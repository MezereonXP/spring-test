package com.mezereon.springtest.dao;

import com.mezereon.springtest.bean.KillGood;
import com.mezereon.springtest.bean.KillGoodExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface KillGoodMapper {

    long countByExample(KillGoodExample example);

    int deleteByExample(KillGoodExample example);

    int deleteByPrimaryKey(Integer kgId);

    int insert(KillGood record);

    int insertSelective(KillGood record);

    List<KillGood> selectByExample(KillGoodExample example);

    KillGood selectByPrimaryKey(Integer kgId);

    int updateByExampleSelective(@Param("record") KillGood record, @Param("example") KillGoodExample example);

    int updateByExample(@Param("record") KillGood record, @Param("example") KillGoodExample example);

    int updateByPrimaryKeySelective(KillGood record);

    int updateByPrimaryKey(KillGood record);

    List<KillGood> selectKillGoods();

}