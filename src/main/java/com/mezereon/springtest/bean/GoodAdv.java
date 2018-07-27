package com.mezereon.springtest.bean;

import org.springframework.stereotype.Component;

public class GoodAdv {
    private Integer advId;

    private String advGCatagory;

    private String advPic;

    public Integer getAdvId() {
        return advId;
    }

    public void setAdvId(Integer advId) {
        this.advId = advId;
    }

    public String getAdvGCatagory() {
        return advGCatagory;
    }

    public void setAdvGCatagory(String advGCatagory) {
        this.advGCatagory = advGCatagory == null ? null : advGCatagory.trim();
    }

    public String getAdvPic() {
        return advPic;
    }

    public void setAdvPic(String advPic) {
        this.advPic = advPic == null ? null : advPic.trim();
    }
}