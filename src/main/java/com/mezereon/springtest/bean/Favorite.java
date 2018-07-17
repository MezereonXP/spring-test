package com.mezereon.springtest.bean;

public class Favorite {
    private Integer fId;

    private Integer fCustomerId;

    private Integer fGoodsId;

    private Integer fStatus;

    public Integer getfId() {
        return fId;
    }

    public void setfId(Integer fId) {
        this.fId = fId;
    }

    public Integer getfCustomerId() {
        return fCustomerId;
    }

    public void setfCustomerId(Integer fCustomerId) {
        this.fCustomerId = fCustomerId;
    }

    public Integer getfGoodsId() {
        return fGoodsId;
    }

    public void setfGoodsId(Integer fGoodsId) {
        this.fGoodsId = fGoodsId;
    }

    public Integer getfStatus() {
        return fStatus;
    }

    public void setfStatus(Integer fStatus) {
        this.fStatus = fStatus;
    }
}