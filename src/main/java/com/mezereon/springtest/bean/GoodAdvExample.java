package com.mezereon.springtest.bean;

import java.util.ArrayList;
import java.util.List;

public class GoodAdvExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodAdvExample() {
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

        public Criteria andAdvIdIsNull() {
            addCriterion("adv_id is null");
            return (Criteria) this;
        }

        public Criteria andAdvIdIsNotNull() {
            addCriterion("adv_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdvIdEqualTo(Integer value) {
            addCriterion("adv_id =", value, "advId");
            return (Criteria) this;
        }

        public Criteria andAdvIdNotEqualTo(Integer value) {
            addCriterion("adv_id <>", value, "advId");
            return (Criteria) this;
        }

        public Criteria andAdvIdGreaterThan(Integer value) {
            addCriterion("adv_id >", value, "advId");
            return (Criteria) this;
        }

        public Criteria andAdvIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("adv_id >=", value, "advId");
            return (Criteria) this;
        }

        public Criteria andAdvIdLessThan(Integer value) {
            addCriterion("adv_id <", value, "advId");
            return (Criteria) this;
        }

        public Criteria andAdvIdLessThanOrEqualTo(Integer value) {
            addCriterion("adv_id <=", value, "advId");
            return (Criteria) this;
        }

        public Criteria andAdvIdIn(List<Integer> values) {
            addCriterion("adv_id in", values, "advId");
            return (Criteria) this;
        }

        public Criteria andAdvIdNotIn(List<Integer> values) {
            addCriterion("adv_id not in", values, "advId");
            return (Criteria) this;
        }

        public Criteria andAdvIdBetween(Integer value1, Integer value2) {
            addCriterion("adv_id between", value1, value2, "advId");
            return (Criteria) this;
        }

        public Criteria andAdvIdNotBetween(Integer value1, Integer value2) {
            addCriterion("adv_id not between", value1, value2, "advId");
            return (Criteria) this;
        }

        public Criteria andAdvGCatagoryIsNull() {
            addCriterion("adv_g_catagory is null");
            return (Criteria) this;
        }

        public Criteria andAdvGCatagoryIsNotNull() {
            addCriterion("adv_g_catagory is not null");
            return (Criteria) this;
        }

        public Criteria andAdvGCatagoryEqualTo(String value) {
            addCriterion("adv_g_catagory =", value, "advGCatagory");
            return (Criteria) this;
        }

        public Criteria andAdvGCatagoryNotEqualTo(String value) {
            addCriterion("adv_g_catagory <>", value, "advGCatagory");
            return (Criteria) this;
        }

        public Criteria andAdvGCatagoryGreaterThan(String value) {
            addCriterion("adv_g_catagory >", value, "advGCatagory");
            return (Criteria) this;
        }

        public Criteria andAdvGCatagoryGreaterThanOrEqualTo(String value) {
            addCriterion("adv_g_catagory >=", value, "advGCatagory");
            return (Criteria) this;
        }

        public Criteria andAdvGCatagoryLessThan(String value) {
            addCriterion("adv_g_catagory <", value, "advGCatagory");
            return (Criteria) this;
        }

        public Criteria andAdvGCatagoryLessThanOrEqualTo(String value) {
            addCriterion("adv_g_catagory <=", value, "advGCatagory");
            return (Criteria) this;
        }

        public Criteria andAdvGCatagoryLike(String value) {
            addCriterion("adv_g_catagory like", value, "advGCatagory");
            return (Criteria) this;
        }

        public Criteria andAdvGCatagoryNotLike(String value) {
            addCriterion("adv_g_catagory not like", value, "advGCatagory");
            return (Criteria) this;
        }

        public Criteria andAdvGCatagoryIn(List<String> values) {
            addCriterion("adv_g_catagory in", values, "advGCatagory");
            return (Criteria) this;
        }

        public Criteria andAdvGCatagoryNotIn(List<String> values) {
            addCriterion("adv_g_catagory not in", values, "advGCatagory");
            return (Criteria) this;
        }

        public Criteria andAdvGCatagoryBetween(String value1, String value2) {
            addCriterion("adv_g_catagory between", value1, value2, "advGCatagory");
            return (Criteria) this;
        }

        public Criteria andAdvGCatagoryNotBetween(String value1, String value2) {
            addCriterion("adv_g_catagory not between", value1, value2, "advGCatagory");
            return (Criteria) this;
        }

        public Criteria andAdvPicIsNull() {
            addCriterion("adv_pic is null");
            return (Criteria) this;
        }

        public Criteria andAdvPicIsNotNull() {
            addCriterion("adv_pic is not null");
            return (Criteria) this;
        }

        public Criteria andAdvPicEqualTo(String value) {
            addCriterion("adv_pic =", value, "advPic");
            return (Criteria) this;
        }

        public Criteria andAdvPicNotEqualTo(String value) {
            addCriterion("adv_pic <>", value, "advPic");
            return (Criteria) this;
        }

        public Criteria andAdvPicGreaterThan(String value) {
            addCriterion("adv_pic >", value, "advPic");
            return (Criteria) this;
        }

        public Criteria andAdvPicGreaterThanOrEqualTo(String value) {
            addCriterion("adv_pic >=", value, "advPic");
            return (Criteria) this;
        }

        public Criteria andAdvPicLessThan(String value) {
            addCriterion("adv_pic <", value, "advPic");
            return (Criteria) this;
        }

        public Criteria andAdvPicLessThanOrEqualTo(String value) {
            addCriterion("adv_pic <=", value, "advPic");
            return (Criteria) this;
        }

        public Criteria andAdvPicLike(String value) {
            addCriterion("adv_pic like", value, "advPic");
            return (Criteria) this;
        }

        public Criteria andAdvPicNotLike(String value) {
            addCriterion("adv_pic not like", value, "advPic");
            return (Criteria) this;
        }

        public Criteria andAdvPicIn(List<String> values) {
            addCriterion("adv_pic in", values, "advPic");
            return (Criteria) this;
        }

        public Criteria andAdvPicNotIn(List<String> values) {
            addCriterion("adv_pic not in", values, "advPic");
            return (Criteria) this;
        }

        public Criteria andAdvPicBetween(String value1, String value2) {
            addCriterion("adv_pic between", value1, value2, "advPic");
            return (Criteria) this;
        }

        public Criteria andAdvPicNotBetween(String value1, String value2) {
            addCriterion("adv_pic not between", value1, value2, "advPic");
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