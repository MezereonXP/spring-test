package com.mezereon.springtest.controller;

import com.mezereon.springtest.bean.TeamShopGoods;
import com.mezereon.springtest.response.Response;
import com.mezereon.springtest.util.Util;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * @program: KillController
 * @description: Controller to kill goods
 * @author: mezereonxp Email: mezereonxp@gmail.com
 * @create: 2018/7/18
 **/
@RestController
public class KillController {
    private static final String KILL = "kill";
    private static final String HOST = "119.29.87.112";
    private static final String SUCCESS = "kill:success";
    private static final String FAIL = "kill:fail";

    @RequestMapping(value = "/api/killGoods", method = RequestMethod.GET)
    @CrossOrigin
    public Response killGoods(@RequestParam(value = "id", required = true) String id) {
        Response response = new Response();
        if (!Util.isRuning) {
            Util.startKill();
        }
        if (run(id)) {
            response.setMsg(id + "抢购成功!");
        } else {
            response.setMsg(id + "抢购失败!");
        }
        try {
            response.setStatus(true);
            return response;
        } catch (Exception e) {
            response.setMsg(e.getMessage());
            response.setStatus(false);
            return response;
        }
    }

    public boolean run(String name) {
        JedisPool pool = new JedisPool(new JedisPoolConfig(), HOST);
        Jedis jedis = null;

        try {
            jedis = pool.getResource();
            jedis.lpush(KILL, name);
            while ((!jedis.sismember(SUCCESS, name)) && !(jedis.sismember(FAIL, name))) {
                System.out.println(name + "等待中。。。");
            }
            if (jedis.sismember(SUCCESS, name)) {
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
