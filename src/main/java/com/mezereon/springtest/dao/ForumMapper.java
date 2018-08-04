package com.mezereon.springtest.dao;

import com.mezereon.springtest.bean.Forum;
import com.mezereon.springtest.bean.ForumExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface ForumMapper {
    long countByExample(ForumExample example);

    int deleteByExample(ForumExample example);

    int deleteByPrimaryKey(Integer fId);

    int insert(Forum record);

    int insertSelective(Forum record);

    List<Forum> selectByExampleWithBLOBs(ForumExample example);

    List<Forum> selectByExample(ForumExample example);

    Forum selectByPrimaryKey(Integer fId);

    int updateByExampleSelective(@Param("record") Forum record, @Param("example") ForumExample example);

    int updateByExampleWithBLOBs(@Param("record") Forum record, @Param("example") ForumExample example);

    int updateByExample(@Param("record") Forum record, @Param("example") ForumExample example);

    int updateByPrimaryKeySelective(Forum record);

    int updateByPrimaryKeyWithBLOBs(Forum record);

    int updateByPrimaryKey(Forum record);
}