package com.mezereon.springtest.controller;

import com.mezereon.springtest.bean.Customer;
import com.mezereon.springtest.bean.CustomerExample;
import com.mezereon.springtest.dao.CustomerMapper;
import com.mezereon.springtest.response.Response;
import com.mezereon.springtest.service.CustomerService;
import com.mezereon.springtest.util.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @Autowired
    CustomerMapper customerMapper;

    @RequestMapping(value = "/api/regist", method = RequestMethod.POST)
    @CrossOrigin
    public void regist(@RequestBody Customer customer) {
        customerService.regist(customer);
    }

    @RequestMapping(value = "/api/reset", method = RequestMethod.POST)
    @CrossOrigin
    public void reset(@RequestBody Customer customer) {
        customerService.reset(customer);
    }

    @RequestMapping(value = "/api/selectCustomerById", method = RequestMethod.GET)
    @CrossOrigin
    public Response selectCustomerById(int customerId) {
        Customer customer = customerService.selectCustomerById(customerId);
        Response response = new Response();
        response.setData(customer);
        return response;
    }

    @RequestMapping(value = "/api/login", method = RequestMethod.POST)
    @CrossOrigin
    public Response login(@RequestParam(value = "phone", required = true) String phone,
                          @RequestParam(value = "pwd", required = true) String pwd, HttpServletRequest req, HttpServletResponse resq) {
        Response response = new Response();
        try {
            CustomerExample customerExample = new CustomerExample();
            customerExample.createCriteria().andCTelephoneEqualTo(phone);
            Customer customer = customerMapper.selectByExample(customerExample).get(0);
            response.setData(null);
            response.setStatus(customer.getcPassword().equals(pwd));
            if (customer.getcPassword().equals(pwd)) {
                Date date = new Date(System.currentTimeMillis());
                DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
                Cookie cookie1 = new Cookie("damiPhone", phone);
                Cookie cookie2 = new Cookie("damiToken", Util.getSha1(phone + pwd + dateFormat.format(date)));
                resq.addCookie(cookie1);
                resq.addCookie(cookie2);
            }

            return response;
        } catch (Exception e) {
            response.setStatus(false);
            response.setMsg(e.getMessage());
            return response;
        }

    }

    @RequestMapping(value = "/api/checklogin", method = RequestMethod.GET)
    @CrossOrigin
    public Response checklogin(HttpServletRequest req, HttpServletResponse resq) {
        Cookie[] cookies = req.getCookies();
        String damiPhone = null;
        String damiToken = null;
        boolean flag = false;
        Response response = new Response();
        for (Cookie cookie : cookies) {
            if ("damiPhone".equals(cookie.getName())) {
                damiPhone = cookie.getValue();
                Date date = new Date(System.currentTimeMillis());
                DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");

                CustomerExample customerExample = new CustomerExample();
                customerExample.createCriteria().andCTelephoneEqualTo(damiPhone);
                Customer customer = customerMapper.selectByExample(customerExample).get(0);

                damiToken = Util.getSha1(damiPhone + customer.getcPassword() + dateFormat.format(date));
            }
        }

        for (Cookie cookie : cookies) {
            if ("damiToken".equals(cookie.getName())) {
                if (cookie.getValue().equals(damiToken)) {
                    flag = true;
                }
            }
        }
        response.setData(damiPhone);
        response.setStatus(flag);
        return response;
    }

    @RequestMapping(value = "/api/getCustomerByPhone", method = RequestMethod.GET)
    @CrossOrigin
    public Response getCustomerByPhone(@RequestParam(value = "phone", required = true) String phone) {
        Response response = new Response();
        CustomerExample customerExample = new CustomerExample();
        customerExample.createCriteria().andCTelephoneEqualTo(phone);
        Customer customer = customerMapper.selectByExample(customerExample).get(0);
        response.setData(customer);
        return response;
    }
}