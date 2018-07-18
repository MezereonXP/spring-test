package com.mezereon.springtest.controller;

import com.mezereon.springtest.bean.Goods;
import com.mezereon.springtest.bean.TeamShopGoods;
import com.mezereon.springtest.dao.GoodsMapper;
import com.mezereon.springtest.dao.TeamShopGoodsMapper;
import com.mezereon.springtest.response.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

/**
 * Created by Administrator on 2018/07/17.
 */

@RestController
public class TeamShopGoodsController {
    @Autowired
    private TeamShopGoodsMapper teamShopGoodsMapper;

    @Autowired
    private GoodsMapper goodsMapper;

    @RequestMapping(value = "/api/selectTeamShopGoodsById", method = RequestMethod.GET)
    @CrossOrigin
    public Response selectTeamShopGoodsById(@RequestParam(value = "id", required = true) Integer id) {
        Response response = new Response();
        try {
            response.setStatus(true);
            TeamShopGoods teamShopGoods = teamShopGoodsMapper.selectByPrimaryKey(id);
            response.setData(teamShopGoods);
            return response;
        } catch (Exception e) {
            response.setMsg(e.getMessage());
            response.setStatus(false);
            return response;
        }
    }

    @RequestMapping(value = "/api/insertGoods", method = RequestMethod.POST)
    @CrossOrigin
    public Response insertGoods(@RequestBody TeamShopGoods teamShopGoods) {
        Response response = new Response();
        try {
            teamShopGoodsMapper.insert(teamShopGoods);
            response.setStatus(true);
            return response;
        } catch (Exception e) {
            response.setMsg(e.getMessage());
            response.setStatus(false);
            return response;
        }
    }
}
