package com.mezereon.springtest.dao;

import com.mezereon.springtest.bean.TeamCustomer;
import com.mezereon.springtest.bean.TeamCustomerExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TeamCustomerMapper {
    long countByExample(TeamCustomerExample example);

    int deleteByExample(TeamCustomerExample example);

    int deleteByPrimaryKey(Integer tcId);

    int insert(TeamCustomer record);

    int insertSelective(TeamCustomer record);

    List<TeamCustomer> selectByExample(TeamCustomerExample example);

    TeamCustomer selectByPrimaryKey(Integer tcId);

    int updateByExampleSelective(@Param("record") TeamCustomer record, @Param("example") TeamCustomerExample example);

    int updateByExample(@Param("record") TeamCustomer record, @Param("example") TeamCustomerExample example);

    int updateByPrimaryKeySelective(TeamCustomer record);

    int updateByPrimaryKey(TeamCustomer record);

    //根据客户id查询该客户参加的所有团
    List<TeamCustomer> selectTeamByCustomer(TeamCustomer teamCustomer);
}