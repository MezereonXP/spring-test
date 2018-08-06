package com.mezereon.springtest.controller;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.mezereon.springtest.bean.Customer;
import com.mezereon.springtest.bean.Note;
import com.mezereon.springtest.dao.NoteMapper;
import com.mezereon.springtest.response.Response;
import com.mezereon.springtest.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class NoteController {

    private static final String HOST = "119.29.87.112";
    @Autowired
    NoteService noteService;
    @Autowired
    NoteMapper noteMapper;

    @RequestMapping(value = "/api/insertNote", method = RequestMethod.GET)
    @CrossOrigin
    public Response AddNote(@RequestParam(value = "cId", required = true) Integer cId,
                            @RequestParam(value = "kgName", required = true) String kgName,
                            @RequestParam(value = "time", required = true) String time,
                            @RequestParam(value = "killGoodDate", required = true) String killGoodDate,
                            @RequestParam(value = "kgMsg", required = true) String kgMsg) {

        List<Note> noteList = new ArrayList<>();
        Response response = new Response();
        Note note = new Note();
        Customer customer = new Customer();

        customer.setcId(cId);
        note.setnCustomer(customer);
        note.setnTipTime(killGoodDate);
        String kgNote = "你抢购的商品" + " " + kgName + " " + "将于" + time + "开始抢购，请您做好准备";
        note.setnNote(kgNote);
        try {
            if (!kgMsg.equals("success") && !kgMsg.equals("over")) {

                noteMapper.insert(note);
                response.setMsg("true");
                response.setStatus(true);
            } else {
                System.out.println(kgMsg);
                response.setMsg("fail");
                response.setStatus(false);
            }
            return response;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            response.setStatus(false);
            response.setMsg(e.getMessage());
            return response;
        }
    }

    @RequestMapping(value = "/api/selectNoteByCustomerId", method = RequestMethod.GET)
    @CrossOrigin
    public Response selectNoteByCustomerId(int customerId) {
        Response response = new Response();
        try {
            List<Note> list = noteService.selectNoteByCustomerId(customerId);

            response.setData(list);
            return response;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            response.setStatus(false);
            response.setMsg(e.getMessage());
            return response;
        }
    }
}
