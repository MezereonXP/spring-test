package com.mezereon.springtest.service;

import com.mezereon.springtest.bean.TeamShopGoods;
import com.mezereon.springtest.dao.GoodsMapper;
import com.mezereon.springtest.dao.TeamShopGoodsMapper;
import com.mezereon.springtest.response.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Administrator on 2018/07/19.
 */

@Component
public class TeamShopGoodsService {
    @Autowired
    private TeamShopGoodsMapper teamShopGoodsMapper;
    @Autowired
    private GoodsMapper goodsMapper;

    //根据ID获得团购商品详细属性
    public Response selectTeamShopGoodsById(int tg_id) {
        Response response = new Response();
        try {
            response.setStatus(true);
            TeamShopGoods teamShopGoods = teamShopGoodsMapper.selectByPrimaryKey(tg_id);
            response.setData(teamShopGoods);
            return response;
        } catch (Exception e) {
            response.setMsg(e.getMessage());
            response.setStatus(false);
            return response;
        }
    }

    public Response selectAllTeamShopGoods() {
        Response response = new Response();
        try {
            response.setStatus(true);
            List<TeamShopGoods> teamShopGoods = teamShopGoodsMapper.selectAllTSGMapper();
            response.setData(teamShopGoods);
            return response;
        } catch (Exception e) {
            response.setMsg(e.getMessage());
            response.setStatus(false);
            return response;
        }
    }
   /*
    public Response insertGoods(TeamShopGoods teamShopGoods) {
        Response response = new Response();
        try {
            teamShopGoodsMapper.insert(teamShopGoods);
            response.setStatus(true);
            return response;
        } catch (Exception e) {
            response.setMsg(e.getMessage());
            response.setStatus(false);
            return response;
        }
    }*/
}
