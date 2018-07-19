package com.mezereon.springtest.bean;

public class Favorite {
    private Integer fId;

    private Customer customer;

    private Goods goods;

    private Integer fStatus;

    public Integer getfId() {
        return fId;
    }

    public void setfId(Integer fId) {
        this.fId = fId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Goods getGoods() {
        return goods;
    }

    public void Goods(Goods goods) {
        this.goods = goods;
    }

    public Integer getfStatus() {
        return fStatus;
    }

    public void setfStatus(Integer fStatus) {
        this.fStatus = fStatus;
    }
}