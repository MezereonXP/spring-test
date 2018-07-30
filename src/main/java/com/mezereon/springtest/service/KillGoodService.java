package com.mezereon.springtest.service;

import com.mezereon.springtest.bean.Customer;
import com.mezereon.springtest.bean.KillGood;
import com.mezereon.springtest.dao.CustomerMapper;
import com.mezereon.springtest.dao.KillGoodMapper;
import com.mezereon.springtest.dao.NoteMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.util.HashMap;
import java.util.Map;

@Service
public class KillGoodService {

    @Autowired
    private static CustomerMapper customerMapper;
    @Autowired
    private static KillGoodMapper killGoodMapper;
    @Autowired
    private static NoteMapper noteMapper;

    private static final String HOST = "119.29.87.112";
    private static final String S_KILL = "kill";
    private static final String S_SUCCESS = "success";
    private static final String S_FAIL = "fail";

    private static final Map<Integer, String> KILL = new HashMap<>();
    private static final Map<Integer, String> SUCCESS = new HashMap<>();
    private static final Map<Integer, String> FAIL = new HashMap<>();
    private static Integer maxNum;
    public static Map<Integer, Integer> FLAG = new HashMap<>();
    public static Map<Integer, Integer> isRuning = new HashMap<>();
    public static Map<Integer,Integer>  kgQuantity=new HashMap<>();

    public static void  AddKillGood(int kgId){

        if(kgQuantity.get(kgId).equals("null")){
            KillGood killGood = killGoodMapper.selectByPrimaryKey(kgId);
            maxNum = killGood.getKgQuantity();
            kgQuantity.put(kgId,maxNum);
        }
    }

    public static void startKill(Integer kgId, Integer cId) {
        isRuning.put(kgId, 1);
        //       isRuning = true;
        FLAG.put(kgId, 1);
        //       flag = true;

        new Thread(new Runnable() {
            public void run() {
                JedisPool pool = new JedisPool(new JedisPoolConfig(), HOST);
                Jedis jedis = null;
                String kill = S_KILL + kgId;
                String success = S_SUCCESS + kgId;
                String fail = S_FAIL + kgId;
                //判断该商品是否已经有队列没有则建立相应的
                if (!KILL.get(kgId).equals(kill)) {
                    KILL.put(kgId, kill);
                    SUCCESS.put(kgId, success);
                    FAIL.put(kgId, fail);
                }

                try {
                    jedis = pool.getResource();
                    while (jedis.scard(SUCCESS.get(kgId)) < kgQuantity.get(kgId)) {
                        if (jedis.llen(KILL.get(kgId)) != 0) {
                            //加入成功队列
                            String temp = jedis.rpop(KILL.get(kgId));
                            jedis.sadd(SUCCESS.get(kgId), String.valueOf(cId));

                            //将相应的商品数量减少
                             kgQuantity.put(kgId,kgQuantity.get(kgId)-1);
                        }
                    }
                    while (FLAG.get(kgId) == 1) {
                        if (jedis.llen(KILL.get(kgId)) != 0) {
                            String temp = jedis.rpop(KILL.get(kgId));
                            jedis.sadd(FAIL.get(kgId), String.valueOf(cId));
                        }
                    }
                } finally {
                    if (jedis != null) {
                        jedis.close();
                    }
                }
                pool.close();
            }
        }).start();
        stop(kgId);
    }

    public static void stop(Integer kgId) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.printf("stop");
                FLAG.put(kgId, 0);
                isRuning.put(kgId, 0);
            }
        }).start();
    }

}
