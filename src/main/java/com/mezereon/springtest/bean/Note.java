package com.mezereon.springtest.bean;

public class Note {
    private Integer nId;

    private Customer customer;

    private String nTipTime;

    private String nNote;

    public Integer getnId() {
        return nId;
    }

    public void setnId(Integer nId) {
        this.nId = nId;
    }

    public Customer getnCustomer() {
        return customer;
    }

    public void setnCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getnTipTime() {
        return nTipTime;
    }

    public void setnTipTime(String nTipTime) {
        this.nTipTime = nTipTime == null ? null : nTipTime.trim();
    }

    public String getnNote() {
        return nNote;
    }

    public void setnNote(String nNote) {
        this.nNote = nNote == null ? null : nNote.trim();
    }
}