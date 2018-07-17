package com.mezereon.springtest.controller;

import com.mezereon.springtest.bean.TeamShopGoods;
import com.mezereon.springtest.dao.TeamShopGoodsMapper;
import com.mezereon.springtest.response.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Administrator on 2018/07/17.
 */

@RestController
public class TeamShopGoodsController {
    @Autowired
    private TeamShopGoodsMapper teamShopGoodsMapper;

    @RequestMapping(value = "/api/selectAllTeamShopGoods", method = RequestMethod.GET)
    @CrossOrigin
    public Response selectAllTeamShopGoods(@RequestParam(value = "id", required = true) Integer id) {
        Response response = new Response();
        try {
            response.setStatus(true);
            response.setData(teamShopGoodsMapper.selectByPrimaryKey(id));
            return response;
        } catch (Exception e) {
            response.setMsg(e.getMessage());
            response.setStatus(false);
            return response;
        }
    }
}
