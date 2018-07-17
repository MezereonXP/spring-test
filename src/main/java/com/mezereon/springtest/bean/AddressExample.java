package com.mezereon.springtest.bean;

import java.util.ArrayList;
import java.util.List;

public class AddressExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AddressExample() {
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

        public Criteria andAIdIsNull() {
            addCriterion("a_id is null");
            return (Criteria) this;
        }

        public Criteria andAIdIsNotNull() {
            addCriterion("a_id is not null");
            return (Criteria) this;
        }

        public Criteria andAIdEqualTo(Integer value) {
            addCriterion("a_id =", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdNotEqualTo(Integer value) {
            addCriterion("a_id <>", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdGreaterThan(Integer value) {
            addCriterion("a_id >", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("a_id >=", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdLessThan(Integer value) {
            addCriterion("a_id <", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdLessThanOrEqualTo(Integer value) {
            addCriterion("a_id <=", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdIn(List<Integer> values) {
            addCriterion("a_id in", values, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdNotIn(List<Integer> values) {
            addCriterion("a_id not in", values, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdBetween(Integer value1, Integer value2) {
            addCriterion("a_id between", value1, value2, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdNotBetween(Integer value1, Integer value2) {
            addCriterion("a_id not between", value1, value2, "aId");
            return (Criteria) this;
        }

        public Criteria andACustomerIdIsNull() {
            addCriterion("a_customer_id is null");
            return (Criteria) this;
        }

        public Criteria andACustomerIdIsNotNull() {
            addCriterion("a_customer_id is not null");
            return (Criteria) this;
        }

        public Criteria andACustomerIdEqualTo(Integer value) {
            addCriterion("a_customer_id =", value, "aCustomerId");
            return (Criteria) this;
        }

        public Criteria andACustomerIdNotEqualTo(Integer value) {
            addCriterion("a_customer_id <>", value, "aCustomerId");
            return (Criteria) this;
        }

        public Criteria andACustomerIdGreaterThan(Integer value) {
            addCriterion("a_customer_id >", value, "aCustomerId");
            return (Criteria) this;
        }

        public Criteria andACustomerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("a_customer_id >=", value, "aCustomerId");
            return (Criteria) this;
        }

        public Criteria andACustomerIdLessThan(Integer value) {
            addCriterion("a_customer_id <", value, "aCustomerId");
            return (Criteria) this;
        }

        public Criteria andACustomerIdLessThanOrEqualTo(Integer value) {
            addCriterion("a_customer_id <=", value, "aCustomerId");
            return (Criteria) this;
        }

        public Criteria andACustomerIdIn(List<Integer> values) {
            addCriterion("a_customer_id in", values, "aCustomerId");
            return (Criteria) this;
        }

        public Criteria andACustomerIdNotIn(List<Integer> values) {
            addCriterion("a_customer_id not in", values, "aCustomerId");
            return (Criteria) this;
        }

        public Criteria andACustomerIdBetween(Integer value1, Integer value2) {
            addCriterion("a_customer_id between", value1, value2, "aCustomerId");
            return (Criteria) this;
        }

        public Criteria andACustomerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("a_customer_id not between", value1, value2, "aCustomerId");
            return (Criteria) this;
        }

        public Criteria andAReceiverIsNull() {
            addCriterion("a_receiver is null");
            return (Criteria) this;
        }

        public Criteria andAReceiverIsNotNull() {
            addCriterion("a_receiver is not null");
            return (Criteria) this;
        }

        public Criteria andAReceiverEqualTo(String value) {
            addCriterion("a_receiver =", value, "aReceiver");
            return (Criteria) this;
        }

        public Criteria andAReceiverNotEqualTo(String value) {
            addCriterion("a_receiver <>", value, "aReceiver");
            return (Criteria) this;
        }

        public Criteria andAReceiverGreaterThan(String value) {
            addCriterion("a_receiver >", value, "aReceiver");
            return (Criteria) this;
        }

        public Criteria andAReceiverGreaterThanOrEqualTo(String value) {
            addCriterion("a_receiver >=", value, "aReceiver");
            return (Criteria) this;
        }

        public Criteria andAReceiverLessThan(String value) {
            addCriterion("a_receiver <", value, "aReceiver");
            return (Criteria) this;
        }

        public Criteria andAReceiverLessThanOrEqualTo(String value) {
            addCriterion("a_receiver <=", value, "aReceiver");
            return (Criteria) this;
        }

        public Criteria andAReceiverLike(String value) {
            addCriterion("a_receiver like", value, "aReceiver");
            return (Criteria) this;
        }

        public Criteria andAReceiverNotLike(String value) {
            addCriterion("a_receiver not like", value, "aReceiver");
            return (Criteria) this;
        }

        public Criteria andAReceiverIn(List<String> values) {
            addCriterion("a_receiver in", values, "aReceiver");
            return (Criteria) this;
        }

        public Criteria andAReceiverNotIn(List<String> values) {
            addCriterion("a_receiver not in", values, "aReceiver");
            return (Criteria) this;
        }

        public Criteria andAReceiverBetween(String value1, String value2) {
            addCriterion("a_receiver between", value1, value2, "aReceiver");
            return (Criteria) this;
        }

        public Criteria andAReceiverNotBetween(String value1, String value2) {
            addCriterion("a_receiver not between", value1, value2, "aReceiver");
            return (Criteria) this;
        }

        public Criteria andATelephoneIsNull() {
            addCriterion("a_telephone is null");
            return (Criteria) this;
        }

        public Criteria andATelephoneIsNotNull() {
            addCriterion("a_telephone is not null");
            return (Criteria) this;
        }

        public Criteria andATelephoneEqualTo(String value) {
            addCriterion("a_telephone =", value, "aTelephone");
            return (Criteria) this;
        }

        public Criteria andATelephoneNotEqualTo(String value) {
            addCriterion("a_telephone <>", value, "aTelephone");
            return (Criteria) this;
        }

        public Criteria andATelephoneGreaterThan(String value) {
            addCriterion("a_telephone >", value, "aTelephone");
            return (Criteria) this;
        }

        public Criteria andATelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("a_telephone >=", value, "aTelephone");
            return (Criteria) this;
        }

        public Criteria andATelephoneLessThan(String value) {
            addCriterion("a_telephone <", value, "aTelephone");
            return (Criteria) this;
        }

        public Criteria andATelephoneLessThanOrEqualTo(String value) {
            addCriterion("a_telephone <=", value, "aTelephone");
            return (Criteria) this;
        }

        public Criteria andATelephoneLike(String value) {
            addCriterion("a_telephone like", value, "aTelephone");
            return (Criteria) this;
        }

        public Criteria andATelephoneNotLike(String value) {
            addCriterion("a_telephone not like", value, "aTelephone");
            return (Criteria) this;
        }

        public Criteria andATelephoneIn(List<String> values) {
            addCriterion("a_telephone in", values, "aTelephone");
            return (Criteria) this;
        }

        public Criteria andATelephoneNotIn(List<String> values) {
            addCriterion("a_telephone not in", values, "aTelephone");
            return (Criteria) this;
        }

        public Criteria andATelephoneBetween(String value1, String value2) {
            addCriterion("a_telephone between", value1, value2, "aTelephone");
            return (Criteria) this;
        }

        public Criteria andATelephoneNotBetween(String value1, String value2) {
            addCriterion("a_telephone not between", value1, value2, "aTelephone");
            return (Criteria) this;
        }

        public Criteria andAZipcodeIsNull() {
            addCriterion("a_zipcode is null");
            return (Criteria) this;
        }

        public Criteria andAZipcodeIsNotNull() {
            addCriterion("a_zipcode is not null");
            return (Criteria) this;
        }

        public Criteria andAZipcodeEqualTo(String value) {
            addCriterion("a_zipcode =", value, "aZipcode");
            return (Criteria) this;
        }

        public Criteria andAZipcodeNotEqualTo(String value) {
            addCriterion("a_zipcode <>", value, "aZipcode");
            return (Criteria) this;
        }

        public Criteria andAZipcodeGreaterThan(String value) {
            addCriterion("a_zipcode >", value, "aZipcode");
            return (Criteria) this;
        }

        public Criteria andAZipcodeGreaterThanOrEqualTo(String value) {
            addCriterion("a_zipcode >=", value, "aZipcode");
            return (Criteria) this;
        }

        public Criteria andAZipcodeLessThan(String value) {
            addCriterion("a_zipcode <", value, "aZipcode");
            return (Criteria) this;
        }

        public Criteria andAZipcodeLessThanOrEqualTo(String value) {
            addCriterion("a_zipcode <=", value, "aZipcode");
            return (Criteria) this;
        }

        public Criteria andAZipcodeLike(String value) {
            addCriterion("a_zipcode like", value, "aZipcode");
            return (Criteria) this;
        }

        public Criteria andAZipcodeNotLike(String value) {
            addCriterion("a_zipcode not like", value, "aZipcode");
            return (Criteria) this;
        }

        public Criteria andAZipcodeIn(List<String> values) {
            addCriterion("a_zipcode in", values, "aZipcode");
            return (Criteria) this;
        }

        public Criteria andAZipcodeNotIn(List<String> values) {
            addCriterion("a_zipcode not in", values, "aZipcode");
            return (Criteria) this;
        }

        public Criteria andAZipcodeBetween(String value1, String value2) {
            addCriterion("a_zipcode between", value1, value2, "aZipcode");
            return (Criteria) this;
        }

        public Criteria andAZipcodeNotBetween(String value1, String value2) {
            addCriterion("a_zipcode not between", value1, value2, "aZipcode");
            return (Criteria) this;
        }

        public Criteria andADetailIsNull() {
            addCriterion("a_detail is null");
            return (Criteria) this;
        }

        public Criteria andADetailIsNotNull() {
            addCriterion("a_detail is not null");
            return (Criteria) this;
        }

        public Criteria andADetailEqualTo(String value) {
            addCriterion("a_detail =", value, "aDetail");
            return (Criteria) this;
        }

        public Criteria andADetailNotEqualTo(String value) {
            addCriterion("a_detail <>", value, "aDetail");
            return (Criteria) this;
        }

        public Criteria andADetailGreaterThan(String value) {
            addCriterion("a_detail >", value, "aDetail");
            return (Criteria) this;
        }

        public Criteria andADetailGreaterThanOrEqualTo(String value) {
            addCriterion("a_detail >=", value, "aDetail");
            return (Criteria) this;
        }

        public Criteria andADetailLessThan(String value) {
            addCriterion("a_detail <", value, "aDetail");
            return (Criteria) this;
        }

        public Criteria andADetailLessThanOrEqualTo(String value) {
            addCriterion("a_detail <=", value, "aDetail");
            return (Criteria) this;
        }

        public Criteria andADetailLike(String value) {
            addCriterion("a_detail like", value, "aDetail");
            return (Criteria) this;
        }

        public Criteria andADetailNotLike(String value) {
            addCriterion("a_detail not like", value, "aDetail");
            return (Criteria) this;
        }

        public Criteria andADetailIn(List<String> values) {
            addCriterion("a_detail in", values, "aDetail");
            return (Criteria) this;
        }

        public Criteria andADetailNotIn(List<String> values) {
            addCriterion("a_detail not in", values, "aDetail");
            return (Criteria) this;
        }

        public Criteria andADetailBetween(String value1, String value2) {
            addCriterion("a_detail between", value1, value2, "aDetail");
            return (Criteria) this;
        }

        public Criteria andADetailNotBetween(String value1, String value2) {
            addCriterion("a_detail not between", value1, value2, "aDetail");
            return (Criteria) this;
        }

        public Criteria andAStatusIsNull() {
            addCriterion("a_status is null");
            return (Criteria) this;
        }

        public Criteria andAStatusIsNotNull() {
            addCriterion("a_status is not null");
            return (Criteria) this;
        }

        public Criteria andAStatusEqualTo(Integer value) {
            addCriterion("a_status =", value, "aStatus");
            return (Criteria) this;
        }

        public Criteria andAStatusNotEqualTo(Integer value) {
            addCriterion("a_status <>", value, "aStatus");
            return (Criteria) this;
        }

        public Criteria andAStatusGreaterThan(Integer value) {
            addCriterion("a_status >", value, "aStatus");
            return (Criteria) this;
        }

        public Criteria andAStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("a_status >=", value, "aStatus");
            return (Criteria) this;
        }

        public Criteria andAStatusLessThan(Integer value) {
            addCriterion("a_status <", value, "aStatus");
            return (Criteria) this;
        }

        public Criteria andAStatusLessThanOrEqualTo(Integer value) {
            addCriterion("a_status <=", value, "aStatus");
            return (Criteria) this;
        }

        public Criteria andAStatusIn(List<Integer> values) {
            addCriterion("a_status in", values, "aStatus");
            return (Criteria) this;
        }

        public Criteria andAStatusNotIn(List<Integer> values) {
            addCriterion("a_status not in", values, "aStatus");
            return (Criteria) this;
        }

        public Criteria andAStatusBetween(Integer value1, Integer value2) {
            addCriterion("a_status between", value1, value2, "aStatus");
            return (Criteria) this;
        }

        public Criteria andAStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("a_status not between", value1, value2, "aStatus");
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