package com.mezereon.springtest.bean;

import java.util.ArrayList;
import java.util.List;

public class ShopCarExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShopCarExample() {
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

        public Criteria andSIdIsNull() {
            addCriterion("s_id is null");
            return (Criteria) this;
        }

        public Criteria andSIdIsNotNull() {
            addCriterion("s_id is not null");
            return (Criteria) this;
        }

        public Criteria andSIdEqualTo(Integer value) {
            addCriterion("s_id =", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotEqualTo(Integer value) {
            addCriterion("s_id <>", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdGreaterThan(Integer value) {
            addCriterion("s_id >", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("s_id >=", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdLessThan(Integer value) {
            addCriterion("s_id <", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdLessThanOrEqualTo(Integer value) {
            addCriterion("s_id <=", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdIn(List<Integer> values) {
            addCriterion("s_id in", values, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotIn(List<Integer> values) {
            addCriterion("s_id not in", values, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdBetween(Integer value1, Integer value2) {
            addCriterion("s_id between", value1, value2, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotBetween(Integer value1, Integer value2) {
            addCriterion("s_id not between", value1, value2, "sId");
            return (Criteria) this;
        }

        public Criteria andSCustomerIdIsNull() {
            addCriterion("s_customer_id is null");
            return (Criteria) this;
        }

        public Criteria andSCustomerIdIsNotNull() {
            addCriterion("s_customer_id is not null");
            return (Criteria) this;
        }

        public Criteria andSCustomerIdEqualTo(Integer value) {
            addCriterion("s_customer_id =", value, "sCustomerId");
            return (Criteria) this;
        }

        public Criteria andSCustomerIdNotEqualTo(Integer value) {
            addCriterion("s_customer_id <>", value, "sCustomerId");
            return (Criteria) this;
        }

        public Criteria andSCustomerIdGreaterThan(Integer value) {
            addCriterion("s_customer_id >", value, "sCustomerId");
            return (Criteria) this;
        }

        public Criteria andSCustomerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("s_customer_id >=", value, "sCustomerId");
            return (Criteria) this;
        }

        public Criteria andSCustomerIdLessThan(Integer value) {
            addCriterion("s_customer_id <", value, "sCustomerId");
            return (Criteria) this;
        }

        public Criteria andSCustomerIdLessThanOrEqualTo(Integer value) {
            addCriterion("s_customer_id <=", value, "sCustomerId");
            return (Criteria) this;
        }

        public Criteria andSCustomerIdIn(List<Integer> values) {
            addCriterion("s_customer_id in", values, "sCustomerId");
            return (Criteria) this;
        }

        public Criteria andSCustomerIdNotIn(List<Integer> values) {
            addCriterion("s_customer_id not in", values, "sCustomerId");
            return (Criteria) this;
        }

        public Criteria andSCustomerIdBetween(Integer value1, Integer value2) {
            addCriterion("s_customer_id between", value1, value2, "sCustomerId");
            return (Criteria) this;
        }

        public Criteria andSCustomerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("s_customer_id not between", value1, value2, "sCustomerId");
            return (Criteria) this;
        }

        public Criteria andSGoodsIdIsNull() {
            addCriterion("s_goods_id is null");
            return (Criteria) this;
        }

        public Criteria andSGoodsIdIsNotNull() {
            addCriterion("s_goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andSGoodsIdEqualTo(Integer value) {
            addCriterion("s_goods_id =", value, "sGoodsId");
            return (Criteria) this;
        }

        public Criteria andSGoodsIdNotEqualTo(Integer value) {
            addCriterion("s_goods_id <>", value, "sGoodsId");
            return (Criteria) this;
        }

        public Criteria andSGoodsIdGreaterThan(Integer value) {
            addCriterion("s_goods_id >", value, "sGoodsId");
            return (Criteria) this;
        }

        public Criteria andSGoodsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("s_goods_id >=", value, "sGoodsId");
            return (Criteria) this;
        }

        public Criteria andSGoodsIdLessThan(Integer value) {
            addCriterion("s_goods_id <", value, "sGoodsId");
            return (Criteria) this;
        }

        public Criteria andSGoodsIdLessThanOrEqualTo(Integer value) {
            addCriterion("s_goods_id <=", value, "sGoodsId");
            return (Criteria) this;
        }

        public Criteria andSGoodsIdIn(List<Integer> values) {
            addCriterion("s_goods_id in", values, "sGoodsId");
            return (Criteria) this;
        }

        public Criteria andSGoodsIdNotIn(List<Integer> values) {
            addCriterion("s_goods_id not in", values, "sGoodsId");
            return (Criteria) this;
        }

        public Criteria andSGoodsIdBetween(Integer value1, Integer value2) {
            addCriterion("s_goods_id between", value1, value2, "sGoodsId");
            return (Criteria) this;
        }

        public Criteria andSGoodsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("s_goods_id not between", value1, value2, "sGoodsId");
            return (Criteria) this;
        }

        public Criteria andSQuantityIsNull() {
            addCriterion("s_quantity is null");
            return (Criteria) this;
        }

        public Criteria andSQuantityIsNotNull() {
            addCriterion("s_quantity is not null");
            return (Criteria) this;
        }

        public Criteria andSQuantityEqualTo(Integer value) {
            addCriterion("s_quantity =", value, "sQuantity");
            return (Criteria) this;
        }

        public Criteria andSQuantityNotEqualTo(Integer value) {
            addCriterion("s_quantity <>", value, "sQuantity");
            return (Criteria) this;
        }

        public Criteria andSQuantityGreaterThan(Integer value) {
            addCriterion("s_quantity >", value, "sQuantity");
            return (Criteria) this;
        }

        public Criteria andSQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("s_quantity >=", value, "sQuantity");
            return (Criteria) this;
        }

        public Criteria andSQuantityLessThan(Integer value) {
            addCriterion("s_quantity <", value, "sQuantity");
            return (Criteria) this;
        }

        public Criteria andSQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("s_quantity <=", value, "sQuantity");
            return (Criteria) this;
        }

        public Criteria andSQuantityIn(List<Integer> values) {
            addCriterion("s_quantity in", values, "sQuantity");
            return (Criteria) this;
        }

        public Criteria andSQuantityNotIn(List<Integer> values) {
            addCriterion("s_quantity not in", values, "sQuantity");
            return (Criteria) this;
        }

        public Criteria andSQuantityBetween(Integer value1, Integer value2) {
            addCriterion("s_quantity between", value1, value2, "sQuantity");
            return (Criteria) this;
        }

        public Criteria andSQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("s_quantity not between", value1, value2, "sQuantity");
            return (Criteria) this;
        }

        public Criteria andSStatusIsNull() {
            addCriterion("s_status is null");
            return (Criteria) this;
        }

        public Criteria andSStatusIsNotNull() {
            addCriterion("s_status is not null");
            return (Criteria) this;
        }

        public Criteria andSStatusEqualTo(Integer value) {
            addCriterion("s_status =", value, "sStatus");
            return (Criteria) this;
        }

        public Criteria andSStatusNotEqualTo(Integer value) {
            addCriterion("s_status <>", value, "sStatus");
            return (Criteria) this;
        }

        public Criteria andSStatusGreaterThan(Integer value) {
            addCriterion("s_status >", value, "sStatus");
            return (Criteria) this;
        }

        public Criteria andSStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("s_status >=", value, "sStatus");
            return (Criteria) this;
        }

        public Criteria andSStatusLessThan(Integer value) {
            addCriterion("s_status <", value, "sStatus");
            return (Criteria) this;
        }

        public Criteria andSStatusLessThanOrEqualTo(Integer value) {
            addCriterion("s_status <=", value, "sStatus");
            return (Criteria) this;
        }

        public Criteria andSStatusIn(List<Integer> values) {
            addCriterion("s_status in", values, "sStatus");
            return (Criteria) this;
        }

        public Criteria andSStatusNotIn(List<Integer> values) {
            addCriterion("s_status not in", values, "sStatus");
            return (Criteria) this;
        }

        public Criteria andSStatusBetween(Integer value1, Integer value2) {
            addCriterion("s_status between", value1, value2, "sStatus");
            return (Criteria) this;
        }

        public Criteria andSStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("s_status not between", value1, value2, "sStatus");
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