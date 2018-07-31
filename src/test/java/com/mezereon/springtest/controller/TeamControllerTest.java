package com.mezereon.springtest.controller;

import com.mezereon.springtest.SpringTestApplication;
import com.mezereon.springtest.bean.*;
import com.mezereon.springtest.dao.NoteMapper;
import com.mezereon.springtest.dao.TeamCustomerMapper;
import com.mezereon.springtest.dao.TeamMapper;
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
    @Autowired
    TeamController teamController;
    @Autowired
    TeamMapper teamMapper;
    @Autowired
    NoteMapper noteMapper;
    @Autowired
    TeamCustomerMapper teamCustomerMapper;

    /*@Test
    public void selectNofCustomer() {
        Assert.assertEquals(teamService.selectNofCustomer(1).getData(), 1);
    }*/
    /*@Test
     *//*public void selectTeamById(){
        int cId=1;
        int tId=1;
        Assert.assertEquals(teamService.selectTeamById(tId,cId),);
    }*/

    @Test
    public void addNote() {
        Note note = new Note();
        Customer customer = new Customer();
        customer.setcId(1);
        note.setnCustomer(customer);
        note.setnTipTime("111111111111");
        note.setnNote("23333");
        noteMapper.insert(note);
        Assert.assertEquals(noteMapper.selectByPrimaryKey(1).getnNote(), "23333");
    }

    @Test
    public void selectTeamByPrimaryKey() {
        Assert.assertEquals(teamMapper.selectByPrimaryKey(1).gettId(), 1, 0.00001);
    }

    @Test
    public void insertTeam() {
        int tgId = 1;
        TeamShopGoods teamShopGoods = new TeamShopGoods();
        teamShopGoods.setTgId(1);
        Assert.assertEquals(teamService.insertTeam(tgId).getData(), 1);
    }

    @Test
    public void updateTeamCustomer() {
        int oId = 1;
        int tId = 1;
        teamService.updateTeam(oId, tId);
    }

    @Test
    public void addNote2() {
        int cId = 1;
        teamService.sendNote(cId);
    }
}