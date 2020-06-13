package com.springboot.hotel.demo.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class RoomExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RoomExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andHotelidIsNull() {
            addCriterion("hotelId is null");
            return (Criteria) this;
        }

        public Criteria andHotelidIsNotNull() {
            addCriterion("hotelId is not null");
            return (Criteria) this;
        }

        public Criteria andHotelidEqualTo(Integer value) {
            addCriterion("hotelId =", value, "hotelid");
            return (Criteria) this;
        }

        public Criteria andHotelidNotEqualTo(Integer value) {
            addCriterion("hotelId <>", value, "hotelid");
            return (Criteria) this;
        }

        public Criteria andHotelidGreaterThan(Integer value) {
            addCriterion("hotelId >", value, "hotelid");
            return (Criteria) this;
        }

        public Criteria andHotelidGreaterThanOrEqualTo(Integer value) {
            addCriterion("hotelId >=", value, "hotelid");
            return (Criteria) this;
        }

        public Criteria andHotelidLessThan(Integer value) {
            addCriterion("hotelId <", value, "hotelid");
            return (Criteria) this;
        }

        public Criteria andHotelidLessThanOrEqualTo(Integer value) {
            addCriterion("hotelId <=", value, "hotelid");
            return (Criteria) this;
        }

        public Criteria andHotelidIn(List<Integer> values) {
            addCriterion("hotelId in", values, "hotelid");
            return (Criteria) this;
        }

        public Criteria andHotelidNotIn(List<Integer> values) {
            addCriterion("hotelId not in", values, "hotelid");
            return (Criteria) this;
        }

        public Criteria andHotelidBetween(Integer value1, Integer value2) {
            addCriterion("hotelId between", value1, value2, "hotelid");
            return (Criteria) this;
        }

        public Criteria andHotelidNotBetween(Integer value1, Integer value2) {
            addCriterion("hotelId not between", value1, value2, "hotelid");
            return (Criteria) this;
        }

        public Criteria andRoomtypeIsNull() {
            addCriterion("roomType is null");
            return (Criteria) this;
        }

        public Criteria andRoomtypeIsNotNull() {
            addCriterion("roomType is not null");
            return (Criteria) this;
        }

        public Criteria andRoomtypeEqualTo(String value) {
            addCriterion("roomType =", value, "roomtype");
            return (Criteria) this;
        }

        public Criteria andRoomtypeNotEqualTo(String value) {
            addCriterion("roomType <>", value, "roomtype");
            return (Criteria) this;
        }

        public Criteria andRoomtypeGreaterThan(String value) {
            addCriterion("roomType >", value, "roomtype");
            return (Criteria) this;
        }

        public Criteria andRoomtypeGreaterThanOrEqualTo(String value) {
            addCriterion("roomType >=", value, "roomtype");
            return (Criteria) this;
        }

        public Criteria andRoomtypeLessThan(String value) {
            addCriterion("roomType <", value, "roomtype");
            return (Criteria) this;
        }

        public Criteria andRoomtypeLessThanOrEqualTo(String value) {
            addCriterion("roomType <=", value, "roomtype");
            return (Criteria) this;
        }

        public Criteria andRoomtypeLike(String value) {
            addCriterion("roomType like", value, "roomtype");
            return (Criteria) this;
        }

        public Criteria andRoomtypeNotLike(String value) {
            addCriterion("roomType not like", value, "roomtype");
            return (Criteria) this;
        }

        public Criteria andRoomtypeIn(List<String> values) {
            addCriterion("roomType in", values, "roomtype");
            return (Criteria) this;
        }

        public Criteria andRoomtypeNotIn(List<String> values) {
            addCriterion("roomType not in", values, "roomtype");
            return (Criteria) this;
        }

        public Criteria andRoomtypeBetween(String value1, String value2) {
            addCriterion("roomType between", value1, value2, "roomtype");
            return (Criteria) this;
        }

        public Criteria andRoomtypeNotBetween(String value1, String value2) {
            addCriterion("roomType not between", value1, value2, "roomtype");
            return (Criteria) this;
        }

        public Criteria andBedtypeIsNull() {
            addCriterion("bedType is null");
            return (Criteria) this;
        }

        public Criteria andBedtypeIsNotNull() {
            addCriterion("bedType is not null");
            return (Criteria) this;
        }

        public Criteria andBedtypeEqualTo(String value) {
            addCriterion("bedType =", value, "bedtype");
            return (Criteria) this;
        }

        public Criteria andBedtypeNotEqualTo(String value) {
            addCriterion("bedType <>", value, "bedtype");
            return (Criteria) this;
        }

        public Criteria andBedtypeGreaterThan(String value) {
            addCriterion("bedType >", value, "bedtype");
            return (Criteria) this;
        }

        public Criteria andBedtypeGreaterThanOrEqualTo(String value) {
            addCriterion("bedType >=", value, "bedtype");
            return (Criteria) this;
        }

        public Criteria andBedtypeLessThan(String value) {
            addCriterion("bedType <", value, "bedtype");
            return (Criteria) this;
        }

        public Criteria andBedtypeLessThanOrEqualTo(String value) {
            addCriterion("bedType <=", value, "bedtype");
            return (Criteria) this;
        }

        public Criteria andBedtypeLike(String value) {
            addCriterion("bedType like", value, "bedtype");
            return (Criteria) this;
        }

        public Criteria andBedtypeNotLike(String value) {
            addCriterion("bedType not like", value, "bedtype");
            return (Criteria) this;
        }

        public Criteria andBedtypeIn(List<String> values) {
            addCriterion("bedType in", values, "bedtype");
            return (Criteria) this;
        }

        public Criteria andBedtypeNotIn(List<String> values) {
            addCriterion("bedType not in", values, "bedtype");
            return (Criteria) this;
        }

        public Criteria andBedtypeBetween(String value1, String value2) {
            addCriterion("bedType between", value1, value2, "bedtype");
            return (Criteria) this;
        }

        public Criteria andBedtypeNotBetween(String value1, String value2) {
            addCriterion("bedType not between", value1, value2, "bedtype");
            return (Criteria) this;
        }

        public Criteria andServiceIsNull() {
            addCriterion("service is null");
            return (Criteria) this;
        }

        public Criteria andServiceIsNotNull() {
            addCriterion("service is not null");
            return (Criteria) this;
        }

        public Criteria andServiceEqualTo(String value) {
            addCriterion("service =", value, "service");
            return (Criteria) this;
        }

        public Criteria andServiceNotEqualTo(String value) {
            addCriterion("service <>", value, "service");
            return (Criteria) this;
        }

        public Criteria andServiceGreaterThan(String value) {
            addCriterion("service >", value, "service");
            return (Criteria) this;
        }

        public Criteria andServiceGreaterThanOrEqualTo(String value) {
            addCriterion("service >=", value, "service");
            return (Criteria) this;
        }

        public Criteria andServiceLessThan(String value) {
            addCriterion("service <", value, "service");
            return (Criteria) this;
        }

        public Criteria andServiceLessThanOrEqualTo(String value) {
            addCriterion("service <=", value, "service");
            return (Criteria) this;
        }

        public Criteria andServiceLike(String value) {
            addCriterion("service like", value, "service");
            return (Criteria) this;
        }

        public Criteria andServiceNotLike(String value) {
            addCriterion("service not like", value, "service");
            return (Criteria) this;
        }

        public Criteria andServiceIn(List<String> values) {
            addCriterion("service in", values, "service");
            return (Criteria) this;
        }

        public Criteria andServiceNotIn(List<String> values) {
            addCriterion("service not in", values, "service");
            return (Criteria) this;
        }

        public Criteria andServiceBetween(String value1, String value2) {
            addCriterion("service between", value1, value2, "service");
            return (Criteria) this;
        }

        public Criteria andServiceNotBetween(String value1, String value2) {
            addCriterion("service not between", value1, value2, "service");
            return (Criteria) this;
        }

        public Criteria andHasbreakfastIsNull() {
            addCriterion("hasbreakfast is null");
            return (Criteria) this;
        }

        public Criteria andHasbreakfastIsNotNull() {
            addCriterion("hasbreakfast is not null");
            return (Criteria) this;
        }

        public Criteria andHasbreakfastEqualTo(Boolean value) {
            addCriterion("hasbreakfast =", value, "hasbreakfast");
            return (Criteria) this;
        }

        public Criteria andHasbreakfastNotEqualTo(Boolean value) {
            addCriterion("hasbreakfast <>", value, "hasbreakfast");
            return (Criteria) this;
        }

        public Criteria andHasbreakfastGreaterThan(Boolean value) {
            addCriterion("hasbreakfast >", value, "hasbreakfast");
            return (Criteria) this;
        }

        public Criteria andHasbreakfastGreaterThanOrEqualTo(Boolean value) {
            addCriterion("hasbreakfast >=", value, "hasbreakfast");
            return (Criteria) this;
        }

        public Criteria andHasbreakfastLessThan(Boolean value) {
            addCriterion("hasbreakfast <", value, "hasbreakfast");
            return (Criteria) this;
        }

        public Criteria andHasbreakfastLessThanOrEqualTo(Boolean value) {
            addCriterion("hasbreakfast <=", value, "hasbreakfast");
            return (Criteria) this;
        }

        public Criteria andHasbreakfastIn(List<Boolean> values) {
            addCriterion("hasbreakfast in", values, "hasbreakfast");
            return (Criteria) this;
        }

        public Criteria andHasbreakfastNotIn(List<Boolean> values) {
            addCriterion("hasbreakfast not in", values, "hasbreakfast");
            return (Criteria) this;
        }

        public Criteria andHasbreakfastBetween(Boolean value1, Boolean value2) {
            addCriterion("hasbreakfast between", value1, value2, "hasbreakfast");
            return (Criteria) this;
        }

        public Criteria andHasbreakfastNotBetween(Boolean value1, Boolean value2) {
            addCriterion("hasbreakfast not between", value1, value2, "hasbreakfast");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Integer value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Integer value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Integer value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Integer value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Integer value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Integer> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Integer> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Integer value1, Integer value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andCommentnumIsNull() {
            addCriterion("commentNum is null");
            return (Criteria) this;
        }

        public Criteria andCommentnumIsNotNull() {
            addCriterion("commentNum is not null");
            return (Criteria) this;
        }

        public Criteria andCommentnumEqualTo(Integer value) {
            addCriterion("commentNum =", value, "commentnum");
            return (Criteria) this;
        }

        public Criteria andCommentnumNotEqualTo(Integer value) {
            addCriterion("commentNum <>", value, "commentnum");
            return (Criteria) this;
        }

        public Criteria andCommentnumGreaterThan(Integer value) {
            addCriterion("commentNum >", value, "commentnum");
            return (Criteria) this;
        }

        public Criteria andCommentnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("commentNum >=", value, "commentnum");
            return (Criteria) this;
        }

        public Criteria andCommentnumLessThan(Integer value) {
            addCriterion("commentNum <", value, "commentnum");
            return (Criteria) this;
        }

        public Criteria andCommentnumLessThanOrEqualTo(Integer value) {
            addCriterion("commentNum <=", value, "commentnum");
            return (Criteria) this;
        }

        public Criteria andCommentnumIn(List<Integer> values) {
            addCriterion("commentNum in", values, "commentnum");
            return (Criteria) this;
        }

        public Criteria andCommentnumNotIn(List<Integer> values) {
            addCriterion("commentNum not in", values, "commentnum");
            return (Criteria) this;
        }

        public Criteria andCommentnumBetween(Integer value1, Integer value2) {
            addCriterion("commentNum between", value1, value2, "commentnum");
            return (Criteria) this;
        }

        public Criteria andCommentnumNotBetween(Integer value1, Integer value2) {
            addCriterion("commentNum not between", value1, value2, "commentnum");
            return (Criteria) this;
        }

        public Criteria andCollectnumIsNull() {
            addCriterion("collectNum is null");
            return (Criteria) this;
        }

        public Criteria andCollectnumIsNotNull() {
            addCriterion("collectNum is not null");
            return (Criteria) this;
        }

        public Criteria andCollectnumEqualTo(Integer value) {
            addCriterion("collectNum =", value, "collectnum");
            return (Criteria) this;
        }

        public Criteria andCollectnumNotEqualTo(Integer value) {
            addCriterion("collectNum <>", value, "collectnum");
            return (Criteria) this;
        }

        public Criteria andCollectnumGreaterThan(Integer value) {
            addCriterion("collectNum >", value, "collectnum");
            return (Criteria) this;
        }

        public Criteria andCollectnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("collectNum >=", value, "collectnum");
            return (Criteria) this;
        }

        public Criteria andCollectnumLessThan(Integer value) {
            addCriterion("collectNum <", value, "collectnum");
            return (Criteria) this;
        }

        public Criteria andCollectnumLessThanOrEqualTo(Integer value) {
            addCriterion("collectNum <=", value, "collectnum");
            return (Criteria) this;
        }

        public Criteria andCollectnumIn(List<Integer> values) {
            addCriterion("collectNum in", values, "collectnum");
            return (Criteria) this;
        }

        public Criteria andCollectnumNotIn(List<Integer> values) {
            addCriterion("collectNum not in", values, "collectnum");
            return (Criteria) this;
        }

        public Criteria andCollectnumBetween(Integer value1, Integer value2) {
            addCriterion("collectNum between", value1, value2, "collectnum");
            return (Criteria) this;
        }

        public Criteria andCollectnumNotBetween(Integer value1, Integer value2) {
            addCriterion("collectNum not between", value1, value2, "collectnum");
            return (Criteria) this;
        }

        public Criteria andCheckindateIsNull() {
            addCriterion("checkinDate is null");
            return (Criteria) this;
        }

        public Criteria andCheckindateIsNotNull() {
            addCriterion("checkinDate is not null");
            return (Criteria) this;
        }

        public Criteria andCheckindateEqualTo(Date value) {
            addCriterionForJDBCDate("checkinDate =", value, "checkindate");
            return (Criteria) this;
        }

        public Criteria andCheckindateNotEqualTo(Date value) {
            addCriterionForJDBCDate("checkinDate <>", value, "checkindate");
            return (Criteria) this;
        }

        public Criteria andCheckindateGreaterThan(Date value) {
            addCriterionForJDBCDate("checkinDate >", value, "checkindate");
            return (Criteria) this;
        }

        public Criteria andCheckindateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("checkinDate >=", value, "checkindate");
            return (Criteria) this;
        }

        public Criteria andCheckindateLessThan(Date value) {
            addCriterionForJDBCDate("checkinDate <", value, "checkindate");
            return (Criteria) this;
        }

        public Criteria andCheckindateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("checkinDate <=", value, "checkindate");
            return (Criteria) this;
        }

        public Criteria andCheckindateIn(List<Date> values) {
            addCriterionForJDBCDate("checkinDate in", values, "checkindate");
            return (Criteria) this;
        }

        public Criteria andCheckindateNotIn(List<Date> values) {
            addCriterionForJDBCDate("checkinDate not in", values, "checkindate");
            return (Criteria) this;
        }

        public Criteria andCheckindateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("checkinDate between", value1, value2, "checkindate");
            return (Criteria) this;
        }

        public Criteria andCheckindateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("checkinDate not between", value1, value2, "checkindate");
            return (Criteria) this;
        }

        public Criteria andCheckoutdateIsNull() {
            addCriterion("checkoutDate is null");
            return (Criteria) this;
        }

        public Criteria andCheckoutdateIsNotNull() {
            addCriterion("checkoutDate is not null");
            return (Criteria) this;
        }

        public Criteria andCheckoutdateEqualTo(Date value) {
            addCriterionForJDBCDate("checkoutDate =", value, "checkoutdate");
            return (Criteria) this;
        }

        public Criteria andCheckoutdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("checkoutDate <>", value, "checkoutdate");
            return (Criteria) this;
        }

        public Criteria andCheckoutdateGreaterThan(Date value) {
            addCriterionForJDBCDate("checkoutDate >", value, "checkoutdate");
            return (Criteria) this;
        }

        public Criteria andCheckoutdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("checkoutDate >=", value, "checkoutdate");
            return (Criteria) this;
        }

        public Criteria andCheckoutdateLessThan(Date value) {
            addCriterionForJDBCDate("checkoutDate <", value, "checkoutdate");
            return (Criteria) this;
        }

        public Criteria andCheckoutdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("checkoutDate <=", value, "checkoutdate");
            return (Criteria) this;
        }

        public Criteria andCheckoutdateIn(List<Date> values) {
            addCriterionForJDBCDate("checkoutDate in", values, "checkoutdate");
            return (Criteria) this;
        }

        public Criteria andCheckoutdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("checkoutDate not in", values, "checkoutdate");
            return (Criteria) this;
        }

        public Criteria andCheckoutdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("checkoutDate between", value1, value2, "checkoutdate");
            return (Criteria) this;
        }

        public Criteria andCheckoutdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("checkoutDate not between", value1, value2, "checkoutdate");
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