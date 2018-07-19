package com.mezereon.springtest.bean;

public class Address {
    private Integer aId;

    private Customer customer;

    private String aReceiver;

    private String aTelephone;

    private String aZipcode;

    private String aDetail;

    private Integer aStatus;

    public Integer getaId() {
        return aId;
    }

    public void setaId(Integer aId) {
        this.aId = aId;
    }


    public String getaReceiver() {
        return aReceiver;
    }

    public void setaReceiver(String aReceiver) {
        this.aReceiver = aReceiver == null ? null : aReceiver.trim();
    }

    public String getaTelephone() {
        return aTelephone;
    }

    public void setaTelephone(String aTelephone) {
        this.aTelephone = aTelephone == null ? null : aTelephone.trim();
    }

    public String getaZipcode() {
        return aZipcode;
    }

    public void setaZipcode(String aZipcode) {
        this.aZipcode = aZipcode == null ? null : aZipcode.trim();
    }

    public String getaDetail() {
        return aDetail;
    }

    public void setaDetail(String aDetail) {
        this.aDetail = aDetail == null ? null : aDetail.trim();
    }

    public Integer getaStatus() {
        return aStatus;
    }

    public void setaStatus(Integer aStatus) {
        this.aStatus = aStatus;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}