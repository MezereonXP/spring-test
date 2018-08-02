package com.mezereon.springtest.controller;

import com.mezereon.springtest.bean.Goods;
import com.mezereon.springtest.bean.GoodsExample;
import com.mezereon.springtest.bean.Order;
import com.mezereon.springtest.bean.OrderGoods;
import com.mezereon.springtest.dao.GoodsMapper;
import com.mezereon.springtest.response.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: SearchController
 * @description: The controller to search
 * @author: mezereonxp Email: mezereonxp@gmail.com
 * @create: 2018/8/2
 **/
@RestController
public class SearchController {

    @Autowired
    private GoodsMapper goodsMapper;

    @RequestMapping(value = "/api/search", method = RequestMethod.GET)
    @CrossOrigin
    public Response search(@RequestParam(name = "key", required = true) String key) {

        Response response = new Response();
        try {
            GoodsExample goodsExample = new GoodsExample();
            goodsExample.createCriteria().andGNameLike("%" + key + "%");
            List<Goods> goods = goodsMapper.selectByExample(goodsExample);
            response.setData(goods);
            response.setStatus(true);
            return response;
        } catch (Exception e) {
            response.setStatus(false);
            response.setMsg(e.getMessage());
            return response;
        }

    }
}
