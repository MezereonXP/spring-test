package com.mezereon.springtest.service;

import com.mezereon.springtest.bean.Customer;
import com.mezereon.springtest.dao.CustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    CustomerMapper customerMapper;

    public Customer selectByPrimaryKey(int cId) {
        return customerMapper.selectByPrimaryKey(cId);
    }

    public void regist(Customer customer) {
        customerMapper.insert(customer);
    }

    public Customer selectCustomerById(int customerId) {
        Customer customer = customerMapper.selectByPrimaryKey(customerId);
        return customer;
    }

    public void reset(Customer customer) {
        customerMapper.updateByTelephone(customer);
    }

}

