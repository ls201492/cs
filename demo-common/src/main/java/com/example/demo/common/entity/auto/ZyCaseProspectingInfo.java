package com.example.demo.common.entity.auto;

import java.io.Serializable;
import java.util.Date;

public class ZyCaseProspectingInfo implements Serializable {
    private Integer prospectingId;

    private Integer caseId;

    private String undertakeUnit;

    private String address;

    private String plan;

    private String temperature;

    private String weather;

    private String humidity;

    private String ray;

    private String sceneDesc;

    private Long sceneMapFileId;

    private Integer sampleFlowType;

    private String sampleFlowRemark2;

    private String signatures;

    private String witness;

    private Date addTime;

    private Long addUid;

    private Date lastUpdate;

    private Date beginTime;

    private Date endTime;

    private String sampleFlowRemark1;

    private static final long serialVersionUID = 1L;

    public Integer getProspectingId() {
        return prospectingId;
    }

    public void setProspectingId(Integer prospectingId) {
        this.prospectingId = prospectingId;
    }

    public Integer getCaseId() {
        return caseId;
    }

    public void setCaseId(Integer caseId) {
        this.caseId = caseId;
    }

    public String getUndertakeUnit() {
        return undertakeUnit;
    }

    public void setUndertakeUnit(String undertakeUnit) {
        this.undertakeUnit = undertakeUnit == null ? null : undertakeUnit.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan == null ? null : plan.trim();
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature == null ? null : temperature.trim();
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather == null ? null : weather.trim();
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity == null ? null : humidity.trim();
    }

    public String getRay() {
        return ray;
    }

    public void setRay(String ray) {
        this.ray = ray == null ? null : ray.trim();
    }

    public String getSceneDesc() {
        return sceneDesc;
    }

    public void setSceneDesc(String sceneDesc) {
        this.sceneDesc = sceneDesc == null ? null : sceneDesc.trim();
    }

    public Long getSceneMapFileId() {
        return sceneMapFileId;
    }

    public void setSceneMapFileId(Long sceneMapFileId) {
        this.sceneMapFileId = sceneMapFileId;
    }

    public Integer getSampleFlowType() {
        return sampleFlowType;
    }

    public void setSampleFlowType(Integer sampleFlowType) {
        this.sampleFlowType = sampleFlowType;
    }

    public String getSampleFlowRemark2() {
        return sampleFlowRemark2;
    }

    public void setSampleFlowRemark2(String sampleFlowRemark2) {
        this.sampleFlowRemark2 = sampleFlowRemark2 == null ? null : sampleFlowRemark2.trim();
    }

    public String getSignatures() {
        return signatures;
    }

    public void setSignatures(String signatures) {
        this.signatures = signatures == null ? null : signatures.trim();
    }

    public String getWitness() {
        return witness;
    }

