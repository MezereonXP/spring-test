package com.mezereon.springtest.dao;

import com.mezereon.springtest.bean.TeamShopGoods;
import com.mezereon.springtest.bean.TeamShopGoodsExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface TeamShopGoodsMapper {
    long countByExample(TeamShopGoodsExample example);

    int deleteByExample(TeamShopGoodsExample example);

    int deleteByPrimaryKey(Integer tgId);

    int insert(TeamShopGoods record);

    int insertSelective(TeamShopGoods record);

    List<TeamShopGoods> selectByExample(TeamShopGoodsExample example);

    TeamShopGoods selectByPrimaryKey(Integer tgId);

    int updateByExampleSelective(@Param("record") TeamShopGoods record, @Param("example") TeamShopGoodsExample example);

    int updateByExample(@Param("record") TeamShopGoods record, @Param("example") TeamShopGoodsExample example);

    int updateByPrimaryKeySelective(TeamShopGoods record);

    int updateByPrimaryKey(TeamShopGoods record);

    //查询所有团购商品
    List<TeamShopGoods> selectAllTSG();

    //查询该团购商品下的所有团的个数
    int selectNofTeam(Integer tgId);

}