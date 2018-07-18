package com.mezereon.springtest.controller;

import com.mezereon.springtest.SpringTestApplication;
import com.mezereon.springtest.dao.TeamShopGoodsMapper;
import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SpringTestApplication.class)
@WebAppConfiguration
public class TeamShopGoodsControllerTest {

    @Autowired
    TeamShopGoodsMapper teamShopGoodsMapper;

    @Test
    public void selectTeamShopGoodsById() {
        Assert.assertEquals(teamShopGoodsMapper.selectByPrimaryKey(1).getGoods().getgId(), 1, 0.00001);
    }

    @Test
    public void insertGoods() {
    }
}