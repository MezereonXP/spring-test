package com.mezereon.springtest.bean;

import java.util.ArrayList;
import java.util.List;

public class CommentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommentExample() {
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

        public Criteria andCmIdIsNull() {
            addCriterion("cm_id is null");
            return (Criteria) this;
        }

        public Criteria andCmIdIsNotNull() {
            addCriterion("cm_id is not null");
            return (Criteria) this;
        }

        public Criteria andCmIdEqualTo(Integer value) {
            addCriterion("cm_id =", value, "cmId");
            return (Criteria) this;
        }

        public Criteria andCmIdNotEqualTo(Integer value) {
            addCriterion("cm_id <>", value, "cmId");
            return (Criteria) this;
        }

        public Criteria andCmIdGreaterThan(Integer value) {
            addCriterion("cm_id >", value, "cmId");
            return (Criteria) this;
        }

        public Criteria andCmIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cm_id >=", value, "cmId");
            return (Criteria) this;
        }

        public Criteria andCmIdLessThan(Integer value) {
            addCriterion("cm_id <", value, "cmId");
            return (Criteria) this;
        }

        public Criteria andCmIdLessThanOrEqualTo(Integer value) {
            addCriterion("cm_id <=", value, "cmId");
            return (Criteria) this;
        }

        public Criteria andCmIdIn(List<Integer> values) {
            addCriterion("cm_id in", values, "cmId");
            return (Criteria) this;
        }

        public Criteria andCmIdNotIn(List<Integer> values) {
            addCriterion("cm_id not in", values, "cmId");
            return (Criteria) this;
        }

        public Criteria andCmIdBetween(Integer value1, Integer value2) {
            addCriterion("cm_id between", value1, value2, "cmId");
            return (Criteria) this;
        }

        public Criteria andCmIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cm_id not between", value1, value2, "cmId");
            return (Criteria) this;
        }

        public Criteria andCmGoodsIdIsNull() {
            addCriterion("cm_goods_id is null");
            return (Criteria) this;
        }

        public Criteria andCmGoodsIdIsNotNull() {
            addCriterion("cm_goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andCmGoodsIdEqualTo(Integer value) {
            addCriterion("cm_goods_id =", value, "cmGoodsId");
            return (Criteria) this;
        }

        public Criteria andCmGoodsIdNotEqualTo(Integer value) {
            addCriterion("cm_goods_id <>", value, "cmGoodsId");
            return (Criteria) this;
        }

        public Criteria andCmGoodsIdGreaterThan(Integer value) {
            addCriterion("cm_goods_id >", value, "cmGoodsId");
            return (Criteria) this;
        }

        public Criteria andCmGoodsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cm_goods_id >=", value, "cmGoodsId");
            return (Criteria) this;
        }

        public Criteria andCmGoodsIdLessThan(Integer value) {
            addCriterion("cm_goods_id <", value, "cmGoodsId");
            return (Criteria) this;
        }

        public Criteria andCmGoodsIdLessThanOrEqualTo(Integer value) {
            addCriterion("cm_goods_id <=", value, "cmGoodsId");
            return (Criteria) this;
        }

        public Criteria andCmGoodsIdIn(List<Integer> values) {
            addCriterion("cm_goods_id in", values, "cmGoodsId");
            return (Criteria) this;
        }

        public Criteria andCmGoodsIdNotIn(List<Integer> values) {
            addCriterion("cm_goods_id not in", values, "cmGoodsId");
            return (Criteria) this;
        }

        public Criteria andCmGoodsIdBetween(Integer value1, Integer value2) {
            addCriterion("cm_goods_id between", value1, value2, "cmGoodsId");
            return (Criteria) this;
        }

        public Criteria andCmGoodsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cm_goods_id not between", value1, value2, "cmGoodsId");
            return (Criteria) this;
        }

        public Criteria andCmCustomerIdIsNull() {
            addCriterion("cm_customer_id is null");
            return (Criteria) this;
        }

        public Criteria andCmCustomerIdIsNotNull() {
            addCriterion("cm_customer_id is not null");
            return (Criteria) this;
        }

        public Criteria andCmCustomerIdEqualTo(Integer value) {
            addCriterion("cm_customer_id =", value, "cmCustomerId");
            return (Criteria) this;
        }

        public Criteria andCmCustomerIdNotEqualTo(Integer value) {
            addCriterion("cm_customer_id <>", value, "cmCustomerId");
            return (Criteria) this;
        }

        public Criteria andCmCustomerIdGreaterThan(Integer value) {
            addCriterion("cm_customer_id >", value, "cmCustomerId");
            return (Criteria) this;
        }

        public Criteria andCmCustomerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cm_customer_id >=", value, "cmCustomerId");
            return (Criteria) this;
        }

        public Criteria andCmCustomerIdLessThan(Integer value) {
            addCriterion("cm_customer_id <", value, "cmCustomerId");
            return (Criteria) this;
        }

        public Criteria andCmCustomerIdLessThanOrEqualTo(Integer value) {
            addCriterion("cm_customer_id <=", value, "cmCustomerId");
            return (Criteria) this;
        }

        public Criteria andCmCustomerIdIn(List<Integer> values) {
            addCriterion("cm_customer_id in", values, "cmCustomerId");
            return (Criteria) this;
        }

        public Criteria andCmCustomerIdNotIn(List<Integer> values) {
            addCriterion("cm_customer_id not in", values, "cmCustomerId");
            return (Criteria) this;
        }

        public Criteria andCmCustomerIdBetween(Integer value1, Integer value2) {
            addCriterion("cm_customer_id between", value1, value2, "cmCustomerId");
            return (Criteria) this;
        }

        public Criteria andCmCustomerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cm_customer_id not between", value1, value2, "cmCustomerId");
            return (Criteria) this;
        }

        public Criteria andCmInfoIsNull() {
            addCriterion("cm_info is null");
            return (Criteria) this;
        }

        public Criteria andCmInfoIsNotNull() {
            addCriterion("cm_info is not null");
            return (Criteria) this;
        }

        public Criteria andCmInfoEqualTo(String value) {
            addCriterion("cm_info =", value, "cmInfo");
            return (Criteria) this;
        }

        public Criteria andCmInfoNotEqualTo(String value) {
            addCriterion("cm_info <>", value, "cmInfo");
            return (Criteria) this;
        }

        public Criteria andCmInfoGreaterThan(String value) {
            addCriterion("cm_info >", value, "cmInfo");
            return (Criteria) this;
        }

        public Criteria andCmInfoGreaterThanOrEqualTo(String value) {
            addCriterion("cm_info >=", value, "cmInfo");
            return (Criteria) this;
        }

        public Criteria andCmInfoLessThan(String value) {
            addCriterion("cm_info <", value, "cmInfo");
            return (Criteria) this;
        }

        public Criteria andCmInfoLessThanOrEqualTo(String value) {
            addCriterion("cm_info <=", value, "cmInfo");
            return (Criteria) this;
        }

        public Criteria andCmInfoLike(String value) {
            addCriterion("cm_info like", value, "cmInfo");
            return (Criteria) this;
        }

        public Criteria andCmInfoNotLike(String value) {
            addCriterion("cm_info not like", value, "cmInfo");
            return (Criteria) this;
        }

        public Criteria andCmInfoIn(List<String> values) {
            addCriterion("cm_info in", values, "cmInfo");
            return (Criteria) this;
        }

        public Criteria andCmInfoNotIn(List<String> values) {
            addCriterion("cm_info not in", values, "cmInfo");
            return (Criteria) this;
        }

        public Criteria andCmInfoBetween(String value1, String value2) {
            addCriterion("cm_info between", value1, value2, "cmInfo");
            return (Criteria) this;
        }

        public Criteria andCmInfoNotBetween(String value1, String value2) {
            addCriterion("cm_info not between", value1, value2, "cmInfo");
            return (Criteria) this;
        }

        public Criteria andCmDateIsNull() {
            addCriterion("cm_date is null");
            return (Criteria) this;
        }

        public Criteria andCmDateIsNotNull() {
            addCriterion("cm_date is not null");
            return (Criteria) this;
        }

        public Criteria andCmDateEqualTo(String value) {
            addCriterion("cm_date =", value, "cmDate");
            return (Criteria) this;
        }

        public Criteria andCmDateNotEqualTo(String value) {
            addCriterion("cm_date <>", value, "cmDate");
            return (Criteria) this;
        }

        public Criteria andCmDateGreaterThan(String value) {
            addCriterion("cm_date >", value, "cmDate");
            return (Criteria) this;
        }

        public Criteria andCmDateGreaterThanOrEqualTo(String value) {
            addCriterion("cm_date >=", value, "cmDate");
            return (Criteria) this;
        }

        public Criteria andCmDateLessThan(String value) {
            addCriterion("cm_date <", value, "cmDate");
            return (Criteria) this;
        }

        public Criteria andCmDateLessThanOrEqualTo(String value) {
            addCriterion("cm_date <=", value, "cmDate");
            return (Criteria) this;
        }

        public Criteria andCmDateLike(String value) {
            addCriterion("cm_date like", value, "cmDate");
            return (Criteria) this;
        }

        public Criteria andCmDateNotLike(String value) {
            addCriterion("cm_date not like", value, "cmDate");
            return (Criteria) this;
        }

        public Criteria andCmDateIn(List<String> values) {
            addCriterion("cm_date in", values, "cmDate");
            return (Criteria) this;
        }

        public Criteria andCmDateNotIn(List<String> values) {
            addCriterion("cm_date not in", values, "cmDate");
            return (Criteria) this;
        }

        public Criteria andCmDateBetween(String value1, String value2) {
            addCriterion("cm_date between", value1, value2, "cmDate");
            return (Criteria) this;
        }

        public Criteria andCmDateNotBetween(String value1, String value2) {
            addCriterion("cm_date not between", value1, value2, "cmDate");
            return (Criteria) this;
        }

        public Criteria andCmStatusIsNull() {
            addCriterion("cm_status is null");
            return (Criteria) this;
        }

        public Criteria andCmStatusIsNotNull() {
            addCriterion("cm_status is not null");
            return (Criteria) this;
        }

        public Criteria andCmStatusEqualTo(Integer value) {
            addCriterion("cm_status =", value, "cmStatus");
            return (Criteria) this;
        }

        public Criteria andCmStatusNotEqualTo(Integer value) {
            addCriterion("cm_status <>", value, "cmStatus");
            return (Criteria) this;
        }

        public Criteria andCmStatusGreaterThan(Integer value) {
            addCriterion("cm_status >", value, "cmStatus");
            return (Criteria) this;
        }

        public Criteria andCmStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("cm_status >=", value, "cmStatus");
            return (Criteria) this;
        }

        public Criteria andCmStatusLessThan(Integer value) {
            addCriterion("cm_status <", value, "cmStatus");
            return (Criteria) this;
        }

        public Criteria andCmStatusLessThanOrEqualTo(Integer value) {
            addCriterion("cm_status <=", value, "cmStatus");
            return (Criteria) this;
        }

        public Criteria andCmStatusIn(List<Integer> values) {
            addCriterion("cm_status in", values, "cmStatus");
            return (Criteria) this;
        }

        public Criteria andCmStatusNotIn(List<Integer> values) {
            addCriterion("cm_status not in", values, "cmStatus");
            return (Criteria) this;
        }

        public Criteria andCmStatusBetween(Integer value1, Integer value2) {
            addCriterion("cm_status between", value1, value2, "cmStatus");
            return (Criteria) this;
        }

        public Criteria andCmStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("cm_status not between", value1, value2, "cmStatus");
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