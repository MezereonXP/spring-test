package com.mezereon.springtest.service;

import com.mezereon.springtest.bean.Goods;
import com.mezereon.springtest.bean.TeamShopGoods;
import com.mezereon.springtest.bean.TeamShopGoodsDisplay;
import com.mezereon.springtest.dao.GoodsMapper;
import com.mezereon.springtest.dao.TeamShopGoodsMapper;
import com.mezereon.springtest.response.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/07/19.
 */

//实现团购商品的获得中的逻辑
@Component
public class TeamShopGoodsService {
    @Autowired
    private TeamShopGoodsMapper teamShopGoodsMapper;
    @Autowired
    private GoodsMapper goodsMapper;

    //根据ID获得团购商品详细属性
    public Response selectTeamShopGoodsById(int tgId) {
        Response response = new Response();
        try {
            response.setStatus(true);
            TeamShopGoods teamShopGoods = teamShopGoodsMapper.selectByPrimaryKey(tgId);
            Goods goods = goodsMapper.selectByPrimaryKey(tgId);
            int nowTeam = teamShopGoodsMapper.selectNofTeam(tgId);
            TeamShopGoodsDisplay teamShopGoodsDisplay = new TeamShopGoodsDisplay();
            teamShopGoodsDisplay.setTeamGoodsId(tgId);
            teamShopGoodsDisplay.setName(goods.getgName());
            teamShopGoodsDisplay.setDate(teamShopGoods.getTgDate());
            teamShopGoodsDisplay.setNowTeam(nowTeam);
            int leftTeam = teamShopGoods.getTgMaxpeople() / teamShopGoods.getTgQuantity() - nowTeam;
            teamShopGoodsDisplay.setLeftTeam(leftTeam);
            teamShopGoodsDisplay.setOriginPrice(goods.getgPrice());
            teamShopGoodsDisplay.setNowPrice(teamShopGoods.getTgDiscount() * goods.getgPrice());
            teamShopGoodsDisplay.setPic(goods.getgPictureurl());
            response.setData(teamShopGoodsDisplay);
            return response;
        } catch (Exception e) {
            response.setMsg(e.getMessage());
            response.setStatus(false);
            return response;
        }
    }

    //获得全部商品的属性
    public Response selectAllTeamShopGoods() {
        Response response = new Response();
        try {
            response.setStatus(true);
            List<TeamShopGoods> teamShopGoods = teamShopGoodsMapper.selectAllTSG();
            List<TeamShopGoodsDisplay> teamShopGoodsDisplays = new ArrayList<>();
            for (TeamShopGoods teamShopGood : teamShopGoods) {
                int tgId = teamShopGood.getTgId();
                Goods goods = goodsMapper.selectByPrimaryKey(tgId);
                int nowTeam = teamShopGoodsMapper.selectNofTeam(tgId);
                TeamShopGoodsDisplay teamShopGoodsDisplay = new TeamShopGoodsDisplay();
                teamShopGoodsDisplay.setTeamGoodsId(tgId);
                teamShopGoodsDisplay.setName(goods.getgName());
                teamShopGoodsDisplay.setDate(teamShopGood.getTgDate());
                teamShopGoodsDisplay.setNowTeam(nowTeam);
                int leftTeam = teamShopGood.getTgMaxpeople() / teamShopGood.getTgQuantity() - nowTeam;
                teamShopGoodsDisplay.setLeftTeam(leftTeam);
                teamShopGoodsDisplay.setOriginPrice(goods.getgPrice());
                teamShopGoodsDisplay.setNowPrice(teamShopGood.getTgDiscount() * goods.getgPrice());
                teamShopGoodsDisplay.setPic(goods.getgPictureurl());
                teamShopGoodsDisplays.add(teamShopGoodsDisplay);
            }
            response.setData(teamShopGoodsDisplays);
            return response;
        } catch (Exception e) {
            response.setMsg(e.getMessage());
            response.setStatus(false);
            return response;
        }
    }

    //获得该种类商品的所有属性
    public Response selectTeamShopGoodsByTypeId(String catagory) {
        Response response = new Response();
        try {
            response.setStatus(true);
            List<TeamShopGoods> teamShopGoodsexample = teamShopGoodsMapper.selectAllTSG();
            List<TeamShopGoods> teamShopGoods = new ArrayList<>();
            for (TeamShopGoods teamShopGoods1 : teamShopGoodsexample) {
                if (teamShopGoods1.getGoods().getgCatagory().equals(catagory)) {
                    teamShopGoods.add(teamShopGoods1);
                }
            }
            List<TeamShopGoodsDisplay> teamShopGoodsDisplays = new ArrayList<>();
            for (TeamShopGoods teamShopGood : teamShopGoods) {
                int tgId = teamShopGood.getTgId();
                Goods goods = goodsMapper.selectByPrimaryKey(tgId);
                int nowTeam = teamShopGoodsMapper.selectNofTeam(tgId);
                TeamShopGoodsDisplay teamShopGoodsDisplay = new TeamShopGoodsDisplay();
                teamShopGoodsDisplay.setTeamGoodsId(tgId);
                teamShopGoodsDisplay.setName(goods.getgName());
                teamShopGoodsDisplay.setDate(teamShopGood.getTgDate());
                teamShopGoodsDisplay.setNowTeam(nowTeam);
                int leftTeam = teamShopGood.getTgMaxpeople() / teamShopGood.getTgQuantity() - nowTeam;
                teamShopGoodsDisplay.setLeftTeam(leftTeam);
                teamShopGoodsDisplay.setOriginPrice(goods.getgPrice());
                teamShopGoodsDisplay.setNowPrice(teamShopGood.getTgDiscount() * goods.getgPrice());
                teamShopGoodsDisplay.setPic(goods.getgPictureurl());
                teamShopGoodsDisplays.add(teamShopGoodsDisplay);
            }
            response.setData(teamShopGoodsDisplays);
            return response;
        } catch (Exception e) {
            response.setMsg(e.getMessage());
            response.setStatus(false);
            return response;
        }
    }

    //获得团购商品的商品属性
    public Response selectGoodsByTgId(int tgId) {
        Response response = new Response();
        try {
            response.setStatus(true);
            TeamShopGoods teamShopGoods = teamShopGoodsMapper.selectByPrimaryKey(tgId);
            Goods goods = teamShopGoods.getGoods();
            response.setData(goods);
            return response;
        } catch (Exception e) {
            response.setMsg(e.getMessage());
            response.setStatus(false);
            return response;
        }
    }
}
