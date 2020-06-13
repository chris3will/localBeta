package com.springboot.hotel.demo.entity;

import java.util.ArrayList;
import java.util.List;

public class HotelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HotelExample() {
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

        public Criteria andHotelchinesenameIsNull() {
            addCriterion("hotelChinesename is null");
            return (Criteria) this;
        }

        public Criteria andHotelchinesenameIsNotNull() {
            addCriterion("hotelChinesename is not null");
            return (Criteria) this;
        }

        public Criteria andHotelchinesenameEqualTo(String value) {
            addCriterion("hotelChinesename =", value, "hotelchinesename");
            return (Criteria) this;
        }

        public Criteria andHotelchinesenameNotEqualTo(String value) {
            addCriterion("hotelChinesename <>", value, "hotelchinesename");
            return (Criteria) this;
        }

        public Criteria andHotelchinesenameGreaterThan(String value) {
            addCriterion("hotelChinesename >", value, "hotelchinesename");
            return (Criteria) this;
        }

        public Criteria andHotelchinesenameGreaterThanOrEqualTo(String value) {
            addCriterion("hotelChinesename >=", value, "hotelchinesename");
            return (Criteria) this;
        }

        public Criteria andHotelchinesenameLessThan(String value) {
            addCriterion("hotelChinesename <", value, "hotelchinesename");
            return (Criteria) this;
        }

        public Criteria andHotelchinesenameLessThanOrEqualTo(String value) {
            addCriterion("hotelChinesename <=", value, "hotelchinesename");
            return (Criteria) this;
        }

        public Criteria andHotelchinesenameLike(String value) {
            addCriterion("hotelChinesename like", value, "hotelchinesename");
            return (Criteria) this;
        }

        public Criteria andHotelchinesenameNotLike(String value) {
            addCriterion("hotelChinesename not like", value, "hotelchinesename");
            return (Criteria) this;
        }

        public Criteria andHotelchinesenameIn(List<String> values) {
            addCriterion("hotelChinesename in", values, "hotelchinesename");
            return (Criteria) this;
        }

        public Criteria andHotelchinesenameNotIn(List<String> values) {
            addCriterion("hotelChinesename not in", values, "hotelchinesename");
            return (Criteria) this;
        }

        public Criteria andHotelchinesenameBetween(String value1, String value2) {
            addCriterion("hotelChinesename between", value1, value2, "hotelchinesename");
            return (Criteria) this;
        }

        public Criteria andHotelchinesenameNotBetween(String value1, String value2) {
            addCriterion("hotelChinesename not between", value1, value2, "hotelchinesename");
            return (Criteria) this;
        }

        public Criteria andHotelenglishnameIsNull() {
            addCriterion("hotelEnglishname is null");
            return (Criteria) this;
        }

        public Criteria andHotelenglishnameIsNotNull() {
            addCriterion("hotelEnglishname is not null");
            return (Criteria) this;
        }

        public Criteria andHotelenglishnameEqualTo(String value) {
            addCriterion("hotelEnglishname =", value, "hotelenglishname");
            return (Criteria) this;
        }

        public Criteria andHotelenglishnameNotEqualTo(String value) {
            addCriterion("hotelEnglishname <>", value, "hotelenglishname");
            return (Criteria) this;
        }

        public Criteria andHotelenglishnameGreaterThan(String value) {
            addCriterion("hotelEnglishname >", value, "hotelenglishname");
            return (Criteria) this;
        }

        public Criteria andHotelenglishnameGreaterThanOrEqualTo(String value) {
            addCriterion("hotelEnglishname >=", value, "hotelenglishname");
            return (Criteria) this;
        }

        public Criteria andHotelenglishnameLessThan(String value) {
            addCriterion("hotelEnglishname <", value, "hotelenglishname");
            return (Criteria) this;
        }

        public Criteria andHotelenglishnameLessThanOrEqualTo(String value) {
            addCriterion("hotelEnglishname <=", value, "hotelenglishname");
            return (Criteria) this;
        }

