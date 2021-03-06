package com.mezereon.springtest.dao;

import com.mezereon.springtest.bean.Order;
import com.mezereon.springtest.bean.OrderExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface OrderMapper {
    long countByExample(OrderExample example);

    int deleteByExample(OrderExample example);

    int deleteByPrimaryKey(Integer oId);

    int insert(Order record);

    int insertSelective(Order record);

    List<Order> selectByExample(OrderExample example);

    Order selectByPrimaryKey(Integer oId);

    int updateByExampleSelective(@Param("record") Order record, @Param("example") OrderExample example);

    int updateByExample(@Param("record") Order record, @Param("example") OrderExample example);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);

    Order selectByOrderCode(String oCode);

    List<Order> selectAllOrderByCustomerId(int customerId);

    //根据类型查询某个客户当前类型的所有订单订单
    List<Order> selectByType(Order order);
}