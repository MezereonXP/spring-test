package com.mezereon.springtest.controller;

import com.mezereon.springtest.bean.Customer;
import com.mezereon.springtest.bean.CustomerExample;
import com.mezereon.springtest.dao.CustomerMapper;
import com.mezereon.springtest.response.Response;
import com.mezereon.springtest.service.CustomerService;
import com.mezereon.springtest.util.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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

    @RequestMapping(value = "/api/login", method = RequestMethod.GET)
    @CrossOrigin
    public Response login(HttpServletRequest req, HttpServletResponse resq,
                          @RequestParam(value = "phone", required = true) String phone,
                          @RequestParam(value = "pwd", required = true) String pwd) {
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
                Cookie cookie2 = new Cookie("damiToken",
                        Util.getSha1(phone + pwd + dateFormat.format(date)));
                System.out.println(cookie1.getName() + ":" + cookie1.getValue());
                System.out.println(cookie2.getName() + ":" + cookie2.getValue());
                cookie1.setPath("/");
                cookie1.setMaxAge(60 * 60 * 24);
                cookie1.setDomain("localhost");
                cookie2.setPath("/");
                cookie2.setMaxAge(60 * 60 * 24);
                cookie2.setDomain("localhost");
                resq.addCookie(cookie1);
                resq.addCookie(cookie2);
            }
            System.out.println(response.isStatus());
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
        Response response = new Response();
        try {
            String damiPhone = "";
            String damiToken = "";
            boolean flag = false;

            for (int i = 0; i < cookies.length; i++) {
                if ("damiPhone".equals(cookies[i].getName())) {
                    damiPhone = cookies[i].getValue();
                    System.out.println("damiPhone" + damiPhone);
                    Date date = new Date(System.currentTimeMillis());
                    DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");

                    CustomerExample customerExample = new CustomerExample();
                    customerExample.createCriteria().andCTelephoneEqualTo(damiPhone);

                    Customer customer = customerMapper.selectByExample(customerExample).get(0);

                    damiToken = Util.getSha1(damiPhone + customer.getcPassword() + dateFormat.format(date));

                }
            }
            for (int i = 0; i < cookies.length; i++) {
                if ("damiToken".equals(cookies[i].getName())) {
                    System.out.println("damiToken" + cookies[i].getValue());
                    if (cookies[i].getValue().equals(damiToken)) {
                        flag = true;
                    }
                }
            }

            response.setData(damiPhone);
            response.setStatus(flag);
            return response;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            response.setStatus(false);
            response.setMsg(e.getMessage());
            return response;
        }

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

    @RequestMapping(value = "/api/logout", method = RequestMethod.GET)
    @CrossOrigin
    public void logout(HttpServletRequest req, HttpServletResponse resq) {
        Cookie cookie1 = new Cookie("damiPhone", "");
        Cookie cookie2 = new Cookie("damiToken", "");
        cookie1.setPath("/");
        cookie1.setMaxAge(60 * 60 * 24);
        cookie1.setDomain("localhost");
        cookie2.setPath("/");
        cookie2.setMaxAge(60 * 60 * 24);
        cookie2.setDomain("localhost");
        resq.addCookie(cookie1);
        resq.addCookie(cookie2);
    }
}