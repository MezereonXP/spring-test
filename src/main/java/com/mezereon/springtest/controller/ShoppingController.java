package com.mezereon.springtest.controller;

import com.mezereon.springtest.bean.Config;
import com.mezereon.springtest.bean.ConfigExample;
import com.mezereon.springtest.bean.GoodImg;
import com.mezereon.springtest.bean.GoodImgExample;
import com.mezereon.springtest.bean.Goods;
import com.mezereon.springtest.bean.Shopping;
import com.mezereon.springtest.dao.ConfigMapper;
import com.mezereon.springtest.dao.GoodImgMapper;
import com.mezereon.springtest.dao.GoodsMapper;
import com.mezereon.springtest.response.Response;
import com.mezereon.springtest.service.ShoppingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class ShoppingController {

    @Autowired
    private ShoppingService shoppingService;

    @Autowired
    private GoodsMapper goodsMapper;

    @Autowired
    private GoodImgMapper goodImgMapper;

    @Autowired
    private ConfigMapper configMapper;

    @RequestMapping(value = "api/getShopGoodInfo", method = RequestMethod.GET)
    @CrossOrigin
    public Response getShopGoodInfo(HttpServletRequest req,
                                    HttpServletResponse resp,
                                    @RequestParam(value = "gId", required = true) Integer gId) {
        Response response1 = new Response();
        try {
            //获取Good
            Goods goods = shoppingService.selectByPrimaryKey(gId);
//                    goodsMapper.selectByPrimaryKey(gId);

            //获取Config list
            ConfigExample configExample = new ConfigExample();
            configExample.createCriteria().andCfgGoodsIdEqualTo(gId);
            List<Config> configList = shoppingService.selectByExample(configExample);
//                    configMapper.selectByExample(configExample);

            List<Config> configList1 = new ArrayList<>();
            for (Config config : configList) {
                if (config.getGoods().getgId() == gId) {
                    configList1.add(config);
                }
            }

            //设置条件, 获取图片List
            GoodImgExample goodImgExample = new GoodImgExample();
            for (Config config : configList1) {
                goodImgExample.createCriteria().andGiCfgIdEqualTo(config.getCfgId());
            }
            List<GoodImg> goodImgList = shoppingService.selectByExample(goodImgExample);

//                    goodImgMapper.selectByExample(goodImgExample);

            Shopping shopping = new Shopping(goods, configList, goodImgList);

            response1.setMsg("success");
            System.out.println(goods.getgName());
            response1.setData(shopping);
            response1.setStatus(true);
            return response1;
        } catch (Exception e) {
            response1.setMsg(e.toString());
            response1.setStatus(false);
            return response1;
        }
    }
}
