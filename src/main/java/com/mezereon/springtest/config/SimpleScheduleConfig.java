package com.mezereon.springtest.config;

import com.mezereon.springtest.bean.*;
import com.mezereon.springtest.dao.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @program: SimpleScheduleConfig
 * @description: Set the schedule class
 * @author: mezereonxp Email: mezereonxp@gmail.com
 * @create: 2018/8/2
 **/
@Service
@Configuration //1.主要用于标记配置类，兼备Component的效果。
@EnableScheduling // 2.开启定时任务
public class SimpleScheduleConfig {
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

    // 3.添加定时任务,发送消息
    @Scheduled(cron = "0/5 * * * * ?")
    private void sendNote() {
        long date = new Date().getTime();
        //查询到期团购
        TeamShopGoodsExample teamShopGoodsExample = new TeamShopGoodsExample();
        teamShopGoodsExample.createCriteria().andTgDateLessThanOrEqualTo(Long.toString(date));
        List<TeamShopGoods> teamShopGoods = teamShopGoodsMapper.selectByExample(teamShopGoodsExample);
        for (TeamShopGoods teamShopGood : teamShopGoods) {
            TeamExample teamExample = new TeamExample();
            teamExample.createCriteria().andTTeamshopGoodsIdEqualTo(teamShopGood.getTgId());
            List<Team> teams = teamMapper.selectByExample(teamExample);
            for (Team team : teams) {
                TeamCustomerExample teamCustomerExample = new TeamCustomerExample();
                teamCustomerExample.createCriteria().andTcTeamIdEqualTo(team.gettId());
                List<TeamCustomer> teamCustomers = teamCustomerMapper.selectByExample(teamCustomerExample);
                for (TeamCustomer teamCustomer : teamCustomers) {
                    Note note = new Note();
                    note.setnCustomer(teamCustomer.getCustomer());
                    note.setnTipTime(teamShopGood.getTgDate());
                    note.setnNote("团购超时,失败");
                    noteMapper.insert(note);
                }
                teamCustomerMapper.deleteByExample(teamCustomerExample);
                teamMapper.deleteByPrimaryKey(team.gettId());
            }
        }
        //查询已完成团购
        TeamExample teamExample = new TeamExample();
        teamExample.createCriteria().andTIdIsNotNull();
        List<Team> teams = teamMapper.selectByExample(teamExample);
        for (Team team : teams) {
            TeamCustomerExample teamCustomerExample = new TeamCustomerExample();
            teamCustomerExample.createCriteria().andTcTeamIdEqualTo(team.gettId());
            List<TeamCustomer> teamCustomers = teamCustomerMapper.selectByExample(teamCustomerExample);
            long NofCustomer = teamCustomerMapper.countByExample(teamCustomerExample);
            int maxNum1 = team.getTeamShopGoods().getTgQuantity();
            long maxNum = Long.parseLong(String.valueOf(maxNum1));
            if (maxNum <= NofCustomer) {
                for (TeamCustomer teamCustomer : teamCustomers) {
                    Note note = new Note();
                    note.setnCustomer(teamCustomer.getCustomer());
                    note.setnTipTime(Long.toString(date));
                    note.setnNote("团购成功，请静候商品到家");
                    System.out.println(note.getnTipTime());
                    noteMapper.insert(note);
                }
                teamCustomerMapper.deleteByExample(teamCustomerExample);
                teamMapper.deleteByPrimaryKey(team.gettId());
            }
        }
    }
}
