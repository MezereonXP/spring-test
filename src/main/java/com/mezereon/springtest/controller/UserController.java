package com.mezereon.springtest.controller;

import com.mezereon.springtest.bean.User;
import com.mezereon.springtest.dao.UserMapper;
import com.mezereon.springtest.response.Response;

import javax.servlet.http.Cookie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @program: UserController
 * @description: Offer the interface to operate the data of user
 * @author: mezereonxp Email: mezereonxp@gmail.com
 * @create: 2018/7/11
 **/
@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping(value = "/api/getUser", method = RequestMethod.GET)
    @CrossOrigin
    public Response getTeamBlog(HttpServletRequest req,
                                HttpServletResponse resp,
                                @RequestParam(value = "id", required = true) Integer id) {
        Response response = new Response();
        Cookie cookie = new Cookie("userId", "" + id);
        resp.addCookie(cookie);
        try {
            response.setStatus(true);
            response.setData(userMapper.selectByPrimaryKey(id));
            return response;
        } catch (Exception e) {
            response.setMsg(e.getMessage());
            response.setStatus(false);
            return response;
        }
    }

    @RequestMapping(value = "/api/getAllUser", method = RequestMethod.GET)
    @CrossOrigin
    public Response getAllUser() {
        Response response = new Response();
        try {
            response.setStatus(true);
            response.setData(userMapper.getAllUsers());
            return response;
        } catch (Exception e) {
            response.setMsg(e.getMessage());
            response.setStatus(false);
            return response;
        }
    }

    @RequestMapping(value = "/api/addUser", method = RequestMethod.GET)
    @CrossOrigin
    public Response addUser(HttpServletRequest req,
                            HttpServletResponse resp,
                            @RequestBody User user) {
        Response response = new Response();
        try {
            response.setStatus(true);
            userMapper.insert(user);
            return response;
        } catch (Exception e) {
            response.setMsg(e.getMessage());
            response.setStatus(false);
            return response;
        }
    }

    @RequestMapping(value = "/api/check", method = RequestMethod.GET)
    @CrossOrigin
    public Response checkCookies(HttpServletRequest req,
                                 HttpServletResponse resp) {
        Response response = new Response();
        String result = "";
        try {
            response.setStatus(true);
            Cookie[] cookies = req.getCookies();
            for (Cookie cookie : cookies) {
                result += "Name: " + cookie.getName() + ";"
                        + "Path: " + cookie.getPath() + ";"
                        + "Value: " + cookie.getValue() + "\n";
            }
            response.setData(result);
            return response;
        } catch (Exception e) {
            response.setMsg(e.getMessage());
            response.setStatus(false);
            return response;
        }
    }

    public UserMapper getUserMapper() {
        return userMapper;
    }

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }
}
