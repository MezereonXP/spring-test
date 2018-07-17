package com.mezereon.springtest.bean;

import java.util.ArrayList;
import java.util.List;

public class OrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderExample() {
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

        public Criteria andOIdIsNull() {
            addCriterion("o_id is null");
            return (Criteria) this;
        }

        public Criteria andOIdIsNotNull() {
            addCriterion("o_id is not null");
            return (Criteria) this;
        }

        public Criteria andOIdEqualTo(Integer value) {
            addCriterion("o_id =", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdNotEqualTo(Integer value) {
            addCriterion("o_id <>", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdGreaterThan(Integer value) {
            addCriterion("o_id >", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("o_id >=", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdLessThan(Integer value) {
            addCriterion("o_id <", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdLessThanOrEqualTo(Integer value) {
            addCriterion("o_id <=", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdIn(List<Integer> values) {
            addCriterion("o_id in", values, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdNotIn(List<Integer> values) {
            addCriterion("o_id not in", values, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdBetween(Integer value1, Integer value2) {
            addCriterion("o_id between", value1, value2, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdNotBetween(Integer value1, Integer value2) {
            addCriterion("o_id not between", value1, value2, "oId");
            return (Criteria) this;
        }

        public Criteria andOCodeIsNull() {
            addCriterion("o_code is null");
            return (Criteria) this;
        }

        public Criteria andOCodeIsNotNull() {
            addCriterion("o_code is not null");
            return (Criteria) this;
        }

        public Criteria andOCodeEqualTo(String value) {
            addCriterion("o_code =", value, "oCode");
            return (Criteria) this;
        }

        public Criteria andOCodeNotEqualTo(String value) {
            addCriterion("o_code <>", value, "oCode");
            return (Criteria) this;
        }

        public Criteria andOCodeGreaterThan(String value) {
            addCriterion("o_code >", value, "oCode");
            return (Criteria) this;
        }

        public Criteria andOCodeGreaterThanOrEqualTo(String value) {
            addCriterion("o_code >=", value, "oCode");
            return (Criteria) this;
        }

        public Criteria andOCodeLessThan(String value) {
            addCriterion("o_code <", value, "oCode");
            return (Criteria) this;
        }

        public Criteria andOCodeLessThanOrEqualTo(String value) {
            addCriterion("o_code <=", value, "oCode");
            return (Criteria) this;
        }

        public Criteria andOCodeLike(String value) {
            addCriterion("o_code like", value, "oCode");
            return (Criteria) this;
        }

        public Criteria andOCodeNotLike(String value) {
            addCriterion("o_code not like", value, "oCode");
            return (Criteria) this;
        }

        public Criteria andOCodeIn(List<String> values) {
            addCriterion("o_code in", values, "oCode");
            return (Criteria) this;
        }

        public Criteria andOCodeNotIn(List<String> values) {
            addCriterion("o_code not in", values, "oCode");
            return (Criteria) this;
        }

        public Criteria andOCodeBetween(String value1, String value2) {
            addCriterion("o_code between", value1, value2, "oCode");
            return (Criteria) this;
        }

        public Criteria andOCodeNotBetween(String value1, String value2) {
            addCriterion("o_code not between", value1, value2, "oCode");
            return (Criteria) this;
        }

        public Criteria andOCustomerIdIsNull() {
            addCriterion("o_customer_id is null");
            return (Criteria) this;
        }

        public Criteria andOCustomerIdIsNotNull() {
            addCriterion("o_customer_id is not null");
            return (Criteria) this;
        }

        public Criteria andOCustomerIdEqualTo(Integer value) {
            addCriterion("o_customer_id =", value, "oCustomerId");
            return (Criteria) this;
        }

        public Criteria andOCustomerIdNotEqualTo(Integer value) {
            addCriterion("o_customer_id <>", value, "oCustomerId");
            return (Criteria) this;
        }

        public Criteria andOCustomerIdGreaterThan(Integer value) {
            addCriterion("o_customer_id >", value, "oCustomerId");
            return (Criteria) this;
        }

        public Criteria andOCustomerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("o_customer_id >=", value, "oCustomerId");
            return (Criteria) this;
        }

        public Criteria andOCustomerIdLessThan(Integer value) {
            addCriterion("o_customer_id <", value, "oCustomerId");
            return (Criteria) this;
        }

        public Criteria andOCustomerIdLessThanOrEqualTo(Integer value) {
            addCriterion("o_customer_id <=", value, "oCustomerId");
            return (Criteria) this;
        }

        public Criteria andOCustomerIdIn(List<Integer> values) {
            addCriterion("o_customer_id in", values, "oCustomerId");
            return (Criteria) this;
        }

        public Criteria andOCustomerIdNotIn(List<Integer> values) {
            addCriterion("o_customer_id not in", values, "oCustomerId");
            return (Criteria) this;
        }

        public Criteria andOCustomerIdBetween(Integer value1, Integer value2) {
            addCriterion("o_customer_id between", value1, value2, "oCustomerId");
            return (Criteria) this;
        }

        public Criteria andOCustomerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("o_customer_id not between", value1, value2, "oCustomerId");
            return (Criteria) this;
        }

        public Criteria andOAddressIdIsNull() {
            addCriterion("o_address_id is null");
            return (Criteria) this;
        }

        public Criteria andOAddressIdIsNotNull() {
            addCriterion("o_address_id is not null");
            return (Criteria) this;
        }

        public Criteria andOAddressIdEqualTo(Integer value) {
            addCriterion("o_address_id =", value, "oAddressId");
            return (Criteria) this;
        }

        public Criteria andOAddressIdNotEqualTo(Integer value) {
            addCriterion("o_address_id <>", value, "oAddressId");
            return (Criteria) this;
        }

        public Criteria andOAddressIdGreaterThan(Integer value) {
            addCriterion("o_address_id >", value, "oAddressId");
            return (Criteria) this;
        }

        public Criteria andOAddressIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("o_address_id >=", value, "oAddressId");
            return (Criteria) this;
        }

        public Criteria andOAddressIdLessThan(Integer value) {
            addCriterion("o_address_id <", value, "oAddressId");
            return (Criteria) this;
        }

        public Criteria andOAddressIdLessThanOrEqualTo(Integer value) {
            addCriterion("o_address_id <=", value, "oAddressId");
            return (Criteria) this;
        }

        public Criteria andOAddressIdIn(List<Integer> values) {
            addCriterion("o_address_id in", values, "oAddressId");
            return (Criteria) this;
        }

        public Criteria andOAddressIdNotIn(List<Integer> values) {
            addCriterion("o_address_id not in", values, "oAddressId");
            return (Criteria) this;
        }

        public Criteria andOAddressIdBetween(Integer value1, Integer value2) {
            addCriterion("o_address_id between", value1, value2, "oAddressId");
            return (Criteria) this;
        }

        public Criteria andOAddressIdNotBetween(Integer value1, Integer value2) {
            addCriterion("o_address_id not between", value1, value2, "oAddressId");
            return (Criteria) this;
        }

        public Criteria andOStateIsNull() {
            addCriterion("o_state is null");
            return (Criteria) this;
        }

        public Criteria andOStateIsNotNull() {
            addCriterion("o_state is not null");
            return (Criteria) this;
        }

        public Criteria andOStateEqualTo(Integer value) {
            addCriterion("o_state =", value, "oState");
            return (Criteria) this;
        }

        public Criteria andOStateNotEqualTo(Integer value) {
            addCriterion("o_state <>", value, "oState");
            return (Criteria) this;
        }

        public Criteria andOStateGreaterThan(Integer value) {
            addCriterion("o_state >", value, "oState");
            return (Criteria) this;
        }

        public Criteria andOStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("o_state >=", value, "oState");
            return (Criteria) this;
        }

        public Criteria andOStateLessThan(Integer value) {
            addCriterion("o_state <", value, "oState");
            return (Criteria) this;
        }

        public Criteria andOStateLessThanOrEqualTo(Integer value) {
            addCriterion("o_state <=", value, "oState");
            return (Criteria) this;
        }

        public Criteria andOStateIn(List<Integer> values) {
            addCriterion("o_state in", values, "oState");
            return (Criteria) this;
        }

        public Criteria andOStateNotIn(List<Integer> values) {
            addCriterion("o_state not in", values, "oState");
            return (Criteria) this;
        }

        public Criteria andOStateBetween(Integer value1, Integer value2) {
            addCriterion("o_state between", value1, value2, "oState");
            return (Criteria) this;
        }

        public Criteria andOStateNotBetween(Integer value1, Integer value2) {
            addCriterion("o_state not between", value1, value2, "oState");
            return (Criteria) this;
        }

        public Criteria andOTypeIsNull() {
            addCriterion("o_type is null");
            return (Criteria) this;
        }

        public Criteria andOTypeIsNotNull() {
            addCriterion("o_type is not null");
            return (Criteria) this;
        }

        public Criteria andOTypeEqualTo(Integer value) {
            addCriterion("o_type =", value, "oType");
            return (Criteria) this;
        }

        public Criteria andOTypeNotEqualTo(Integer value) {
            addCriterion("o_type <>", value, "oType");
            return (Criteria) this;
        }

        public Criteria andOTypeGreaterThan(Integer value) {
            addCriterion("o_type >", value, "oType");
            return (Criteria) this;
        }

        public Criteria andOTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("o_type >=", value, "oType");
            return (Criteria) this;
        }

        public Criteria andOTypeLessThan(Integer value) {
            addCriterion("o_type <", value, "oType");
            return (Criteria) this;
        }

        public Criteria andOTypeLessThanOrEqualTo(Integer value) {
            addCriterion("o_type <=", value, "oType");
            return (Criteria) this;
        }

        public Criteria andOTypeIn(List<Integer> values) {
            addCriterion("o_type in", values, "oType");
            return (Criteria) this;
        }

        public Criteria andOTypeNotIn(List<Integer> values) {
            addCriterion("o_type not in", values, "oType");
            return (Criteria) this;
        }

        public Criteria andOTypeBetween(Integer value1, Integer value2) {
            addCriterion("o_type between", value1, value2, "oType");
            return (Criteria) this;
        }

        public Criteria andOTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("o_type not between", value1, value2, "oType");
            return (Criteria) this;
        }

        public Criteria andOSetdateIsNull() {
            addCriterion("o_setDate is null");
            return (Criteria) this;
        }

        public Criteria andOSetdateIsNotNull() {
            addCriterion("o_setDate is not null");
            return (Criteria) this;
        }

        public Criteria andOSetdateEqualTo(String value) {
            addCriterion("o_setDate =", value, "oSetdate");
            return (Criteria) this;
        }

        public Criteria andOSetdateNotEqualTo(String value) {
            addCriterion("o_setDate <>", value, "oSetdate");
            return (Criteria) this;
        }

        public Criteria andOSetdateGreaterThan(String value) {
            addCriterion("o_setDate >", value, "oSetdate");
            return (Criteria) this;
        }

        public Criteria andOSetdateGreaterThanOrEqualTo(String value) {
            addCriterion("o_setDate >=", value, "oSetdate");
            return (Criteria) this;
        }

        public Criteria andOSetdateLessThan(String value) {
            addCriterion("o_setDate <", value, "oSetdate");
            return (Criteria) this;
        }

        public Criteria andOSetdateLessThanOrEqualTo(String value) {
            addCriterion("o_setDate <=", value, "oSetdate");
            return (Criteria) this;
        }

        public Criteria andOSetdateLike(String value) {
            addCriterion("o_setDate like", value, "oSetdate");
            return (Criteria) this;
        }

        public Criteria andOSetdateNotLike(String value) {
            addCriterion("o_setDate not like", value, "oSetdate");
            return (Criteria) this;
        }

        public Criteria andOSetdateIn(List<String> values) {
            addCriterion("o_setDate in", values, "oSetdate");
            return (Criteria) this;
        }

        public Criteria andOSetdateNotIn(List<String> values) {
            addCriterion("o_setDate not in", values, "oSetdate");
            return (Criteria) this;
        }

        public Criteria andOSetdateBetween(String value1, String value2) {
            addCriterion("o_setDate between", value1, value2, "oSetdate");
            return (Criteria) this;
        }

        public Criteria andOSetdateNotBetween(String value1, String value2) {
            addCriterion("o_setDate not between", value1, value2, "oSetdate");
            return (Criteria) this;
        }

        public Criteria andORemarkIsNull() {
            addCriterion("o_remark is null");
            return (Criteria) this;
        }

        public Criteria andORemarkIsNotNull() {
            addCriterion("o_remark is not null");
            return (Criteria) this;
        }

        public Criteria andORemarkEqualTo(String value) {
            addCriterion("o_remark =", value, "oRemark");
            return (Criteria) this;
        }

        public Criteria andORemarkNotEqualTo(String value) {
            addCriterion("o_remark <>", value, "oRemark");
            return (Criteria) this;
        }

        public Criteria andORemarkGreaterThan(String value) {
            addCriterion("o_remark >", value, "oRemark");
            return (Criteria) this;
        }

        public Criteria andORemarkGreaterThanOrEqualTo(String value) {
            addCriterion("o_remark >=", value, "oRemark");
            return (Criteria) this;
        }

        public Criteria andORemarkLessThan(String value) {
            addCriterion("o_remark <", value, "oRemark");
            return (Criteria) this;
        }

        public Criteria andORemarkLessThanOrEqualTo(String value) {
            addCriterion("o_remark <=", value, "oRemark");
            return (Criteria) this;
        }

        public Criteria andORemarkLike(String value) {
            addCriterion("o_remark like", value, "oRemark");
            return (Criteria) this;
        }

        public Criteria andORemarkNotLike(String value) {
            addCriterion("o_remark not like", value, "oRemark");
            return (Criteria) this;
        }

        public Criteria andORemarkIn(List<String> values) {
            addCriterion("o_remark in", values, "oRemark");
            return (Criteria) this;
        }

        public Criteria andORemarkNotIn(List<String> values) {
            addCriterion("o_remark not in", values, "oRemark");
            return (Criteria) this;
        }

        public Criteria andORemarkBetween(String value1, String value2) {
            addCriterion("o_remark between", value1, value2, "oRemark");
            return (Criteria) this;
        }

        public Criteria andORemarkNotBetween(String value1, String value2) {
            addCriterion("o_remark not between", value1, value2, "oRemark");
            return (Criteria) this;
        }

        public Criteria andOStatusIsNull() {
            addCriterion("o_status is null");
            return (Criteria) this;
        }

        public Criteria andOStatusIsNotNull() {
            addCriterion("o_status is not null");
            return (Criteria) this;
        }

        public Criteria andOStatusEqualTo(Integer value) {
            addCriterion("o_status =", value, "oStatus");
            return (Criteria) this;
        }

        public Criteria andOStatusNotEqualTo(Integer value) {
            addCriterion("o_status <>", value, "oStatus");
            return (Criteria) this;
        }

        public Criteria andOStatusGreaterThan(Integer value) {
            addCriterion("o_status >", value, "oStatus");
            return (Criteria) this;
        }

        public Criteria andOStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("o_status >=", value, "oStatus");
            return (Criteria) this;
        }

        public Criteria andOStatusLessThan(Integer value) {
            addCriterion("o_status <", value, "oStatus");
            return (Criteria) this;
        }

        public Criteria andOStatusLessThanOrEqualTo(Integer value) {
            addCriterion("o_status <=", value, "oStatus");
            return (Criteria) this;
        }

        public Criteria andOStatusIn(List<Integer> values) {
            addCriterion("o_status in", values, "oStatus");
            return (Criteria) this;
        }

        public Criteria andOStatusNotIn(List<Integer> values) {
            addCriterion("o_status not in", values, "oStatus");
            return (Criteria) this;
        }

        public Criteria andOStatusBetween(Integer value1, Integer value2) {
            addCriterion("o_status between", value1, value2, "oStatus");
            return (Criteria) this;
        }

        public Criteria andOStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("o_status not between", value1, value2, "oStatus");
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