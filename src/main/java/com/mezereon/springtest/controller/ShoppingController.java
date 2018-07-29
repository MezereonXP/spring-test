package com.mezereon.springtest.controller;

import com.mezereon.springtest.bean.GoodImg;
import com.mezereon.springtest.bean.Goods;
import com.mezereon.springtest.bean.Config;
import com.mezereon.springtest.bean.Shopping;
import com.mezereon.springtest.response.Response;
import com.mezereon.springtest.service.ShoppingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

@RestController
public class ShoppingController {
    @Autowired
    private ShoppingService shoppingService;

    @RequestMapping(value = "api/getShopGoodInfo", method = RequestMethod.GET)
    @CrossOrigin
    public Response getAllGoods(HttpServletRequest req,
                                HttpServletResponse resp,
                                @RequestParam(value = "gId", required = true) Integer gId) {
        Response response1 = new Response();
        try {
            List<Goods> goods = shoppingService.selectAllgoods();
            List<Shopping> shoppings = new ArrayList<>();

            response1.setMsg("success");
            response1.setData(shoppings);
            response1.setStatus(true);
            return response1;
        } catch (Exception e) {
            response1.setMsg(e.toString());
            response1.setStatus(false);
            return response1;
        }
    }

    public Response getAllConfig() {
        Response response2 = new Response();
        try {
            List<Config> configs = shoppingService.selectAllconfig();
            List<Shopping> shoppings = new ArrayList<>();

            response2.setMsg("success");
            response2.setData(shoppings);
            response2.setStatus(true);
            return response2;
        } catch (Exception e) {
            response2.setMsg(e.toString());
            response2.setStatus(false);
            return response2;
        }
    }

    public Response getAllGoodImg() {
        Response response = new Response();
        try {
            List<GoodImg> goodImgs = shoppingService.selectAllgoodImg();
            List<Shopping> shoppings = new ArrayList<>();

            response.setMsg("success");
            response.setData(shoppings);
            response.setStatus(true);
            return response;
        } catch (Exception e) {
            response.setMsg(e.toString());
            response.setStatus(false);
            return response;
        }
    }

    private Shopping generateShopping(Goods good, Config config, GoodImg goodImg) {
        Shopping shopping = new Shopping();
        shopping.setGoods(new ArrayList<>());
        shopping.setConfig(new ArrayList<>());
        shopping.setGoodimg(new ArrayList<>());
        return shopping;
    }
}
