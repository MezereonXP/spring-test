package com.mezereon.springtest.bean;

public class Goods {
    private Integer gId;

    private String gName;

    private Double gPrice;

    private String gCatagory;

    private Integer gStock;

    private String gPictureurl;

    private Integer gStatus;

    public Integer getgId() {
        return gId;
    }

    public void setgId(Integer gId) {
        this.gId = gId;
    }

    public String getgName() {
        return gName;
    }

    public void setgName(String gName) {
        this.gName = gName == null ? null : gName.trim();
    }

    public Double getgPrice() {
        return gPrice;
    }

    public void setgPrice(Double gPrice) {
        this.gPrice = gPrice;
    }

    public String getgCatagory() {
        return gCatagory;
    }

    public void setgCatagory(String gCatagory) {
        this.gCatagory = gCatagory == null ? null : gCatagory.trim();
    }

    public Integer getgStock() {
        return gStock;
    }

    public void setgStock(Integer gStock) {
        this.gStock = gStock;
    }

    public String getgPictureurl() {
        return gPictureurl;
    }

    public void setgPictureurl(String gPictureurl) {
        this.gPictureurl = gPictureurl == null ? null : gPictureurl.trim();
    }

    public Integer getgStatus() {
        return gStatus;
    }

    public void setgStatus(Integer gStatus) {
        this.gStatus = gStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Goods) {
            Goods g = (Goods) o;
            return this.gId.equals(g.getgId());

        }
        return super.equals(o);
    }
}


