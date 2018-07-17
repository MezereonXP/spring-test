package com.mezereon.springtest.bean;

public class ShopCar {
    private Integer sId;

    private Integer sCustomerId;

    private Integer sGoodsId;

    private Integer sQuantity;

    private Integer sStatus;

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    public Integer getsCustomerId() {
        return sCustomerId;
    }

    public void setsCustomerId(Integer sCustomerId) {
        this.sCustomerId = sCustomerId;
    }

    public Integer getsGoodsId() {
        return sGoodsId;
    }

    public void setsGoodsId(Integer sGoodsId) {
        this.sGoodsId = sGoodsId;
    }

    public Integer getsQuantity() {
        return sQuantity;
    }

    public void setsQuantity(Integer sQuantity) {
        this.sQuantity = sQuantity;
    }

    public Integer getsStatus() {
        return sStatus;
    }

    public void setsStatus(Integer sStatus) {
        this.sStatus = sStatus;
    }
}