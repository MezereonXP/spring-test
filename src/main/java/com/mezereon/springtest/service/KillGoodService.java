package com.mezereon.springtest.service;

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
    private CustomerMapper customerMapper;
    @Autowired
    private KillGoodMapper killGoodMapper;
    @Autowired
    private NoteMapper noteMapper;

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
    public static Map<Integer, Integer> kgQuantity = new HashMap<>();

    public int ifRunning(int kgId) {
        if (isRuning.containsKey(kgId) && isRuning.get(kgId) == 1) {
            return 1;
        } else {
            return 0;
        }
    }

    public void AddKillGood(int kgId) {
        if (!kgQuantity.containsKey(kgId)) {
            KillGood killGood = killGoodMapper.selectByPrimaryKey(kgId);
            maxNum = killGood.getKgQuantity();
            kgQuantity.put(kgId, maxNum);
        }
    }

    public void startKill(Integer kgId, Integer cId) {
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
                if (!KILL.containsKey(kgId)) {
                    KILL.put(kgId, kill);
                    SUCCESS.put(kgId, success);
                    FAIL.put(kgId, fail);
                }

                try {
                    jedis = pool.getResource();
                    //先删除上次可能残留的队列
                    jedis.del(SUCCESS.get(kgId));
                    jedis.del(FAIL.get(kgId));

                    while (jedis.scard(SUCCESS.get(kgId)) < kgQuantity.get(kgId)) {
                        if (jedis.llen(KILL.get(kgId)) != 0) {
                            //加入成功队列
                            String temp = jedis.rpop(KILL.get(kgId));
                            jedis.sadd(SUCCESS.get(kgId), String.valueOf(temp));
                        }
                    }
                    while (FLAG.get(kgId) == 1) {
                        if (jedis.llen(KILL.get(kgId)) != 0) {
                            String temp = jedis.rpop(KILL.get(kgId));
                            jedis.sadd(FAIL.get(kgId), String.valueOf(temp));
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

    public void stop(Integer kgId) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    //四个小时后结束
                    Thread.sleep(1000 * 30);
                    System.out.printf("stop");
                    FLAG.put(kgId, 0);
                    isRuning.put(kgId, 0);
                    kgQuantity.remove(kgId);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    public boolean run(Integer kgId, Integer cId) {
        JedisPool pool = new JedisPool(new JedisPoolConfig(), HOST);
        Jedis jedis = null;

        try {
            String kill = S_KILL + kgId;
            String success = S_SUCCESS + kgId;
            String fail = S_FAIL + kgId;
            jedis = pool.getResource();
            jedis.lpush(kill, String.valueOf(cId));
            while ((!jedis.sismember(success, String.valueOf(cId))) && !(jedis.sismember(fail, String.valueOf(cId)))) {
                System.out.println(String.valueOf(cId) + "等待中。。。");
            }
            if (jedis.sismember(success, String.valueOf(cId))) {
                return true;
            } else {
                return false;
            }
        } finally {
            if (jedis != null) {
                jedis.close();
            }
            pool.close();
        }
    }

}
