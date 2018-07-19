package com.mezereon.springtest.bean;

import java.util.ArrayList;
import java.util.List;

public class TeamCustomerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeamCustomerExample() {
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

        public Criteria andTcIdIsNull() {
            addCriterion("tc_id is null");
            return (Criteria) this;
        }

        public Criteria andTcIdIsNotNull() {
            addCriterion("tc_id is not null");
            return (Criteria) this;
        }

        public Criteria andTcIdEqualTo(Integer value) {
            addCriterion("tc_id =", value, "tcId");
            return (Criteria) this;
        }

        public Criteria andTcIdNotEqualTo(Integer value) {
            addCriterion("tc_id <>", value, "tcId");
            return (Criteria) this;
        }

        public Criteria andTcIdGreaterThan(Integer value) {
            addCriterion("tc_id >", value, "tcId");
            return (Criteria) this;
        }

        public Criteria andTcIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("tc_id >=", value, "tcId");
            return (Criteria) this;
        }

        public Criteria andTcIdLessThan(Integer value) {
            addCriterion("tc_id <", value, "tcId");
            return (Criteria) this;
        }

        public Criteria andTcIdLessThanOrEqualTo(Integer value) {
            addCriterion("tc_id <=", value, "tcId");
            return (Criteria) this;
        }

        public Criteria andTcIdIn(List<Integer> values) {
            addCriterion("tc_id in", values, "tcId");
            return (Criteria) this;
        }

        public Criteria andTcIdNotIn(List<Integer> values) {
            addCriterion("tc_id not in", values, "tcId");
            return (Criteria) this;
        }

        public Criteria andTcIdBetween(Integer value1, Integer value2) {
            addCriterion("tc_id between", value1, value2, "tcId");
            return (Criteria) this;
        }

        public Criteria andTcIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tc_id not between", value1, value2, "tcId");
            return (Criteria) this;
        }

        public Criteria andTcTeamIdIsNull() {
            addCriterion("tc_team_id is null");
            return (Criteria) this;
        }

        public Criteria andTcTeamIdIsNotNull() {
            addCriterion("tc_team_id is not null");
            return (Criteria) this;
        }

        public Criteria andTcTeamIdEqualTo(Integer value) {
            addCriterion("tc_team_id =", value, "tcTeamId");
            return (Criteria) this;
        }

        public Criteria andTcTeamIdNotEqualTo(Integer value) {
            addCriterion("tc_team_id <>", value, "tcTeamId");
            return (Criteria) this;
        }

        public Criteria andTcTeamIdGreaterThan(Integer value) {
            addCriterion("tc_team_id >", value, "tcTeamId");
            return (Criteria) this;
        }

        public Criteria andTcTeamIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("tc_team_id >=", value, "tcTeamId");
            return (Criteria) this;
        }

        public Criteria andTcTeamIdLessThan(Integer value) {
            addCriterion("tc_team_id <", value, "tcTeamId");
            return (Criteria) this;
        }

        public Criteria andTcTeamIdLessThanOrEqualTo(Integer value) {
            addCriterion("tc_team_id <=", value, "tcTeamId");
            return (Criteria) this;
        }

        public Criteria andTcTeamIdIn(List<Integer> values) {
            addCriterion("tc_team_id in", values, "tcTeamId");
            return (Criteria) this;
        }

        public Criteria andTcTeamIdNotIn(List<Integer> values) {
            addCriterion("tc_team_id not in", values, "tcTeamId");
            return (Criteria) this;
        }

        public Criteria andTcTeamIdBetween(Integer value1, Integer value2) {
            addCriterion("tc_team_id between", value1, value2, "tcTeamId");
            return (Criteria) this;
        }

        public Criteria andTcTeamIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tc_team_id not between", value1, value2, "tcTeamId");
            return (Criteria) this;
        }

        public Criteria andTcCustomerIdIsNull() {
            addCriterion("tc_customer_id is null");
            return (Criteria) this;
        }

        public Criteria andTcCustomerIdIsNotNull() {
            addCriterion("tc_customer_id is not null");
            return (Criteria) this;
        }

        public Criteria andTcCustomerIdEqualTo(Integer value) {
            addCriterion("tc_customer_id =", value, "tcCustomerId");
            return (Criteria) this;
        }

        public Criteria andTcCustomerIdNotEqualTo(Integer value) {
            addCriterion("tc_customer_id <>", value, "tcCustomerId");
            return (Criteria) this;
        }

        public Criteria andTcCustomerIdGreaterThan(Integer value) {
            addCriterion("tc_customer_id >", value, "tcCustomerId");
            return (Criteria) this;
        }

        public Criteria andTcCustomerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("tc_customer_id >=", value, "tcCustomerId");
            return (Criteria) this;
        }

        public Criteria andTcCustomerIdLessThan(Integer value) {
            addCriterion("tc_customer_id <", value, "tcCustomerId");
            return (Criteria) this;
        }

        public Criteria andTcCustomerIdLessThanOrEqualTo(Integer value) {
            addCriterion("tc_customer_id <=", value, "tcCustomerId");
            return (Criteria) this;
        }

        public Criteria andTcCustomerIdIn(List<Integer> values) {
            addCriterion("tc_customer_id in", values, "tcCustomerId");
            return (Criteria) this;
        }

        public Criteria andTcCustomerIdNotIn(List<Integer> values) {
            addCriterion("tc_customer_id not in", values, "tcCustomerId");
            return (Criteria) this;
        }

        public Criteria andTcCustomerIdBetween(Integer value1, Integer value2) {
            addCriterion("tc_customer_id between", value1, value2, "tcCustomerId");
            return (Criteria) this;
        }

        public Criteria andTcCustomerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tc_customer_id not between", value1, value2, "tcCustomerId");
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