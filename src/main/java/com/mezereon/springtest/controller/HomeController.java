package com.mezereon.springtest.controller;

import com.mezereon.springtest.bean.GoodAdv;
import com.mezereon.springtest.bean.GoodAdvExample;
import com.mezereon.springtest.bean.Goods;
import com.mezereon.springtest.bean.HomeBean;
import com.mezereon.springtest.dao.GoodAdvMapper;
import com.mezereon.springtest.response.Response;
import com.mezereon.springtest.service.GoodsService;
import com.mezereon.springtest.util.Util;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: HomeController
 * @description: Controller
 * @author: mezereonxp Email: mezereonxp@gmail.com
 * @create: 2018/7/27
 **/

@RestController
public class HomeController {

  private final static String MOBILE = "手机";
  private final static String LAPTOP = "笔记本平板";
  private final static String FURNITURE = "智能家居";
  private final static String FITTING = "配件";
  private final static String EAR_PHONE = "耳机音箱";

  private final static String MOBILE_URL = "https://i1.mifile.cn/a4/xmad_15299774887546_atPHd.jpg";
  private final static String LAPTOP_URL = "https://i1.mifile.cn/a4/xmad_1531969003126_XdRfS.jpg";
  private final static String FURNITURE_URL = "https://i1.mifile.cn/a4/xmad_15204795762271_ZwaxE.jpg";
  private final static String FITTING_URL = "https://i1.mifile.cn/a4/xmad_15204798088946_YvzWs.jpg";
  private final static String EAR_PHONE_URL = "https://i1.mifile.cn/a4/xmad_15204799796935_WjnpM.jpg";

  @Autowired
  private GoodsService goodsService;

  @Autowired
  private GoodAdvMapper goodAdvMapper;

  /**
   * 查询首页所有的商品信息
   */
  @RequestMapping(value = "/api/getAllGoods", method = RequestMethod.GET)
  @CrossOrigin
  public Response getAllGoods() {
    Response response = new Response();
    try {
      List<Goods> goods = goodsService.selectAllgoods();
      List<HomeBean> homeBeans = new ArrayList<>();
      for (Goods good : goods) {
        int position = haveSameCatagory(homeBeans, good);
        if (position != -1) {
          homeBeans.get(position).getGoods().add(good);
        } else {
          homeBeans.add(generateHomeBean(good));
        }
      }
      response.setMsg("success");
      response.setData(homeBeans);
      response.setStatus(true);
      return response;
    } catch (Exception e) {
      response.setMsg(e.toString());
      response.setStatus(false);
      return response;
    }
  }

  private HomeBean generateHomeBean(Goods good) {
    HomeBean homeBean = new HomeBean();
    homeBean.setGoods(new ArrayList<>());
    homeBean.getGoods().add(good);
    homeBean.setOneAdvPic(good.getgCatagory().equals(MOBILE));
    homeBean.setTypeName(good.getgCatagory());
    //这里是生成一个单表的条件查询, 利用Example来进行查询
    GoodAdvExample goodAdvExample = new GoodAdvExample();
    goodAdvExample.createCriteria().andAdvGCatagoryEqualTo(good.getgCatagory());
    List<GoodAdv> goodAdvs = goodAdvMapper.selectByExample(goodAdvExample);
    homeBean.setAdvPic(toStringArray(goodAdvs));
    homeBean.setDividePic(getDividePicByCatagory(good.getgCatagory()));
    return homeBean;
  }

  private String getDividePicByCatagory(String s) {
    switch (s) {
      case MOBILE:
        return MOBILE_URL;
      case LAPTOP:
        return LAPTOP_URL;
      case FURNITURE:
        return FURNITURE_URL;
      case FITTING:
        return FITTING_URL;
      case EAR_PHONE:
        return EAR_PHONE_URL;
    }
    return EAR_PHONE_URL;
  }

  /**
   * 将GoodAdv数组的url组合成String数组并且返回
   */
  private List<String> toStringArray(List<GoodAdv> goodAdvs) {
    List<String> stringList = new ArrayList<>();
    for (int i = 0; i < goodAdvs.size(); i++) {
      stringList.add(goodAdvs.get(i).getAdvPic());
    }
    return stringList;
  }

  /**
   * 判断HomeBean数组里面是否含有相同类别的HomeBean
   */
  private int haveSameCatagory(List<HomeBean> homeBeans, Goods good) {
    for (int i = 0; i < homeBeans.size(); i++) {
      if (homeBeans.get(i).getTypeName().equals(good.getgCatagory())) {
        return i;
      }
    }
    return -1;
  }

}
