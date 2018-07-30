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

    public static void startKill(Integer kgId, Integer cId) {
        isRuning.put(kgId, 1);
        //       isRuning = true;
        FLAG.put(kgId, 1);
        //       flag = true;
        Customer customer = CustomerService.selectByPrimaryKey(cId);
        String cName = customer.getcName();
        KillGood killGood = killGoodMapper.selectByPrimaryKey(kgId);
        maxNum = killGood.getKgQuantity();

        new Thread(new Runnable() {
            public void run() {
                JedisPool pool = new JedisPool(new JedisPoolConfig(), HOST);
                Jedis jedis = null;
                String kill = S_KILL + kgId;
                String success = S_SUCCESS + kgId;
                String fail = S_FAIL + kgId;
                //判断该客户知否已经在抢购队列中，如果不在加入
                if (!KILL.get(kgId).equals(kill)) {
                    KILL.put(kgId, kill);
                    SUCCESS.put(kgId, success);
                    FAIL.put(kgId, fail);
                }

                try {
                    jedis = pool.getResource();
//                    jedis.del(SUCCESS);
//                    jedis.del(FAIL);
                    while (jedis.scard(SUCCESS.get(kgId)) < maxNum) {
                        if (jedis.llen(KILL.get(kgId)) != 0) {
                            //加入成功队列
                            String temp = jedis.rpop(KILL.get(kgId));
                            jedis.sadd(SUCCESS.get(kgId), cName);

/*                           //成功后生成相应的订单(暂时缺少生成订单号的方法)
                               //生成订单并插入
                            String oCode;
                            Order order=new Order();
                            order.setCustomer(customer);
                            order.setoState(1);
                            order.setoType(3);
                            OrderService.insertSelective(order);
                           //得到订单号并生成相应的OrderGoods插入数据库
                            Order order1=OrderService.selectByOCode(oCode);
                            OrderGoods orderGoods=new OrderGoods();
                            orderGoods.setOrder(order1);
                            Goods goods=GoodsService.selectByPrimatyKey(kgId);
                            orderGoods.setGoods(goods);
                            KillGood killGood=KillGoodService.selectByPrimaryKey(kgId);
                            double kgPrice=killGood.getKgPrice();
                            orderGoods.setOgPrice(kgPrice);
                            orderGoods.setOgQuantity(1);
                            orderGoods.setOgStatus(1);
                            OrderGoodsService.insertSelective(orderGoods);*/
                            //将相应的商品数量减少
                            KillGood killgood = killGoodMapper.selectByPrimaryKey(kgId);
                            killgood.setKgQuantity(killgood.getKgQuantity() - 1);
                            killGoodMapper.updateByPrimaryKey(killgood);
                        }
                    }
                    while (FLAG.get(kgId) == 1) {
                        if (jedis.llen(KILL.get(kgId)) != 0) {
                            String temp = jedis.rpop(KILL.get(kgId));
                            jedis.sadd(FAIL.get(kgId), cName);
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
                //               flag = false;
                isRuning.put(kgId, 0);
//                isRuning = false;
            }
        }).start();
    }

}
