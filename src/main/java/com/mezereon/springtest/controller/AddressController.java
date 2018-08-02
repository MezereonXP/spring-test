package com.mezereon.springtest.controller;


import com.mezereon.springtest.bean.Address;

import com.mezereon.springtest.bean.ShopCar;
import com.mezereon.springtest.response.Response;
import com.mezereon.springtest.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*
    收货地址controller
 */
@RestController
public class AddressController {

    //自动注入
    @Autowired
    AddressService addressService;

    //通过customer id 查询所有收货地址
    @RequestMapping(value = "/api/selectAllAddressByCustomerId", method = RequestMethod.GET)
    @CrossOrigin
    public Response selectAllAddressByCustomerId(@RequestParam(value = "userId", required = true) int customerId) {

        Response response = new Response();
        try {
            List<Address> list = addressService.selectAllAddressByCustomerId(customerId);

            response.setData(list);

            return response;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            response.setStatus(false);
            response.setMsg(e.getMessage());
            return response;
        }
    }


    //添加收货地址
    @RequestMapping(value = "/api/addAddress", method = RequestMethod.POST)
    @CrossOrigin
    public void addAddress(@RequestBody Address address) {

        try {
            addressService.addAddress(address);
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }


    //编辑收货地址
    @RequestMapping(value = "/api/modifyAddress", method = RequestMethod.POST)
    @CrossOrigin
    public void modifyAddress(@RequestBody Address address) {

        try {
            addressService.modifyAddress(address);
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }

    //删除收货地址
    @RequestMapping(value = "/api/deleteAddress", method = RequestMethod.POST)
    @CrossOrigin
    public void deleteAddress(@RequestBody Address address) {

        try {
            addressService.deleteAddress(address);
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }
}
