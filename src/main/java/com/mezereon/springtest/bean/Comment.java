package com.mezereon.springtest.bean;

public class Comment {
    private Integer cmId;

    private Goods goods;

    private Order order;

    private String cmInfo;

    private String cmDate;

    private Integer cmStatus;

    public Integer getCmId() {
        return cmId;
    }

    public void setCmId(Integer cmId) {
        this.cmId = cmId;
    }

    public String getCmInfo() {
        return cmInfo;
    }

    public void setCmInfo(String cmInfo) {
        this.cmInfo = cmInfo == null ? null : cmInfo.trim();
    }

    public String getCmDate() {
        return cmDate;
    }

    public void setCmDate(String cmDate) {
        this.cmDate = cmDate == null ? null : cmDate.trim();
    }

    public Integer getCmStatus() {
        return cmStatus;
    }

    public void setCmStatus(Integer cmStatus) {
        this.cmStatus = cmStatus;
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}