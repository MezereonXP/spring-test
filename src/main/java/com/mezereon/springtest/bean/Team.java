package com.mezereon.springtest.bean;

import java.util.List;

public class Team {
    private Integer tId;

    private TeamShopGoods teamShopGoods;

    private Integer tStatus;

    private List<Customer> customers;

    public Integer gettId() {
        return tId;
    }

    public void settId(Integer tId) {
        this.tId = tId;
    }

    public TeamShopGoods getTeamShopGoods() {
        return teamShopGoods;
    }

    public void setTeamShopGoods(TeamShopGoods teamShopGoods) {
        this.teamShopGoods = teamShopGoods;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    public Integer gettStatus() {
        return tStatus;
    }

    public void settStatus(Integer tStatus) {
        this.tStatus = tStatus;
    }
}