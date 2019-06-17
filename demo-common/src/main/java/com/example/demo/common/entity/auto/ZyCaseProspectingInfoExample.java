package com.example.demo.common.entity.auto;

import com.example.demo.common.entity.PageHelper;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ZyCaseProspectingInfoExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    protected PageHelper pageHelper;

    public ZyCaseProspectingInfoExample() {
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

    public void setPageHelper(PageHelper pageHelper) {
        this.pageHelper=pageHelper;
    }

    public PageHelper getPageHelper() {
        return pageHelper;
    }

    protected abstract static class GeneratedCriteria implements Serializable {
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

        public Criteria andProspectingIdIsNull() {
            addCriterion("prospecting_id is null");
            return (Criteria) this;
        }

        public Criteria andProspectingIdIsNotNull() {
            addCriterion("prospecting_id is not null");
            return (Criteria) this;
        }

        public Criteria andProspectingIdEqualTo(Integer value) {
            addCriterion("prospecting_id =", value, "prospectingId");
            return (Criteria) this;
        }

        public Criteria andProspectingIdNotEqualTo(Integer value) {
            addCriterion("prospecting_id <>", value, "prospectingId");
            return (Criteria) this;
        }

        public Criteria andProspectingIdGreaterThan(Integer value) {
            addCriterion("prospecting_id >", value, "prospectingId");
            return (Criteria) this;
        }

        public Criteria andProspectingIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("prospecting_id >=", value, "prospectingId");
            return (Criteria) this;
        }

        public Criteria andProspectingIdLessThan(Integer value) {
            addCriterion("prospecting_id <", value, "prospectingId");
            return (Criteria) this;
        }

        public Criteria andProspectingIdLessThanOrEqualTo(Integer value) {
            addCriterion("prospecting_id <=", value, "prospectingId");
            return (Criteria) this;
        }

        public Criteria andProspectingIdIn(List<Integer> values) {
            addCriterion("prospecting_id in", values, "prospectingId");
            return (Criteria) this;
        }

        public Criteria andProspectingIdNotIn(List<Integer> values) {
            addCriterion("prospecting_id not in", values, "prospectingId");
            return (Criteria) this;
        }

        public Criteria andProspectingIdBetween(Integer value1, Integer value2) {
            addCriterion("prospecting_id between", value1, value2, "prospectingId");
            return (Criteria) this;
        }

        public Criteria andProspectingIdNotBetween(Integer value1, Integer value2) {
            addCriterion("prospecting_id not between", value1, value2, "prospectingId");
            return (Criteria) this;
        }

        public Criteria andCaseIdIsNull() {
            addCriterion("case_id is null");
            return (Criteria) this;
        }

        public Criteria andCaseIdIsNotNull() {
            addCriterion("case_id is not null");
            return (Criteria) this;
        }

        public Criteria andCaseIdEqualTo(Integer value) {
            addCriterion("case_id =", value, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdNotEqualTo(Integer value) {
            addCriterion("case_id <>", value, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdGreaterThan(Integer value) {
            addCriterion("case_id >", value, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("case_id >=", value, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdLessThan(Integer value) {
            addCriterion("case_id <", value, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdLessThanOrEqualTo(Integer value) {
            addCriterion("case_id <=", value, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdIn(List<Integer> values) {
            addCriterion("case_id in", values, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdNotIn(List<Integer> values) {
            addCriterion("case_id not in", values, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdBetween(Integer value1, Integer value2) {
            addCriterion("case_id between", value1, value2, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("case_id not between", value1, value2, "caseId");
            return (Criteria) this;
        }

        public Criteria andUndertakeUnitIsNull() {
            addCriterion("undertake_unit is null");
            return (Criteria) this;
        }

        public Criteria andUndertakeUnitIsNotNull() {
            addCriterion("undertake_unit is not null");
            return (Criteria) this;
        }

        public Criteria andUndertakeUnitEqualTo(String value) {
            addCriterion("undertake_unit =", value, "undertakeUnit");
            return (Criteria) this;
        }

        public Criteria andUndertakeUnitNotEqualTo(String value) {
            addCriterion("undertake_unit <>", value, "undertakeUnit");
            return (Criteria) this;
        }

        public Criteria andUndertakeUnitGreaterThan(String value) {
            addCriterion("undertake_unit >", value, "undertakeUnit");
            return (Criteria) this;
        }

        public Criteria andUndertakeUnitGreaterThanOrEqualTo(String value) {
            addCriterion("undertake_unit >=", value, "undertakeUnit");
            return (Criteria) this;
        }

        public Criteria andUndertakeUnitLessThan(String value) {
            addCriterion("undertake_unit <", value, "undertakeUnit");
            return (Criteria) this;
        }

        public Criteria andUndertakeUnitLessThanOrEqualTo(String value) {
            addCriterion("undertake_unit <=", value, "undertakeUnit");
            return (Criteria) this;
        }

        public Criteria andUndertakeUnitLike(String value) {
            addCriterion("undertake_unit like", value, "undertakeUnit");
            return (Criteria) this;
        }

        public Criteria andUndertakeUnitNotLike(String value) {
            addCriterion("undertake_unit not like", value, "undertakeUnit");
            return (Criteria) this;
        }

        public Criteria andUndertakeUnitIn(List<String> values) {
            addCriterion("undertake_unit in", values, "undertakeUnit");
            return (Criteria) this;
        }

        public Criteria andUndertakeUnitNotIn(List<String> values) {
            addCriterion("undertake_unit not in", values, "undertakeUnit");
            return (Criteria) this;
        }

        public Criteria andUndertakeUnitBetween(String value1, String value2) {
            addCriterion("undertake_unit between", value1, value2, "undertakeUnit");
            return (Criteria) this;
        }

        public Criteria andUndertakeUnitNotBetween(String value1, String value2) {
            addCriterion("undertake_unit not between", value1, value2, "undertakeUnit");
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

        public Criteria andPlanIsNull() {
            addCriterion("`plan` is null");
            return (Criteria) this;
        }

        public Criteria andPlanIsNotNull() {
            addCriterion("`plan` is not null");
            return (Criteria) this;
        }

        public Criteria andPlanEqualTo(String value) {
            addCriterion("`plan` =", value, "plan");
            return (Criteria) this;
        }

        public Criteria andPlanNotEqualTo(String value) {
            addCriterion("`plan` <>", value, "plan");
            return (Criteria) this;
        }

        public Criteria andPlanGreaterThan(String value) {
            addCriterion("`plan` >", value, "plan");
            return (Criteria) this;
        }

        public Criteria andPlanGreaterThanOrEqualTo(String value) {
            addCriterion("`plan` >=", value, "plan");
            return (Criteria) this;
        }

        public Criteria andPlanLessThan(String value) {
            addCriterion("`plan` <", value, "plan");
            return (Criteria) this;
        }

        public Criteria andPlanLessThanOrEqualTo(String value) {
            addCriterion("`plan` <=", value, "plan");
            return (Criteria) this;
        }

        public Criteria andPlanLike(String value) {
            addCriterion("`plan` like", value, "plan");
            return (Criteria) this;
        }

        public Criteria andPlanNotLike(String value) {
            addCriterion("`plan` not like", value, "plan");
            return (Criteria) this;
        }

        public Criteria andPlanIn(List<String> values) {
            addCriterion("`plan` in", values, "plan");
            return (Criteria) this;
        }

        public Criteria andPlanNotIn(List<String> values) {
            addCriterion("`plan` not in", values, "plan");
            return (Criteria) this;
        }

        public Criteria andPlanBetween(String value1, String value2) {
            addCriterion("`plan` between", value1, value2, "plan");
            return (Criteria) this;
        }

        public Criteria andPlanNotBetween(String value1, String value2) {
            addCriterion("`plan` not between", value1, value2, "plan");
            return (Criteria) this;
        }

        public Criteria andTemperatureIsNull() {
            addCriterion("temperature is null");
            return (Criteria) this;
        }

        public Criteria andTemperatureIsNotNull() {
            addCriterion("temperature is not null");
            return (Criteria) this;
        }

        public Criteria andTemperatureEqualTo(String value) {
            addCriterion("temperature =", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureNotEqualTo(String value) {
            addCriterion("temperature <>", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureGreaterThan(String value) {
            addCriterion("temperature >", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureGreaterThanOrEqualTo(String value) {
            addCriterion("temperature >=", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureLessThan(String value) {
            addCriterion("temperature <", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureLessThanOrEqualTo(String value) {
            addCriterion("temperature <=", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureLike(String value) {
            addCriterion("temperature like", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureNotLike(String value) {
            addCriterion("temperature not like", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureIn(List<String> values) {
            addCriterion("temperature in", values, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureNotIn(List<String> values) {
            addCriterion("temperature not in", values, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureBetween(String value1, String value2) {
            addCriterion("temperature between", value1, value2, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureNotBetween(String value1, String value2) {
            addCriterion("temperature not between", value1, value2, "temperature");
            return (Criteria) this;
        }

        public Criteria andWeatherIsNull() {
            addCriterion("weather is null");
            return (Criteria) this;
        }

        public Criteria andWeatherIsNotNull() {
            addCriterion("weather is not null");
            return (Criteria) this;
        }

        public Criteria andWeatherEqualTo(String value) {
            addCriterion("weather =", value, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherNotEqualTo(String value) {
            addCriterion("weather <>", value, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherGreaterThan(String value) {
            addCriterion("weather >", value, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherGreaterThanOrEqualTo(String value) {
            addCriterion("weather >=", value, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherLessThan(String value) {
            addCriterion("weather <", value, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherLessThanOrEqualTo(String value) {
            addCriterion("weather <=", value, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherLike(String value) {
            addCriterion("weather like", value, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherNotLike(String value) {
            addCriterion("weather not like", value, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherIn(List<String> values) {
            addCriterion("weather in", values, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherNotIn(List<String> values) {
            addCriterion("weather not in", values, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherBetween(String value1, String value2) {
            addCriterion("weather between", value1, value2, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherNotBetween(String value1, String value2) {
            addCriterion("weather not between", value1, value2, "weather");
            return (Criteria) this;
        }

        public Criteria andHumidityIsNull() {
            addCriterion("humidity is null");
            return (Criteria) this;
        }

        public Criteria andHumidityIsNotNull() {
            addCriterion("humidity is not null");
            return (Criteria) this;
        }

        public Criteria andHumidityEqualTo(String value) {
            addCriterion("humidity =", value, "humidity");
            return (Criteria) this;
        }

        public Criteria andHumidityNotEqualTo(String value) {
            addCriterion("humidity <>", value, "humidity");
            return (Criteria) this;
        }

        public Criteria andHumidityGreaterThan(String value) {
            addCriterion("humidity >", value, "humidity");
            return (Criteria) this;
        }

        public Criteria andHumidityGreaterThanOrEqualTo(String value) {
            addCriterion("humidity >=", value, "humidity");
            return (Criteria) this;
        }

        public Criteria andHumidityLessThan(String value) {
            addCriterion("humidity <", value, "humidity");
            return (Criteria) this;
        }

        public Criteria andHumidityLessThanOrEqualTo(String value) {
            addCriterion("humidity <=", value, "humidity");
            return (Criteria) this;
        }

        public Criteria andHumidityLike(String value) {
            addCriterion("humidity like", value, "humidity");
            return (Criteria) this;
        }

        public Criteria andHumidityNotLike(String value) {
            addCriterion("humidity not like", value, "humidity");
            return (Criteria) this;
        }

        public Criteria andHumidityIn(List<String> values) {
            addCriterion("humidity in", values, "humidity");
            return (Criteria) this;
        }

        public Criteria andHumidityNotIn(List<String> values) {
            addCriterion("humidity not in", values, "humidity");
            return (Criteria) this;
        }

        public Criteria andHumidityBetween(String value1, String value2) {
            addCriterion("humidity between", value1, value2, "humidity");
            return (Criteria) this;
        }

        public Criteria andHumidityNotBetween(String value1, String value2) {
            addCriterion("humidity not between", value1, value2, "humidity");
            return (Criteria) this;
        }

        public Criteria andRayIsNull() {
            addCriterion("ray is null");
            return (Criteria) this;
        }

        public Criteria andRayIsNotNull() {
            addCriterion("ray is not null");
            return (Criteria) this;
        }

        public Criteria andRayEqualTo(String value) {
            addCriterion("ray =", value, "ray");
            return (Criteria) this;
        }

        public Criteria andRayNotEqualTo(String value) {
            addCriterion("ray <>", value, "ray");
            return (Criteria) this;
        }

        public Criteria andRayGreaterThan(String value) {
            addCriterion("ray >", value, "ray");
            return (Criteria) this;
        }

        public Criteria andRayGreaterThanOrEqualTo(String value) {
            addCriterion("ray >=", value, "ray");
            return (Criteria) this;
        }

        public Criteria andRayLessThan(String value) {
            addCriterion("ray <", value, "ray");
            return (Criteria) this;
        }

        public Criteria andRayLessThanOrEqualTo(String value) {
            addCriterion("ray <=", value, "ray");
            return (Criteria) this;
        }

        public Criteria andRayLike(String value) {
            addCriterion("ray like", value, "ray");
            return (Criteria) this;
        }

        public Criteria andRayNotLike(String value) {
            addCriterion("ray not like", value, "ray");
            return (Criteria) this;
        }

        public Criteria andRayIn(List<String> values) {
            addCriterion("ray in", values, "ray");
            return (Criteria) this;
        }

        public Criteria andRayNotIn(List<String> values) {
            addCriterion("ray not in", values, "ray");
            return (Criteria) this;
        }

        public Criteria andRayBetween(String value1, String value2) {
            addCriterion("ray between", value1, value2, "ray");
            return (Criteria) this;
        }

        public Criteria andRayNotBetween(String value1, String value2) {
            addCriterion("ray not between", value1, value2, "ray");
            return (Criteria) this;
        }

        public Criteria andSceneDescIsNull() {
            addCriterion("scene_desc is null");
            return (Criteria) this;
        }

        public Criteria andSceneDescIsNotNull() {
            addCriterion("scene_desc is not null");
            return (Criteria) this;
        }

        public Criteria andSceneDescEqualTo(String value) {
            addCriterion("scene_desc =", value, "sceneDesc");
            return (Criteria) this;
        }

        public Criteria andSceneDescNotEqualTo(String value) {
            addCriterion("scene_desc <>", value, "sceneDesc");
            return (Criteria) this;
        }

        public Criteria andSceneDescGreaterThan(String value) {
            addCriterion("scene_desc >", value, "sceneDesc");
            return (Criteria) this;
        }

        public Criteria andSceneDescGreaterThanOrEqualTo(String value) {
            addCriterion("scene_desc >=", value, "sceneDesc");
            return (Criteria) this;
        }

        public Criteria andSceneDescLessThan(String value) {
            addCriterion("scene_desc <", value, "sceneDesc");
            return (Criteria) this;
        }

        public Criteria andSceneDescLessThanOrEqualTo(String value) {
            addCriterion("scene_desc <=", value, "sceneDesc");
            return (Criteria) this;
        }

        public Criteria andSceneDescLike(String value) {
            addCriterion("scene_desc like", value, "sceneDesc");
            return (Criteria) this;
        }

        public Criteria andSceneDescNotLike(String value) {
            addCriterion("scene_desc not like", value, "sceneDesc");
            return (Criteria) this;
        }

        public Criteria andSceneDescIn(List<String> values) {
            addCriterion("scene_desc in", values, "sceneDesc");
            return (Criteria) this;
        }

        public Criteria andSceneDescNotIn(List<String> values) {
            addCriterion("scene_desc not in", values, "sceneDesc");
            return (Criteria) this;
        }

        public Criteria andSceneDescBetween(String value1, String value2) {
            addCriterion("scene_desc between", value1, value2, "sceneDesc");
            return (Criteria) this;
        }

        public Criteria andSceneDescNotBetween(String value1, String value2) {
            addCriterion("scene_desc not between", value1, value2, "sceneDesc");
            return (Criteria) this;
        }

        public Criteria andSceneMapFileIdIsNull() {
            addCriterion("scene_map_file_id is null");
            return (Criteria) this;
        }

        public Criteria andSceneMapFileIdIsNotNull() {
            addCriterion("scene_map_file_id is not null");
            return (Criteria) this;
        }

        public Criteria andSceneMapFileIdEqualTo(Long value) {
            addCriterion("scene_map_file_id =", value, "sceneMapFileId");
            return (Criteria) this;
        }

        public Criteria andSceneMapFileIdNotEqualTo(Long value) {
            addCriterion("scene_map_file_id <>", value, "sceneMapFileId");
            return (Criteria) this;
        }

        public Criteria andSceneMapFileIdGreaterThan(Long value) {
            addCriterion("scene_map_file_id >", value, "sceneMapFileId");
            return (Criteria) this;
        }

        public Criteria andSceneMapFileIdGreaterThanOrEqualTo(Long value) {
            addCriterion("scene_map_file_id >=", value, "sceneMapFileId");
            return (Criteria) this;
        }

        public Criteria andSceneMapFileIdLessThan(Long value) {
            addCriterion("scene_map_file_id <", value, "sceneMapFileId");
            return (Criteria) this;
        }

        public Criteria andSceneMapFileIdLessThanOrEqualTo(Long value) {
            addCriterion("scene_map_file_id <=", value, "sceneMapFileId");
            return (Criteria) this;
        }

        public Criteria andSceneMapFileIdIn(List<Long> values) {
            addCriterion("scene_map_file_id in", values, "sceneMapFileId");
            return (Criteria) this;
        }

        public Criteria andSceneMapFileIdNotIn(List<Long> values) {
            addCriterion("scene_map_file_id not in", values, "sceneMapFileId");
            return (Criteria) this;
        }

        public Criteria andSceneMapFileIdBetween(Long value1, Long value2) {
            addCriterion("scene_map_file_id between", value1, value2, "sceneMapFileId");
            return (Criteria) this;
        }

        public Criteria andSceneMapFileIdNotBetween(Long value1, Long value2) {
            addCriterion("scene_map_file_id not between", value1, value2, "sceneMapFileId");
            return (Criteria) this;
        }

        public Criteria andSampleFlowTypeIsNull() {
            addCriterion("sample_flow_type is null");
            return (Criteria) this;
        }

        public Criteria andSampleFlowTypeIsNotNull() {
            addCriterion("sample_flow_type is not null");
            return (Criteria) this;
        }

        public Criteria andSampleFlowTypeEqualTo(Integer value) {
            addCriterion("sample_flow_type =", value, "sampleFlowType");
            return (Criteria) this;
        }

        public Criteria andSampleFlowTypeNotEqualTo(Integer value) {
            addCriterion("sample_flow_type <>", value, "sampleFlowType");
            return (Criteria) this;
        }

        public Criteria andSampleFlowTypeGreaterThan(Integer value) {
            addCriterion("sample_flow_type >", value, "sampleFlowType");
            return (Criteria) this;
        }

        public Criteria andSampleFlowTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("sample_flow_type >=", value, "sampleFlowType");
            return (Criteria) this;
        }

        public Criteria andSampleFlowTypeLessThan(Integer value) {
            addCriterion("sample_flow_type <", value, "sampleFlowType");
            return (Criteria) this;
        }

        public Criteria andSampleFlowTypeLessThanOrEqualTo(Integer value) {
            addCriterion("sample_flow_type <=", value, "sampleFlowType");
            return (Criteria) this;
        }

        public Criteria andSampleFlowTypeIn(List<Integer> values) {
            addCriterion("sample_flow_type in", values, "sampleFlowType");
            return (Criteria) this;
        }

        public Criteria andSampleFlowTypeNotIn(List<Integer> values) {
            addCriterion("sample_flow_type not in", values, "sampleFlowType");
            return (Criteria) this;
        }

        public Criteria andSampleFlowTypeBetween(Integer value1, Integer value2) {
            addCriterion("sample_flow_type between", value1, value2, "sampleFlowType");
            return (Criteria) this;
        }

        public Criteria andSampleFlowTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("sample_flow_type not between", value1, value2, "sampleFlowType");
            return (Criteria) this;
        }

        public Criteria andSampleFlowRemark2IsNull() {
            addCriterion("sample_flow_remark2 is null");
            return (Criteria) this;
        }

        public Criteria andSampleFlowRemark2IsNotNull() {
            addCriterion("sample_flow_remark2 is not null");
            return (Criteria) this;
        }

        public Criteria andSampleFlowRemark2EqualTo(String value) {
            addCriterion("sample_flow_remark2 =", value, "sampleFlowRemark2");
            return (Criteria) this;
        }

        public Criteria andSampleFlowRemark2NotEqualTo(String value) {
            addCriterion("sample_flow_remark2 <>", value, "sampleFlowRemark2");
            return (Criteria) this;
        }

        public Criteria andSampleFlowRemark2GreaterThan(String value) {
            addCriterion("sample_flow_remark2 >", value, "sampleFlowRemark2");
            return (Criteria) this;
        }

        public Criteria andSampleFlowRemark2GreaterThanOrEqualTo(String value) {
            addCriterion("sample_flow_remark2 >=", value, "sampleFlowRemark2");
            return (Criteria) this;
        }

        public Criteria andSampleFlowRemark2LessThan(String value) {
            addCriterion("sample_flow_remark2 <", value, "sampleFlowRemark2");
            return (Criteria) this;
        }

        public Criteria andSampleFlowRemark2LessThanOrEqualTo(String value) {
            addCriterion("sample_flow_remark2 <=", value, "sampleFlowRemark2");
            return (Criteria) this;
        }

        public Criteria andSampleFlowRemark2Like(String value) {
            addCriterion("sample_flow_remark2 like", value, "sampleFlowRemark2");
            return (Criteria) this;
        }

        public Criteria andSampleFlowRemark2NotLike(String value) {
            addCriterion("sample_flow_remark2 not like", value, "sampleFlowRemark2");
            return (Criteria) this;
        }

        public Criteria andSampleFlowRemark2In(List<String> values) {
            addCriterion("sample_flow_remark2 in", values, "sampleFlowRemark2");
            return (Criteria) this;
        }

        public Criteria andSampleFlowRemark2NotIn(List<String> values) {
            addCriterion("sample_flow_remark2 not in", values, "sampleFlowRemark2");
            return (Criteria) this;
        }

        public Criteria andSampleFlowRemark2Between(String value1, String value2) {
            addCriterion("sample_flow_remark2 between", value1, value2, "sampleFlowRemark2");
            return (Criteria) this;
        }

        public Criteria andSampleFlowRemark2NotBetween(String value1, String value2) {
            addCriterion("sample_flow_remark2 not between", value1, value2, "sampleFlowRemark2");
            return (Criteria) this;
        }

        public Criteria andSignaturesIsNull() {
            addCriterion("signatures is null");
            return (Criteria) this;
        }

        public Criteria andSignaturesIsNotNull() {
            addCriterion("signatures is not null");
            return (Criteria) this;
        }

        public Criteria andSignaturesEqualTo(String value) {
            addCriterion("signatures =", value, "signatures");
            return (Criteria) this;
        }

        public Criteria andSignaturesNotEqualTo(String value) {
            addCriterion("signatures <>", value, "signatures");
            return (Criteria) this;
        }

        public Criteria andSignaturesGreaterThan(String value) {
            addCriterion("signatures >", value, "signatures");
            return (Criteria) this;
        }

        public Criteria andSignaturesGreaterThanOrEqualTo(String value) {
            addCriterion("signatures >=", value, "signatures");
            return (Criteria) this;
        }

        public Criteria andSignaturesLessThan(String value) {
            addCriterion("signatures <", value, "signatures");
            return (Criteria) this;
        }

        public Criteria andSignaturesLessThanOrEqualTo(String value) {
            addCriterion("signatures <=", value, "signatures");
            return (Criteria) this;
        }

        public Criteria andSignaturesLike(String value) {
            addCriterion("signatures like", value, "signatures");
            return (Criteria) this;
        }

        public Criteria andSignaturesNotLike(String value) {
            addCriterion("signatures not like", value, "signatures");
            return (Criteria) this;
        }

        public Criteria andSignaturesIn(List<String> values) {
            addCriterion("signatures in", values, "signatures");
            return (Criteria) this;
        }

        public Criteria andSignaturesNotIn(List<String> values) {
            addCriterion("signatures not in", values, "signatures");
            return (Criteria) this;
        }

        public Criteria andSignaturesBetween(String value1, String value2) {
            addCriterion("signatures between", value1, value2, "signatures");
            return (Criteria) this;
        }

        public Criteria andSignaturesNotBetween(String value1, String value2) {
            addCriterion("signatures not between", value1, value2, "signatures");
            return (Criteria) this;
        }

        public Criteria andWitnessIsNull() {
            addCriterion("witness is null");
            return (Criteria) this;
        }

        public Criteria andWitnessIsNotNull() {
            addCriterion("witness is not null");
            return (Criteria) this;
        }

        public Criteria andWitnessEqualTo(String value) {
            addCriterion("witness =", value, "witness");
            return (Criteria) this;
        }

        public Criteria andWitnessNotEqualTo(String value) {
            addCriterion("witness <>", value, "witness");
            return (Criteria) this;
        }

        public Criteria andWitnessGreaterThan(String value) {
            addCriterion("witness >", value, "witness");
            return (Criteria) this;
        }

        public Criteria andWitnessGreaterThanOrEqualTo(String value) {
            addCriterion("witness >=", value, "witness");
            return (Criteria) this;
        }

        public Criteria andWitnessLessThan(String value) {
            addCriterion("witness <", value, "witness");
            return (Criteria) this;
        }

        public Criteria andWitnessLessThanOrEqualTo(String value) {
            addCriterion("witness <=", value, "witness");
            return (Criteria) this;
        }

        public Criteria andWitnessLike(String value) {
            addCriterion("witness like", value, "witness");
            return (Criteria) this;
        }

        public Criteria andWitnessNotLike(String value) {
            addCriterion("witness not like", value, "witness");
            return (Criteria) this;
        }

        public Criteria andWitnessIn(List<String> values) {
            addCriterion("witness in", values, "witness");
            return (Criteria) this;
        }

        public Criteria andWitnessNotIn(List<String> values) {
            addCriterion("witness not in", values, "witness");
            return (Criteria) this;
        }

        public Criteria andWitnessBetween(String value1, String value2) {
            addCriterion("witness between", value1, value2, "witness");
            return (Criteria) this;
        }

        public Criteria andWitnessNotBetween(String value1, String value2) {
            addCriterion("witness not between", value1, value2, "witness");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNull() {
            addCriterion("add_time is null");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNotNull() {
            addCriterion("add_time is not null");
            return (Criteria) this;
        }

        public Criteria andAddTimeEqualTo(Date value) {
            addCriterion("add_time =", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotEqualTo(Date value) {
            addCriterion("add_time <>", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThan(Date value) {
            addCriterion("add_time >", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("add_time >=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThan(Date value) {
            addCriterion("add_time <", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("add_time <=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeIn(List<Date> values) {
            addCriterion("add_time in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotIn(List<Date> values) {
            addCriterion("add_time not in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeBetween(Date value1, Date value2) {
            addCriterion("add_time between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("add_time not between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddUidIsNull() {
            addCriterion("add_uid is null");
            return (Criteria) this;
        }

        public Criteria andAddUidIsNotNull() {
            addCriterion("add_uid is not null");
            return (Criteria) this;
        }

        public Criteria andAddUidEqualTo(Long value) {
            addCriterion("add_uid =", value, "addUid");
            return (Criteria) this;
        }

        public Criteria andAddUidNotEqualTo(Long value) {
            addCriterion("add_uid <>", value, "addUid");
            return (Criteria) this;
        }

        public Criteria andAddUidGreaterThan(Long value) {
            addCriterion("add_uid >", value, "addUid");
            return (Criteria) this;
        }

        public Criteria andAddUidGreaterThanOrEqualTo(Long value) {
            addCriterion("add_uid >=", value, "addUid");
            return (Criteria) this;
        }

        public Criteria andAddUidLessThan(Long value) {
            addCriterion("add_uid <", value, "addUid");
            return (Criteria) this;
        }

        public Criteria andAddUidLessThanOrEqualTo(Long value) {
            addCriterion("add_uid <=", value, "addUid");
            return (Criteria) this;
        }

        public Criteria andAddUidIn(List<Long> values) {
            addCriterion("add_uid in", values, "addUid");
            return (Criteria) this;
        }

        public Criteria andAddUidNotIn(List<Long> values) {
            addCriterion("add_uid not in", values, "addUid");
            return (Criteria) this;
        }

        public Criteria andAddUidBetween(Long value1, Long value2) {
            addCriterion("add_uid between", value1, value2, "addUid");
            return (Criteria) this;
        }

        public Criteria andAddUidNotBetween(Long value1, Long value2) {
            addCriterion("add_uid not between", value1, value2, "addUid");
            return (Criteria) this;
        }

        public Criteria andLastUpdateIsNull() {
            addCriterion("last_update is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateIsNotNull() {
            addCriterion("last_update is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateEqualTo(Date value) {
            addCriterion("last_update =", value, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateNotEqualTo(Date value) {
            addCriterion("last_update <>", value, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateGreaterThan(Date value) {
            addCriterion("last_update >", value, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateGreaterThanOrEqualTo(Date value) {
            addCriterion("last_update >=", value, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateLessThan(Date value) {
            addCriterion("last_update <", value, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateLessThanOrEqualTo(Date value) {
            addCriterion("last_update <=", value, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateIn(List<Date> values) {
            addCriterion("last_update in", values, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateNotIn(List<Date> values) {
            addCriterion("last_update not in", values, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateBetween(Date value1, Date value2) {
            addCriterion("last_update between", value1, value2, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateNotBetween(Date value1, Date value2) {
            addCriterion("last_update not between", value1, value2, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andBeginTimeIsNull() {
            addCriterion("begin_time is null");
            return (Criteria) this;
        }

        public Criteria andBeginTimeIsNotNull() {
            addCriterion("begin_time is not null");
            return (Criteria) this;
        }

        public Criteria andBeginTimeEqualTo(Date value) {
            addCriterion("begin_time =", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeNotEqualTo(Date value) {
            addCriterion("begin_time <>", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeGreaterThan(Date value) {
            addCriterion("begin_time >", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("begin_time >=", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeLessThan(Date value) {
            addCriterion("begin_time <", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeLessThanOrEqualTo(Date value) {
            addCriterion("begin_time <=", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeIn(List<Date> values) {
            addCriterion("begin_time in", values, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeNotIn(List<Date> values) {
            addCriterion("begin_time not in", values, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeBetween(Date value1, Date value2) {
            addCriterion("begin_time between", value1, value2, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeNotBetween(Date value1, Date value2) {
            addCriterion("begin_time not between", value1, value2, "beginTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria implements Serializable {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion implements Serializable {
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