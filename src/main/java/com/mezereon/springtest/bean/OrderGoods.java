package com.mezereon.springtest.bean;

public class OrderGoods {
    private Integer ogId;

    private Order order;

    private Goods goods;

    private Double ogPrice;

    private Integer ogQuantity;

    private Integer ogStatus;

    public Integer getOgId() {
        return ogId;
    }

    public void setOgId(Integer ogId) {
        this.ogId = ogId;
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

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }
}