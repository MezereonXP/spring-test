package com.mezereon.springtest.bean;

import java.util.ArrayList;
import java.util.List;

public class FavoriteExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FavoriteExample() {
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

        public Criteria andFIdIsNull() {
            addCriterion("f_id is null");
            return (Criteria) this;
        }

        public Criteria andFIdIsNotNull() {
            addCriterion("f_id is not null");
            return (Criteria) this;
        }

        public Criteria andFIdEqualTo(Integer value) {
            addCriterion("f_id =", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdNotEqualTo(Integer value) {
            addCriterion("f_id <>", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdGreaterThan(Integer value) {
            addCriterion("f_id >", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("f_id >=", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdLessThan(Integer value) {
            addCriterion("f_id <", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdLessThanOrEqualTo(Integer value) {
            addCriterion("f_id <=", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdIn(List<Integer> values) {
            addCriterion("f_id in", values, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdNotIn(List<Integer> values) {
            addCriterion("f_id not in", values, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdBetween(Integer value1, Integer value2) {
            addCriterion("f_id between", value1, value2, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdNotBetween(Integer value1, Integer value2) {
            addCriterion("f_id not between", value1, value2, "fId");
            return (Criteria) this;
        }

        public Criteria andFCustomerIdIsNull() {
            addCriterion("f_customer_id is null");
            return (Criteria) this;
        }

        public Criteria andFCustomerIdIsNotNull() {
            addCriterion("f_customer_id is not null");
            return (Criteria) this;
        }

        public Criteria andFCustomerIdEqualTo(Integer value) {
            addCriterion("f_customer_id =", value, "fCustomerId");
            return (Criteria) this;
        }

        public Criteria andFCustomerIdNotEqualTo(Integer value) {
            addCriterion("f_customer_id <>", value, "fCustomerId");
            return (Criteria) this;
        }

        public Criteria andFCustomerIdGreaterThan(Integer value) {
            addCriterion("f_customer_id >", value, "fCustomerId");
            return (Criteria) this;
        }

        public Criteria andFCustomerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("f_customer_id >=", value, "fCustomerId");
            return (Criteria) this;
        }

        public Criteria andFCustomerIdLessThan(Integer value) {
            addCriterion("f_customer_id <", value, "fCustomerId");
            return (Criteria) this;
        }

        public Criteria andFCustomerIdLessThanOrEqualTo(Integer value) {
            addCriterion("f_customer_id <=", value, "fCustomerId");
            return (Criteria) this;
        }

        public Criteria andFCustomerIdIn(List<Integer> values) {
            addCriterion("f_customer_id in", values, "fCustomerId");
            return (Criteria) this;
        }

        public Criteria andFCustomerIdNotIn(List<Integer> values) {
            addCriterion("f_customer_id not in", values, "fCustomerId");
            return (Criteria) this;
        }

        public Criteria andFCustomerIdBetween(Integer value1, Integer value2) {
            addCriterion("f_customer_id between", value1, value2, "fCustomerId");
            return (Criteria) this;
        }

        public Criteria andFCustomerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("f_customer_id not between", value1, value2, "fCustomerId");
            return (Criteria) this;
        }

        public Criteria andFGoodsIdIsNull() {
            addCriterion("f_goods_id is null");
            return (Criteria) this;
        }

        public Criteria andFGoodsIdIsNotNull() {
            addCriterion("f_goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andFGoodsIdEqualTo(Integer value) {
            addCriterion("f_goods_id =", value, "fGoodsId");
            return (Criteria) this;
        }

        public Criteria andFGoodsIdNotEqualTo(Integer value) {
            addCriterion("f_goods_id <>", value, "fGoodsId");
            return (Criteria) this;
        }

        public Criteria andFGoodsIdGreaterThan(Integer value) {
            addCriterion("f_goods_id >", value, "fGoodsId");
            return (Criteria) this;
        }

        public Criteria andFGoodsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("f_goods_id >=", value, "fGoodsId");
            return (Criteria) this;
        }

        public Criteria andFGoodsIdLessThan(Integer value) {
            addCriterion("f_goods_id <", value, "fGoodsId");
            return (Criteria) this;
        }

        public Criteria andFGoodsIdLessThanOrEqualTo(Integer value) {
            addCriterion("f_goods_id <=", value, "fGoodsId");
            return (Criteria) this;
        }

        public Criteria andFGoodsIdIn(List<Integer> values) {
            addCriterion("f_goods_id in", values, "fGoodsId");
            return (Criteria) this;
        }

        public Criteria andFGoodsIdNotIn(List<Integer> values) {
            addCriterion("f_goods_id not in", values, "fGoodsId");
            return (Criteria) this;
        }

        public Criteria andFGoodsIdBetween(Integer value1, Integer value2) {
            addCriterion("f_goods_id between", value1, value2, "fGoodsId");
            return (Criteria) this;
        }

        public Criteria andFGoodsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("f_goods_id not between", value1, value2, "fGoodsId");
            return (Criteria) this;
        }

        public Criteria andFStatusIsNull() {
            addCriterion("f_status is null");
            return (Criteria) this;
        }

        public Criteria andFStatusIsNotNull() {
            addCriterion("f_status is not null");
            return (Criteria) this;
        }

        public Criteria andFStatusEqualTo(Integer value) {
            addCriterion("f_status =", value, "fStatus");
            return (Criteria) this;
        }

        public Criteria andFStatusNotEqualTo(Integer value) {
            addCriterion("f_status <>", value, "fStatus");
            return (Criteria) this;
        }

        public Criteria andFStatusGreaterThan(Integer value) {
            addCriterion("f_status >", value, "fStatus");
            return (Criteria) this;
        }

        public Criteria andFStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("f_status >=", value, "fStatus");
            return (Criteria) this;
        }

        public Criteria andFStatusLessThan(Integer value) {
            addCriterion("f_status <", value, "fStatus");
            return (Criteria) this;
        }

        public Criteria andFStatusLessThanOrEqualTo(Integer value) {
            addCriterion("f_status <=", value, "fStatus");
            return (Criteria) this;
        }

        public Criteria andFStatusIn(List<Integer> values) {
            addCriterion("f_status in", values, "fStatus");
            return (Criteria) this;
        }

        public Criteria andFStatusNotIn(List<Integer> values) {
            addCriterion("f_status not in", values, "fStatus");
            return (Criteria) this;
        }

        public Criteria andFStatusBetween(Integer value1, Integer value2) {
            addCriterion("f_status between", value1, value2, "fStatus");
            return (Criteria) this;
        }

        public Criteria andFStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("f_status not between", value1, value2, "fStatus");
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