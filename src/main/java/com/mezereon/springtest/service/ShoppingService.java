package com.mezereon.springtest.service;

import com.mezereon.springtest.bean.Config;
import com.mezereon.springtest.bean.GoodImg;
import com.mezereon.springtest.bean.Goods;
import com.mezereon.springtest.dao.ConfigMapper;
import com.mezereon.springtest.dao.GoodImgMapper;
import com.mezereon.springtest.dao.GoodsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShoppingService {
    @Autowired
    GoodsMapper goodsMapper;
    ConfigMapper configMapper;
    GoodImgMapper goodImgMapper;

    public List<Goods> selectAllgoods() {
        List<Goods> list = goodsMapper.selectAllgoods();
        return list;
    }

    public List<Config> selectAllconfig() {
        List<Config> list1 = configMapper.selectAllconfig();
        return list1;
    }

    public List<GoodImg> selectAllgoodImg() {
        List<GoodImg> list2 = goodImgMapper.selectAllgoodimg();
        return list2;
    }

}
