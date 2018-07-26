package com.mezereon.springtest.service;

import com.mezereon.springtest.bean.Goods;
import com.mezereon.springtest.dao.GoodsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsService {
    @Autowired
    GoodsMapper goodsMapper;

    public List<Goods> selectAllgoods() {
        List<Goods> list = goodsMapper.selectAllgoods();
        return list;
    }


}
