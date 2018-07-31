package com.mezereon.springtest.bean;

public class TeamShopGoodsDisplay {
    private int teamGoodsId;
    private String name;
    private double originPrice;
    private double nowPrice;
    private String date;
    private int nowTeam;
    private int leftTeam;
    private String pic;

    public int getTeamGoodsId() {
        return teamGoodsId;
    }

    public void setTeamGoodsId(int teamGoodsId) {
        this.teamGoodsId = teamGoodsId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getOriginPrice() {
        return originPrice;
    }

    public void setOriginPrice(double originPrice) {
        this.originPrice = originPrice;
    }

    public double getNowPrice() {
        return nowPrice;
    }

    public void setNowPrice(double nowPrice) {
        this.nowPrice = nowPrice;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getNowTeam() {
        return nowTeam;
    }

    public void setNowTeam(int nowTeam) {
        this.nowTeam = nowTeam;
    }

    public int getLeftTeam() {
        return leftTeam;
    }

    public void setLeftTeam(int leftTeam) {
        this.leftTeam = leftTeam;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }
}
