package com.mezereon.springtest.controller;

import com.mezereon.springtest.bean.Customer;
import com.mezereon.springtest.bean.Team;
import com.mezereon.springtest.dao.TeamMapper;
import com.mezereon.springtest.response.Response;
import com.mezereon.springtest.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * Created by Administrator on 2018/07/19.
 */

@RestController
public class TeamController {

    @Autowired
    private TeamService teamService;
/*
    //查询顾客数量
    @RequestMapping(value="/api/selectNofCustomer",method= RequestMethod.GET)
    @CrossOrigin
    public Response selectNofCustomer(@RequestParam(value = "id", required = true) Integer t_id){
        return teamService.selectNofCustomer(t_id);
    }
    //获得团购详细数据
    @RequestMapping(value = "/api/selectTeamById",method = RequestMethod.GET)
    @CrossOrigin
    public Response selectTeamById(@RequestParam(value = "id", required = true) Integer t_id){
        return teamService.selectTeamById(t_id);
    }
    //新建团购
    @RequestMapping(value = "/api/insertTeam",method = RequestMethod.POST)
    @CrossOrigin
    public Response insertTeam(@RequestBody Map<String,Object> map){
        return teamService.insertTeam(map);
    }
    //参与团购
    @RequestMapping(value = "/api/attendTeam",method = RequestMethod.POST)
    @CrossOrigin
    public  Response attendTeam(Map<String,Object> map){
        return teamService.updateTeam(map);
    }
*//*    //发送消息
    @RequestMapping(value = "/api/sendNote",method = RequestMethod.POST)
    @CrossOrigin
    public Response sendNote(@RequestParam(value = "id", required = true) Integer c_id){
        return teamService.sendNote(c_id);
    }*/
}
