package com.mezereon.springtest.bean;

public class Comment {
    private Integer cmId;

    private Integer cmGoodsId;

    private Integer cmCustomerId;

    private String cmInfo;

    private String cmDate;

    private Integer cmStatus;

    public Integer getCmId() {
        return cmId;
    }

    public void setCmId(Integer cmId) {
        this.cmId = cmId;
    }

    public Integer getCmGoodsId() {
        return cmGoodsId;
    }

    public void setCmGoodsId(Integer cmGoodsId) {
        this.cmGoodsId = cmGoodsId;
    }

    public Integer getCmCustomerId() {
        return cmCustomerId;
    }

    public void setCmCustomerId(Integer cmCustomerId) {
        this.cmCustomerId = cmCustomerId;
    }

    public String getCmInfo() {
        return cmInfo;
    }

    public void setCmInfo(String cmInfo) {
        this.cmInfo = cmInfo == null ? null : cmInfo.trim();
    }

    public String getCmDate() {
        return cmDate;
    }

    public void setCmDate(String cmDate) {
        this.cmDate = cmDate == null ? null : cmDate.trim();
    }

    public Integer getCmStatus() {
        return cmStatus;
    }

    public void setCmStatus(Integer cmStatus) {
        this.cmStatus = cmStatus;
    }
}