package com.mezereon.springtest.service;

import com.mezereon.springtest.bean.Goods;
import com.mezereon.springtest.bean.OrderGoods;
import com.mezereon.springtest.bean.ShopCar;
import com.mezereon.springtest.dao.OrderGoodsMapper;
import com.mezereon.springtest.dao.ShopCarMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class ShopcarService {

    @Autowired
    ShopCarMapper shopCarMapper;

    @Autowired
    OrderGoodsMapper orderGoodsMapper;

    public List<ShopCar> selectAllGoodsInShopcar(int customerId) {
        List<ShopCar> list = shopCarMapper.selectByCustomerId(customerId);
        return list;
    }

    public void editQuantityOfGoods(ShopCar shopcar) {
        shopCarMapper.updateByPrimaryKey(shopcar);
    }

    public void deleteGoodsFromShopcar(ShopCar shopcar) {
        shopcar.setsStatus(0);
        shopCarMapper.updateByPrimaryKey(shopcar);
    }

    public void addGoodsToShopcar(ShopCar shopcar) {
        shopCarMapper.insert(shopcar);
    }

    public List<Goods> getRecommendGoods(int customerId) {
        List<Goods> goodsList = new ArrayList<Goods>();
        List<Goods> fianalGoodsList = new ArrayList<Goods>();
        //先得到当前客户的购物车所有的商品
        List<ShopCar> list = shopCarMapper.selectByCustomerId(customerId);

        for (ShopCar shopcar : list) {

            System.out.println(shopcar.getGoods().getgName());
            //遍历所有与购物车中有相同商品的订单
            List<OrderGoods> oglist = orderGoodsMapper.selectByGoodsId(shopcar.getGoods().getgId());

            for (OrderGoods og : oglist) {

                //遍历这些订单中的所有商品
                List<OrderGoods> orderGoodsList = orderGoodsMapper.selectByOrderId(og.getOrder().getoId());

                for (OrderGoods ordergoods : orderGoodsList) {

                    //遍历 加入list
                    if (shopcar.getGoods().getgId() != ordergoods.getGoods().getgId()) {
                        System.out.println("推荐：" + ordergoods.getGoods().getgName());
                        goodsList.add(ordergoods.getGoods());
                    }

                }
            }
        }
        for (int j = 0; j < list.size(); j++) {
            for (int i = 0; i < goodsList.size(); i++) {
                if (goodsList.get(i).getgId() == list.get(j).getGoods().getgId()) {
                    System.out.println("移除购物车已有：" + goodsList.get(i).getgName());
                    goodsList.remove(i);
                }
            }
        }

        //去除重复

        for(int i=0;i<goodsList.size();i++){
            if(!fianalGoodsList.contains(goodsList.get(i))){
                fianalGoodsList.add(goodsList.get(i));
            }
        }
        return fianalGoodsList;
    }
}
