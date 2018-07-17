package com.mezereon.springtest.bean;

public class OrderGoods {
    private Integer ogId;

    private Integer ogOrderId;

    private Integer ogGoodsId;

    private Double ogPrice;

    private Integer ogQuantity;

    private Integer ogStatus;

    public Integer getOgId() {
        return ogId;
    }

    public void setOgId(Integer ogId) {
        this.ogId = ogId;
    }

    public Integer getOgOrderId() {
        return ogOrderId;
    }

    public void setOgOrderId(Integer ogOrderId) {
        this.ogOrderId = ogOrderId;
    }

    public Integer getOgGoodsId() {
        return ogGoodsId;
    }

    public void setOgGoodsId(Integer ogGoodsId) {
        this.ogGoodsId = ogGoodsId;
    }

    public Double getOgPrice() {
        return ogPrice;
    }

    public void setOgPrice(Double ogPrice) {
        this.ogPrice = ogPrice;
    }

    public Integer getOgQuantity() {
        return ogQuantity;
    }

    public void setOgQuantity(Integer ogQuantity) {
        this.ogQuantity = ogQuantity;
    }

    public Integer getOgStatus() {
        return ogStatus;
    }

    public void setOgStatus(Integer ogStatus) {
        this.ogStatus = ogStatus;
    }
}