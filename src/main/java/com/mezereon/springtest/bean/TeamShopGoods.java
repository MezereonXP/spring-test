package com.mezereon.springtest.bean;

import java.util.List;

public class TeamShopGoods {
    private Integer tgId;

    private Goods goods;

    private Double tgDiscount;

    private String tgDate;

    private Integer tgQuantity;

    private Integer tgMaxpeople;

    private List<Team> teams;

    public Integer getTgId() {
        return tgId;
    }

    public void setTgId(Integer tgId) {
        this.tgId = tgId;
    }

    public Double getTgDiscount() {
        return tgDiscount;
    }

    public void setTgDiscount(Double tgDiscount) {
        this.tgDiscount = tgDiscount;
    }

    public String getTgDate() {
        return tgDate;
    }

    public List<Team> getTeams() {
        return teams;
    }

    public void setTeams(List<Team> teams) {
        this.teams = teams;
    }

    public void setTgDate(String tgDate) {
        this.tgDate = tgDate == null ? null : tgDate.trim();
    }

    public Integer getTgQuantity() {
        return tgQuantity;
    }

    public void setTgQuantity(Integer tgQuantity) {
        this.tgQuantity = tgQuantity;
    }

    public Integer getTgMaxpeople() {
        return tgMaxpeople;
    }

    public void setTgMaxpeople(Integer tgMaxpeople) {
        this.tgMaxpeople = tgMaxpeople;
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }
}