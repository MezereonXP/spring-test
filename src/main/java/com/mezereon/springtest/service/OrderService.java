package com.mezereon.springtest.service;


import com.mezereon.springtest.bean.Order;
import com.mezereon.springtest.bean.OrderGoods;
import com.mezereon.springtest.bean.ShopCar;
import com.mezereon.springtest.dao.OrderGoodsMapper;
import com.mezereon.springtest.dao.OrderMapper;
import com.mezereon.springtest.dao.ShopCarMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {

    @Autowired
    OrderMapper orderMapper;

    @Autowired
    OrderGoodsMapper orderGoodsMapper;

    @Autowired
    ShopCarMapper shopCarMapper;

    public void addNewOrder(List<OrderGoods> list) {

            Order order ;
            String timeNow=System.currentTimeMillis()+"";
        list.get(0).getOrder().setoCode(timeNow + list.get(0).getOrder().getAddress().getCustomer().getcId() + list.get(0).getOrder().getoType());
        list.get(0).getOrder().setoSetdate(timeNow);
        list.get(0).getOrder().setCustomer(list.get(0).getOrder().getAddress().getCustomer());
            orderMapper.insert(list.get(0).getOrder());
            System.out.println("新增订单" + list.get(0).getGoods().getgName() + ":" + list.get(0).getOgQuantity());
            //找到最新插入的订单
            order = orderMapper.selectByOrderCode(list.get(0).getOrder().getoCode());
            for (OrderGoods ordergoods : list) {
                ordergoods.setOrder(order);
                orderGoodsMapper.insert(ordergoods);

                List<ShopCar> shopCarList = shopCarMapper.selectByCustomerId(ordergoods.getOrder().getAddress().getCustomer().getcId());

                for (ShopCar shopcar : shopCarList) {
                    if (shopcar.getGoods().getgId()==ordergoods.getGoods().getgId()) {
                        shopcar.setsStatus(0);
                        shopCarMapper.updateByPrimaryKey(shopcar);
                    }
                }
            }


    }

    public List<OrderGoods> selectAllOrderGoodsByCustomerId(int customerId) {
        List<Order> list = orderMapper.selectAllOrderByCustomerId(customerId);
        List<OrderGoods> orderGoodsList = new ArrayList<OrderGoods>();
        for (Order order : list) {
            List<OrderGoods> oglist = orderGoodsMapper.selectByOrderId(order.getoId());
            orderGoodsList.addAll(oglist);
        }
        return orderGoodsList;
    }

    public List<Order> selectAllOrder(int customerId) {
        List<Order> list = orderMapper.selectAllOrderByCustomerId(customerId);
        return list;
    }

    public void updateOrder(Order order) {
        orderMapper.updateByPrimaryKey(order);
    }
}
