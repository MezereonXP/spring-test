package com.mezereon.springtest.controller;

import com.mezereon.springtest.bean.Customer;
import com.mezereon.springtest.bean.CustomerExample;
import com.mezereon.springtest.dao.CustomerMapper;
import com.mezereon.springtest.response.Response;
import com.mezereon.springtest.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @Autowired
    CustomerMapper customerMapper;

    @RequestMapping(value = "/api/regist",method = RequestMethod.POST)
    @CrossOrigin
    public void regist(@RequestBody Customer customer){
        customerService.regist(customer);
    }
    @RequestMapping(value = "/api/reset",method = RequestMethod.POST)
    @CrossOrigin
    public void reset(@RequestBody Customer customer){
        customerService.reset(customer);
    }

    @RequestMapping(value = "/api/selectCustomerById",method = RequestMethod.GET)
    @CrossOrigin
    public Response selectCustomerById( int customerId){
        Customer customer = customerService.selectCustomerById(customerId);
        Response response = new Response();
        response.setData(customer);
        return response;
    }

    @RequestMapping(value = "/api/login",method = RequestMethod.POST)
    @CrossOrigin
    public Response login(@RequestParam( value = "phone", required = true) String phone,
                          @RequestParam( value = "pwd", required = true) String pwd ){
        Response response = new Response();
        try{
            CustomerExample customerExample = new CustomerExample();
            customerExample.createCriteria().andCTelephoneEqualTo(phone);
            Customer customer = customerMapper.selectByExample(customerExample).get(0);
            response.setData(null);
            response.setStatus(customer.getcPassword().equals(pwd));
            return response;
        }catch (Exception e){
            response.setStatus(false);
            response.setMsg(e.getMessage());
            return response;
        }

    }

}
