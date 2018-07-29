package com.mezereon.springtest.bean;

import java.util.List;

public class Shopping {
    private List<Goods> goods;
    private List<Config> config;
    private List<GoodImg> goodimg;

    public List<Goods> getGoods() {
        return goods;
    }

    public void setGoods(List<Goods> goods) {
        this.goods = goods;
    }

    public List<Config> getConfig() {
        return config;
    }

    public void setConfig(List<Config> config) {
        this.config = config;
    }

    public List<GoodImg> getGoodimg() {
        return goodimg;
    }

    public void setGoodimg(List<GoodImg> goodimg) {
        this.goodimg = goodimg;
    }
}
