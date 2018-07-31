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
    AddressService  addressService;

    //通过customer id 查询所有收货地址
    @RequestMapping(value = "/api/selectAllAddressByCustomerId", method = RequestMethod.GET)
    @CrossOrigin
    public Response selectAllAddressByCustomerId(@RequestParam(value = "userId", required = true) int customerId){
        List<Address> list = addressService.selectAllAddressByCustomerId(customerId);
        Response response = new Response();
        response.setData(list);

        return response;
    }


    //添加收货地址
    @RequestMapping( value = "/api/addAddress",method = RequestMethod.POST)
    @CrossOrigin
    public void addAddress(@RequestBody Address address){


        addressService.addAddress(address);
    }


    //编辑收货地址
    @RequestMapping( value = "/api/modifyAddress",method = RequestMethod.POST)
    @CrossOrigin
    public void modifyAddress(@RequestBody Address address){


        addressService.modifyAddress(address);
    }

    //删除收货地址
    @RequestMapping( value = "/api/deleteAddress",method = RequestMethod.POST)
    @CrossOrigin
    public void deleteAddress(@RequestBody Address address){


        addressService.deleteAddress(address);
    }
}
