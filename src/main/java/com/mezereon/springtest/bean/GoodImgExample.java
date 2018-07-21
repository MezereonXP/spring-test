package com.mezereon.springtest.bean;

import java.util.ArrayList;
import java.util.List;

public class GoodImgExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodImgExample() {
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

        public Criteria andGiIdIsNull() {
            addCriterion("gi_id is null");
            return (Criteria) this;
        }

        public Criteria andGiIdIsNotNull() {
            addCriterion("gi_id is not null");
            return (Criteria) this;
        }

        public Criteria andGiIdEqualTo(Integer value) {
            addCriterion("gi_id =", value, "giId");
            return (Criteria) this;
        }

        public Criteria andGiIdNotEqualTo(Integer value) {
            addCriterion("gi_id <>", value, "giId");
            return (Criteria) this;
        }

        public Criteria andGiIdGreaterThan(Integer value) {
            addCriterion("gi_id >", value, "giId");
            return (Criteria) this;
        }

        public Criteria andGiIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("gi_id >=", value, "giId");
            return (Criteria) this;
        }

        public Criteria andGiIdLessThan(Integer value) {
            addCriterion("gi_id <", value, "giId");
            return (Criteria) this;
        }

        public Criteria andGiIdLessThanOrEqualTo(Integer value) {
            addCriterion("gi_id <=", value, "giId");
            return (Criteria) this;
        }

        public Criteria andGiIdIn(List<Integer> values) {
            addCriterion("gi_id in", values, "giId");
            return (Criteria) this;
        }

        public Criteria andGiIdNotIn(List<Integer> values) {
            addCriterion("gi_id not in", values, "giId");
            return (Criteria) this;
        }

        public Criteria andGiIdBetween(Integer value1, Integer value2) {
            addCriterion("gi_id between", value1, value2, "giId");
            return (Criteria) this;
        }

        public Criteria andGiIdNotBetween(Integer value1, Integer value2) {
            addCriterion("gi_id not between", value1, value2, "giId");
            return (Criteria) this;
        }

        public Criteria andGiCfgIdIsNull() {
            addCriterion("gi_cfg_id is null");
            return (Criteria) this;
        }

        public Criteria andGiCfgIdIsNotNull() {
            addCriterion("gi_cfg_id is not null");
            return (Criteria) this;
        }

        public Criteria andGiCfgIdEqualTo(Integer value) {
            addCriterion("gi_cfg_id =", value, "giCfgId");
            return (Criteria) this;
        }

        public Criteria andGiCfgIdNotEqualTo(Integer value) {
            addCriterion("gi_cfg_id <>", value, "giCfgId");
            return (Criteria) this;
        }

        public Criteria andGiCfgIdGreaterThan(Integer value) {
            addCriterion("gi_cfg_id >", value, "giCfgId");
            return (Criteria) this;
        }

        public Criteria andGiCfgIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("gi_cfg_id >=", value, "giCfgId");
            return (Criteria) this;
        }

        public Criteria andGiCfgIdLessThan(Integer value) {
            addCriterion("gi_cfg_id <", value, "giCfgId");
            return (Criteria) this;
        }

        public Criteria andGiCfgIdLessThanOrEqualTo(Integer value) {
            addCriterion("gi_cfg_id <=", value, "giCfgId");
            return (Criteria) this;
        }

        public Criteria andGiCfgIdIn(List<Integer> values) {
            addCriterion("gi_cfg_id in", values, "giCfgId");
            return (Criteria) this;
        }

        public Criteria andGiCfgIdNotIn(List<Integer> values) {
            addCriterion("gi_cfg_id not in", values, "giCfgId");
            return (Criteria) this;
        }

        public Criteria andGiCfgIdBetween(Integer value1, Integer value2) {
            addCriterion("gi_cfg_id between", value1, value2, "giCfgId");
            return (Criteria) this;
        }

        public Criteria andGiCfgIdNotBetween(Integer value1, Integer value2) {
            addCriterion("gi_cfg_id not between", value1, value2, "giCfgId");
            return (Criteria) this;
        }

        public Criteria andGiImgIsNull() {
            addCriterion("gi_img is null");
            return (Criteria) this;
        }

        public Criteria andGiImgIsNotNull() {
            addCriterion("gi_img is not null");
            return (Criteria) this;
        }

        public Criteria andGiImgEqualTo(String value) {
            addCriterion("gi_img =", value, "giImg");
            return (Criteria) this;
        }

        public Criteria andGiImgNotEqualTo(String value) {
            addCriterion("gi_img <>", value, "giImg");
            return (Criteria) this;
        }

        public Criteria andGiImgGreaterThan(String value) {
            addCriterion("gi_img >", value, "giImg");
            return (Criteria) this;
        }

        public Criteria andGiImgGreaterThanOrEqualTo(String value) {
            addCriterion("gi_img >=", value, "giImg");
            return (Criteria) this;
        }

        public Criteria andGiImgLessThan(String value) {
            addCriterion("gi_img <", value, "giImg");
            return (Criteria) this;
        }

        public Criteria andGiImgLessThanOrEqualTo(String value) {
            addCriterion("gi_img <=", value, "giImg");
            return (Criteria) this;
        }

        public Criteria andGiImgLike(String value) {
            addCriterion("gi_img like", value, "giImg");
            return (Criteria) this;
        }

        public Criteria andGiImgNotLike(String value) {
            addCriterion("gi_img not like", value, "giImg");
            return (Criteria) this;
        }

        public Criteria andGiImgIn(List<String> values) {
            addCriterion("gi_img in", values, "giImg");
            return (Criteria) this;
        }

        public Criteria andGiImgNotIn(List<String> values) {
            addCriterion("gi_img not in", values, "giImg");
            return (Criteria) this;
        }

        public Criteria andGiImgBetween(String value1, String value2) {
            addCriterion("gi_img between", value1, value2, "giImg");
            return (Criteria) this;
        }

        public Criteria andGiImgNotBetween(String value1, String value2) {
            addCriterion("gi_img not between", value1, value2, "giImg");
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