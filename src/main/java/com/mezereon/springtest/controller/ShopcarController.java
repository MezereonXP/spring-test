package com.mezereon.springtest.controller;


import com.mezereon.springtest.bean.Goods;
import com.mezereon.springtest.bean.ShopCar;
import com.mezereon.springtest.response.Response;
import com.mezereon.springtest.service.ShopcarService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ShopcarController {

    @Autowired
    private ShopcarService shopcarService;

    @RequestMapping(value = "/api/getShopCarGoods", method = RequestMethod.GET)
    @CrossOrigin
    public Response selectAllGoodsInShopcar(int customerId){
        List<ShopCar> list = shopcarService.selectAllGoodsInShopcar(customerId);
        Response response = new Response();
        response.setData(list);

        return response;
    }

    @RequestMapping( value = "/api/editQuantityOfGoods",method = RequestMethod.POST)
    @CrossOrigin
    public void editQuantityOfGoods(@RequestBody ShopCar shopcar){

        System.out.println("修改数量"+shopcar.getGoods().getgName()+":"+shopcar.getsQuantity());
        shopcarService.editQuantityOfGoods(shopcar);
    }

    @RequestMapping( value = "/api/deleteGoodsFromShopcar",method = RequestMethod.POST)
    @CrossOrigin
    public void deleteGoodsFromShopcar(@RequestBody ShopCar shopcar){

        System.out.println("删除"+shopcar.getGoods().getgName()+":"+shopcar.getsQuantity());
        shopcarService.deleteGoodsFromShopcar(shopcar);
    }

    @RequestMapping( value = "/api/addGoodsToShopcar",method = RequestMethod.POST)
    @CrossOrigin
    public void addGoodsToShopcar(@RequestBody ShopCar shopcar){

        System.out.println("新增"+shopcar.getGoods().getgName()+":"+shopcar.getsQuantity());
        shopcarService.addGoodsToShopcar(shopcar);
    }

    @RequestMapping(value = "/api/getRecommendGoods", method = RequestMethod.GET)
    @CrossOrigin
    public Response getRecommendGoods(int customerId){
        List<Goods> list = shopcarService.getRecommendGoods(customerId);
        Response response = new Response();
        response.setData(list);

        return response;
    }
}
