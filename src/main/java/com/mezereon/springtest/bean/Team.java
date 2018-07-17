package com.mezereon.springtest.bean;

public class Team {
    private Integer tId;

    private Integer tTeamshopGoodsId;

    private Integer tStatus;

    public Integer gettId() {
        return tId;
    }

    public void settId(Integer tId) {
        this.tId = tId;
    }

    public Integer gettTeamshopGoodsId() {
        return tTeamshopGoodsId;
    }

    public void settTeamshopGoodsId(Integer tTeamshopGoodsId) {
        this.tTeamshopGoodsId = tTeamshopGoodsId;
    }

    public Integer gettStatus() {
        return tStatus;
    }

    public void settStatus(Integer tStatus) {
        this.tStatus = tStatus;
    }
}