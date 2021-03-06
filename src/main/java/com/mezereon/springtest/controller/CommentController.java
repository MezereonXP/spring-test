package com.mezereon.springtest.controller;

import com.mezereon.springtest.bean.Comment;
import com.mezereon.springtest.bean.Forum;
import com.mezereon.springtest.dao.CommentMapper;
import com.mezereon.springtest.dao.ForumMapper;
import com.mezereon.springtest.response.Response;
import com.mezereon.springtest.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @program: CommentController
 * @description: The controller for comment data
 * @author: mezereonxp Email: mezereonxp@gmail.com
 * @create: 2018/8/4
 **/

@RestController
public class CommentController {

    @Autowired
    private CommentService commentService;

    @Autowired
    private ForumMapper forumMapper;

    @Autowired
    private CommentMapper commentMapper;

    @RequestMapping(value = "/api/getPopularComment", method = RequestMethod.GET)
    @CrossOrigin
    public Response getPopularComment(HttpServletRequest req, HttpServletResponse resq,
                                      @RequestParam(name = "gId", required = true) Integer gId) {
        Response response = new Response();
        try {
            response.setData(commentService.getCommentPopularByGId(gId));
            response.setStatus(true);
            return response;
        } catch (Exception e) {
            response.setMsg(e.getMessage());
            response.setStatus(false);
            return response;
        }
    }

    @RequestMapping(value = "/api/getComment", method = RequestMethod.GET)
    @CrossOrigin
    public Response getComment(HttpServletRequest req, HttpServletResponse resq,
                               @RequestParam(name = "gId", required = true) Integer gId) {
        Response response = new Response();
        try {
            response.setData(commentService.getCommentByGId(gId));
            response.setStatus(true);
            return response;
        } catch (Exception e) {
            response.setMsg(e.getMessage());
            response.setStatus(false);
            return response;
        }
    }

    @RequestMapping(value = "/api/getForum", method = RequestMethod.GET)
    @CrossOrigin
    public Response getForum(HttpServletRequest req, HttpServletResponse resq,
                             @RequestParam(name = "cmId", required = true) Integer cmId) {
        Response response = new Response();
        try {
            response.setData(commentService.getForumByCMId(cmId));
            response.setStatus(true);
            return response;
        } catch (Exception e) {
            response.setMsg(e.getMessage());
            response.setStatus(false);
            return response;
        }
    }

    @RequestMapping(value = "/api/addForum", method = RequestMethod.POST)
    @CrossOrigin
    public Response addForum(HttpServletRequest req, HttpServletResponse resq,
                             @RequestBody Forum forum) {
        Response response = new Response();
        try {
            forumMapper.insert(forum);
            commentService.updateCommentStatus(forum.getComment().getCmId());
            response.setStatus(true);
            return response;
        } catch (Exception e) {
            response.setMsg(e.getMessage());
            response.setStatus(false);
            return response;
        }
    }

    @RequestMapping(value = "/api/addComment", method = RequestMethod.POST)
    @CrossOrigin
    public Response addComment(HttpServletRequest req, HttpServletResponse resq,
                               @RequestBody Comment comment) {
        Response response = new Response();
        try {
            commentMapper.insert(comment);
            response.setStatus(true);
            return response;
        } catch (Exception e) {
            response.setMsg(e.getMessage());
            response.setStatus(false);
            return response;
        }
    }
}
