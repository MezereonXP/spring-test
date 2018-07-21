package com.mezereon.springtest.bean;

import java.util.ArrayList;
import java.util.List;

public class ConfigExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ConfigExample() {
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

        public Criteria andCfgIdIsNull() {
            addCriterion("cfg_id is null");
            return (Criteria) this;
        }

        public Criteria andCfgIdIsNotNull() {
            addCriterion("cfg_id is not null");
            return (Criteria) this;
        }

        public Criteria andCfgIdEqualTo(Integer value) {
            addCriterion("cfg_id =", value, "cfgId");
            return (Criteria) this;
        }

        public Criteria andCfgIdNotEqualTo(Integer value) {
            addCriterion("cfg_id <>", value, "cfgId");
            return (Criteria) this;
        }

        public Criteria andCfgIdGreaterThan(Integer value) {
            addCriterion("cfg_id >", value, "cfgId");
            return (Criteria) this;
        }

        public Criteria andCfgIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cfg_id >=", value, "cfgId");
            return (Criteria) this;
        }

        public Criteria andCfgIdLessThan(Integer value) {
            addCriterion("cfg_id <", value, "cfgId");
            return (Criteria) this;
        }

        public Criteria andCfgIdLessThanOrEqualTo(Integer value) {
            addCriterion("cfg_id <=", value, "cfgId");
            return (Criteria) this;
        }

        public Criteria andCfgIdIn(List<Integer> values) {
            addCriterion("cfg_id in", values, "cfgId");
            return (Criteria) this;
        }

        public Criteria andCfgIdNotIn(List<Integer> values) {
            addCriterion("cfg_id not in", values, "cfgId");
            return (Criteria) this;
        }

        public Criteria andCfgIdBetween(Integer value1, Integer value2) {
            addCriterion("cfg_id between", value1, value2, "cfgId");
            return (Criteria) this;
        }

        public Criteria andCfgIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cfg_id not between", value1, value2, "cfgId");
            return (Criteria) this;
        }

        public Criteria andCfgGoodsIdIsNull() {
            addCriterion("cfg_goods_id is null");
            return (Criteria) this;
        }

        public Criteria andCfgGoodsIdIsNotNull() {
            addCriterion("cfg_goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andCfgGoodsIdEqualTo(Integer value) {
            addCriterion("cfg_goods_id =", value, "cfgGoodsId");
            return (Criteria) this;
        }

        public Criteria andCfgGoodsIdNotEqualTo(Integer value) {
            addCriterion("cfg_goods_id <>", value, "cfgGoodsId");
            return (Criteria) this;
        }

        public Criteria andCfgGoodsIdGreaterThan(Integer value) {
            addCriterion("cfg_goods_id >", value, "cfgGoodsId");
            return (Criteria) this;
        }

        public Criteria andCfgGoodsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cfg_goods_id >=", value, "cfgGoodsId");
            return (Criteria) this;
        }

        public Criteria andCfgGoodsIdLessThan(Integer value) {
            addCriterion("cfg_goods_id <", value, "cfgGoodsId");
            return (Criteria) this;
        }

        public Criteria andCfgGoodsIdLessThanOrEqualTo(Integer value) {
            addCriterion("cfg_goods_id <=", value, "cfgGoodsId");
            return (Criteria) this;
        }

        public Criteria andCfgGoodsIdIn(List<Integer> values) {
            addCriterion("cfg_goods_id in", values, "cfgGoodsId");
            return (Criteria) this;
        }

        public Criteria andCfgGoodsIdNotIn(List<Integer> values) {
            addCriterion("cfg_goods_id not in", values, "cfgGoodsId");
            return (Criteria) this;
        }

        public Criteria andCfgGoodsIdBetween(Integer value1, Integer value2) {
            addCriterion("cfg_goods_id between", value1, value2, "cfgGoodsId");
            return (Criteria) this;
        }

        public Criteria andCfgGoodsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cfg_goods_id not between", value1, value2, "cfgGoodsId");
            return (Criteria) this;
        }

        public Criteria andCfgTypeIsNull() {
            addCriterion("cfg_type is null");
            return (Criteria) this;
        }

        public Criteria andCfgTypeIsNotNull() {
            addCriterion("cfg_type is not null");
            return (Criteria) this;
        }

        public Criteria andCfgTypeEqualTo(Integer value) {
            addCriterion("cfg_type =", value, "cfgType");
            return (Criteria) this;
        }

        public Criteria andCfgTypeNotEqualTo(Integer value) {
            addCriterion("cfg_type <>", value, "cfgType");
            return (Criteria) this;
        }

        public Criteria andCfgTypeGreaterThan(Integer value) {
            addCriterion("cfg_type >", value, "cfgType");
            return (Criteria) this;
        }

        public Criteria andCfgTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("cfg_type >=", value, "cfgType");
            return (Criteria) this;
        }

        public Criteria andCfgTypeLessThan(Integer value) {
            addCriterion("cfg_type <", value, "cfgType");
            return (Criteria) this;
        }

        public Criteria andCfgTypeLessThanOrEqualTo(Integer value) {
            addCriterion("cfg_type <=", value, "cfgType");
            return (Criteria) this;
        }

        public Criteria andCfgTypeIn(List<Integer> values) {
            addCriterion("cfg_type in", values, "cfgType");
            return (Criteria) this;
        }

        public Criteria andCfgTypeNotIn(List<Integer> values) {
            addCriterion("cfg_type not in", values, "cfgType");
            return (Criteria) this;
        }

        public Criteria andCfgTypeBetween(Integer value1, Integer value2) {
            addCriterion("cfg_type between", value1, value2, "cfgType");
            return (Criteria) this;
        }

        public Criteria andCfgTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("cfg_type not between", value1, value2, "cfgType");
            return (Criteria) this;
        }

        public Criteria andCfgPricedataIsNull() {
            addCriterion("cfg_pricedata is null");
            return (Criteria) this;
        }

        public Criteria andCfgPricedataIsNotNull() {
            addCriterion("cfg_pricedata is not null");
            return (Criteria) this;
        }

        public Criteria andCfgPricedataEqualTo(Integer value) {
            addCriterion("cfg_pricedata =", value, "cfgPricedata");
            return (Criteria) this;
        }

        public Criteria andCfgPricedataNotEqualTo(Integer value) {
            addCriterion("cfg_pricedata <>", value, "cfgPricedata");
            return (Criteria) this;
        }

        public Criteria andCfgPricedataGreaterThan(Integer value) {
            addCriterion("cfg_pricedata >", value, "cfgPricedata");
            return (Criteria) this;
        }

        public Criteria andCfgPricedataGreaterThanOrEqualTo(Integer value) {
            addCriterion("cfg_pricedata >=", value, "cfgPricedata");
            return (Criteria) this;
        }

        public Criteria andCfgPricedataLessThan(Integer value) {
            addCriterion("cfg_pricedata <", value, "cfgPricedata");
            return (Criteria) this;
        }

        public Criteria andCfgPricedataLessThanOrEqualTo(Integer value) {
            addCriterion("cfg_pricedata <=", value, "cfgPricedata");
            return (Criteria) this;
        }

        public Criteria andCfgPricedataIn(List<Integer> values) {
            addCriterion("cfg_pricedata in", values, "cfgPricedata");
            return (Criteria) this;
        }

        public Criteria andCfgPricedataNotIn(List<Integer> values) {
            addCriterion("cfg_pricedata not in", values, "cfgPricedata");
            return (Criteria) this;
        }

        public Criteria andCfgPricedataBetween(Integer value1, Integer value2) {
            addCriterion("cfg_pricedata between", value1, value2, "cfgPricedata");
            return (Criteria) this;
        }

        public Criteria andCfgPricedataNotBetween(Integer value1, Integer value2) {
            addCriterion("cfg_pricedata not between", value1, value2, "cfgPricedata");
            return (Criteria) this;
        }

        public Criteria andCfgDescriptionIsNull() {
            addCriterion("cfg_description is null");
            return (Criteria) this;
        }

        public Criteria andCfgDescriptionIsNotNull() {
            addCriterion("cfg_description is not null");
            return (Criteria) this;
        }

        public Criteria andCfgDescriptionEqualTo(String value) {
            addCriterion("cfg_description =", value, "cfgDescription");
            return (Criteria) this;
        }

        public Criteria andCfgDescriptionNotEqualTo(String value) {
            addCriterion("cfg_description <>", value, "cfgDescription");
            return (Criteria) this;
        }

        public Criteria andCfgDescriptionGreaterThan(String value) {
            addCriterion("cfg_description >", value, "cfgDescription");
            return (Criteria) this;
        }

        public Criteria andCfgDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("cfg_description >=", value, "cfgDescription");
            return (Criteria) this;
        }

        public Criteria andCfgDescriptionLessThan(String value) {
            addCriterion("cfg_description <", value, "cfgDescription");
            return (Criteria) this;
        }

        public Criteria andCfgDescriptionLessThanOrEqualTo(String value) {
            addCriterion("cfg_description <=", value, "cfgDescription");
            return (Criteria) this;
        }

        public Criteria andCfgDescriptionLike(String value) {
            addCriterion("cfg_description like", value, "cfgDescription");
            return (Criteria) this;
        }

        public Criteria andCfgDescriptionNotLike(String value) {
            addCriterion("cfg_description not like", value, "cfgDescription");
            return (Criteria) this;
        }

        public Criteria andCfgDescriptionIn(List<String> values) {
            addCriterion("cfg_description in", values, "cfgDescription");
            return (Criteria) this;
        }

        public Criteria andCfgDescriptionNotIn(List<String> values) {
            addCriterion("cfg_description not in", values, "cfgDescription");
            return (Criteria) this;
        }

        public Criteria andCfgDescriptionBetween(String value1, String value2) {
            addCriterion("cfg_description between", value1, value2, "cfgDescription");
            return (Criteria) this;
        }

        public Criteria andCfgDescriptionNotBetween(String value1, String value2) {
            addCriterion("cfg_description not between", value1, value2, "cfgDescription");
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