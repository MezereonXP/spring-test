package com.mezereon.springtest.controller;

import com.mezereon.springtest.SpringTestApplication;
import com.mezereon.springtest.service.TeamService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SpringTestApplication.class)
@WebAppConfiguration
public class TeamControllerTest {

    @Autowired
    TeamService teamService;

    @Test
    public void selectNofCustomer() {
        Assert.assertEquals(teamService.selectNofCustomer(1).getData(), 1);
    }
}