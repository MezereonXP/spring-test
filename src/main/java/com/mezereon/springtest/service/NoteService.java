package com.mezereon.springtest.service;

import com.mezereon.springtest.bean.Note;
import com.mezereon.springtest.dao.NoteMapper;
import com.mezereon.springtest.response.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NoteService {

    @Autowired
    private  static NoteMapper noteMapper;

    public  static Response insert(Note note) {

        Response response = new Response();
        try {
            noteMapper.insert(note);
            response.setStatus(true);
            return response;
        } catch (Exception e) {
            response.setStatus(false);
            return response;
        }
    }
}
