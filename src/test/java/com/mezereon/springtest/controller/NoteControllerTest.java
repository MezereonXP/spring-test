package com.mezereon.springtest.controller;

import com.mezereon.springtest.SpringTestApplication;
import com.mezereon.springtest.bean.Customer;
import com.mezereon.springtest.bean.Note;;
import com.mezereon.springtest.dao.NoteMapper;
import com.mezereon.springtest.response.Response;
import com.mezereon.springtest.service.NoteService;
import com.mezereon.springtest.service.TeamService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SpringTestApplication.class)
@WebAppConfiguration

public class NoteControllerTest {

 @Autowired
 NoteService noteService;
 @Autowired
    NoteMapper noteMapper;

    @Test
    public void insertNote(){
        Note note=new Note();
        Customer customer=new Customer();
        customer.setcId(1);
        note.setnCustomer(customer);
        note.setnTipTime("54645646456");
        note.setnNote("抢购即将开始");
        noteMapper.insert(note);
        Assert.assertEquals(noteMapper.selectByPrimaryKey(2).getnNote(),"抢购即将开始");
    }
}