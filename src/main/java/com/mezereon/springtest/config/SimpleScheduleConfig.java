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
//    @Scheduled(cron = "0/5 * * * * ?")
//    private void sendNote() {
//        Order order = new Order();
//        CustomerExample customerExample = new CustomerExample();
//        customerExample.createCriteria().andCStatusIsNotNull();
//        List<Customer> customers = customerMapper.selectByExample(customerExample);
//        for (Customer customer : customers) {
//            order.setCustomer(customer);
//            order.setoType(2);
//            List<Order> orders = orderMapper.selectByType(order);
//            long date = new Date().getTime();
//            //通知计数器
//            int i = 0;
//            List<OrderGoods> orderGoods = new ArrayList<>();
//            for (Order order1 : orders) {
//                //团购中一个订单只有一个商品，所以返回值应该只有一条
//                orderGoods.add(orderGoodsMapper.selectByOrderId(order1.getoId()).get(0));
//            }
//            //查找到期的团购
//            for (OrderGoods orderGood : orderGoods) {
//                TeamShopGoods teamShopGoods = teamShopGoodsMapper.selectByPrimaryKey(orderGood.getGoods().getgId());
//                if (Long.parseLong(teamShopGoods.getTgDate()) < date) {
//                    Note note = new Note();
//                    note.setnCustomer(customer);
//                    note.setnTipTime(teamShopGoods.getTgDate());
//                    note.setnNote("很抱歉，可能没有足够多志同道合的人愿意与您组团，本次团购失败");
//                    TeamExample teamExample = new TeamExample();
//                    teamExample.createCriteria().andTTeamshopGoodsIdEqualTo(teamShopGoods.getTgId());
//                    List<Team> teams = teamMapper.selectByExample(teamExample);
//                    for (Team team : teams) {
//                        teamMapper.deleteByPrimaryKey(team.gettId());
//                    }
//                    noteMapper.insert(note);
//                    i++;
//                    //orderMapper.updateOrder(order);
//                }
//            }
//            //查找完成的团购
//            TeamCustomer teamCustomer1 = new TeamCustomer();
//            teamCustomer1.setCustomer(customer);
//            List<TeamCustomer> teamCustomers = teamCustomerMapper.selectTeamByCustomer(teamCustomer1);
//            List<Team> teams = new ArrayList<>();
//            for (TeamCustomer teamCustomer : teamCustomers) {
//                teams.add(teamCustomer.getTeam());
//            }
//            for (Team team : teams) {
//                int nownum = teamMapper.selectNofCustomer(team.gettId());
//                TeamShopGoods teamShopGoods = teamShopGoodsMapper.selectByPrimaryKey(team.getTeamShopGoods().getTgId());
//                if (nownum >= teamShopGoods.getTgQuantity()) {
//                    Note note = new Note();
//                    note.setnCustomer(customer);
//                    note.setnTipTime(Long.toString(date));
//                    note.setnNote("恭喜您团购成功，请静待商品到家");
//                    teamMapper.deleteByPrimaryKey(team.gettId());
//                    noteMapper.insert(note);
//                    i++;
//                }
//            }
//        }
//    }
}
