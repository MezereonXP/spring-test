package com.mezereon.springtest.bean;

import java.util.ArrayList;
import java.util.List;

public class NoteExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NoteExample() {
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

        public Criteria andNIdIsNull() {
            addCriterion("n_id is null");
            return (Criteria) this;
        }

        public Criteria andNIdIsNotNull() {
            addCriterion("n_id is not null");
            return (Criteria) this;
        }

        public Criteria andNIdEqualTo(Integer value) {
            addCriterion("n_id =", value, "nId");
            return (Criteria) this;
        }

        public Criteria andNIdNotEqualTo(Integer value) {
            addCriterion("n_id <>", value, "nId");
            return (Criteria) this;
        }

        public Criteria andNIdGreaterThan(Integer value) {
            addCriterion("n_id >", value, "nId");
            return (Criteria) this;
        }

        public Criteria andNIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("n_id >=", value, "nId");
            return (Criteria) this;
        }

        public Criteria andNIdLessThan(Integer value) {
            addCriterion("n_id <", value, "nId");
            return (Criteria) this;
        }

        public Criteria andNIdLessThanOrEqualTo(Integer value) {
            addCriterion("n_id <=", value, "nId");
            return (Criteria) this;
        }

        public Criteria andNIdIn(List<Integer> values) {
            addCriterion("n_id in", values, "nId");
            return (Criteria) this;
        }

        public Criteria andNIdNotIn(List<Integer> values) {
            addCriterion("n_id not in", values, "nId");
            return (Criteria) this;
        }

        public Criteria andNIdBetween(Integer value1, Integer value2) {
            addCriterion("n_id between", value1, value2, "nId");
            return (Criteria) this;
        }

        public Criteria andNIdNotBetween(Integer value1, Integer value2) {
            addCriterion("n_id not between", value1, value2, "nId");
            return (Criteria) this;
        }

        public Criteria andNCustomerIdIsNull() {
            addCriterion("n_customer_id is null");
            return (Criteria) this;
        }

        public Criteria andNCustomerIdIsNotNull() {
            addCriterion("n_customer_id is not null");
            return (Criteria) this;
        }

        public Criteria andNCustomerIdEqualTo(Integer value) {
            addCriterion("n_customer_id =", value, "nCustomerId");
            return (Criteria) this;
        }

        public Criteria andNCustomerIdNotEqualTo(Integer value) {
            addCriterion("n_customer_id <>", value, "nCustomerId");
            return (Criteria) this;
        }

        public Criteria andNCustomerIdGreaterThan(Integer value) {
            addCriterion("n_customer_id >", value, "nCustomerId");
            return (Criteria) this;
        }

        public Criteria andNCustomerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("n_customer_id >=", value, "nCustomerId");
            return (Criteria) this;
        }

        public Criteria andNCustomerIdLessThan(Integer value) {
            addCriterion("n_customer_id <", value, "nCustomerId");
            return (Criteria) this;
        }

        public Criteria andNCustomerIdLessThanOrEqualTo(Integer value) {
            addCriterion("n_customer_id <=", value, "nCustomerId");
            return (Criteria) this;
        }

        public Criteria andNCustomerIdIn(List<Integer> values) {
            addCriterion("n_customer_id in", values, "nCustomerId");
            return (Criteria) this;
        }

        public Criteria andNCustomerIdNotIn(List<Integer> values) {
            addCriterion("n_customer_id not in", values, "nCustomerId");
            return (Criteria) this;
        }

        public Criteria andNCustomerIdBetween(Integer value1, Integer value2) {
            addCriterion("n_customer_id between", value1, value2, "nCustomerId");
            return (Criteria) this;
        }

        public Criteria andNCustomerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("n_customer_id not between", value1, value2, "nCustomerId");
            return (Criteria) this;
        }

        public Criteria andNTipTimeIsNull() {
            addCriterion("n_tip_time is null");
            return (Criteria) this;
        }

        public Criteria andNTipTimeIsNotNull() {
            addCriterion("n_tip_time is not null");
            return (Criteria) this;
        }

        public Criteria andNTipTimeEqualTo(String value) {
            addCriterion("n_tip_time =", value, "nTipTime");
            return (Criteria) this;
        }

        public Criteria andNTipTimeNotEqualTo(String value) {
            addCriterion("n_tip_time <>", value, "nTipTime");
            return (Criteria) this;
        }

        public Criteria andNTipTimeGreaterThan(String value) {
            addCriterion("n_tip_time >", value, "nTipTime");
            return (Criteria) this;
        }

        public Criteria andNTipTimeGreaterThanOrEqualTo(String value) {
            addCriterion("n_tip_time >=", value, "nTipTime");
            return (Criteria) this;
        }

        public Criteria andNTipTimeLessThan(String value) {
            addCriterion("n_tip_time <", value, "nTipTime");
            return (Criteria) this;
        }

        public Criteria andNTipTimeLessThanOrEqualTo(String value) {
            addCriterion("n_tip_time <=", value, "nTipTime");
            return (Criteria) this;
        }

        public Criteria andNTipTimeLike(String value) {
            addCriterion("n_tip_time like", value, "nTipTime");
            return (Criteria) this;
        }

        public Criteria andNTipTimeNotLike(String value) {
            addCriterion("n_tip_time not like", value, "nTipTime");
            return (Criteria) this;
        }

        public Criteria andNTipTimeIn(List<String> values) {
            addCriterion("n_tip_time in", values, "nTipTime");
            return (Criteria) this;
        }

        public Criteria andNTipTimeNotIn(List<String> values) {
            addCriterion("n_tip_time not in", values, "nTipTime");
            return (Criteria) this;
        }

        public Criteria andNTipTimeBetween(String value1, String value2) {
            addCriterion("n_tip_time between", value1, value2, "nTipTime");
            return (Criteria) this;
        }

        public Criteria andNTipTimeNotBetween(String value1, String value2) {
            addCriterion("n_tip_time not between", value1, value2, "nTipTime");
            return (Criteria) this;
        }

        public Criteria andNNoteIsNull() {
            addCriterion("n_note is null");
            return (Criteria) this;
        }

        public Criteria andNNoteIsNotNull() {
            addCriterion("n_note is not null");
            return (Criteria) this;
        }

        public Criteria andNNoteEqualTo(String value) {
            addCriterion("n_note =", value, "nNote");
            return (Criteria) this;
        }

        public Criteria andNNoteNotEqualTo(String value) {
            addCriterion("n_note <>", value, "nNote");
            return (Criteria) this;
        }

        public Criteria andNNoteGreaterThan(String value) {
            addCriterion("n_note >", value, "nNote");
            return (Criteria) this;
        }

        public Criteria andNNoteGreaterThanOrEqualTo(String value) {
            addCriterion("n_note >=", value, "nNote");
            return (Criteria) this;
        }

        public Criteria andNNoteLessThan(String value) {
            addCriterion("n_note <", value, "nNote");
            return (Criteria) this;
        }

        public Criteria andNNoteLessThanOrEqualTo(String value) {
            addCriterion("n_note <=", value, "nNote");
            return (Criteria) this;
        }

        public Criteria andNNoteLike(String value) {
            addCriterion("n_note like", value, "nNote");
            return (Criteria) this;
        }

        public Criteria andNNoteNotLike(String value) {
            addCriterion("n_note not like", value, "nNote");
            return (Criteria) this;
        }

        public Criteria andNNoteIn(List<String> values) {
            addCriterion("n_note in", values, "nNote");
            return (Criteria) this;
        }

        public Criteria andNNoteNotIn(List<String> values) {
            addCriterion("n_note not in", values, "nNote");
            return (Criteria) this;
        }

        public Criteria andNNoteBetween(String value1, String value2) {
            addCriterion("n_note between", value1, value2, "nNote");
            return (Criteria) this;
        }

        public Criteria andNNoteNotBetween(String value1, String value2) {
            addCriterion("n_note not between", value1, value2, "nNote");
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