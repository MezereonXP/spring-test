package com.mezereon.springtest.bean;

//用于向前端传递正确的Team的json数据
public class TeamDisplay {
    private int teamId;
    private int nowPeople;
    private int leftPeople;
    private int maxTeam;
    private boolean hide;

    public int getMaxTeam() {
        return maxTeam;
    }

    public void setMaxTeam(int maxTeam) {
        this.maxTeam = maxTeam;
    }

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    public int getNowPeople() {
        return nowPeople;
    }

    public void setNowPeople(int nowPeople) {
        this.nowPeople = nowPeople;
    }

    public int getLeftPeople() {
        return leftPeople;
    }

    public void setLeftPeople(int leftPeople) {
        this.leftPeople = leftPeople;
    }

    public boolean getHide() {
        return hide;
    }

    public void setHide(boolean hide) {
        this.hide = hide;
    }
}
