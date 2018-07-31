package com.mezereon.springtest.controller;

import com.mezereon.springtest.bean.Goods;
import com.mezereon.springtest.bean.TeamShopGoods;
import com.mezereon.springtest.dao.GoodsMapper;
import com.mezereon.springtest.dao.TeamShopGoodsMapper;
import com.mezereon.springtest.response.Response;
import com.mezereon.springtest.service.TeamShopGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

/**
 * Created by Administrator on 2018/07/17.
 */
//团购商品管理
@RestController
public class TeamShopGoodsController {

    @Autowired
    private TeamShopGoodsService teamShopGoodsService;

    //获得团购商品详细数据
    @RequestMapping(value = "/api/getTeamGoodById", method = RequestMethod.GET)
    @CrossOrigin
    public Response selectTeamShopGoodsById(@RequestParam(value = "tgId", required = true) Integer tgId) {
        return teamShopGoodsService.selectTeamShopGoodsById(tgId);
    }

    //获得全部商品数据
    @RequestMapping(value = "/api/getAllTeamGoods", method = RequestMethod.GET)
    @CrossOrigin
    public Response selectAllTeamShopGoods() {
        return teamShopGoodsService.selectAllTeamShopGoods();
    }

/*    //获得某类型的商品数据
    @RequestMapping(value = "/api/selectTeamShopGoods", method = RequestMethod.GET)
    @CrossOrigin
    public Response selectAllTeamShopGoodsById(){return teamShopGoodsService.}*/
/*    @RequestMapping(value = "/api/insertGoods", method = RequestMethod.POST)
    @CrossOrigin
    public Response insertGoods(@RequestBody TeamShopGoods teamShopGoods) {
        return teamShopGoodsService.insertGoods(teamShopGoods);
    }*/
//获得某种类型的商品数据
@RequestMapping(value = "/api/getTeamGoods", method = RequestMethod.GET)
@CrossOrigin
public Response selectTeamGoodsByTypeId(@RequestParam(value = "catagory", required = true) String catagory) {
    System.out.println(catagory);
    return teamShopGoodsService.selectTeamShopGoodsByTypeId(catagory);
}
}
