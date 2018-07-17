package com.mezereon.springtest.controller;

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
            ArrayList<Object> list = new ArrayList<>();
            list.add(teamShopGoods);
            list.add(goodsMapper.selectByPrimaryKey(teamShopGoods.getTgGoodsId()));
            response.setData(list);
            return response;
        } catch (Exception e) {
            response.setMsg(e.getMessage());
            response.setStatus(false);
            return response;
        }
    }
}
