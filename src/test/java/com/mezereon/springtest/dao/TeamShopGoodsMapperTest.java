package com.mezereon.springtest.dao;

import com.mezereon.springtest.SpringTestApplication;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SpringTestApplication.class)
@WebAppConfiguration
public class TeamShopGoodsMapperTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(TeamShopGoodsMapperTest.class.getName());

    @Autowired
    TeamShopGoodsMapper teamShopGoodsMapper;

    @Test
    public void selectAllTSGMapper() {
        LOGGER.info("SIZE", teamShopGoodsMapper.selectAllTSGMapper().size());
    }
}