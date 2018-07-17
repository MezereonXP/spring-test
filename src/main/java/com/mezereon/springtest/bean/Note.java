package com.mezereon.springtest.bean;

public class Note {
    private Integer nId;

    private Integer nCustomerId;

    private String nTipTime;

    private String nNote;

    public Integer getnId() {
        return nId;
    }

    public void setnId(Integer nId) {
        this.nId = nId;
    }

    public Integer getnCustomerId() {
        return nCustomerId;
    }

    public void setnCustomerId(Integer nCustomerId) {
        this.nCustomerId = nCustomerId;
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