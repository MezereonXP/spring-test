package com.mezereon.springtest.bean;

public class GoodImg {
    private Integer giId;

    private Config config;

    private String giImg;

    public Integer getGiId() {
        return giId;
    }

    public void setGiId(Integer giId) {
        this.giId = giId;
    }

    public String getGiImg() {
        return giImg;
    }

    public void setGiImg(String giImg) {
        this.giImg = giImg == null ? null : giImg.trim();
    }

    public Config getConfig() {
        return config;
    }

    public void setConfig(Config config) {
        this.config = config;
    }
}