package com.mezereon.springtest.bean;

public class KillGood {
    private Integer kgId;

    private Integer kgGoodsId;

    private Integer kgQuantity;

    private String kgTime;

    private Integer kgPrice;

    public Integer getKgId() {
        return kgId;
    }

    public void setKgId(Integer kgId) {
        this.kgId = kgId;
    }

    public Integer getKgGoodsId() {
        return kgGoodsId;
    }

    public void setKgGoodsId(Integer kgGoodsId) {
        this.kgGoodsId = kgGoodsId;
    }

    public Integer getKgQuantity() {
        return kgQuantity;
    }

    public void setKgQuantity(Integer kgQuantity) {
        this.kgQuantity = kgQuantity;
    }

    public String getKgTime() {
        return kgTime;
    }

    public void setKgTime(String kgTime) {
        this.kgTime = kgTime == null ? null : kgTime.trim();
    }

    public Integer getKgPrice() {
        return kgPrice;
    }

    public void setKgPrice(Integer kgPrice) {
        this.kgPrice = kgPrice;
    }
}