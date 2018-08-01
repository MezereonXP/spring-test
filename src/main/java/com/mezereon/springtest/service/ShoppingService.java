package com.mezereon.springtest.service;

import com.mezereon.springtest.bean.Config;
import com.mezereon.springtest.bean.ConfigExample;
import com.mezereon.springtest.bean.GoodImg;
import com.mezereon.springtest.bean.GoodImgExample;
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
    @Autowired
    ConfigMapper configMapper;
    @Autowired
    GoodImgMapper goodImgMapper;

    public Goods selectByPrimaryKey(int gId) {
        Goods goods = goodsMapper.selectByPrimaryKey(gId);
        return goods;
    }

    public List<GoodImg> selectByExample(GoodImgExample goodImgExample) {
        List<GoodImg> goodImgList = goodImgMapper.selectByExample(goodImgExample);
        return goodImgList;
    }

    public List<Config> selectByExample(ConfigExample configExample) {
        List<Config> configList = configMapper.selectByExample(configExample);
        return configList;
    }

}
