package com.mezereon.springtest.dao;

import com.mezereon.springtest.bean.Goods;
import com.mezereon.springtest.bean.Team;
import com.mezereon.springtest.bean.TeamExample;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface TeamMapper {
    long countByExample(TeamExample example);

    int deleteByExample(TeamExample example);

    int deleteByPrimaryKey(Integer tId);

    //建立团购
    int insert(Team record);

    int insertSelective(Team record);

    List<Team> selectByExample(TeamExample example);

    //查询对应的团购
    Team selectByPrimaryKey(Integer tId);

    int updateByExampleSelective(@Param("record") Team record, @Param("example") TeamExample example);

    int updateByExample(@Param("record") Team record, @Param("example") TeamExample example);

    int updateByPrimaryKeySelective(Team record);

    int updateByPrimaryKey(Team record);

    //查询该团下的所有参与团购人数
    int selectNofCustomer(int t_id);

    //更新团购与顾客连接表数据
    void updateTeam(Map<String, Object> map);

}