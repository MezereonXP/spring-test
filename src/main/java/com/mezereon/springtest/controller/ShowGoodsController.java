package com.mezereon.springtest.controller;

import com.mezereon.springtest.bean.Goods;
import com.mezereon.springtest.dao.GoodsMapper;
import com.mezereon.springtest.response.Response;
import com.mezereon.springtest.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ShowGoodsController {
    @Autowired
    private GoodsService goodsService;

    @RequestMapping(value = "/api/getGoodsList", method = RequestMethod.GET)
    @CrossOrigin
    public Response selectAllGoods() {
        List<Goods> list = goodsService.selectAllgoods();
        Response response = new Response();
        response.setData(list);
        return response;
    }

}
