package com.mezereon.springtest.controller;

import com.mezereon.springtest.SpringTestApplication;
import com.mezereon.springtest.bean.Team;
import com.mezereon.springtest.bean.TeamShopGoods;
import com.mezereon.springtest.dao.TeamMapper;
import com.mezereon.springtest.dao.TeamShopGoodsMapper;
import com.mezereon.springtest.service.TeamService;
import com.mezereon.springtest.service.TeamShopGoodsService;
import org.junit.Assert;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.ArrayList;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SpringTestApplication.class)
@WebAppConfiguration
public class TeamShopGoodsControllerTest {

    @Autowired
    TeamShopGoodsMapper teamShopGoodsMapper;
    @Autowired
    TeamShopGoodsService teamShopGoodsService;

    @Test
    public void selectTeamShopGoodsById() {
        Assert.assertEquals(teamShopGoodsMapper.selectByPrimaryKey(1).getGoods().getgId(), 1, 0.00001);
    }

    @Test
    public void selectAllTSG() {
        Assert.assertEquals(teamShopGoodsMapper.selectAllTSG().get(0).getTgId(), 1, 0.00001);
    }

    @Test
    public void insertGoods() {
    }
}