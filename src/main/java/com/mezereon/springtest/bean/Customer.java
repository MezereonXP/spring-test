package com.mezereon.springtest.bean;

public class Customer {
    private Integer cId;

    private String cPassword;

    private String cName;

    private Integer cSex;

    private String cBirthday;

    private String cTelephone;

    private String cArea;

    private String cBankcard;

    private String cEmail;

    private String cPictureurl;

    private Integer cStatus;

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public String getcPassword() {
        return cPassword;
    }

    public void setcPassword(String cPassword) {
        this.cPassword = cPassword == null ? null : cPassword.trim();
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName == null ? null : cName.trim();
    }

    public Integer getcSex() {
        return cSex;
    }

    public void setcSex(Integer cSex) {
        this.cSex = cSex;
    }

    public String getcBirthday() {
        return cBirthday;
    }

    public void setcBirthday(String cBirthday) {
        this.cBirthday = cBirthday == null ? null : cBirthday.trim();
    }

    public String getcTelephone() {
        return cTelephone;
    }

    public void setcTelephone(String cTelephone) {
        this.cTelephone = cTelephone == null ? null : cTelephone.trim();
    }

    public String getcArea() {
        return cArea;
    }

    public void setcArea(String cArea) {
        this.cArea = cArea == null ? null : cArea.trim();
    }

    public String getcBankcard() {
        return cBankcard;
    }

    public void setcBankcard(String cBankcard) {
        this.cBankcard = cBankcard == null ? null : cBankcard.trim();
    }

    public String getcEmail() {
        return cEmail;
    }

    public void setcEmail(String cEmail) {
        this.cEmail = cEmail == null ? null : cEmail.trim();
    }

    public String getcPictureurl() {
        return cPictureurl;
    }

    public void setcPictureurl(String cPictureurl) {
        this.cPictureurl = cPictureurl == null ? null : cPictureurl.trim();
    }

    public Integer getcStatus() {
        return cStatus;
    }

    public void setcStatus(Integer cStatus) {
        this.cStatus = cStatus;
    }
}