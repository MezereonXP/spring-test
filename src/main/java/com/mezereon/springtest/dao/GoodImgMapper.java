package com.mezereon.springtest.dao;

import com.mezereon.springtest.bean.GoodImg;
import com.mezereon.springtest.bean.GoodImgExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface GoodImgMapper {
    long countByExample(GoodImgExample example);

    int deleteByExample(GoodImgExample example);

    int deleteByPrimaryKey(Integer giId);

    int insert(GoodImg record);

    int insertSelective(GoodImg record);

    List<GoodImg> selectByExample(GoodImgExample example);

    GoodImg selectByPrimaryKey(Integer giId);

    int updateByExampleSelective(@Param("record") GoodImg record, @Param("example") GoodImgExample example);

    int updateByExample(@Param("record") GoodImg record, @Param("example") GoodImgExample example);

    int updateByPrimaryKeySelective(GoodImg record);

    int updateByPrimaryKey(GoodImg record);

    List<GoodImg> selectAllgoodimg();
}