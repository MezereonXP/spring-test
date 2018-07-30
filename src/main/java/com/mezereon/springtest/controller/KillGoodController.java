package com.mezereon.springtest.controller;


import com.mezereon.springtest.bean.KillGood;
import com.mezereon.springtest.dao.CustomerMapper;
import com.mezereon.springtest.dao.KillGoodMapper;
import com.mezereon.springtest.response.Response;
import com.mezereon.springtest.service.CustomerService;
import com.mezereon.springtest.service.KillGoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.util.List;


/**
 * @program: KillController
 * @description: Controller to kill goods
 * @author: mezereonxp Email: mezereonxp@gmail.com
 * @create: 2018/7/18
 **/


@RestController
public class KillGoodController {


    private static final String HOST = "119.29.87.112";
    @Autowired
    KillGoodMapper killGoodMapper;
    @Autowired
    KillGoodService killGoodService;
    @Autowired
    CustomerMapper customerMapper;
    @Autowired
    CustomerService customerService;

    @RequestMapping(value = "/api/selectKillGoods", method = RequestMethod.GET)
    @CrossOrigin
    public Response selectKillGoods(){

        Response response=new Response();
        List<KillGood> listKillGood=killGoodMapper.selectKillGoods();
        response.setStatus(true);
        response.setData(listKillGood);
        return response;
    }



    @RequestMapping(value = "/api/killGoods", method = RequestMethod.GET)
    @CrossOrigin
    public Response killGoods(@RequestParam(value = "kgId", required = true) Integer kgId,@RequestParam(value = "cId",required = true) Integer cId ) {
        Response response = new Response();

        String cName=customerService.selectByPrimaryKey(cId).getcName();
        if (KillGoodService.isRuning.get(kgId)==0) {
            KillGoodService.startKill(kgId,cId);
        }
        if (run(kgId,cId)) {
            response.setMsg("抢购成功");
        } else {
            response.setMsg("抢购失败");
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
    public boolean run(Integer kgId,Integer cId) {
        JedisPool pool = new JedisPool(new JedisPoolConfig(), HOST);
        Jedis jedis = null;

        try {
            String KILL="kill"+kgId;
            String SUCCESS="success"+kgId;
            String FAIL="fail"+kgId;
            String cName=customerService.selectByPrimaryKey(cId).getcName();
            jedis = pool.getResource();
            jedis.lpush(KILL,cName);
            while ((!jedis.sismember(SUCCESS, cName)) && !(jedis.sismember(FAIL, cName))) {
                System.out.println(cName + "等待中。。。");
            }
            if (jedis.sismember(SUCCESS,cName)) {
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

