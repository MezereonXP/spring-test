package com.mezereon.springtest.service;

import com.mezereon.springtest.bean.Customer;
import com.mezereon.springtest.dao.CustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    static
    CustomerMapper customerMapper;

    public static Customer selectByPrimaryKey(int cId){
        return customerMapper.selectByPrimaryKey(cId);
    }
}
