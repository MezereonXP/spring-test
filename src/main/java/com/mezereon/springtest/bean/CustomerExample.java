package com.mezereon.springtest.bean;

import java.util.ArrayList;
import java.util.List;

public class CustomerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomerExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andCIdIsNull() {
            addCriterion("c_id is null");
            return (Criteria) this;
        }

        public Criteria andCIdIsNotNull() {
            addCriterion("c_id is not null");
            return (Criteria) this;
        }

        public Criteria andCIdEqualTo(Integer value) {
            addCriterion("c_id =", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotEqualTo(Integer value) {
            addCriterion("c_id <>", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdGreaterThan(Integer value) {
            addCriterion("c_id >", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_id >=", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdLessThan(Integer value) {
            addCriterion("c_id <", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdLessThanOrEqualTo(Integer value) {
            addCriterion("c_id <=", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdIn(List<Integer> values) {
            addCriterion("c_id in", values, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotIn(List<Integer> values) {
            addCriterion("c_id not in", values, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdBetween(Integer value1, Integer value2) {
            addCriterion("c_id between", value1, value2, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotBetween(Integer value1, Integer value2) {
            addCriterion("c_id not between", value1, value2, "cId");
            return (Criteria) this;
        }

        public Criteria andCPasswordIsNull() {
            addCriterion("c_password is null");
            return (Criteria) this;
        }

        public Criteria andCPasswordIsNotNull() {
            addCriterion("c_password is not null");
            return (Criteria) this;
        }

        public Criteria andCPasswordEqualTo(String value) {
            addCriterion("c_password =", value, "cPassword");
            return (Criteria) this;
        }

        public Criteria andCPasswordNotEqualTo(String value) {
            addCriterion("c_password <>", value, "cPassword");
            return (Criteria) this;
        }

        public Criteria andCPasswordGreaterThan(String value) {
            addCriterion("c_password >", value, "cPassword");
            return (Criteria) this;
        }

        public Criteria andCPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("c_password >=", value, "cPassword");
            return (Criteria) this;
        }

        public Criteria andCPasswordLessThan(String value) {
            addCriterion("c_password <", value, "cPassword");
            return (Criteria) this;
        }

        public Criteria andCPasswordLessThanOrEqualTo(String value) {
            addCriterion("c_password <=", value, "cPassword");
            return (Criteria) this;
        }

        public Criteria andCPasswordLike(String value) {
            addCriterion("c_password like", value, "cPassword");
            return (Criteria) this;
        }

        public Criteria andCPasswordNotLike(String value) {
            addCriterion("c_password not like", value, "cPassword");
            return (Criteria) this;
        }

        public Criteria andCPasswordIn(List<String> values) {
            addCriterion("c_password in", values, "cPassword");
            return (Criteria) this;
        }

        public Criteria andCPasswordNotIn(List<String> values) {
            addCriterion("c_password not in", values, "cPassword");
            return (Criteria) this;
        }

        public Criteria andCPasswordBetween(String value1, String value2) {
            addCriterion("c_password between", value1, value2, "cPassword");
            return (Criteria) this;
        }

        public Criteria andCPasswordNotBetween(String value1, String value2) {
            addCriterion("c_password not between", value1, value2, "cPassword");
            return (Criteria) this;
        }

        public Criteria andCNameIsNull() {
            addCriterion("c_name is null");
            return (Criteria) this;
        }

        public Criteria andCNameIsNotNull() {
            addCriterion("c_name is not null");
            return (Criteria) this;
        }

        public Criteria andCNameEqualTo(String value) {
            addCriterion("c_name =", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameNotEqualTo(String value) {
            addCriterion("c_name <>", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameGreaterThan(String value) {
            addCriterion("c_name >", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameGreaterThanOrEqualTo(String value) {
            addCriterion("c_name >=", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameLessThan(String value) {
            addCriterion("c_name <", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameLessThanOrEqualTo(String value) {
            addCriterion("c_name <=", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameLike(String value) {
            addCriterion("c_name like", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameNotLike(String value) {
            addCriterion("c_name not like", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameIn(List<String> values) {
            addCriterion("c_name in", values, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameNotIn(List<String> values) {
            addCriterion("c_name not in", values, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameBetween(String value1, String value2) {
            addCriterion("c_name between", value1, value2, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameNotBetween(String value1, String value2) {
            addCriterion("c_name not between", value1, value2, "cName");
            return (Criteria) this;
        }

        public Criteria andCSexIsNull() {
            addCriterion("c_sex is null");
            return (Criteria) this;
        }

        public Criteria andCSexIsNotNull() {
            addCriterion("c_sex is not null");
            return (Criteria) this;
        }

        public Criteria andCSexEqualTo(Integer value) {
            addCriterion("c_sex =", value, "cSex");
            return (Criteria) this;
        }

        public Criteria andCSexNotEqualTo(Integer value) {
            addCriterion("c_sex <>", value, "cSex");
            return (Criteria) this;
        }

        public Criteria andCSexGreaterThan(Integer value) {
            addCriterion("c_sex >", value, "cSex");
            return (Criteria) this;
        }

        public Criteria andCSexGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_sex >=", value, "cSex");
            return (Criteria) this;
        }

        public Criteria andCSexLessThan(Integer value) {
            addCriterion("c_sex <", value, "cSex");
            return (Criteria) this;
        }

        public Criteria andCSexLessThanOrEqualTo(Integer value) {
            addCriterion("c_sex <=", value, "cSex");
            return (Criteria) this;
        }

        public Criteria andCSexIn(List<Integer> values) {
            addCriterion("c_sex in", values, "cSex");
            return (Criteria) this;
        }

        public Criteria andCSexNotIn(List<Integer> values) {
            addCriterion("c_sex not in", values, "cSex");
            return (Criteria) this;
        }

        public Criteria andCSexBetween(Integer value1, Integer value2) {
            addCriterion("c_sex between", value1, value2, "cSex");
            return (Criteria) this;
        }

        public Criteria andCSexNotBetween(Integer value1, Integer value2) {
            addCriterion("c_sex not between", value1, value2, "cSex");
            return (Criteria) this;
        }

        public Criteria andCBirthdayIsNull() {
            addCriterion("c_birthday is null");
            return (Criteria) this;
        }

        public Criteria andCBirthdayIsNotNull() {
            addCriterion("c_birthday is not null");
            return (Criteria) this;
        }

        public Criteria andCBirthdayEqualTo(String value) {
            addCriterion("c_birthday =", value, "cBirthday");
            return (Criteria) this;
        }

        public Criteria andCBirthdayNotEqualTo(String value) {
            addCriterion("c_birthday <>", value, "cBirthday");
            return (Criteria) this;
        }

        public Criteria andCBirthdayGreaterThan(String value) {
            addCriterion("c_birthday >", value, "cBirthday");
            return (Criteria) this;
        }

        public Criteria andCBirthdayGreaterThanOrEqualTo(String value) {
            addCriterion("c_birthday >=", value, "cBirthday");
            return (Criteria) this;
        }

        public Criteria andCBirthdayLessThan(String value) {
            addCriterion("c_birthday <", value, "cBirthday");
            return (Criteria) this;
        }

        public Criteria andCBirthdayLessThanOrEqualTo(String value) {
            addCriterion("c_birthday <=", value, "cBirthday");
            return (Criteria) this;
        }

        public Criteria andCBirthdayLike(String value) {
            addCriterion("c_birthday like", value, "cBirthday");
            return (Criteria) this;
        }

        public Criteria andCBirthdayNotLike(String value) {
            addCriterion("c_birthday not like", value, "cBirthday");
            return (Criteria) this;
        }

        public Criteria andCBirthdayIn(List<String> values) {
            addCriterion("c_birthday in", values, "cBirthday");
            return (Criteria) this;
        }

        public Criteria andCBirthdayNotIn(List<String> values) {
            addCriterion("c_birthday not in", values, "cBirthday");
            return (Criteria) this;
        }

        public Criteria andCBirthdayBetween(String value1, String value2) {
            addCriterion("c_birthday between", value1, value2, "cBirthday");
            return (Criteria) this;
        }

        public Criteria andCBirthdayNotBetween(String value1, String value2) {
            addCriterion("c_birthday not between", value1, value2, "cBirthday");
            return (Criteria) this;
        }

        public Criteria andCTelephoneIsNull() {
            addCriterion("c_telephone is null");
            return (Criteria) this;
        }

        public Criteria andCTelephoneIsNotNull() {
            addCriterion("c_telephone is not null");
            return (Criteria) this;
        }

        public Criteria andCTelephoneEqualTo(String value) {
            addCriterion("c_telephone =", value, "cTelephone");
            return (Criteria) this;
        }

        public Criteria andCTelephoneNotEqualTo(String value) {
            addCriterion("c_telephone <>", value, "cTelephone");
            return (Criteria) this;
        }

        public Criteria andCTelephoneGreaterThan(String value) {
            addCriterion("c_telephone >", value, "cTelephone");
            return (Criteria) this;
        }

        public Criteria andCTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("c_telephone >=", value, "cTelephone");
            return (Criteria) this;
        }

        public Criteria andCTelephoneLessThan(String value) {
            addCriterion("c_telephone <", value, "cTelephone");
            return (Criteria) this;
        }

        public Criteria andCTelephoneLessThanOrEqualTo(String value) {
            addCriterion("c_telephone <=", value, "cTelephone");
            return (Criteria) this;
        }

        public Criteria andCTelephoneLike(String value) {
            addCriterion("c_telephone like", value, "cTelephone");
            return (Criteria) this;
        }

        public Criteria andCTelephoneNotLike(String value) {
            addCriterion("c_telephone not like", value, "cTelephone");
            return (Criteria) this;
        }

        public Criteria andCTelephoneIn(List<String> values) {
            addCriterion("c_telephone in", values, "cTelephone");
            return (Criteria) this;
        }

        public Criteria andCTelephoneNotIn(List<String> values) {
            addCriterion("c_telephone not in", values, "cTelephone");
            return (Criteria) this;
        }

        public Criteria andCTelephoneBetween(String value1, String value2) {
            addCriterion("c_telephone between", value1, value2, "cTelephone");
            return (Criteria) this;
        }

        public Criteria andCTelephoneNotBetween(String value1, String value2) {
            addCriterion("c_telephone not between", value1, value2, "cTelephone");
            return (Criteria) this;
        }

        public Criteria andCAreaIsNull() {
            addCriterion("c_area is null");
            return (Criteria) this;
        }

        public Criteria andCAreaIsNotNull() {
            addCriterion("c_area is not null");
            return (Criteria) this;
        }

        public Criteria andCAreaEqualTo(String value) {
            addCriterion("c_area =", value, "cArea");
            return (Criteria) this;
        }

        public Criteria andCAreaNotEqualTo(String value) {
            addCriterion("c_area <>", value, "cArea");
            return (Criteria) this;
        }

        public Criteria andCAreaGreaterThan(String value) {
            addCriterion("c_area >", value, "cArea");
            return (Criteria) this;
        }

        public Criteria andCAreaGreaterThanOrEqualTo(String value) {
            addCriterion("c_area >=", value, "cArea");
            return (Criteria) this;
        }

        public Criteria andCAreaLessThan(String value) {
            addCriterion("c_area <", value, "cArea");
            return (Criteria) this;
        }

        public Criteria andCAreaLessThanOrEqualTo(String value) {
            addCriterion("c_area <=", value, "cArea");
            return (Criteria) this;
        }

        public Criteria andCAreaLike(String value) {
            addCriterion("c_area like", value, "cArea");
            return (Criteria) this;
        }

        public Criteria andCAreaNotLike(String value) {
            addCriterion("c_area not like", value, "cArea");
            return (Criteria) this;
        }

        public Criteria andCAreaIn(List<String> values) {
            addCriterion("c_area in", values, "cArea");
            return (Criteria) this;
        }

        public Criteria andCAreaNotIn(List<String> values) {
            addCriterion("c_area not in", values, "cArea");
            return (Criteria) this;
        }

        public Criteria andCAreaBetween(String value1, String value2) {
            addCriterion("c_area between", value1, value2, "cArea");
            return (Criteria) this;
        }

        public Criteria andCAreaNotBetween(String value1, String value2) {
            addCriterion("c_area not between", value1, value2, "cArea");
            return (Criteria) this;
        }

        public Criteria andCBankcardIsNull() {
            addCriterion("c_bankcard is null");
            return (Criteria) this;
        }

        public Criteria andCBankcardIsNotNull() {
            addCriterion("c_bankcard is not null");
            return (Criteria) this;
        }

        public Criteria andCBankcardEqualTo(String value) {
            addCriterion("c_bankcard =", value, "cBankcard");
            return (Criteria) this;
        }

        public Criteria andCBankcardNotEqualTo(String value) {
            addCriterion("c_bankcard <>", value, "cBankcard");
            return (Criteria) this;
        }

        public Criteria andCBankcardGreaterThan(String value) {
            addCriterion("c_bankcard >", value, "cBankcard");
            return (Criteria) this;
        }

        public Criteria andCBankcardGreaterThanOrEqualTo(String value) {
            addCriterion("c_bankcard >=", value, "cBankcard");
            return (Criteria) this;
        }

        public Criteria andCBankcardLessThan(String value) {
            addCriterion("c_bankcard <", value, "cBankcard");
            return (Criteria) this;
        }

        public Criteria andCBankcardLessThanOrEqualTo(String value) {
            addCriterion("c_bankcard <=", value, "cBankcard");
            return (Criteria) this;
        }

        public Criteria andCBankcardLike(String value) {
            addCriterion("c_bankcard like", value, "cBankcard");
            return (Criteria) this;
        }

        public Criteria andCBankcardNotLike(String value) {
            addCriterion("c_bankcard not like", value, "cBankcard");
            return (Criteria) this;
        }

        public Criteria andCBankcardIn(List<String> values) {
            addCriterion("c_bankcard in", values, "cBankcard");
            return (Criteria) this;
        }

        public Criteria andCBankcardNotIn(List<String> values) {
            addCriterion("c_bankcard not in", values, "cBankcard");
            return (Criteria) this;
        }

        public Criteria andCBankcardBetween(String value1, String value2) {
            addCriterion("c_bankcard between", value1, value2, "cBankcard");
            return (Criteria) this;
        }

        public Criteria andCBankcardNotBetween(String value1, String value2) {
            addCriterion("c_bankcard not between", value1, value2, "cBankcard");
            return (Criteria) this;
        }

        public Criteria andCEmailIsNull() {
            addCriterion("c_email is null");
            return (Criteria) this;
        }

        public Criteria andCEmailIsNotNull() {
            addCriterion("c_email is not null");
            return (Criteria) this;
        }

        public Criteria andCEmailEqualTo(String value) {
            addCriterion("c_email =", value, "cEmail");
            return (Criteria) this;
        }

        public Criteria andCEmailNotEqualTo(String value) {
            addCriterion("c_email <>", value, "cEmail");
            return (Criteria) this;
        }

        public Criteria andCEmailGreaterThan(String value) {
            addCriterion("c_email >", value, "cEmail");
            return (Criteria) this;
        }

        public Criteria andCEmailGreaterThanOrEqualTo(String value) {
            addCriterion("c_email >=", value, "cEmail");
            return (Criteria) this;
        }

        public Criteria andCEmailLessThan(String value) {
            addCriterion("c_email <", value, "cEmail");
            return (Criteria) this;
        }

        public Criteria andCEmailLessThanOrEqualTo(String value) {
            addCriterion("c_email <=", value, "cEmail");
            return (Criteria) this;
        }

        public Criteria andCEmailLike(String value) {
            addCriterion("c_email like", value, "cEmail");
            return (Criteria) this;
        }

        public Criteria andCEmailNotLike(String value) {
            addCriterion("c_email not like", value, "cEmail");
            return (Criteria) this;
        }

        public Criteria andCEmailIn(List<String> values) {
            addCriterion("c_email in", values, "cEmail");
            return (Criteria) this;
        }

        public Criteria andCEmailNotIn(List<String> values) {
            addCriterion("c_email not in", values, "cEmail");
            return (Criteria) this;
        }

        public Criteria andCEmailBetween(String value1, String value2) {
            addCriterion("c_email between", value1, value2, "cEmail");
            return (Criteria) this;
        }

        public Criteria andCEmailNotBetween(String value1, String value2) {
            addCriterion("c_email not between", value1, value2, "cEmail");
            return (Criteria) this;
        }

        public Criteria andCPictureurlIsNull() {
            addCriterion("c_pictureurl is null");
            return (Criteria) this;
        }

        public Criteria andCPictureurlIsNotNull() {
            addCriterion("c_pictureurl is not null");
            return (Criteria) this;
        }

        public Criteria andCPictureurlEqualTo(String value) {
            addCriterion("c_pictureurl =", value, "cPictureurl");
            return (Criteria) this;
        }

        public Criteria andCPictureurlNotEqualTo(String value) {
            addCriterion("c_pictureurl <>", value, "cPictureurl");
            return (Criteria) this;
        }

        public Criteria andCPictureurlGreaterThan(String value) {
            addCriterion("c_pictureurl >", value, "cPictureurl");
            return (Criteria) this;
        }

        public Criteria andCPictureurlGreaterThanOrEqualTo(String value) {
            addCriterion("c_pictureurl >=", value, "cPictureurl");
            return (Criteria) this;
        }

        public Criteria andCPictureurlLessThan(String value) {
            addCriterion("c_pictureurl <", value, "cPictureurl");
            return (Criteria) this;
        }

        public Criteria andCPictureurlLessThanOrEqualTo(String value) {
            addCriterion("c_pictureurl <=", value, "cPictureurl");
            return (Criteria) this;
        }

        public Criteria andCPictureurlLike(String value) {
            addCriterion("c_pictureurl like", value, "cPictureurl");
            return (Criteria) this;
        }

        public Criteria andCPictureurlNotLike(String value) {
            addCriterion("c_pictureurl not like", value, "cPictureurl");
            return (Criteria) this;
        }

        public Criteria andCPictureurlIn(List<String> values) {
            addCriterion("c_pictureurl in", values, "cPictureurl");
            return (Criteria) this;
        }

        public Criteria andCPictureurlNotIn(List<String> values) {
            addCriterion("c_pictureurl not in", values, "cPictureurl");
            return (Criteria) this;
        }

        public Criteria andCPictureurlBetween(String value1, String value2) {
            addCriterion("c_pictureurl between", value1, value2, "cPictureurl");
            return (Criteria) this;
        }

        public Criteria andCPictureurlNotBetween(String value1, String value2) {
            addCriterion("c_pictureurl not between", value1, value2, "cPictureurl");
            return (Criteria) this;
        }

        public Criteria andCStatusIsNull() {
            addCriterion("c_status is null");
            return (Criteria) this;
        }

        public Criteria andCStatusIsNotNull() {
            addCriterion("c_status is not null");
            return (Criteria) this;
        }

        public Criteria andCStatusEqualTo(Integer value) {
            addCriterion("c_status =", value, "cStatus");
            return (Criteria) this;
        }

        public Criteria andCStatusNotEqualTo(Integer value) {
            addCriterion("c_status <>", value, "cStatus");
            return (Criteria) this;
        }

        public Criteria andCStatusGreaterThan(Integer value) {
            addCriterion("c_status >", value, "cStatus");
            return (Criteria) this;
        }

        public Criteria andCStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_status >=", value, "cStatus");
            return (Criteria) this;
        }

        public Criteria andCStatusLessThan(Integer value) {
            addCriterion("c_status <", value, "cStatus");
            return (Criteria) this;
        }

        public Criteria andCStatusLessThanOrEqualTo(Integer value) {
            addCriterion("c_status <=", value, "cStatus");
            return (Criteria) this;
        }

        public Criteria andCStatusIn(List<Integer> values) {
            addCriterion("c_status in", values, "cStatus");
            return (Criteria) this;
        }

        public Criteria andCStatusNotIn(List<Integer> values) {
            addCriterion("c_status not in", values, "cStatus");
            return (Criteria) this;
        }

        public Criteria andCStatusBetween(Integer value1, Integer value2) {
            addCriterion("c_status between", value1, value2, "cStatus");
            return (Criteria) this;
        }

        public Criteria andCStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("c_status not between", value1, value2, "cStatus");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}