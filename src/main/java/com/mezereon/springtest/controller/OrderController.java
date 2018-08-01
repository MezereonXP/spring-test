package com.mezereon.springtest.controller;

import com.mezereon.springtest.bean.Order;
import com.mezereon.springtest.bean.OrderGoods;
import com.mezereon.springtest.response.Response;
import com.mezereon.springtest.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    //通过客户id查找订单及订单中的商品
    @RequestMapping(value = "/api/selectAllOrderGoods", method = RequestMethod.GET)
    @CrossOrigin
    public Response selectAllOrderGoods(@RequestParam(value = "userId", required = true) int customerId) {
        Response response = new Response();
        try {
            List<OrderGoods> list = orderService.selectAllOrderGoodsByCustomerId(customerId);
            response.setData(list);
            response.setStatus(true);
            return response;
        } catch (Exception e) {
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
            response.setStatus(true);
            return response;
        } catch (Exception e) {
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
            response.setStatus(true);
            return response;
        } catch (Exception e) {
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
            response.setStatus(false);
            return response;
        }
    }
}
