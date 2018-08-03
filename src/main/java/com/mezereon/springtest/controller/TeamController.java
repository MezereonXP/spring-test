package com.mezereon.springtest.controller;

import com.mezereon.springtest.dao.TeamMapper;
import com.mezereon.springtest.response.Response;
import com.mezereon.springtest.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/07/19.
 */

//团购管理
@RestController
public class TeamController {

    @Autowired
    private TeamService teamService;
    @Autowired
    TeamMapper teamMapper;

   /* //查询顾客数量
    @RequestMapping(value = "/api/selectNofCustomer", method = RequestMethod.GET)
    @CrossOrigin
    public Response selectNofCustomer(@RequestParam(value = "id", required = true) Integer tId) {
        return teamService.selectNofCustomer(tId);
    }*/

    //根据团购商品Id获得团购信息
    @RequestMapping(value = "/api/getTeamByTgId", method = RequestMethod.GET)
    @CrossOrigin
    public Response getTeamByTgId(@RequestParam(value = "tgId", required = true) Integer tgId, @RequestParam(value = "cId", required = true) Integer cId) {
        return teamService.selectTeamByTgId(tgId, cId);
    }
    //获得团购详细数据
    @RequestMapping(value = "/api/getTeamByTId", method = RequestMethod.GET)
    @CrossOrigin
    public Response getTeamById(@RequestParam(value = "tId", required = true) Integer tId) {
        return teamService.selectTeamById(tId);
    }

    //新建团购
    @RequestMapping(value = "/api/insertTeam", method = RequestMethod.POST)
    @CrossOrigin
    public Response insertTeam(@RequestParam(value = "tgId", required = true) Integer tgId) {
        return teamService.insertTeam(tgId);
    }

    //参与团购
    @RequestMapping(value = "/api/attendTeam", method = RequestMethod.POST)
    @CrossOrigin
    public Response updateTeam(@RequestParam(value = "oId", required = true) Integer oId, @RequestParam(value = "tId", required = true) Integer tId) {

        return teamService.updateTeam(oId, tId);
    }

}
