package com.mezereon.springtest.bean;

import java.util.List;

public class Shopping {
    private Goods goods;
    private List<Config> config;
    private List<GoodImg> goodimg;

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
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

    public Shopping(Goods goods, List<Config> config, List<GoodImg> goodimg) {
        this.goods = goods;
        this.config = config;
        this.goodimg = goodimg;
    }
}
