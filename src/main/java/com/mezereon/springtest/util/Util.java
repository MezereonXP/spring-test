package com.mezereon.springtest.util;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class Util {

    private static final String KILL = "kill";
    private static final String HOST = "119.29.87.112";
    private static final String SUCCESS = "kill:success";
    private static final String FAIL = "kill:fail";
    private static Integer maxNum = 1;
    public static volatile boolean flag = true;
    public static boolean isRuning = false;

    public static void startKill() {
        isRuning = true;
        flag = true;
        new Thread(new Runnable() {
            public void run() {
                JedisPool pool = new JedisPool(new JedisPoolConfig(), HOST);
                Jedis jedis = null;
                try {
                    jedis = pool.getResource();
                    jedis.del(SUCCESS);
                    jedis.del(FAIL);
                    while (jedis.scard(SUCCESS) < maxNum) {
                        if (jedis.llen(KILL) != 0) {
                            String temp = jedis.rpop(KILL);
                            jedis.sadd(SUCCESS, temp);
                        }
                    }
                    while (flag) {
                        if (jedis.llen(KILL) != 0) {
                            String temp = jedis.rpop(KILL);
                            jedis.sadd(FAIL, temp);
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
        stop();
    }

    public static void stop() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(20000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.printf("stop");
                flag = false;
                isRuning = false;
            }
        }).start();
    }

}