        public Criteria andHotelenglishnameLike(String value) {
            addCriterion("hotelEnglishname like", value, "hotelenglishname");
            return (Criteria) this;
        }

        public Criteria andHotelenglishnameNotLike(String value) {
            addCriterion("hotelEnglishname not like", value, "hotelenglishname");
            return (Criteria) this;
        }

        public Criteria andHotelenglishnameIn(List<String> values) {
            addCriterion("hotelEnglishname in", values, "hotelenglishname");
            return (Criteria) this;
        }

        public Criteria andHotelenglishnameNotIn(List<String> values) {
            addCriterion("hotelEnglishname not in", values, "hotelenglishname");
            return (Criteria) this;
        }

        public Criteria andHotelenglishnameBetween(String value1, String value2) {
            addCriterion("hotelEnglishname between", value1, value2, "hotelenglishname");
            return (Criteria) this;
        }

        public Criteria andHotelenglishnameNotBetween(String value1, String value2) {
            addCriterion("hotelEnglishname not between", value1, value2, "hotelenglishname");
            return (Criteria) this;
        }

        public Criteria andLocationIsNull() {
            addCriterion("location is null");
            return (Criteria) this;
        }

        public Criteria andLocationIsNotNull() {
            addCriterion("location is not null");
            return (Criteria) this;
        }

