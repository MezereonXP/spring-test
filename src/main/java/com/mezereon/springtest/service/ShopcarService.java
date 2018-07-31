package com.mezereon.springtest.service;

import com.mezereon.springtest.bean.Goods;
import com.mezereon.springtest.bean.OrderGoods;
import com.mezereon.springtest.bean.ShopCar;
import com.mezereon.springtest.dao.OrderGoodsMapper;
import com.mezereon.springtest.dao.ShopCarMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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

        //先得到当前客户的购物车所有的商品
        List<ShopCar> list = shopCarMapper.selectByCustomerId(customerId);

        for (ShopCar shopcar : list) {

            System.out.println(shopcar.getGoods().getgName());
            //遍历所有与购物车中有相同商品的订单
            List<OrderGoods> oglist = orderGoodsMapper.selectByGoodsId(shopcar.getGoods().getgId());

            for (OrderGoods og : oglist) {
                System.out.println(og.getGoods().getgName());
                //遍历这些订单中的所有商品
                List<OrderGoods> orderGoodsList = orderGoodsMapper.selectByOrderId(og.getOrder().getoId());

                for (OrderGoods ordergoods : orderGoodsList) {
                    System.out.println(ordergoods.getGoods().getgName());
                    //遍历并判断这些商品中与购物车商品不同的商品 加入list
                    goodsList.add(ordergoods.getGoods());
                }
            }
        }

        for (int i = 0; i < goodsList.size() - 1; i++) {
            for (int j = goodsList.size() - 1; j > i; j--) {
                if (goodsList.get(j).equals(goodsList.get(i))) {
                    goodsList.remove(j);
                }
            }
        }


        return goodsList;
    }
}