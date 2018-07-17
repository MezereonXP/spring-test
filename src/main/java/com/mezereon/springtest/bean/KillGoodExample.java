package com.mezereon.springtest.bean;

import java.util.ArrayList;
import java.util.List;

public class KillGoodExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public KillGoodExample() {
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

        public Criteria andKgIdIsNull() {
            addCriterion("kg_id is null");
            return (Criteria) this;
        }

        public Criteria andKgIdIsNotNull() {
            addCriterion("kg_id is not null");
            return (Criteria) this;
        }

        public Criteria andKgIdEqualTo(Integer value) {
            addCriterion("kg_id =", value, "kgId");
            return (Criteria) this;
        }

        public Criteria andKgIdNotEqualTo(Integer value) {
            addCriterion("kg_id <>", value, "kgId");
            return (Criteria) this;
        }

        public Criteria andKgIdGreaterThan(Integer value) {
            addCriterion("kg_id >", value, "kgId");
            return (Criteria) this;
        }

        public Criteria andKgIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("kg_id >=", value, "kgId");
            return (Criteria) this;
        }

        public Criteria andKgIdLessThan(Integer value) {
            addCriterion("kg_id <", value, "kgId");
            return (Criteria) this;
        }

        public Criteria andKgIdLessThanOrEqualTo(Integer value) {
            addCriterion("kg_id <=", value, "kgId");
            return (Criteria) this;
        }

        public Criteria andKgIdIn(List<Integer> values) {
            addCriterion("kg_id in", values, "kgId");
            return (Criteria) this;
        }

        public Criteria andKgIdNotIn(List<Integer> values) {
            addCriterion("kg_id not in", values, "kgId");
            return (Criteria) this;
        }

        public Criteria andKgIdBetween(Integer value1, Integer value2) {
            addCriterion("kg_id between", value1, value2, "kgId");
            return (Criteria) this;
        }

        public Criteria andKgIdNotBetween(Integer value1, Integer value2) {
            addCriterion("kg_id not between", value1, value2, "kgId");
            return (Criteria) this;
        }

        public Criteria andKgGoodsIdIsNull() {
            addCriterion("kg_goods_id is null");
            return (Criteria) this;
        }

        public Criteria andKgGoodsIdIsNotNull() {
            addCriterion("kg_goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andKgGoodsIdEqualTo(Integer value) {
            addCriterion("kg_goods_id =", value, "kgGoodsId");
            return (Criteria) this;
        }

        public Criteria andKgGoodsIdNotEqualTo(Integer value) {
            addCriterion("kg_goods_id <>", value, "kgGoodsId");
            return (Criteria) this;
        }

        public Criteria andKgGoodsIdGreaterThan(Integer value) {
            addCriterion("kg_goods_id >", value, "kgGoodsId");
            return (Criteria) this;
        }

        public Criteria andKgGoodsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("kg_goods_id >=", value, "kgGoodsId");
            return (Criteria) this;
        }

        public Criteria andKgGoodsIdLessThan(Integer value) {
            addCriterion("kg_goods_id <", value, "kgGoodsId");
            return (Criteria) this;
        }

        public Criteria andKgGoodsIdLessThanOrEqualTo(Integer value) {
            addCriterion("kg_goods_id <=", value, "kgGoodsId");
            return (Criteria) this;
        }

        public Criteria andKgGoodsIdIn(List<Integer> values) {
            addCriterion("kg_goods_id in", values, "kgGoodsId");
            return (Criteria) this;
        }

        public Criteria andKgGoodsIdNotIn(List<Integer> values) {
            addCriterion("kg_goods_id not in", values, "kgGoodsId");
            return (Criteria) this;
        }

        public Criteria andKgGoodsIdBetween(Integer value1, Integer value2) {
            addCriterion("kg_goods_id between", value1, value2, "kgGoodsId");
            return (Criteria) this;
        }

        public Criteria andKgGoodsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("kg_goods_id not between", value1, value2, "kgGoodsId");
            return (Criteria) this;
        }

        public Criteria andKgQuantityIsNull() {
            addCriterion("kg_quantity is null");
            return (Criteria) this;
        }

        public Criteria andKgQuantityIsNotNull() {
            addCriterion("kg_quantity is not null");
            return (Criteria) this;
        }

        public Criteria andKgQuantityEqualTo(Integer value) {
            addCriterion("kg_quantity =", value, "kgQuantity");
            return (Criteria) this;
        }

        public Criteria andKgQuantityNotEqualTo(Integer value) {
            addCriterion("kg_quantity <>", value, "kgQuantity");
            return (Criteria) this;
        }

        public Criteria andKgQuantityGreaterThan(Integer value) {
            addCriterion("kg_quantity >", value, "kgQuantity");
            return (Criteria) this;
        }

        public Criteria andKgQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("kg_quantity >=", value, "kgQuantity");
            return (Criteria) this;
        }

        public Criteria andKgQuantityLessThan(Integer value) {
            addCriterion("kg_quantity <", value, "kgQuantity");
            return (Criteria) this;
        }

        public Criteria andKgQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("kg_quantity <=", value, "kgQuantity");
            return (Criteria) this;
        }

        public Criteria andKgQuantityIn(List<Integer> values) {
            addCriterion("kg_quantity in", values, "kgQuantity");
            return (Criteria) this;
        }

        public Criteria andKgQuantityNotIn(List<Integer> values) {
            addCriterion("kg_quantity not in", values, "kgQuantity");
            return (Criteria) this;
        }

        public Criteria andKgQuantityBetween(Integer value1, Integer value2) {
            addCriterion("kg_quantity between", value1, value2, "kgQuantity");
            return (Criteria) this;
        }

        public Criteria andKgQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("kg_quantity not between", value1, value2, "kgQuantity");
            return (Criteria) this;
        }

        public Criteria andKgTimeIsNull() {
            addCriterion("kg_time is null");
            return (Criteria) this;
        }

        public Criteria andKgTimeIsNotNull() {
            addCriterion("kg_time is not null");
            return (Criteria) this;
        }

        public Criteria andKgTimeEqualTo(String value) {
            addCriterion("kg_time =", value, "kgTime");
            return (Criteria) this;
        }

        public Criteria andKgTimeNotEqualTo(String value) {
            addCriterion("kg_time <>", value, "kgTime");
            return (Criteria) this;
        }

        public Criteria andKgTimeGreaterThan(String value) {
            addCriterion("kg_time >", value, "kgTime");
            return (Criteria) this;
        }

        public Criteria andKgTimeGreaterThanOrEqualTo(String value) {
            addCriterion("kg_time >=", value, "kgTime");
            return (Criteria) this;
        }

        public Criteria andKgTimeLessThan(String value) {
            addCriterion("kg_time <", value, "kgTime");
            return (Criteria) this;
        }

        public Criteria andKgTimeLessThanOrEqualTo(String value) {
            addCriterion("kg_time <=", value, "kgTime");
            return (Criteria) this;
        }

        public Criteria andKgTimeLike(String value) {
            addCriterion("kg_time like", value, "kgTime");
            return (Criteria) this;
        }

        public Criteria andKgTimeNotLike(String value) {
            addCriterion("kg_time not like", value, "kgTime");
            return (Criteria) this;
        }

        public Criteria andKgTimeIn(List<String> values) {
            addCriterion("kg_time in", values, "kgTime");
            return (Criteria) this;
        }

        public Criteria andKgTimeNotIn(List<String> values) {
            addCriterion("kg_time not in", values, "kgTime");
            return (Criteria) this;
        }

        public Criteria andKgTimeBetween(String value1, String value2) {
            addCriterion("kg_time between", value1, value2, "kgTime");
            return (Criteria) this;
        }

        public Criteria andKgTimeNotBetween(String value1, String value2) {
            addCriterion("kg_time not between", value1, value2, "kgTime");
            return (Criteria) this;
        }

        public Criteria andKgPriceIsNull() {
            addCriterion("kg_price is null");
            return (Criteria) this;
        }

        public Criteria andKgPriceIsNotNull() {
            addCriterion("kg_price is not null");
            return (Criteria) this;
        }

        public Criteria andKgPriceEqualTo(Integer value) {
            addCriterion("kg_price =", value, "kgPrice");
            return (Criteria) this;
        }

        public Criteria andKgPriceNotEqualTo(Integer value) {
            addCriterion("kg_price <>", value, "kgPrice");
            return (Criteria) this;
        }

        public Criteria andKgPriceGreaterThan(Integer value) {
            addCriterion("kg_price >", value, "kgPrice");
            return (Criteria) this;
        }

        public Criteria andKgPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("kg_price >=", value, "kgPrice");
            return (Criteria) this;
        }

        public Criteria andKgPriceLessThan(Integer value) {
            addCriterion("kg_price <", value, "kgPrice");
            return (Criteria) this;
        }

        public Criteria andKgPriceLessThanOrEqualTo(Integer value) {
            addCriterion("kg_price <=", value, "kgPrice");
            return (Criteria) this;
        }

        public Criteria andKgPriceIn(List<Integer> values) {
            addCriterion("kg_price in", values, "kgPrice");
            return (Criteria) this;
        }

        public Criteria andKgPriceNotIn(List<Integer> values) {
            addCriterion("kg_price not in", values, "kgPrice");
            return (Criteria) this;
        }

        public Criteria andKgPriceBetween(Integer value1, Integer value2) {
            addCriterion("kg_price between", value1, value2, "kgPrice");
            return (Criteria) this;
        }

        public Criteria andKgPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("kg_price not between", value1, value2, "kgPrice");
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