    public void setWitness(String witness) {
        this.witness = witness == null ? null : witness.trim();
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Long getAddUid() {
        return addUid;
    }

    public void setAddUid(Long addUid) {
        this.addUid = addUid;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getSampleFlowRemark1() {
        return sampleFlowRemark1;
    }

    public void setSampleFlowRemark1(String sampleFlowRemark1) {
        this.sampleFlowRemark1 = sampleFlowRemark1 == null ? null : sampleFlowRemark1.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", prospectingId=").append(prospectingId);
        sb.append(", caseId=").append(caseId);
        sb.append(", undertakeUnit=").append(undertakeUnit);
        sb.append(", address=").append(address);
        sb.append(", plan=").append(plan);
        sb.append(", temperature=").append(temperature);
        sb.append(", weather=").append(weather);
        sb.append(", humidity=").append(humidity);
        sb.append(", ray=").append(ray);
        sb.append(", sceneDesc=").append(sceneDesc);
        sb.append(", sceneMapFileId=").append(sceneMapFileId);
        sb.append(", sampleFlowType=").append(sampleFlowType);
        sb.append(", sampleFlowRemark2=").append(sampleFlowRemark2);
        sb.append(", signatures=").append(signatures);
        sb.append(", witness=").append(witness);
        sb.append(", addTime=").append(addTime);
        sb.append(", addUid=").append(addUid);
        sb.append(", lastUpdate=").append(lastUpdate);
        sb.append(", beginTime=").append(beginTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", sampleFlowRemark1=").append(sampleFlowRemark1);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    private ZyCaseProspectingInfo(Builder b) {
        prospectingId = b.prospectingId;
        caseId = b.caseId;
        undertakeUnit = b.undertakeUnit;
        address = b.address;
        plan = b.plan;
        temperature = b.temperature;
        weather = b.weather;
        humidity = b.humidity;
        ray = b.ray;
        sceneDesc = b.sceneDesc;
        sceneMapFileId = b.sceneMapFileId;
        sampleFlowType = b.sampleFlowType;
        sampleFlowRemark2 = b.sampleFlowRemark2;
        signatures = b.signatures;
        witness = b.witness;
        addTime = b.addTime;
        addUid = b.addUid;
        lastUpdate = b.lastUpdate;
        beginTime = b.beginTime;
        endTime = b.endTime;
        sampleFlowRemark1 = b.sampleFlowRemark1;
    }

    public ZyCaseProspectingInfo() {
        super();
    }

    public static class Builder {
        private Integer prospectingId;

        private Integer caseId;

        private String undertakeUnit;

        private String address;

        private String plan;

        private String temperature;

        private String weather;

        private String humidity;

        private String ray;

        private String sceneDesc;

        private Long sceneMapFileId;

        private Integer sampleFlowType;

        private String sampleFlowRemark2;

        private String signatures;

        private String witness;

        private Date addTime;

        private Long addUid;

        private Date lastUpdate;

        private Date beginTime;

        private Date endTime;

        private String sampleFlowRemark1;

        public Builder prospectingId(Integer prospectingId) {
            this.prospectingId = prospectingId;
            return this;
        }

        public Builder caseId(Integer caseId) {
            this.caseId = caseId;
            return this;
        }

        public Builder undertakeUnit(String undertakeUnit) {
            this.undertakeUnit = undertakeUnit;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Builder plan(String plan) {
            this.plan = plan;
            return this;
        }

        public Builder temperature(String temperature) {
            this.temperature = temperature;
            return this;
        }

        public Builder weather(String weather) {
            this.weather = weather;
            return this;
        }

        public Builder humidity(String humidity) {
            this.humidity = humidity;
            return this;
        }

        public Builder ray(String ray) {
            this.ray = ray;
            return this;
        }

        public Builder sceneDesc(String sceneDesc) {
            this.sceneDesc = sceneDesc;
            return this;
        }

        public Builder sceneMapFileId(Long sceneMapFileId) {
            this.sceneMapFileId = sceneMapFileId;
            return this;
        }

        public Builder sampleFlowType(Integer sampleFlowType) {
            this.sampleFlowType = sampleFlowType;
            return this;
        }

        public Builder sampleFlowRemark2(String sampleFlowRemark2) {
            this.sampleFlowRemark2 = sampleFlowRemark2;
            return this;
        }

        public Builder signatures(String signatures) {
            this.signatures = signatures;
            return this;
        }

        public Builder witness(String witness) {
            this.witness = witness;
            return this;
        }

        public Builder addTime(Date addTime) {
            this.addTime = addTime;
            return this;
        }

        public Builder addUid(Long addUid) {
            this.addUid = addUid;
            return this;
        }

        public Builder lastUpdate(Date lastUpdate) {
            this.lastUpdate = lastUpdate;
            return this;
        }

        public Builder beginTime(Date beginTime) {
            this.beginTime = beginTime;
            return this;
        }

        public Builder endTime(Date endTime) {
            this.endTime = endTime;
            return this;
        }

        public Builder sampleFlowRemark1(String sampleFlowRemark1) {
            this.sampleFlowRemark1 = sampleFlowRemark1;
            return this;
        }

        public ZyCaseProspectingInfo build() {
            return new ZyCaseProspectingInfo(this);
        }
    }
}