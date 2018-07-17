package com.mezereon.springtest.bean;

import java.util.ArrayList;
import java.util.List;

public class TeamExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeamExample() {
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

        public Criteria andTIdIsNull() {
            addCriterion("t_id is null");
            return (Criteria) this;
        }

        public Criteria andTIdIsNotNull() {
            addCriterion("t_id is not null");
            return (Criteria) this;
        }

        public Criteria andTIdEqualTo(Integer value) {
            addCriterion("t_id =", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdNotEqualTo(Integer value) {
            addCriterion("t_id <>", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdGreaterThan(Integer value) {
            addCriterion("t_id >", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("t_id >=", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdLessThan(Integer value) {
            addCriterion("t_id <", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdLessThanOrEqualTo(Integer value) {
            addCriterion("t_id <=", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdIn(List<Integer> values) {
            addCriterion("t_id in", values, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdNotIn(List<Integer> values) {
            addCriterion("t_id not in", values, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdBetween(Integer value1, Integer value2) {
            addCriterion("t_id between", value1, value2, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdNotBetween(Integer value1, Integer value2) {
            addCriterion("t_id not between", value1, value2, "tId");
            return (Criteria) this;
        }

        public Criteria andTTeamshopGoodsIdIsNull() {
            addCriterion("t_teamshop_goods_id is null");
            return (Criteria) this;
        }

        public Criteria andTTeamshopGoodsIdIsNotNull() {
            addCriterion("t_teamshop_goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andTTeamshopGoodsIdEqualTo(Integer value) {
            addCriterion("t_teamshop_goods_id =", value, "tTeamshopGoodsId");
            return (Criteria) this;
        }

        public Criteria andTTeamshopGoodsIdNotEqualTo(Integer value) {
            addCriterion("t_teamshop_goods_id <>", value, "tTeamshopGoodsId");
            return (Criteria) this;
        }

        public Criteria andTTeamshopGoodsIdGreaterThan(Integer value) {
            addCriterion("t_teamshop_goods_id >", value, "tTeamshopGoodsId");
            return (Criteria) this;
        }

        public Criteria andTTeamshopGoodsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("t_teamshop_goods_id >=", value, "tTeamshopGoodsId");
            return (Criteria) this;
        }

        public Criteria andTTeamshopGoodsIdLessThan(Integer value) {
            addCriterion("t_teamshop_goods_id <", value, "tTeamshopGoodsId");
            return (Criteria) this;
        }

        public Criteria andTTeamshopGoodsIdLessThanOrEqualTo(Integer value) {
            addCriterion("t_teamshop_goods_id <=", value, "tTeamshopGoodsId");
            return (Criteria) this;
        }

        public Criteria andTTeamshopGoodsIdIn(List<Integer> values) {
            addCriterion("t_teamshop_goods_id in", values, "tTeamshopGoodsId");
            return (Criteria) this;
        }

        public Criteria andTTeamshopGoodsIdNotIn(List<Integer> values) {
            addCriterion("t_teamshop_goods_id not in", values, "tTeamshopGoodsId");
            return (Criteria) this;
        }

        public Criteria andTTeamshopGoodsIdBetween(Integer value1, Integer value2) {
            addCriterion("t_teamshop_goods_id between", value1, value2, "tTeamshopGoodsId");
            return (Criteria) this;
        }

        public Criteria andTTeamshopGoodsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("t_teamshop_goods_id not between", value1, value2, "tTeamshopGoodsId");
            return (Criteria) this;
        }

        public Criteria andTStatusIsNull() {
            addCriterion("t_status is null");
            return (Criteria) this;
        }

        public Criteria andTStatusIsNotNull() {
            addCriterion("t_status is not null");
            return (Criteria) this;
        }

        public Criteria andTStatusEqualTo(Integer value) {
            addCriterion("t_status =", value, "tStatus");
            return (Criteria) this;
        }

        public Criteria andTStatusNotEqualTo(Integer value) {
            addCriterion("t_status <>", value, "tStatus");
            return (Criteria) this;
        }

        public Criteria andTStatusGreaterThan(Integer value) {
            addCriterion("t_status >", value, "tStatus");
            return (Criteria) this;
        }

        public Criteria andTStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("t_status >=", value, "tStatus");
            return (Criteria) this;
        }

        public Criteria andTStatusLessThan(Integer value) {
            addCriterion("t_status <", value, "tStatus");
            return (Criteria) this;
        }

        public Criteria andTStatusLessThanOrEqualTo(Integer value) {
            addCriterion("t_status <=", value, "tStatus");
            return (Criteria) this;
        }

        public Criteria andTStatusIn(List<Integer> values) {
            addCriterion("t_status in", values, "tStatus");
            return (Criteria) this;
        }

        public Criteria andTStatusNotIn(List<Integer> values) {
            addCriterion("t_status not in", values, "tStatus");
            return (Criteria) this;
        }

        public Criteria andTStatusBetween(Integer value1, Integer value2) {
            addCriterion("t_status between", value1, value2, "tStatus");
            return (Criteria) this;
        }

        public Criteria andTStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("t_status not between", value1, value2, "tStatus");
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