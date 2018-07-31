package com.mezereon.springtest.controller;

import com.mezereon.springtest.SpringTestApplication;
import com.mezereon.springtest.bean.*;
import com.mezereon.springtest.dao.CustomerMapper;
import com.mezereon.springtest.dao.OrderMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SpringTestApplication.class)
@WebAppConfiguration
public class OrderControllerTest {
    @Autowired
    OrderMapper orderMapper;
    @Autowired
    CustomerMapper customerMapper;

    @Test
    public void selectByType() {
        Order order = new Order();
        Customer customer = customerMapper.selectByPrimaryKey(1);
        order.setCustomer(customer);
        order.setoType(2);
        List<Order> list = orderMapper.selectByType(order);
        for (Order order1 : list) {
            System.out.println(order1.getoId());
        }
    }
}
