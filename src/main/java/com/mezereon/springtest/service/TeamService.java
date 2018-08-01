package com.mezereon.springtest.service;

import com.mezereon.springtest.bean.Customer;
import com.mezereon.springtest.bean.Note;
import com.mezereon.springtest.bean.Order;
import com.mezereon.springtest.bean.OrderGoods;
import com.mezereon.springtest.bean.Team;
import com.mezereon.springtest.bean.TeamCustomer;
import com.mezereon.springtest.bean.TeamDisplay;
import com.mezereon.springtest.bean.TeamShopGoods;
import com.mezereon.springtest.dao.CustomerMapper;
import com.mezereon.springtest.dao.NoteMapper;
import com.mezereon.springtest.dao.OrderGoodsMapper;
import com.mezereon.springtest.dao.OrderMapper;
import com.mezereon.springtest.dao.TeamCustomerMapper;
import com.mezereon.springtest.dao.TeamMapper;
import com.mezereon.springtest.dao.TeamShopGoodsMapper;
import com.mezereon.springtest.response.Response;
import org.springframework.beans.factory.annotation.Autowired;
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

    //根据id获得团购属性
    public Response selectTeamById(int tId, int cId) {
        Response response = new Response();
        try {
            response.setStatus(true);
            Team team = teamMapper.selectByPrimaryKey(tId);
            int nowNum = teamMapper.selectNofCustomer(tId);
            TeamDisplay teamDisplay = new TeamDisplay();
            teamDisplay.setTeamId(team.gettId());
            teamDisplay.setNowPeople(nowNum);
            teamDisplay.setLeftPeople(100 - nowNum);
            teamDisplay.setHide(false);
            TeamCustomer teamCustomer = new TeamCustomer();
            Customer customer = customerMapper.selectByPrimaryKey(cId);
            teamCustomer.setCustomer(customer);
            List<TeamCustomer> teamCustomers = teamCustomerMapper.selectTeamByCustomer(teamCustomer);
            for (TeamCustomer teamCustomer1 : teamCustomers) {
                if (teamCustomer1.getTeam().gettId() == tId) {
                    teamDisplay.setHide(true);
                    break;
                }
            }
            response.setData(teamDisplay);
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
            teamMapper.insert(team);
            response.setData("成功");
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
            if (nownum == 2) {
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

    //发送信息
    public Response sendNote(int cId) {
        Response response = new Response();
        Order order = new Order();
        Customer customer = customerMapper.selectByPrimaryKey(cId);
        customer.setcId(cId);
        order.setCustomer(customer);
        order.setoType(2);
        List<Order> orders = orderMapper.selectByType(order);
        long date = new Date().getTime();
        //通知计数器
        int i = 0;
        List<OrderGoods> orderGoods = new ArrayList<>();
        for (Order order1 : orders) {
            //团购中一个订单只有一个商品，所以返回值应该只有一条
            orderGoods.add(orderGoodsMapper.selectByOrderId(order1.getoId()).get(0));
        }
        //查找到期的团购
        for (OrderGoods orderGood : orderGoods) {
            TeamShopGoods teamShopGoods = teamShopGoodsMapper.selectByPrimaryKey(orderGood.getGoods().getgId());
            if (Long.parseLong(teamShopGoods.getTgDate()) < date) {
                Note note = new Note();
                note.setnCustomer(customer);
                note.setnTipTime(teamShopGoods.getTgDate());
                note.setnNote("很抱歉，可能没有足够多志同道合的人愿意与您组团，本次团购失败");
                noteMapper.insert(note);
                i++;
                //orderMapper.updateOrder(order);
            }
        }
        //查找完成的团购
        TeamCustomer teamCustomer1 = new TeamCustomer();
        teamCustomer1.setCustomer(customer);
        List<TeamCustomer> teamCustomers = teamCustomerMapper.selectTeamByCustomer(teamCustomer1);
        List<Team> teams = new ArrayList<>();
        for (TeamCustomer teamCustomer : teamCustomers) {
            teams.add(teamCustomer.getTeam());
        }
        for (Team team : teams) {
            int nownum = teamMapper.selectNofCustomer(team.gettId());
            TeamShopGoods teamShopGoods = teamShopGoodsMapper.selectByPrimaryKey(team.getTeamShopGoods().getTgId());
            if (nownum >= teamShopGoods.getTgQuantity()) {
                Note note = new Note();
                note.setnCustomer(customer);
                note.setnTipTime(Long.toString(date));
                note.setnNote("恭喜您团购成功，请静待商品到家");
                noteMapper.insert(note);
                i++;
            }
        }
        try {
            if (i == 0) {
                response.setData(null);
            } else {
                response.setData("成功");
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
