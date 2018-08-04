package com.mezereon.springtest.controller;

import com.mezereon.springtest.bean.Goods;
import com.mezereon.springtest.bean.Order;
import com.mezereon.springtest.bean.OrderGoods;

import com.mezereon.springtest.bean.OrderGoodsExample;
import com.mezereon.springtest.dao.OrderGoodsMapper;
import com.mezereon.springtest.dao.OrderMapper;
import com.mezereon.springtest.response.Response;
import com.mezereon.springtest.service.OrderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @Autowired
    private OrderGoodsMapper orderGoodsMapper;

    @Autowired
    private OrderMapper orderMapper;

    //通过客户id查找订单及订单中的商品
    @RequestMapping(value = "/api/selectAllOrderGoods", method = RequestMethod.GET)
    @CrossOrigin
    public Response selectAllOrderGoods(@RequestParam(value = "userId", required = true) int customerId) {
        Response response = new Response();
        try {
            List<OrderGoods> list = orderService.selectAllOrderGoodsByCustomerId(customerId);

            response.setData(list);

            return response;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            response.setStatus(false);
            response.setMsg(e.getMessage());
            return response;
        }
    }

    //通过客户id查找订单
    @RequestMapping(value = "/api/selectAllOrder", method = RequestMethod.GET)
    @CrossOrigin
    public Response selectAllOrder(@RequestParam(value = "userId", required = true) int customerId) {
        Response response = new Response();
        try {
            List<Order> list = orderService.selectAllOrder(customerId);
            response.setData(list);
            return response;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            response.setStatus(false);
            response.setMsg(e.getMessage());
            return response;
        }
    }

    //
    @RequestMapping(value = "/api/addNewOrder", method = RequestMethod.POST)
    @CrossOrigin
    public Response addNewOrder(@RequestBody List<OrderGoods> list) {

        Response response = new Response();
        try {
            Order order = orderService.addNewOrder(list);
            response.setData(order);
            return response;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            response.setStatus(false);
            response.setMsg(e.getMessage());
            return response;
        }
    }

    @RequestMapping(value = "/api/updateOrder", method = RequestMethod.POST)
    @CrossOrigin
    public Response updateOrder(@RequestBody Order order) {
        Response response = new Response();
        try {
            orderService.updateOrder(order);
            response.setStatus(true);
            return response;
        } catch (Exception e) {
            response.setMsg(e.getMessage());
            return response;
        }
    }

    @RequestMapping(value = "/api/updateOrderGoods", method = RequestMethod.POST)
    @CrossOrigin
    public Response updateOrderGoods(@RequestBody OrderGoods orderGoods) {
        Response response = new Response();
        try {
            orderGoodsMapper.updateByPrimaryKey(orderGoods);
            Integer oId = orderGoods.getOrder().getoId();
            OrderGoodsExample orderGoodsExample = new OrderGoodsExample();
            orderGoodsExample.createCriteria().andOgOrderIdEqualTo(oId);
            List<OrderGoods> list = orderGoodsMapper.selectByExample(orderGoodsExample);
            response.setStatus(true);
            for (OrderGoods og : list) {
                if (og.getOgStatus() == 1) {
                    return response;
                }
            }
            orderGoods.getOrder().setoState(3);
            orderService.updateOrder(orderGoods.getOrder());
            return response;
        } catch (Exception e) {
            response.setMsg(e.getMessage());
            return response;
        }
    }

    @RequestMapping(value = "/api/getUnCommentOrderGoods", method = RequestMethod.GET)
    @CrossOrigin
    public Response updateOrder(@RequestParam(value = "cId") Integer cId) {
        Response response = new Response();
        List<OrderGoods> goods = new ArrayList<>();
        try {
            List<Order> orderList = orderService.selectAllOrder(cId);
            for (Order order : orderList) {
                OrderGoodsExample orderGoodsExample = new OrderGoodsExample();
                orderGoodsExample.createCriteria()
                        .andOgOrderIdEqualTo(order.getoId())
                        .andOgStatusEqualTo(2);
                List<OrderGoods> list = orderGoodsMapper.selectByExample(orderGoodsExample);
                for (OrderGoods orderGoods : list) {
                    goods.add(orderGoods);
                }
            }
            response.setData(goods);
            response.setStatus(true);
            return response;
        } catch (Exception e) {
            response.setMsg(e.getMessage());
            response.setStatus(false);
            return response;
        }
    }
}
