package com.mezereon.springtest.bean;

import java.util.ArrayList;
import java.util.List;

public class OrderGoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderGoodsExample() {
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

        public Criteria andOgIdIsNull() {
            addCriterion("og_id is null");
            return (Criteria) this;
        }

        public Criteria andOgIdIsNotNull() {
            addCriterion("og_id is not null");
            return (Criteria) this;
        }

        public Criteria andOgIdEqualTo(Integer value) {
            addCriterion("og_id =", value, "ogId");
            return (Criteria) this;
        }

        public Criteria andOgIdNotEqualTo(Integer value) {
            addCriterion("og_id <>", value, "ogId");
            return (Criteria) this;
        }

        public Criteria andOgIdGreaterThan(Integer value) {
            addCriterion("og_id >", value, "ogId");
            return (Criteria) this;
        }

        public Criteria andOgIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("og_id >=", value, "ogId");
            return (Criteria) this;
        }

        public Criteria andOgIdLessThan(Integer value) {
            addCriterion("og_id <", value, "ogId");
            return (Criteria) this;
        }

        public Criteria andOgIdLessThanOrEqualTo(Integer value) {
            addCriterion("og_id <=", value, "ogId");
            return (Criteria) this;
        }

        public Criteria andOgIdIn(List<Integer> values) {
            addCriterion("og_id in", values, "ogId");
            return (Criteria) this;
        }

        public Criteria andOgIdNotIn(List<Integer> values) {
            addCriterion("og_id not in", values, "ogId");
            return (Criteria) this;
        }

        public Criteria andOgIdBetween(Integer value1, Integer value2) {
            addCriterion("og_id between", value1, value2, "ogId");
            return (Criteria) this;
        }

        public Criteria andOgIdNotBetween(Integer value1, Integer value2) {
            addCriterion("og_id not between", value1, value2, "ogId");
            return (Criteria) this;
        }

        public Criteria andOgOrderIdIsNull() {
            addCriterion("og_order_id is null");
            return (Criteria) this;
        }

        public Criteria andOgOrderIdIsNotNull() {
            addCriterion("og_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOgOrderIdEqualTo(Integer value) {
            addCriterion("og_order_id =", value, "ogOrderId");
            return (Criteria) this;
        }

        public Criteria andOgOrderIdNotEqualTo(Integer value) {
            addCriterion("og_order_id <>", value, "ogOrderId");
            return (Criteria) this;
        }

        public Criteria andOgOrderIdGreaterThan(Integer value) {
            addCriterion("og_order_id >", value, "ogOrderId");
            return (Criteria) this;
        }

        public Criteria andOgOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("og_order_id >=", value, "ogOrderId");
            return (Criteria) this;
        }

        public Criteria andOgOrderIdLessThan(Integer value) {
            addCriterion("og_order_id <", value, "ogOrderId");
            return (Criteria) this;
        }

        public Criteria andOgOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("og_order_id <=", value, "ogOrderId");
            return (Criteria) this;
        }

        public Criteria andOgOrderIdIn(List<Integer> values) {
            addCriterion("og_order_id in", values, "ogOrderId");
            return (Criteria) this;
        }

        public Criteria andOgOrderIdNotIn(List<Integer> values) {
            addCriterion("og_order_id not in", values, "ogOrderId");
            return (Criteria) this;
        }

        public Criteria andOgOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("og_order_id between", value1, value2, "ogOrderId");
            return (Criteria) this;
        }

        public Criteria andOgOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("og_order_id not between", value1, value2, "ogOrderId");
            return (Criteria) this;
        }

        public Criteria andOgGoodsIdIsNull() {
            addCriterion("og_goods_id is null");
            return (Criteria) this;
        }

        public Criteria andOgGoodsIdIsNotNull() {
            addCriterion("og_goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andOgGoodsIdEqualTo(Integer value) {
            addCriterion("og_goods_id =", value, "ogGoodsId");
            return (Criteria) this;
        }

        public Criteria andOgGoodsIdNotEqualTo(Integer value) {
            addCriterion("og_goods_id <>", value, "ogGoodsId");
            return (Criteria) this;
        }

        public Criteria andOgGoodsIdGreaterThan(Integer value) {
            addCriterion("og_goods_id >", value, "ogGoodsId");
            return (Criteria) this;
        }

        public Criteria andOgGoodsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("og_goods_id >=", value, "ogGoodsId");
            return (Criteria) this;
        }

        public Criteria andOgGoodsIdLessThan(Integer value) {
            addCriterion("og_goods_id <", value, "ogGoodsId");
            return (Criteria) this;
        }

        public Criteria andOgGoodsIdLessThanOrEqualTo(Integer value) {
            addCriterion("og_goods_id <=", value, "ogGoodsId");
            return (Criteria) this;
        }

        public Criteria andOgGoodsIdIn(List<Integer> values) {
            addCriterion("og_goods_id in", values, "ogGoodsId");
            return (Criteria) this;
        }

        public Criteria andOgGoodsIdNotIn(List<Integer> values) {
            addCriterion("og_goods_id not in", values, "ogGoodsId");
            return (Criteria) this;
        }

        public Criteria andOgGoodsIdBetween(Integer value1, Integer value2) {
            addCriterion("og_goods_id between", value1, value2, "ogGoodsId");
            return (Criteria) this;
        }

        public Criteria andOgGoodsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("og_goods_id not between", value1, value2, "ogGoodsId");
            return (Criteria) this;
        }

        public Criteria andOgPriceIsNull() {
            addCriterion("og_price is null");
            return (Criteria) this;
        }

        public Criteria andOgPriceIsNotNull() {
            addCriterion("og_price is not null");
            return (Criteria) this;
        }

        public Criteria andOgPriceEqualTo(Double value) {
            addCriterion("og_price =", value, "ogPrice");
            return (Criteria) this;
        }

        public Criteria andOgPriceNotEqualTo(Double value) {
            addCriterion("og_price <>", value, "ogPrice");
            return (Criteria) this;
        }

        public Criteria andOgPriceGreaterThan(Double value) {
            addCriterion("og_price >", value, "ogPrice");
            return (Criteria) this;
        }

        public Criteria andOgPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("og_price >=", value, "ogPrice");
            return (Criteria) this;
        }

        public Criteria andOgPriceLessThan(Double value) {
            addCriterion("og_price <", value, "ogPrice");
            return (Criteria) this;
        }

        public Criteria andOgPriceLessThanOrEqualTo(Double value) {
            addCriterion("og_price <=", value, "ogPrice");
            return (Criteria) this;
        }

        public Criteria andOgPriceIn(List<Double> values) {
            addCriterion("og_price in", values, "ogPrice");
            return (Criteria) this;
        }

        public Criteria andOgPriceNotIn(List<Double> values) {
            addCriterion("og_price not in", values, "ogPrice");
            return (Criteria) this;
        }

        public Criteria andOgPriceBetween(Double value1, Double value2) {
            addCriterion("og_price between", value1, value2, "ogPrice");
            return (Criteria) this;
        }

        public Criteria andOgPriceNotBetween(Double value1, Double value2) {
            addCriterion("og_price not between", value1, value2, "ogPrice");
            return (Criteria) this;
        }

        public Criteria andOgQuantityIsNull() {
            addCriterion("og_quantity is null");
            return (Criteria) this;
        }

        public Criteria andOgQuantityIsNotNull() {
            addCriterion("og_quantity is not null");
            return (Criteria) this;
        }

        public Criteria andOgQuantityEqualTo(Integer value) {
            addCriterion("og_quantity =", value, "ogQuantity");
            return (Criteria) this;
        }

        public Criteria andOgQuantityNotEqualTo(Integer value) {
            addCriterion("og_quantity <>", value, "ogQuantity");
            return (Criteria) this;
        }

        public Criteria andOgQuantityGreaterThan(Integer value) {
            addCriterion("og_quantity >", value, "ogQuantity");
            return (Criteria) this;
        }

        public Criteria andOgQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("og_quantity >=", value, "ogQuantity");
            return (Criteria) this;
        }

        public Criteria andOgQuantityLessThan(Integer value) {
            addCriterion("og_quantity <", value, "ogQuantity");
            return (Criteria) this;
        }

        public Criteria andOgQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("og_quantity <=", value, "ogQuantity");
            return (Criteria) this;
        }

        public Criteria andOgQuantityIn(List<Integer> values) {
            addCriterion("og_quantity in", values, "ogQuantity");
            return (Criteria) this;
        }

        public Criteria andOgQuantityNotIn(List<Integer> values) {
            addCriterion("og_quantity not in", values, "ogQuantity");
            return (Criteria) this;
        }

        public Criteria andOgQuantityBetween(Integer value1, Integer value2) {
            addCriterion("og_quantity between", value1, value2, "ogQuantity");
            return (Criteria) this;
        }

        public Criteria andOgQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("og_quantity not between", value1, value2, "ogQuantity");
            return (Criteria) this;
        }

        public Criteria andOgStatusIsNull() {
            addCriterion("og_status is null");
            return (Criteria) this;
        }

        public Criteria andOgStatusIsNotNull() {
            addCriterion("og_status is not null");
            return (Criteria) this;
        }

        public Criteria andOgStatusEqualTo(Integer value) {
            addCriterion("og_status =", value, "ogStatus");
            return (Criteria) this;
        }

        public Criteria andOgStatusNotEqualTo(Integer value) {
            addCriterion("og_status <>", value, "ogStatus");
            return (Criteria) this;
        }

        public Criteria andOgStatusGreaterThan(Integer value) {
            addCriterion("og_status >", value, "ogStatus");
            return (Criteria) this;
        }

        public Criteria andOgStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("og_status >=", value, "ogStatus");
            return (Criteria) this;
        }

        public Criteria andOgStatusLessThan(Integer value) {
            addCriterion("og_status <", value, "ogStatus");
            return (Criteria) this;
        }

        public Criteria andOgStatusLessThanOrEqualTo(Integer value) {
            addCriterion("og_status <=", value, "ogStatus");
            return (Criteria) this;
        }

        public Criteria andOgStatusIn(List<Integer> values) {
            addCriterion("og_status in", values, "ogStatus");
            return (Criteria) this;
        }

        public Criteria andOgStatusNotIn(List<Integer> values) {
            addCriterion("og_status not in", values, "ogStatus");
            return (Criteria) this;
        }

        public Criteria andOgStatusBetween(Integer value1, Integer value2) {
            addCriterion("og_status between", value1, value2, "ogStatus");
            return (Criteria) this;
        }

        public Criteria andOgStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("og_status not between", value1, value2, "ogStatus");
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