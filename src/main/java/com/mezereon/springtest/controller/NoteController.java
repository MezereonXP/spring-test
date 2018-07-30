package com.mezereon.springtest.controller;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.mezereon.springtest.bean.Customer;
import com.mezereon.springtest.bean.Note;
import com.mezereon.springtest.dao.NoteMapper;
import com.mezereon.springtest.response.Response;
import com.mezereon.springtest.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class NoteController {

    private static final String HOST = "119.29.87.112";
    @Autowired
    NoteService noteService;
    @Autowired
    NoteMapper noteMapper;
    @RequestMapping(value = "/api/insertNote", method = RequestMethod.GET)
    @CrossOrigin
    public Response AddNote(@RequestParam(value = "cId",required = true) Integer cId,
                            @RequestParam(value = "kgName",required = true) String kgName,
                            @RequestParam(value = "time",required = true) String time){
        Response response = new Response();
        Note note=new Note();
        Customer customer=new Customer();
        customer.setcId(1);
        note.setnCustomer(customer);
  //      long kgTime=System.currentTimeMillis();
        note.setnTipTime(time);
        System.out.println(cId+"  "+kgName+ "   "+time);
        String kgNote="你抢购的商品"+" "+kgName+" "+"将于"+time+"开始抢购，请您做好准备";
        note.setnNote(kgNote);
        noteMapper.insert(note);
        response.setStatus(true);
        return response;
    }
}
