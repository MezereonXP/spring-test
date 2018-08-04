package com.mezereon.springtest.bean;

import java.util.ArrayList;
import java.util.List;

public class ForumExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ForumExample() {
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

        public Criteria andFCidIsNull() {
            addCriterion("f_cId is null");
            return (Criteria) this;
        }

        public Criteria andFCidIsNotNull() {
            addCriterion("f_cId is not null");
            return (Criteria) this;
        }

        public Criteria andFCidEqualTo(Integer value) {
            addCriterion("f_cId =", value, "fCid");
            return (Criteria) this;
        }

        public Criteria andFCidNotEqualTo(Integer value) {
            addCriterion("f_cId <>", value, "fCid");
            return (Criteria) this;
        }

        public Criteria andFCidGreaterThan(Integer value) {
            addCriterion("f_cId >", value, "fCid");
            return (Criteria) this;
        }

        public Criteria andFCidGreaterThanOrEqualTo(Integer value) {
            addCriterion("f_cId >=", value, "fCid");
            return (Criteria) this;
        }

        public Criteria andFCidLessThan(Integer value) {
            addCriterion("f_cId <", value, "fCid");
            return (Criteria) this;
        }

        public Criteria andFCidLessThanOrEqualTo(Integer value) {
            addCriterion("f_cId <=", value, "fCid");
            return (Criteria) this;
        }

        public Criteria andFCidIn(List<Integer> values) {
            addCriterion("f_cId in", values, "fCid");
            return (Criteria) this;
        }

        public Criteria andFCidNotIn(List<Integer> values) {
            addCriterion("f_cId not in", values, "fCid");
            return (Criteria) this;
        }

        public Criteria andFCidBetween(Integer value1, Integer value2) {
            addCriterion("f_cId between", value1, value2, "fCid");
            return (Criteria) this;
        }

        public Criteria andFCidNotBetween(Integer value1, Integer value2) {
            addCriterion("f_cId not between", value1, value2, "fCid");
            return (Criteria) this;
        }

        public Criteria andFDateIsNull() {
            addCriterion("f_date is null");
            return (Criteria) this;
        }

        public Criteria andFDateIsNotNull() {
            addCriterion("f_date is not null");
            return (Criteria) this;
        }

        public Criteria andFDateEqualTo(String value) {
            addCriterion("f_date =", value, "fDate");
            return (Criteria) this;
        }

        public Criteria andFDateNotEqualTo(String value) {
            addCriterion("f_date <>", value, "fDate");
            return (Criteria) this;
        }

        public Criteria andFDateGreaterThan(String value) {
            addCriterion("f_date >", value, "fDate");
            return (Criteria) this;
        }

        public Criteria andFDateGreaterThanOrEqualTo(String value) {
            addCriterion("f_date >=", value, "fDate");
            return (Criteria) this;
        }

        public Criteria andFDateLessThan(String value) {
            addCriterion("f_date <", value, "fDate");
            return (Criteria) this;
        }

        public Criteria andFDateLessThanOrEqualTo(String value) {
            addCriterion("f_date <=", value, "fDate");
            return (Criteria) this;
        }

        public Criteria andFDateLike(String value) {
            addCriterion("f_date like", value, "fDate");
            return (Criteria) this;
        }

        public Criteria andFDateNotLike(String value) {
            addCriterion("f_date not like", value, "fDate");
            return (Criteria) this;
        }

        public Criteria andFDateIn(List<String> values) {
            addCriterion("f_date in", values, "fDate");
            return (Criteria) this;
        }

        public Criteria andFDateNotIn(List<String> values) {
            addCriterion("f_date not in", values, "fDate");
            return (Criteria) this;
        }

        public Criteria andFDateBetween(String value1, String value2) {
            addCriterion("f_date between", value1, value2, "fDate");
            return (Criteria) this;
        }

        public Criteria andFDateNotBetween(String value1, String value2) {
            addCriterion("f_date not between", value1, value2, "fDate");
            return (Criteria) this;
        }

        public Criteria andFCmidIsNull() {
            addCriterion("f_cmId is null");
            return (Criteria) this;
        }

        public Criteria andFCmidIsNotNull() {
            addCriterion("f_cmId is not null");
            return (Criteria) this;
        }

        public Criteria andFCmidEqualTo(Integer value) {
            addCriterion("f_cmId =", value, "fCmid");
            return (Criteria) this;
        }

        public Criteria andFCmidNotEqualTo(Integer value) {
            addCriterion("f_cmId <>", value, "fCmid");
            return (Criteria) this;
        }

        public Criteria andFCmidGreaterThan(Integer value) {
            addCriterion("f_cmId >", value, "fCmid");
            return (Criteria) this;
        }

        public Criteria andFCmidGreaterThanOrEqualTo(Integer value) {
            addCriterion("f_cmId >=", value, "fCmid");
            return (Criteria) this;
        }

        public Criteria andFCmidLessThan(Integer value) {
            addCriterion("f_cmId <", value, "fCmid");
            return (Criteria) this;
        }

        public Criteria andFCmidLessThanOrEqualTo(Integer value) {
            addCriterion("f_cmId <=", value, "fCmid");
            return (Criteria) this;
        }

        public Criteria andFCmidIn(List<Integer> values) {
            addCriterion("f_cmId in", values, "fCmid");
            return (Criteria) this;
        }

        public Criteria andFCmidNotIn(List<Integer> values) {
            addCriterion("f_cmId not in", values, "fCmid");
            return (Criteria) this;
        }

        public Criteria andFCmidBetween(Integer value1, Integer value2) {
            addCriterion("f_cmId between", value1, value2, "fCmid");
            return (Criteria) this;
        }

        public Criteria andFCmidNotBetween(Integer value1, Integer value2) {
            addCriterion("f_cmId not between", value1, value2, "fCmid");
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