        public Criteria andLocationEqualTo(String value) {
            addCriterion("location =", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotEqualTo(String value) {
            addCriterion("location <>", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThan(String value) {
            addCriterion("location >", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThanOrEqualTo(String value) {
            addCriterion("location >=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThan(String value) {
            addCriterion("location <", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThanOrEqualTo(String value) {
            addCriterion("location <=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLike(String value) {
            addCriterion("location like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotLike(String value) {
            addCriterion("location not like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationIn(List<String> values) {
            addCriterion("location in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotIn(List<String> values) {
            addCriterion("location not in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationBetween(String value1, String value2) {
            addCriterion("location between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotBetween(String value1, String value2) {
            addCriterion("location not between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andNationIsNull() {
            addCriterion("nation is null");
            return (Criteria) this;
        }

        public Criteria andNationIsNotNull() {
            addCriterion("nation is not null");
            return (Criteria) this;
        }

        public Criteria andNationEqualTo(String value) {
            addCriterion("nation =", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotEqualTo(String value) {
            addCriterion("nation <>", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThan(String value) {
            addCriterion("nation >", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThanOrEqualTo(String value) {
            addCriterion("nation >=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThan(String value) {
            addCriterion("nation <", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThanOrEqualTo(String value) {
            addCriterion("nation <=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLike(String value) {
            addCriterion("nation like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotLike(String value) {
            addCriterion("nation not like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationIn(List<String> values) {
            addCriterion("nation in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotIn(List<String> values) {
            addCriterion("nation not in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationBetween(String value1, String value2) {
            addCriterion("nation between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotBetween(String value1, String value2) {
            addCriterion("nation not between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("province is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("province is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(String value) {
            addCriterion("province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(String value) {
            addCriterion("province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(String value) {
            addCriterion("province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(String value) {
            addCriterion("province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(String value) {
            addCriterion("province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLike(String value) {
            addCriterion("province like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotLike(String value) {
            addCriterion("province not like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<String> values) {
            addCriterion("province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<String> values) {
            addCriterion("province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(String value1, String value2) {
            addCriterion("province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(String value1, String value2) {
            addCriterion("province not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andRegionIsNull() {
            addCriterion("region is null");
            return (Criteria) this;
        }

        public Criteria andRegionIsNotNull() {
            addCriterion("region is not null");
            return (Criteria) this;
        }

        public Criteria andRegionEqualTo(String value) {
            addCriterion("region =", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotEqualTo(String value) {
            addCriterion("region <>", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionGreaterThan(String value) {
            addCriterion("region >", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionGreaterThanOrEqualTo(String value) {
            addCriterion("region >=", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLessThan(String value) {
            addCriterion("region <", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLessThanOrEqualTo(String value) {
            addCriterion("region <=", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLike(String value) {
            addCriterion("region like", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotLike(String value) {
            addCriterion("region not like", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionIn(List<String> values) {
            addCriterion("region in", values, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotIn(List<String> values) {
            addCriterion("region not in", values, "region");
            return (Criteria) this;
        }

        public Criteria andRegionBetween(String value1, String value2) {
            addCriterion("region between", value1, value2, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotBetween(String value1, String value2) {
            addCriterion("region not between", value1, value2, "region");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andScoreIsNull() {
            addCriterion("score is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("score is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(Integer value) {
            addCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(Integer value) {
            addCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(Integer value) {
            addCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(Integer value) {
            addCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(Integer value) {
            addCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<Integer> values) {
            addCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<Integer> values) {
            addCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(Integer value1, Integer value2) {
            addCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("score not between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andImgurl1IsNull() {
            addCriterion("imgurl1 is null");
            return (Criteria) this;
        }

        public Criteria andImgurl1IsNotNull() {
            addCriterion("imgurl1 is not null");
            return (Criteria) this;
        }

        public Criteria andImgurl1EqualTo(String value) {
            addCriterion("imgurl1 =", value, "imgurl1");
            return (Criteria) this;
        }

        public Criteria andImgurl1NotEqualTo(String value) {
            addCriterion("imgurl1 <>", value, "imgurl1");
            return (Criteria) this;
        }

        public Criteria andImgurl1GreaterThan(String value) {
            addCriterion("imgurl1 >", value, "imgurl1");
            return (Criteria) this;
        }

        public Criteria andImgurl1GreaterThanOrEqualTo(String value) {
            addCriterion("imgurl1 >=", value, "imgurl1");
            return (Criteria) this;
        }

        public Criteria andImgurl1LessThan(String value) {
            addCriterion("imgurl1 <", value, "imgurl1");
            return (Criteria) this;
        }

        public Criteria andImgurl1LessThanOrEqualTo(String value) {
            addCriterion("imgurl1 <=", value, "imgurl1");
            return (Criteria) this;
        }

        public Criteria andImgurl1Like(String value) {
            addCriterion("imgurl1 like", value, "imgurl1");
            return (Criteria) this;
        }

        public Criteria andImgurl1NotLike(String value) {
            addCriterion("imgurl1 not like", value, "imgurl1");
            return (Criteria) this;
        }

        public Criteria andImgurl1In(List<String> values) {
            addCriterion("imgurl1 in", values, "imgurl1");
            return (Criteria) this;
        }

        public Criteria andImgurl1NotIn(List<String> values) {
            addCriterion("imgurl1 not in", values, "imgurl1");
            return (Criteria) this;
        }

        public Criteria andImgurl1Between(String value1, String value2) {
            addCriterion("imgurl1 between", value1, value2, "imgurl1");
            return (Criteria) this;
        }

        public Criteria andImgurl1NotBetween(String value1, String value2) {
            addCriterion("imgurl1 not between", value1, value2, "imgurl1");
            return (Criteria) this;
        }

        public Criteria andImgurl2IsNull() {
            addCriterion("imgurl2 is null");
            return (Criteria) this;
        }

        public Criteria andImgurl2IsNotNull() {
            addCriterion("imgurl2 is not null");
            return (Criteria) this;
        }

        public Criteria andImgurl2EqualTo(String value) {
            addCriterion("imgurl2 =", value, "imgurl2");
            return (Criteria) this;
        }

        public Criteria andImgurl2NotEqualTo(String value) {
            addCriterion("imgurl2 <>", value, "imgurl2");
            return (Criteria) this;
        }

        public Criteria andImgurl2GreaterThan(String value) {
            addCriterion("imgurl2 >", value, "imgurl2");
            return (Criteria) this;
        }

        public Criteria andImgurl2GreaterThanOrEqualTo(String value) {
            addCriterion("imgurl2 >=", value, "imgurl2");
            return (Criteria) this;
        }

        public Criteria andImgurl2LessThan(String value) {
            addCriterion("imgurl2 <", value, "imgurl2");
            return (Criteria) this;
        }

        public Criteria andImgurl2LessThanOrEqualTo(String value) {
            addCriterion("imgurl2 <=", value, "imgurl2");
            return (Criteria) this;
        }

        public Criteria andImgurl2Like(String value) {
            addCriterion("imgurl2 like", value, "imgurl2");
            return (Criteria) this;
        }

        public Criteria andImgurl2NotLike(String value) {
            addCriterion("imgurl2 not like", value, "imgurl2");
            return (Criteria) this;
        }

        public Criteria andImgurl2In(List<String> values) {
            addCriterion("imgurl2 in", values, "imgurl2");
            return (Criteria) this;
        }

        public Criteria andImgurl2NotIn(List<String> values) {
            addCriterion("imgurl2 not in", values, "imgurl2");
            return (Criteria) this;
        }

        public Criteria andImgurl2Between(String value1, String value2) {
            addCriterion("imgurl2 between", value1, value2, "imgurl2");
            return (Criteria) this;
        }

        public Criteria andImgurl2NotBetween(String value1, String value2) {
            addCriterion("imgurl2 not between", value1, value2, "imgurl2");
            return (Criteria) this;
        }

        public Criteria andImgurl3IsNull() {
            addCriterion("imgurl3 is null");
            return (Criteria) this;
        }

        public Criteria andImgurl3IsNotNull() {
            addCriterion("imgurl3 is not null");
            return (Criteria) this;
        }

        public Criteria andImgurl3EqualTo(String value) {
            addCriterion("imgurl3 =", value, "imgurl3");
            return (Criteria) this;
        }

        public Criteria andImgurl3NotEqualTo(String value) {
            addCriterion("imgurl3 <>", value, "imgurl3");
            return (Criteria) this;
        }

        public Criteria andImgurl3GreaterThan(String value) {
            addCriterion("imgurl3 >", value, "imgurl3");
            return (Criteria) this;
        }

        public Criteria andImgurl3GreaterThanOrEqualTo(String value) {
            addCriterion("imgurl3 >=", value, "imgurl3");
            return (Criteria) this;
        }

        public Criteria andImgurl3LessThan(String value) {
            addCriterion("imgurl3 <", value, "imgurl3");
            return (Criteria) this;
        }

        public Criteria andImgurl3LessThanOrEqualTo(String value) {
            addCriterion("imgurl3 <=", value, "imgurl3");
            return (Criteria) this;
        }

        public Criteria andImgurl3Like(String value) {
            addCriterion("imgurl3 like", value, "imgurl3");
            return (Criteria) this;
        }

        public Criteria andImgurl3NotLike(String value) {
            addCriterion("imgurl3 not like", value, "imgurl3");
            return (Criteria) this;
        }

        public Criteria andImgurl3In(List<String> values) {
            addCriterion("imgurl3 in", values, "imgurl3");
            return (Criteria) this;
        }

        public Criteria andImgurl3NotIn(List<String> values) {
            addCriterion("imgurl3 not in", values, "imgurl3");
            return (Criteria) this;
        }

        public Criteria andImgurl3Between(String value1, String value2) {
            addCriterion("imgurl3 between", value1, value2, "imgurl3");
            return (Criteria) this;
        }

        public Criteria andImgurl3NotBetween(String value1, String value2) {
            addCriterion("imgurl3 not between", value1, value2, "imgurl3");
            return (Criteria) this;
        }

        public Criteria andImgurl4IsNull() {
            addCriterion("imgurl4 is null");
            return (Criteria) this;
        }

        public Criteria andImgurl4IsNotNull() {
            addCriterion("imgurl4 is not null");
            return (Criteria) this;
        }

        public Criteria andImgurl4EqualTo(String value) {
            addCriterion("imgurl4 =", value, "imgurl4");
            return (Criteria) this;
        }

        public Criteria andImgurl4NotEqualTo(String value) {
            addCriterion("imgurl4 <>", value, "imgurl4");
            return (Criteria) this;
        }

        public Criteria andImgurl4GreaterThan(String value) {
            addCriterion("imgurl4 >", value, "imgurl4");
            return (Criteria) this;
        }

        public Criteria andImgurl4GreaterThanOrEqualTo(String value) {
            addCriterion("imgurl4 >=", value, "imgurl4");
            return (Criteria) this;
        }

        public Criteria andImgurl4LessThan(String value) {
            addCriterion("imgurl4 <", value, "imgurl4");
            return (Criteria) this;
        }

        public Criteria andImgurl4LessThanOrEqualTo(String value) {
            addCriterion("imgurl4 <=", value, "imgurl4");
            return (Criteria) this;
        }

        public Criteria andImgurl4Like(String value) {
            addCriterion("imgurl4 like", value, "imgurl4");
            return (Criteria) this;
        }

        public Criteria andImgurl4NotLike(String value) {
            addCriterion("imgurl4 not like", value, "imgurl4");
            return (Criteria) this;
        }

        public Criteria andImgurl4In(List<String> values) {
            addCriterion("imgurl4 in", values, "imgurl4");
            return (Criteria) this;
        }

        public Criteria andImgurl4NotIn(List<String> values) {
            addCriterion("imgurl4 not in", values, "imgurl4");
            return (Criteria) this;
        }

        public Criteria andImgurl4Between(String value1, String value2) {
            addCriterion("imgurl4 between", value1, value2, "imgurl4");
            return (Criteria) this;
        }

        public Criteria andImgurl4NotBetween(String value1, String value2) {
            addCriterion("imgurl4 not between", value1, value2, "imgurl4");
            return (Criteria) this;
        }

        public Criteria andImgurl5IsNull() {
            addCriterion("imgurl5 is null");
            return (Criteria) this;
        }

        public Criteria andImgurl5IsNotNull() {
            addCriterion("imgurl5 is not null");
            return (Criteria) this;
        }

        public Criteria andImgurl5EqualTo(String value) {
            addCriterion("imgurl5 =", value, "imgurl5");
            return (Criteria) this;
        }

        public Criteria andImgurl5NotEqualTo(String value) {
            addCriterion("imgurl5 <>", value, "imgurl5");
            return (Criteria) this;
        }

        public Criteria andImgurl5GreaterThan(String value) {
            addCriterion("imgurl5 >", value, "imgurl5");
            return (Criteria) this;
        }

        public Criteria andImgurl5GreaterThanOrEqualTo(String value) {
            addCriterion("imgurl5 >=", value, "imgurl5");
            return (Criteria) this;
        }

        public Criteria andImgurl5LessThan(String value) {
            addCriterion("imgurl5 <", value, "imgurl5");
            return (Criteria) this;
        }

        public Criteria andImgurl5LessThanOrEqualTo(String value) {
            addCriterion("imgurl5 <=", value, "imgurl5");
            return (Criteria) this;
        }

        public Criteria andImgurl5Like(String value) {
            addCriterion("imgurl5 like", value, "imgurl5");
            return (Criteria) this;
        }

        public Criteria andImgurl5NotLike(String value) {
            addCriterion("imgurl5 not like", value, "imgurl5");
            return (Criteria) this;
        }

        public Criteria andImgurl5In(List<String> values) {
            addCriterion("imgurl5 in", values, "imgurl5");
            return (Criteria) this;
        }

        public Criteria andImgurl5NotIn(List<String> values) {
            addCriterion("imgurl5 not in", values, "imgurl5");
            return (Criteria) this;
        }

        public Criteria andImgurl5Between(String value1, String value2) {
            addCriterion("imgurl5 between", value1, value2, "imgurl5");
            return (Criteria) this;
        }

        public Criteria andImgurl5NotBetween(String value1, String value2) {
            addCriterion("imgurl5 not between", value1, value2, "imgurl5");
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