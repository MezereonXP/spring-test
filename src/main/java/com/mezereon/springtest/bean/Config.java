package com.mezereon.springtest.bean;

public class Config {
    private Integer cfgId;

    private Goods goods;

    private Integer cfgType;

    private Integer cfgPricedata;

    private String cfgDescription;

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

    public Integer getCfgPricedata() {
        return cfgPricedata;
    }

    public void setCfgPricedata(Integer cfgPricedata) {
        this.cfgPricedata = cfgPricedata;
    }

    public String getCfgDescription() {
        return cfgDescription;
    }

    public void setCfgDescription(String cfgDescription) {
        this.cfgDescription = cfgDescription == null ? null : cfgDescription.trim();
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }
}