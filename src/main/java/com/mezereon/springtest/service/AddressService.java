package com.mezereon.springtest.service;


import com.mezereon.springtest.bean.Address;
import com.mezereon.springtest.dao.AddressMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {

    @Autowired
    AddressMapper addressMapper;

    public List<Address> selectAllAddressByCustomerId(int customerId) {
        return addressMapper.selectAllAddressByCustomerId(customerId);
    }

    public void addAddress(Address address) {
        addressMapper.insert(address);
    }

    public void modifyAddress(Address address) {
        addressMapper.updateByPrimaryKey(address);
    }

    public void deleteAddress(Address address) {
        addressMapper.updateByPrimaryKey(address);
    }
}
