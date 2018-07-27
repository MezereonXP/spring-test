package com.mezereon.springtest.dao;

import com.mezereon.springtest.bean.GoodAdv;
import com.mezereon.springtest.bean.GoodAdvExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface GoodAdvMapper {

    long countByExample(GoodAdvExample example);

    int deleteByExample(GoodAdvExample example);

    int deleteByPrimaryKey(Integer advId);

    int insert(GoodAdv record);

    int insertSelective(GoodAdv record);

    List<GoodAdv> selectByExample(GoodAdvExample example);

    GoodAdv selectByPrimaryKey(Integer advId);

    int updateByExampleSelective(@Param("record") GoodAdv record, @Param("example") GoodAdvExample example);

    int updateByExample(@Param("record") GoodAdv record, @Param("example") GoodAdvExample example);

    int updateByPrimaryKeySelective(GoodAdv record);

    int updateByPrimaryKey(GoodAdv record);
}