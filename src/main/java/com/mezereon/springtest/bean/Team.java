package com.mezereon.springtest.bean;

public class Team {
    private Integer tId;

    private TeamShopGoods teamShopGoods;

    private Integer tStatus;

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

    public Integer gettStatus() {
        return tStatus;
    }

    public void settStatus(Integer tStatus) {
        this.tStatus = tStatus;
    }
}