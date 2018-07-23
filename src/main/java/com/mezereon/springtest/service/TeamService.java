package com.mezereon.springtest.service;

import com.mezereon.springtest.bean.Note;
import com.mezereon.springtest.bean.Order;
import com.mezereon.springtest.bean.Team;
import com.mezereon.springtest.bean.TeamShopGoods;
import com.mezereon.springtest.dao.CustomerMapper;
import com.mezereon.springtest.dao.NoteMapper;
import com.mezereon.springtest.dao.OrderMapper;
import com.mezereon.springtest.dao.TeamMapper;
import com.mezereon.springtest.response.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * Created by Administrator on 2018/07/19.
 */

@Service
public class TeamService {

    @Autowired
    private TeamMapper teamMapper;
    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private NoteMapper noteMapper;
    @Autowired
    private CustomerMapper customerMapper;

    //根据team id获得所有参与团购的人数
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
    }
 /*   //根据id获得团购属性
    public Response selectTeamById(int id){
        Response response = new Response();
        try{
            response.setStatus(true);
            Team data=teamMapper.selectByPrimaryKey(id);
            response.setData(data);
            return  response;
        }catch (Exception e){
            response.setMsg(e.getMessage());
            response.setStatus(false);
            return response;
        }
    }
    //创建团购
    public Response insertTeam(Team team,int c_id){
        int t_id=team.gettId();
        Map<String,Object> map=new HashMap();
        map.put("tc_team_id",t_id);
        map.put("tc_customer_id",c_id);
        Response response = new Response();
        try{
            teamMapper.insert(team);
            teamMapper.updateTeam(map);
            response.setStatus(true);
            return response;
        }catch (Exception e){
            response.setMsg(e.getMessage());
            response.setStatus(false);
            return response;
        }
    }
    //参与团购
    public Response updateTeam(Team team,int cId){
        int tId=team.gettId();
        Map<String,Object> map=new HashMap();
        map.put("tc_team_id",tid);
        map.put("tc_customer_id",cid);
        Response response = new Response();
        try{
            teamMapper.updateTeam(map);
            response.setStatus(true);
            return response;
        }catch (Exception e){
            response.setMsg(e.getMessage());
            response.setStatus(false);
            return response;
        }
    }*/
   /* //发送信息
    public Response sendNote(int c_id){
        Response response = new Response();
        List<Note> notes = new ArrayList<Note>();
        Note note = new Note();
        List<Order> orders=orderMapper.selectByType(2);
        long date = new Date().getTime();
        int i=0;
        try{
            for (Order order:orders) {
                if(order.get){
                    i++;

                    order.setoStatus(3);
                    orderMapper.updateOrder(order);
                }
            }
            if(i==0){
                response.setData(null);
                return response;
            }else{
                return response;
            }
            response.setStatus(true);
        }catch (Exception e){
            response.setMsg(e.getMessage());
            response.setStatus(false);
            return response;
        }
    }*/
}
