package com.mezereon.springtest.bean;

public class Order {
    private Integer oId;

    private String oCode;

    private Integer oCustomerId;

    private Integer oAddressId;

    private Integer oState;

    private Integer oType;

    private String oSetdate;

    private String oRemark;

    private Integer oStatus;

    public Integer getoId() {
        return oId;
    }

    public void setoId(Integer oId) {
        this.oId = oId;
    }

    public String getoCode() {
        return oCode;
    }

    public void setoCode(String oCode) {
        this.oCode = oCode == null ? null : oCode.trim();
    }

    public Integer getoCustomerId() {
        return oCustomerId;
    }

    public void setoCustomerId(Integer oCustomerId) {
        this.oCustomerId = oCustomerId;
    }

    public Integer getoAddressId() {
        return oAddressId;
    }

    public void setoAddressId(Integer oAddressId) {
        this.oAddressId = oAddressId;
    }

    public Integer getoState() {
        return oState;
    }

    public void setoState(Integer oState) {
        this.oState = oState;
    }

    public Integer getoType() {
        return oType;
    }

    public void setoType(Integer oType) {
        this.oType = oType;
    }

    public String getoSetdate() {
        return oSetdate;
    }

    public void setoSetdate(String oSetdate) {
        this.oSetdate = oSetdate == null ? null : oSetdate.trim();
    }

    public String getoRemark() {
        return oRemark;
    }

    public void setoRemark(String oRemark) {
        this.oRemark = oRemark == null ? null : oRemark.trim();
    }

    public Integer getoStatus() {
        return oStatus;
    }

    public void setoStatus(Integer oStatus) {
        this.oStatus = oStatus;
    }
}