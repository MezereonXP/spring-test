package com.mezereon.springtest.bean;

import java.util.ArrayList;
import java.util.List;

public class GoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsExample() {
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

        public Criteria andGIdIsNull() {
            addCriterion("g_id is null");
            return (Criteria) this;
        }

        public Criteria andGIdIsNotNull() {
            addCriterion("g_id is not null");
            return (Criteria) this;
        }

        public Criteria andGIdEqualTo(Integer value) {
            addCriterion("g_id =", value, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdNotEqualTo(Integer value) {
            addCriterion("g_id <>", value, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdGreaterThan(Integer value) {
            addCriterion("g_id >", value, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("g_id >=", value, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdLessThan(Integer value) {
            addCriterion("g_id <", value, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdLessThanOrEqualTo(Integer value) {
            addCriterion("g_id <=", value, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdIn(List<Integer> values) {
            addCriterion("g_id in", values, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdNotIn(List<Integer> values) {
            addCriterion("g_id not in", values, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdBetween(Integer value1, Integer value2) {
            addCriterion("g_id between", value1, value2, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdNotBetween(Integer value1, Integer value2) {
            addCriterion("g_id not between", value1, value2, "gId");
            return (Criteria) this;
        }

        public Criteria andGNameIsNull() {
            addCriterion("g_name is null");
            return (Criteria) this;
        }

        public Criteria andGNameIsNotNull() {
            addCriterion("g_name is not null");
            return (Criteria) this;
        }

        public Criteria andGNameEqualTo(String value) {
            addCriterion("g_name =", value, "gName");
            return (Criteria) this;
        }

        public Criteria andGNameNotEqualTo(String value) {
            addCriterion("g_name <>", value, "gName");
            return (Criteria) this;
        }

        public Criteria andGNameGreaterThan(String value) {
            addCriterion("g_name >", value, "gName");
            return (Criteria) this;
        }

        public Criteria andGNameGreaterThanOrEqualTo(String value) {
            addCriterion("g_name >=", value, "gName");
            return (Criteria) this;
        }

        public Criteria andGNameLessThan(String value) {
            addCriterion("g_name <", value, "gName");
            return (Criteria) this;
        }

        public Criteria andGNameLessThanOrEqualTo(String value) {
            addCriterion("g_name <=", value, "gName");
            return (Criteria) this;
        }

        public Criteria andGNameLike(String value) {
            addCriterion("g_name like", value, "gName");
            return (Criteria) this;
        }

        public Criteria andGNameNotLike(String value) {
            addCriterion("g_name not like", value, "gName");
            return (Criteria) this;
        }

        public Criteria andGNameIn(List<String> values) {
            addCriterion("g_name in", values, "gName");
            return (Criteria) this;
        }

        public Criteria andGNameNotIn(List<String> values) {
            addCriterion("g_name not in", values, "gName");
            return (Criteria) this;
        }

        public Criteria andGNameBetween(String value1, String value2) {
            addCriterion("g_name between", value1, value2, "gName");
            return (Criteria) this;
        }

        public Criteria andGNameNotBetween(String value1, String value2) {
            addCriterion("g_name not between", value1, value2, "gName");
            return (Criteria) this;
        }

        public Criteria andGPriceIsNull() {
            addCriterion("g_price is null");
            return (Criteria) this;
        }

        public Criteria andGPriceIsNotNull() {
            addCriterion("g_price is not null");
            return (Criteria) this;
        }

        public Criteria andGPriceEqualTo(Double value) {
            addCriterion("g_price =", value, "gPrice");
            return (Criteria) this;
        }

        public Criteria andGPriceNotEqualTo(Double value) {
            addCriterion("g_price <>", value, "gPrice");
            return (Criteria) this;
        }

        public Criteria andGPriceGreaterThan(Double value) {
            addCriterion("g_price >", value, "gPrice");
            return (Criteria) this;
        }

        public Criteria andGPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("g_price >=", value, "gPrice");
            return (Criteria) this;
        }

        public Criteria andGPriceLessThan(Double value) {
            addCriterion("g_price <", value, "gPrice");
            return (Criteria) this;
        }

        public Criteria andGPriceLessThanOrEqualTo(Double value) {
            addCriterion("g_price <=", value, "gPrice");
            return (Criteria) this;
        }

        public Criteria andGPriceIn(List<Double> values) {
            addCriterion("g_price in", values, "gPrice");
            return (Criteria) this;
        }

        public Criteria andGPriceNotIn(List<Double> values) {
            addCriterion("g_price not in", values, "gPrice");
            return (Criteria) this;
        }

        public Criteria andGPriceBetween(Double value1, Double value2) {
            addCriterion("g_price between", value1, value2, "gPrice");
            return (Criteria) this;
        }

        public Criteria andGPriceNotBetween(Double value1, Double value2) {
            addCriterion("g_price not between", value1, value2, "gPrice");
            return (Criteria) this;
        }

        public Criteria andGCatagoryIsNull() {
            addCriterion("g_catagory is null");
            return (Criteria) this;
        }

        public Criteria andGCatagoryIsNotNull() {
            addCriterion("g_catagory is not null");
            return (Criteria) this;
        }

        public Criteria andGCatagoryEqualTo(String value) {
            addCriterion("g_catagory =", value, "gCatagory");
            return (Criteria) this;
        }

        public Criteria andGCatagoryNotEqualTo(String value) {
            addCriterion("g_catagory <>", value, "gCatagory");
            return (Criteria) this;
        }

        public Criteria andGCatagoryGreaterThan(String value) {
            addCriterion("g_catagory >", value, "gCatagory");
            return (Criteria) this;
        }

        public Criteria andGCatagoryGreaterThanOrEqualTo(String value) {
            addCriterion("g_catagory >=", value, "gCatagory");
            return (Criteria) this;
        }

        public Criteria andGCatagoryLessThan(String value) {
            addCriterion("g_catagory <", value, "gCatagory");
            return (Criteria) this;
        }

        public Criteria andGCatagoryLessThanOrEqualTo(String value) {
            addCriterion("g_catagory <=", value, "gCatagory");
            return (Criteria) this;
        }

        public Criteria andGCatagoryLike(String value) {
            addCriterion("g_catagory like", value, "gCatagory");
            return (Criteria) this;
        }

        public Criteria andGCatagoryNotLike(String value) {
            addCriterion("g_catagory not like", value, "gCatagory");
            return (Criteria) this;
        }

        public Criteria andGCatagoryIn(List<String> values) {
            addCriterion("g_catagory in", values, "gCatagory");
            return (Criteria) this;
        }

        public Criteria andGCatagoryNotIn(List<String> values) {
            addCriterion("g_catagory not in", values, "gCatagory");
            return (Criteria) this;
        }

        public Criteria andGCatagoryBetween(String value1, String value2) {
            addCriterion("g_catagory between", value1, value2, "gCatagory");
            return (Criteria) this;
        }

        public Criteria andGCatagoryNotBetween(String value1, String value2) {
            addCriterion("g_catagory not between", value1, value2, "gCatagory");
            return (Criteria) this;
        }

        public Criteria andGStockIsNull() {
            addCriterion("g_stock is null");
            return (Criteria) this;
        }

        public Criteria andGStockIsNotNull() {
            addCriterion("g_stock is not null");
            return (Criteria) this;
        }

        public Criteria andGStockEqualTo(Integer value) {
            addCriterion("g_stock =", value, "gStock");
            return (Criteria) this;
        }

        public Criteria andGStockNotEqualTo(Integer value) {
            addCriterion("g_stock <>", value, "gStock");
            return (Criteria) this;
        }

        public Criteria andGStockGreaterThan(Integer value) {
            addCriterion("g_stock >", value, "gStock");
            return (Criteria) this;
        }

        public Criteria andGStockGreaterThanOrEqualTo(Integer value) {
            addCriterion("g_stock >=", value, "gStock");
            return (Criteria) this;
        }

        public Criteria andGStockLessThan(Integer value) {
            addCriterion("g_stock <", value, "gStock");
            return (Criteria) this;
        }

        public Criteria andGStockLessThanOrEqualTo(Integer value) {
            addCriterion("g_stock <=", value, "gStock");
            return (Criteria) this;
        }

        public Criteria andGStockIn(List<Integer> values) {
            addCriterion("g_stock in", values, "gStock");
            return (Criteria) this;
        }

        public Criteria andGStockNotIn(List<Integer> values) {
            addCriterion("g_stock not in", values, "gStock");
            return (Criteria) this;
        }

        public Criteria andGStockBetween(Integer value1, Integer value2) {
            addCriterion("g_stock between", value1, value2, "gStock");
            return (Criteria) this;
        }

        public Criteria andGStockNotBetween(Integer value1, Integer value2) {
            addCriterion("g_stock not between", value1, value2, "gStock");
            return (Criteria) this;
        }

        public Criteria andGPictureurlIsNull() {
            addCriterion("g_pictureurl is null");
            return (Criteria) this;
        }

        public Criteria andGPictureurlIsNotNull() {
            addCriterion("g_pictureurl is not null");
            return (Criteria) this;
        }

        public Criteria andGPictureurlEqualTo(String value) {
            addCriterion("g_pictureurl =", value, "gPictureurl");
            return (Criteria) this;
        }

        public Criteria andGPictureurlNotEqualTo(String value) {
            addCriterion("g_pictureurl <>", value, "gPictureurl");
            return (Criteria) this;
        }

        public Criteria andGPictureurlGreaterThan(String value) {
            addCriterion("g_pictureurl >", value, "gPictureurl");
            return (Criteria) this;
        }

        public Criteria andGPictureurlGreaterThanOrEqualTo(String value) {
            addCriterion("g_pictureurl >=", value, "gPictureurl");
            return (Criteria) this;
        }

        public Criteria andGPictureurlLessThan(String value) {
            addCriterion("g_pictureurl <", value, "gPictureurl");
            return (Criteria) this;
        }

        public Criteria andGPictureurlLessThanOrEqualTo(String value) {
            addCriterion("g_pictureurl <=", value, "gPictureurl");
            return (Criteria) this;
        }

        public Criteria andGPictureurlLike(String value) {
            addCriterion("g_pictureurl like", value, "gPictureurl");
            return (Criteria) this;
        }

        public Criteria andGPictureurlNotLike(String value) {
            addCriterion("g_pictureurl not like", value, "gPictureurl");
            return (Criteria) this;
        }

        public Criteria andGPictureurlIn(List<String> values) {
            addCriterion("g_pictureurl in", values, "gPictureurl");
            return (Criteria) this;
        }

        public Criteria andGPictureurlNotIn(List<String> values) {
            addCriterion("g_pictureurl not in", values, "gPictureurl");
            return (Criteria) this;
        }

        public Criteria andGPictureurlBetween(String value1, String value2) {
            addCriterion("g_pictureurl between", value1, value2, "gPictureurl");
            return (Criteria) this;
        }

        public Criteria andGPictureurlNotBetween(String value1, String value2) {
            addCriterion("g_pictureurl not between", value1, value2, "gPictureurl");
            return (Criteria) this;
        }

        public Criteria andGStatusIsNull() {
            addCriterion("g_status is null");
            return (Criteria) this;
        }

        public Criteria andGStatusIsNotNull() {
            addCriterion("g_status is not null");
            return (Criteria) this;
        }

        public Criteria andGStatusEqualTo(Integer value) {
            addCriterion("g_status =", value, "gStatus");
            return (Criteria) this;
        }

        public Criteria andGStatusNotEqualTo(Integer value) {
            addCriterion("g_status <>", value, "gStatus");
            return (Criteria) this;
        }

        public Criteria andGStatusGreaterThan(Integer value) {
            addCriterion("g_status >", value, "gStatus");
            return (Criteria) this;
        }

        public Criteria andGStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("g_status >=", value, "gStatus");
            return (Criteria) this;
        }

        public Criteria andGStatusLessThan(Integer value) {
            addCriterion("g_status <", value, "gStatus");
            return (Criteria) this;
        }

        public Criteria andGStatusLessThanOrEqualTo(Integer value) {
            addCriterion("g_status <=", value, "gStatus");
            return (Criteria) this;
        }

        public Criteria andGStatusIn(List<Integer> values) {
            addCriterion("g_status in", values, "gStatus");
            return (Criteria) this;
        }

        public Criteria andGStatusNotIn(List<Integer> values) {
            addCriterion("g_status not in", values, "gStatus");
            return (Criteria) this;
        }

        public Criteria andGStatusBetween(Integer value1, Integer value2) {
            addCriterion("g_status between", value1, value2, "gStatus");
            return (Criteria) this;
        }

        public Criteria andGStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("g_status not between", value1, value2, "gStatus");
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