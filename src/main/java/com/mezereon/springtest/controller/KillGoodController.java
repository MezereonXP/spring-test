package com.mezereon.springtest.controller;

import com.mezereon.springtest.bean.KillGood;
import com.mezereon.springtest.dao.CustomerMapper;
import com.mezereon.springtest.dao.KillGoodMapper;
import com.mezereon.springtest.response.Response;
import com.mezereon.springtest.service.CustomerService;
import com.mezereon.springtest.service.KillGoodService;
import com.sun.javafx.collections.MappingChange;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: KillController
 * @description: Controller to kill goods
 * @author: mezereonxp Email: mezereonxp@gmail.com
 * @create: 2018/7/18
 **/

@RestController
public class KillGoodController {

    private static final String HOST = "119.29.87.112";
    private static final String KILL = "kill";
    private static final String SUCCESS = "success";
    private static final String FAIL = "fail";


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
    public Response selectKillGoods() {

        Response response = new Response();
        List<KillGood> listKillGood = killGoodMapper.selectKillGoods();
        response.setStatus(true);
        response.setData(listKillGood);
        return response;
    }

    @RequestMapping(value = "/api/killGoods", method = RequestMethod.GET)
    @CrossOrigin
    public Response killGoods(@RequestParam(value = "kgId", required = true) Integer kgId, @RequestParam(value = "cId", required = true) Integer cId) {
        Response response = new Response();

        killGoodService.AddKillGood(kgId);

        if (killGoodService.ifRunning(kgId) == 0) {
            killGoodService.startKill(kgId, cId);
        }

        if (killGoodService.run(kgId, cId)) {
            response.setMsg("抢购成功");
            KillGood killGood = killGoodMapper.selectByPrimaryKey(kgId);
            if (killGood.getKgQuantity() > 0) {
                killGood.setKgQuantity(killGood.getKgQuantity() - 1);
                killGoodMapper.updateByPrimaryKey(killGood);
            }
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


}

