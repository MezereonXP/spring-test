package com.mezereon.springtest.bean;

public class GoodImg {
    private Integer giId;

    private Integer giCfgId;

    private String giImg;

    public Integer getGiId() {
        return giId;
    }

    public void setGiId(Integer giId) {
        this.giId = giId;
    }

    public Integer getGiCfgId() {
        return giCfgId;
    }

    public void setGiCfgId(Integer giCfgId) {
        this.giCfgId = giCfgId;
    }

    public String getGiImg() {
        return giImg;
    }

    public void setGiImg(String giImg) {
        this.giImg = giImg == null ? null : giImg.trim();
    }
}