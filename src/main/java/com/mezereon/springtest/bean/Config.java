package com.mezereon.springtest.bean;

public class Config {
    private Integer cfgId;

    private Goods goods;

    private Integer cfgType;

    public Integer getCfgId() {
        return cfgId;
    }

    public void setCfgId(Integer cfgId) {
        this.cfgId = cfgId;
    }

    public Integer getCfgType() {
        return cfgType;
    }

    public void setCfgType(Integer cfgType) {
        this.cfgType = cfgType;
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }
}