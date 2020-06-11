package com.springboot.hotel.demo.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrdersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrdersExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andOrderidIsNull() {
            addCriterion("orderId is null");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNotNull() {
            addCriterion("orderId is not null");
            return (Criteria) this;
        }

        public Criteria andOrderidEqualTo(Integer value) {
            addCriterion("orderId =", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotEqualTo(Integer value) {
            addCriterion("orderId <>", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThan(Integer value) {
            addCriterion("orderId >", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThanOrEqualTo(Integer value) {
            addCriterion("orderId >=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThan(Integer value) {
            addCriterion("orderId <", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThanOrEqualTo(Integer value) {
            addCriterion("orderId <=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidIn(List<Integer> values) {
            addCriterion("orderId in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotIn(List<Integer> values) {
            addCriterion("orderId not in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidBetween(Integer value1, Integer value2) {
            addCriterion("orderId between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotBetween(Integer value1, Integer value2) {
            addCriterion("orderId not between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andRoomidIsNull() {
            addCriterion("roomId is null");
            return (Criteria) this;
        }

        public Criteria andRoomidIsNotNull() {
            addCriterion("roomId is not null");
            return (Criteria) this;
        }

        public Criteria andRoomidEqualTo(Integer value) {
            addCriterion("roomId =", value, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidNotEqualTo(Integer value) {
            addCriterion("roomId <>", value, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidGreaterThan(Integer value) {
            addCriterion("roomId >", value, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidGreaterThanOrEqualTo(Integer value) {
            addCriterion("roomId >=", value, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidLessThan(Integer value) {
            addCriterion("roomId <", value, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidLessThanOrEqualTo(Integer value) {
            addCriterion("roomId <=", value, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidIn(List<Integer> values) {
            addCriterion("roomId in", values, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidNotIn(List<Integer> values) {
            addCriterion("roomId not in", values, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidBetween(Integer value1, Integer value2) {
            addCriterion("roomId between", value1, value2, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidNotBetween(Integer value1, Integer value2) {
            addCriterion("roomId not between", value1, value2, "roomid");
            return (Criteria) this;
        }

        public Criteria andEnterdateIsNull() {
            addCriterion("enterDate is null");
            return (Criteria) this;
        }

        public Criteria andEnterdateIsNotNull() {
            addCriterion("enterDate is not null");
            return (Criteria) this;
        }

        public Criteria andEnterdateEqualTo(Date value) {
            addCriterion("enterDate =", value, "enterdate");
            return (Criteria) this;
        }

        public Criteria andEnterdateNotEqualTo(Date value) {
            addCriterion("enterDate <>", value, "enterdate");
            return (Criteria) this;
        }

        public Criteria andEnterdateGreaterThan(Date value) {
            addCriterion("enterDate >", value, "enterdate");
            return (Criteria) this;
        }

        public Criteria andEnterdateGreaterThanOrEqualTo(Date value) {
            addCriterion("enterDate >=", value, "enterdate");
            return (Criteria) this;
        }

        public Criteria andEnterdateLessThan(Date value) {
            addCriterion("enterDate <", value, "enterdate");
            return (Criteria) this;
        }

        public Criteria andEnterdateLessThanOrEqualTo(Date value) {
            addCriterion("enterDate <=", value, "enterdate");
            return (Criteria) this;
        }

        public Criteria andEnterdateIn(List<Date> values) {
            addCriterion("enterDate in", values, "enterdate");
            return (Criteria) this;
        }

        public Criteria andEnterdateNotIn(List<Date> values) {
            addCriterion("enterDate not in", values, "enterdate");
            return (Criteria) this;
        }

        public Criteria andEnterdateBetween(Date value1, Date value2) {
            addCriterion("enterDate between", value1, value2, "enterdate");
            return (Criteria) this;
        }

        public Criteria andEnterdateNotBetween(Date value1, Date value2) {
            addCriterion("enterDate not between", value1, value2, "enterdate");
            return (Criteria) this;
        }

        public Criteria andExitdateIsNull() {
            addCriterion("exitDate is null");
            return (Criteria) this;
        }

        public Criteria andExitdateIsNotNull() {
            addCriterion("exitDate is not null");
            return (Criteria) this;
        }

        public Criteria andExitdateEqualTo(Date value) {
            addCriterion("exitDate =", value, "exitdate");
            return (Criteria) this;
        }

        public Criteria andExitdateNotEqualTo(Date value) {
            addCriterion("exitDate <>", value, "exitdate");
            return (Criteria) this;
        }

        public Criteria andExitdateGreaterThan(Date value) {
            addCriterion("exitDate >", value, "exitdate");
            return (Criteria) this;
        }

        public Criteria andExitdateGreaterThanOrEqualTo(Date value) {
            addCriterion("exitDate >=", value, "exitdate");
            return (Criteria) this;
        }

        public Criteria andExitdateLessThan(Date value) {
            addCriterion("exitDate <", value, "exitdate");
            return (Criteria) this;
        }

        public Criteria andExitdateLessThanOrEqualTo(Date value) {
            addCriterion("exitDate <=", value, "exitdate");
            return (Criteria) this;
        }

        public Criteria andExitdateIn(List<Date> values) {
            addCriterion("exitDate in", values, "exitdate");
            return (Criteria) this;
        }

        public Criteria andExitdateNotIn(List<Date> values) {
            addCriterion("exitDate not in", values, "exitdate");
            return (Criteria) this;
        }

        public Criteria andExitdateBetween(Date value1, Date value2) {
            addCriterion("exitDate between", value1, value2, "exitdate");
            return (Criteria) this;
        }

        public Criteria andExitdateNotBetween(Date value1, Date value2) {
            addCriterion("exitDate not between", value1, value2, "exitdate");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNull() {
            addCriterion("startTime is null");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNotNull() {
            addCriterion("startTime is not null");
            return (Criteria) this;
        }

        public Criteria andStarttimeEqualTo(Date value) {
            addCriterion("startTime =", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotEqualTo(Date value) {
            addCriterion("startTime <>", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThan(Date value) {
            addCriterion("startTime >", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("startTime >=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThan(Date value) {
            addCriterion("startTime <", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThanOrEqualTo(Date value) {
            addCriterion("startTime <=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeIn(List<Date> values) {
            addCriterion("startTime in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotIn(List<Date> values) {
            addCriterion("startTime not in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeBetween(Date value1, Date value2) {
            addCriterion("startTime between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotBetween(Date value1, Date value2) {
            addCriterion("startTime not between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andClosetimeIsNull() {
            addCriterion("closeTime is null");
            return (Criteria) this;
        }

        public Criteria andClosetimeIsNotNull() {
            addCriterion("closeTime is not null");
            return (Criteria) this;
        }

        public Criteria andClosetimeEqualTo(Date value) {
            addCriterion("closeTime =", value, "closetime");
            return (Criteria) this;
        }

        public Criteria andClosetimeNotEqualTo(Date value) {
            addCriterion("closeTime <>", value, "closetime");
            return (Criteria) this;
        }

        public Criteria andClosetimeGreaterThan(Date value) {
            addCriterion("closeTime >", value, "closetime");
            return (Criteria) this;
        }

        public Criteria andClosetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("closeTime >=", value, "closetime");
            return (Criteria) this;
        }

        public Criteria andClosetimeLessThan(Date value) {
            addCriterion("closeTime <", value, "closetime");
            return (Criteria) this;
        }

        public Criteria andClosetimeLessThanOrEqualTo(Date value) {
            addCriterion("closeTime <=", value, "closetime");
            return (Criteria) this;
        }

        public Criteria andClosetimeIn(List<Date> values) {
            addCriterion("closeTime in", values, "closetime");
            return (Criteria) this;
        }

        public Criteria andClosetimeNotIn(List<Date> values) {
            addCriterion("closeTime not in", values, "closetime");
            return (Criteria) this;
        }

        public Criteria andClosetimeBetween(Date value1, Date value2) {
            addCriterion("closeTime between", value1, value2, "closetime");
            return (Criteria) this;
        }

        public Criteria andClosetimeNotBetween(Date value1, Date value2) {
            addCriterion("closeTime not between", value1, value2, "closetime");
            return (Criteria) this;
        }

        public Criteria andCanbeunsubscribeIsNull() {
            addCriterion("canbeUnsubscribe is null");
            return (Criteria) this;
        }

        public Criteria andCanbeunsubscribeIsNotNull() {
            addCriterion("canbeUnsubscribe is not null");
            return (Criteria) this;
        }

        public Criteria andCanbeunsubscribeEqualTo(Boolean value) {
            addCriterion("canbeUnsubscribe =", value, "canbeunsubscribe");
            return (Criteria) this;
        }

        public Criteria andCanbeunsubscribeNotEqualTo(Boolean value) {
            addCriterion("canbeUnsubscribe <>", value, "canbeunsubscribe");
            return (Criteria) this;
        }

        public Criteria andCanbeunsubscribeGreaterThan(Boolean value) {
            addCriterion("canbeUnsubscribe >", value, "canbeunsubscribe");
            return (Criteria) this;
        }

        public Criteria andCanbeunsubscribeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("canbeUnsubscribe >=", value, "canbeunsubscribe");
            return (Criteria) this;
        }

        public Criteria andCanbeunsubscribeLessThan(Boolean value) {
            addCriterion("canbeUnsubscribe <", value, "canbeunsubscribe");
            return (Criteria) this;
        }

        public Criteria andCanbeunsubscribeLessThanOrEqualTo(Boolean value) {
            addCriterion("canbeUnsubscribe <=", value, "canbeunsubscribe");
            return (Criteria) this;
        }

        public Criteria andCanbeunsubscribeIn(List<Boolean> values) {
            addCriterion("canbeUnsubscribe in", values, "canbeunsubscribe");
            return (Criteria) this;
        }

        public Criteria andCanbeunsubscribeNotIn(List<Boolean> values) {
            addCriterion("canbeUnsubscribe not in", values, "canbeunsubscribe");
            return (Criteria) this;
        }

        public Criteria andCanbeunsubscribeBetween(Boolean value1, Boolean value2) {
            addCriterion("canbeUnsubscribe between", value1, value2, "canbeunsubscribe");
            return (Criteria) this;
        }

        public Criteria andCanbeunsubscribeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("canbeUnsubscribe not between", value1, value2, "canbeunsubscribe");
            return (Criteria) this;
        }

        public Criteria andOrderstatusIsNull() {
            addCriterion("orderStatus is null");
            return (Criteria) this;
        }

        public Criteria andOrderstatusIsNotNull() {
            addCriterion("orderStatus is not null");
            return (Criteria) this;
        }

        public Criteria andOrderstatusEqualTo(Integer value) {
            addCriterion("orderStatus =", value, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusNotEqualTo(Integer value) {
            addCriterion("orderStatus <>", value, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusGreaterThan(Integer value) {
            addCriterion("orderStatus >", value, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("orderStatus >=", value, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusLessThan(Integer value) {
            addCriterion("orderStatus <", value, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusLessThanOrEqualTo(Integer value) {
            addCriterion("orderStatus <=", value, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusIn(List<Integer> values) {
            addCriterion("orderStatus in", values, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusNotIn(List<Integer> values) {
            addCriterion("orderStatus not in", values, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusBetween(Integer value1, Integer value2) {
            addCriterion("orderStatus between", value1, value2, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("orderStatus not between", value1, value2, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andIccommentedIsNull() {
            addCriterion("iccommented is null");
            return (Criteria) this;
        }

        public Criteria andIccommentedIsNotNull() {
            addCriterion("iccommented is not null");
            return (Criteria) this;
        }

        public Criteria andIccommentedEqualTo(Boolean value) {
            addCriterion("iccommented =", value, "iccommented");
            return (Criteria) this;
        }

        public Criteria andIccommentedNotEqualTo(Boolean value) {
            addCriterion("iccommented <>", value, "iccommented");
            return (Criteria) this;
        }

        public Criteria andIccommentedGreaterThan(Boolean value) {
            addCriterion("iccommented >", value, "iccommented");
            return (Criteria) this;
        }

        public Criteria andIccommentedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("iccommented >=", value, "iccommented");
            return (Criteria) this;
        }

        public Criteria andIccommentedLessThan(Boolean value) {
            addCriterion("iccommented <", value, "iccommented");
            return (Criteria) this;
        }

        public Criteria andIccommentedLessThanOrEqualTo(Boolean value) {
            addCriterion("iccommented <=", value, "iccommented");
            return (Criteria) this;
        }

        public Criteria andIccommentedIn(List<Boolean> values) {
            addCriterion("iccommented in", values, "iccommented");
            return (Criteria) this;
        }

        public Criteria andIccommentedNotIn(List<Boolean> values) {
            addCriterion("iccommented not in", values, "iccommented");
            return (Criteria) this;
        }

        public Criteria andIccommentedBetween(Boolean value1, Boolean value2) {
            addCriterion("iccommented between", value1, value2, "iccommented");
            return (Criteria) this;
        }

        public Criteria andIccommentedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("iccommented not between", value1, value2, "iccommented");
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