package com.mezereon.springtest.bean;

public class TeamCustomer {
    private Integer tcId;

    private Integer tcTeamId;

    private Integer tcCustomerId;

    public Integer getTcId() {
        return tcId;
    }

    public void setTcId(Integer tcId) {
        this.tcId = tcId;
    }

    public Integer getTcTeamId() {
        return tcTeamId;
    }

    public void setTcTeamId(Integer tcTeamId) {
        this.tcTeamId = tcTeamId;
    }

    public Integer getTcCustomerId() {
        return tcCustomerId;
    }

    public void setTcCustomerId(Integer tcCustomerId) {
        this.tcCustomerId = tcCustomerId;
    }
}