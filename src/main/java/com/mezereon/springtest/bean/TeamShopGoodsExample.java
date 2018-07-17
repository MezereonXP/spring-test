package com.mezereon.springtest.bean;

import java.util.ArrayList;
import java.util.List;

public class TeamShopGoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeamShopGoodsExample() {
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

        public Criteria andTgIdIsNull() {
            addCriterion("tg_id is null");
            return (Criteria) this;
        }

        public Criteria andTgIdIsNotNull() {
            addCriterion("tg_id is not null");
            return (Criteria) this;
        }

        public Criteria andTgIdEqualTo(Integer value) {
            addCriterion("tg_id =", value, "tgId");
            return (Criteria) this;
        }

        public Criteria andTgIdNotEqualTo(Integer value) {
            addCriterion("tg_id <>", value, "tgId");
            return (Criteria) this;
        }

        public Criteria andTgIdGreaterThan(Integer value) {
            addCriterion("tg_id >", value, "tgId");
            return (Criteria) this;
        }

        public Criteria andTgIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("tg_id >=", value, "tgId");
            return (Criteria) this;
        }

        public Criteria andTgIdLessThan(Integer value) {
            addCriterion("tg_id <", value, "tgId");
            return (Criteria) this;
        }

        public Criteria andTgIdLessThanOrEqualTo(Integer value) {
            addCriterion("tg_id <=", value, "tgId");
            return (Criteria) this;
        }

        public Criteria andTgIdIn(List<Integer> values) {
            addCriterion("tg_id in", values, "tgId");
            return (Criteria) this;
        }

        public Criteria andTgIdNotIn(List<Integer> values) {
            addCriterion("tg_id not in", values, "tgId");
            return (Criteria) this;
        }

        public Criteria andTgIdBetween(Integer value1, Integer value2) {
            addCriterion("tg_id between", value1, value2, "tgId");
            return (Criteria) this;
        }

        public Criteria andTgIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tg_id not between", value1, value2, "tgId");
            return (Criteria) this;
        }

        public Criteria andTgGoodsIdIsNull() {
            addCriterion("tg_goods_id is null");
            return (Criteria) this;
        }

        public Criteria andTgGoodsIdIsNotNull() {
            addCriterion("tg_goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andTgGoodsIdEqualTo(Integer value) {
            addCriterion("tg_goods_id =", value, "tgGoodsId");
            return (Criteria) this;
        }

        public Criteria andTgGoodsIdNotEqualTo(Integer value) {
            addCriterion("tg_goods_id <>", value, "tgGoodsId");
            return (Criteria) this;
        }

        public Criteria andTgGoodsIdGreaterThan(Integer value) {
            addCriterion("tg_goods_id >", value, "tgGoodsId");
            return (Criteria) this;
        }

        public Criteria andTgGoodsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("tg_goods_id >=", value, "tgGoodsId");
            return (Criteria) this;
        }

        public Criteria andTgGoodsIdLessThan(Integer value) {
            addCriterion("tg_goods_id <", value, "tgGoodsId");
            return (Criteria) this;
        }

        public Criteria andTgGoodsIdLessThanOrEqualTo(Integer value) {
            addCriterion("tg_goods_id <=", value, "tgGoodsId");
            return (Criteria) this;
        }

        public Criteria andTgGoodsIdIn(List<Integer> values) {
            addCriterion("tg_goods_id in", values, "tgGoodsId");
            return (Criteria) this;
        }

        public Criteria andTgGoodsIdNotIn(List<Integer> values) {
            addCriterion("tg_goods_id not in", values, "tgGoodsId");
            return (Criteria) this;
        }

        public Criteria andTgGoodsIdBetween(Integer value1, Integer value2) {
            addCriterion("tg_goods_id between", value1, value2, "tgGoodsId");
            return (Criteria) this;
        }

        public Criteria andTgGoodsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tg_goods_id not between", value1, value2, "tgGoodsId");
            return (Criteria) this;
        }

        public Criteria andTgDiscountIsNull() {
            addCriterion("tg_discount is null");
            return (Criteria) this;
        }

        public Criteria andTgDiscountIsNotNull() {
            addCriterion("tg_discount is not null");
            return (Criteria) this;
        }

        public Criteria andTgDiscountEqualTo(Double value) {
            addCriterion("tg_discount =", value, "tgDiscount");
            return (Criteria) this;
        }

        public Criteria andTgDiscountNotEqualTo(Double value) {
            addCriterion("tg_discount <>", value, "tgDiscount");
            return (Criteria) this;
        }

        public Criteria andTgDiscountGreaterThan(Double value) {
            addCriterion("tg_discount >", value, "tgDiscount");
            return (Criteria) this;
        }

        public Criteria andTgDiscountGreaterThanOrEqualTo(Double value) {
            addCriterion("tg_discount >=", value, "tgDiscount");
            return (Criteria) this;
        }

        public Criteria andTgDiscountLessThan(Double value) {
            addCriterion("tg_discount <", value, "tgDiscount");
            return (Criteria) this;
        }

        public Criteria andTgDiscountLessThanOrEqualTo(Double value) {
            addCriterion("tg_discount <=", value, "tgDiscount");
            return (Criteria) this;
        }

        public Criteria andTgDiscountIn(List<Double> values) {
            addCriterion("tg_discount in", values, "tgDiscount");
            return (Criteria) this;
        }

        public Criteria andTgDiscountNotIn(List<Double> values) {
            addCriterion("tg_discount not in", values, "tgDiscount");
            return (Criteria) this;
        }

        public Criteria andTgDiscountBetween(Double value1, Double value2) {
            addCriterion("tg_discount between", value1, value2, "tgDiscount");
            return (Criteria) this;
        }

        public Criteria andTgDiscountNotBetween(Double value1, Double value2) {
            addCriterion("tg_discount not between", value1, value2, "tgDiscount");
            return (Criteria) this;
        }

        public Criteria andTgDateIsNull() {
            addCriterion("tg_date is null");
            return (Criteria) this;
        }

        public Criteria andTgDateIsNotNull() {
            addCriterion("tg_date is not null");
            return (Criteria) this;
        }

        public Criteria andTgDateEqualTo(String value) {
            addCriterion("tg_date =", value, "tgDate");
            return (Criteria) this;
        }

        public Criteria andTgDateNotEqualTo(String value) {
            addCriterion("tg_date <>", value, "tgDate");
            return (Criteria) this;
        }

        public Criteria andTgDateGreaterThan(String value) {
            addCriterion("tg_date >", value, "tgDate");
            return (Criteria) this;
        }

        public Criteria andTgDateGreaterThanOrEqualTo(String value) {
            addCriterion("tg_date >=", value, "tgDate");
            return (Criteria) this;
        }

        public Criteria andTgDateLessThan(String value) {
            addCriterion("tg_date <", value, "tgDate");
            return (Criteria) this;
        }

        public Criteria andTgDateLessThanOrEqualTo(String value) {
            addCriterion("tg_date <=", value, "tgDate");
            return (Criteria) this;
        }

        public Criteria andTgDateLike(String value) {
            addCriterion("tg_date like", value, "tgDate");
            return (Criteria) this;
        }

        public Criteria andTgDateNotLike(String value) {
            addCriterion("tg_date not like", value, "tgDate");
            return (Criteria) this;
        }

        public Criteria andTgDateIn(List<String> values) {
            addCriterion("tg_date in", values, "tgDate");
            return (Criteria) this;
        }

        public Criteria andTgDateNotIn(List<String> values) {
            addCriterion("tg_date not in", values, "tgDate");
            return (Criteria) this;
        }

        public Criteria andTgDateBetween(String value1, String value2) {
            addCriterion("tg_date between", value1, value2, "tgDate");
            return (Criteria) this;
        }

        public Criteria andTgDateNotBetween(String value1, String value2) {
            addCriterion("tg_date not between", value1, value2, "tgDate");
            return (Criteria) this;
        }

        public Criteria andTgQuantityIsNull() {
            addCriterion("tg_quantity is null");
            return (Criteria) this;
        }

        public Criteria andTgQuantityIsNotNull() {
            addCriterion("tg_quantity is not null");
            return (Criteria) this;
        }

        public Criteria andTgQuantityEqualTo(Integer value) {
            addCriterion("tg_quantity =", value, "tgQuantity");
            return (Criteria) this;
        }

        public Criteria andTgQuantityNotEqualTo(Integer value) {
            addCriterion("tg_quantity <>", value, "tgQuantity");
            return (Criteria) this;
        }

        public Criteria andTgQuantityGreaterThan(Integer value) {
            addCriterion("tg_quantity >", value, "tgQuantity");
            return (Criteria) this;
        }

        public Criteria andTgQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("tg_quantity >=", value, "tgQuantity");
            return (Criteria) this;
        }

        public Criteria andTgQuantityLessThan(Integer value) {
            addCriterion("tg_quantity <", value, "tgQuantity");
            return (Criteria) this;
        }

        public Criteria andTgQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("tg_quantity <=", value, "tgQuantity");
            return (Criteria) this;
        }

        public Criteria andTgQuantityIn(List<Integer> values) {
            addCriterion("tg_quantity in", values, "tgQuantity");
            return (Criteria) this;
        }

        public Criteria andTgQuantityNotIn(List<Integer> values) {
            addCriterion("tg_quantity not in", values, "tgQuantity");
            return (Criteria) this;
        }

        public Criteria andTgQuantityBetween(Integer value1, Integer value2) {
            addCriterion("tg_quantity between", value1, value2, "tgQuantity");
            return (Criteria) this;
        }

        public Criteria andTgQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("tg_quantity not between", value1, value2, "tgQuantity");
            return (Criteria) this;
        }

        public Criteria andTgMaxpeopleIsNull() {
            addCriterion("tg_maxpeople is null");
            return (Criteria) this;
        }

        public Criteria andTgMaxpeopleIsNotNull() {
            addCriterion("tg_maxpeople is not null");
            return (Criteria) this;
        }

        public Criteria andTgMaxpeopleEqualTo(Integer value) {
            addCriterion("tg_maxpeople =", value, "tgMaxpeople");
            return (Criteria) this;
        }

        public Criteria andTgMaxpeopleNotEqualTo(Integer value) {
            addCriterion("tg_maxpeople <>", value, "tgMaxpeople");
            return (Criteria) this;
        }

        public Criteria andTgMaxpeopleGreaterThan(Integer value) {
            addCriterion("tg_maxpeople >", value, "tgMaxpeople");
            return (Criteria) this;
        }

        public Criteria andTgMaxpeopleGreaterThanOrEqualTo(Integer value) {
            addCriterion("tg_maxpeople >=", value, "tgMaxpeople");
            return (Criteria) this;
        }

        public Criteria andTgMaxpeopleLessThan(Integer value) {
            addCriterion("tg_maxpeople <", value, "tgMaxpeople");
            return (Criteria) this;
        }

        public Criteria andTgMaxpeopleLessThanOrEqualTo(Integer value) {
            addCriterion("tg_maxpeople <=", value, "tgMaxpeople");
            return (Criteria) this;
        }

        public Criteria andTgMaxpeopleIn(List<Integer> values) {
            addCriterion("tg_maxpeople in", values, "tgMaxpeople");
            return (Criteria) this;
        }

        public Criteria andTgMaxpeopleNotIn(List<Integer> values) {
            addCriterion("tg_maxpeople not in", values, "tgMaxpeople");
            return (Criteria) this;
        }

        public Criteria andTgMaxpeopleBetween(Integer value1, Integer value2) {
            addCriterion("tg_maxpeople between", value1, value2, "tgMaxpeople");
            return (Criteria) this;
        }

        public Criteria andTgMaxpeopleNotBetween(Integer value1, Integer value2) {
            addCriterion("tg_maxpeople not between", value1, value2, "tgMaxpeople");
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