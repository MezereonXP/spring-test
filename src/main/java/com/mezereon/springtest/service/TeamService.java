package com.mezereon.springtest.service;

import com.mezereon.springtest.bean.*;
import com.mezereon.springtest.dao.CustomerMapper;
import com.mezereon.springtest.dao.NoteMapper;
import com.mezereon.springtest.dao.OrderGoodsMapper;
import com.mezereon.springtest.dao.OrderMapper;
import com.mezereon.springtest.dao.TeamCustomerMapper;
import com.mezereon.springtest.dao.TeamMapper;
import com.mezereon.springtest.dao.TeamShopGoodsMapper;
import com.mezereon.springtest.response.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2018/07/19.
 */

//实现团购过程中逻辑的处理
@Component
public class TeamService {

    @Autowired
    private TeamMapper teamMapper;
    @Autowired
    private TeamCustomerMapper teamCustomerMapper;
    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private NoteMapper noteMapper;
    @Autowired
    private CustomerMapper customerMapper;
    @Autowired
    private OrderGoodsMapper orderGoodsMapper;
    @Autowired
    private TeamShopGoodsMapper teamShopGoodsMapper;

    /*//根据team id获得所有参与团购的人数
    public Response selectNofCustomer(int tId) {
        Response response = new Response();
        try {
            response.setStatus(true);
            int data = teamMapper.selectNofCustomer(tId);
            response.setData(data);
            return response;
        } catch (Exception e) {
            response.setMsg(e.getMessage());
            response.setStatus(false);
            return response;
        }
    }*/

    //根据商品id获得该商品的全部数据
    public Response selectTeamByTgId(int tgId, int cId) {
        Response response = new Response();
        Team team = new Team();
        List<TeamDisplay> teamDisplays = new ArrayList<>();
        TeamExample teamExample = new TeamExample();
        teamExample.createCriteria().andTTeamshopGoodsIdEqualTo(tgId);
        List<Team> teams = teamMapper.selectByExample(teamExample);
        for (Team team1 : teams) {
            int nowNum = teamMapper.selectNofCustomer(team1.gettId());
            TeamDisplay teamDisplay = new TeamDisplay();
            teamDisplay.setTeamId(team1.gettId());
            teamDisplay.setNowPeople(nowNum);
            teamDisplay.setLeftPeople(100 - nowNum);
            teamDisplay.setHide(false);
            TeamCustomer teamCustomer = new TeamCustomer();
            Customer customer = customerMapper.selectByPrimaryKey(cId);
            teamCustomer.setCustomer(customer);
            List<TeamCustomer> teamCustomers = teamCustomerMapper.selectTeamByCustomer(teamCustomer);
            for (TeamCustomer teamCustomer1 : teamCustomers) {
                if (teamCustomer1.getTeam().gettId() == team1.gettId()) {
                    teamDisplay.setHide(true);
                    break;
                }
            }
            teamDisplays.add(teamDisplay);
        }
        try {
            response.setData(teamDisplays);
            response.setStatus(true);
            return response;
        } catch (Exception e) {
            response.setMsg(e.getMessage());
            response.setStatus(false);
            return response;
        }
    }

    //根据id获得团购属性
    public Response selectTeamById(int tId) {
        Response response = new Response();
        try {
            response.setStatus(true);
            TeamCustomerExample teamCustomerExample = new TeamCustomerExample();
            teamCustomerExample.createCriteria().andTcTeamIdEqualTo(tId);
            List<TeamCustomer> teamCustomers = teamCustomerMapper.selectByExample(teamCustomerExample);
            List<TeamCustomerDisplay> teamCustomerDisplays = new ArrayList<>();
            TeamCustomerDisplay teamCustomerDisplay = new TeamCustomerDisplay();
            for (TeamCustomer teamCustomer : teamCustomers) {
                teamCustomerDisplay.setTcdId(tId);
                teamCustomerDisplay.setCustomerName(teamCustomer.getCustomer().getcName());
                teamCustomerDisplays.add(teamCustomerDisplay);
            }
            response.setData(teamCustomerDisplays);
            return response;
        } catch (Exception e) {
            response.setMsg(e.getMessage());
            response.setStatus(false);
            return response;
        }
    }

    //创建团
    public Response insertTeam(int tgId) {
        Response response = new Response();
        try {
            Team team = new Team();
            TeamShopGoods teamShopGoods = new TeamShopGoods();
            teamShopGoods.setTgId(tgId);
            team.setTeamShopGoods(teamShopGoods);
            team.settStatus(1);
            int data = teamMapper.insert(team);
            response.setData(data);
            response.setStatus(true);
            return response;
        } catch (Exception e) {
            response.setMsg(e.getMessage());
            response.setStatus(false);
            return response;
        }
    }

    //团购中加人
    public Response updateTeam(int oId, int tId) {
        Response response = new Response();
        try {
            Order order = orderMapper.selectByPrimaryKey(oId);
            Customer customer = customerMapper.selectByPrimaryKey(order.getCustomer().getcId());
            Team team = teamMapper.selectByPrimaryKey(tId);
            TeamCustomer teamCustomer = new TeamCustomer();
            teamCustomer.setTeam(team);
            teamCustomer.setCustomer(customer);
            int nownum = teamMapper.selectNofCustomer(tId);
            int maxNum = team.getTeamShopGoods().getTgMaxpeople();
            if (nownum < maxNum) {
                teamCustomerMapper.insert(teamCustomer);
                response.setData("进团成功");
            } else {
                response.setData("对不起，你加入的团已经爆满");
            }
            response.setStatus(true);
            return response;
        } catch (Exception e) {
            response.setMsg(e.getMessage());
            response.setStatus(false);
            return response;
        }
    }
}
