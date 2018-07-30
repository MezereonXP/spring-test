package com.mezereon.springtest.bean;

import java.util.List;

/**
 * @program: HomeBean
 * @description: The bean class for showing goods in home page
 * @author: mezereonxp Email: mezereonxp@gmail.com
 * @create: 2018/7/27
 **/
public class HomeBean {
    private String typeName;
    private String dividePic;
    private List<String> advPic;
    private boolean isOneAdvPic;
    private List<Goods> goods;

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getDividePic() {
        return dividePic;
    }

    public void setDividePic(String dividePic) {
        this.dividePic = dividePic;
    }

    public List<String> getAdvPic() {
        return advPic;
    }

    public void setAdvPic(List<String> advPic) {
        this.advPic = advPic;
    }

    public boolean isOneAdvPic() {
        return isOneAdvPic;
    }

    public void setOneAdvPic(boolean oneAdvPic) {
        isOneAdvPic = oneAdvPic;
    }

    public List<Goods> getGoods() {
        return goods;
    }

    public void setGoods(List<Goods> goods) {
        this.goods = goods;
    }
}
