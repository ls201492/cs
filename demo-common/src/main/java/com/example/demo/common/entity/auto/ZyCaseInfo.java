package com.example.demo.common.entity.auto;

import java.io.Serializable;
import java.util.Date;

public class ZyCaseInfo implements Serializable {
    private Integer caseId;

    private String caseNo;

    private String caseName;

    private Integer level;

    private Integer prospectingId;

    private Integer status;

    private Integer showExample;

    private Integer areaId;

    private Date beginTime;

    private Date endTime;

    private Date addTime;

    private Long addUid;

    private Date lastUpdate;

    private Long lastUpdateUid;

    private String remark;

    private static final long serialVersionUID = 1L;

    public Integer getCaseId() {
        return caseId;
    }

    public void setCaseId(Integer caseId) {
        this.caseId = caseId;
    }

    public String getCaseNo() {
        return caseNo;
    }

    public void setCaseNo(String caseNo) {
        this.caseNo = caseNo == null ? null : caseNo.trim();
    }

    public String getCaseName() {
        return caseName;
    }

    public void setCaseName(String caseName) {
        this.caseName = caseName == null ? null : caseName.trim();
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getProspectingId() {
        return prospectingId;
    }

    public void setProspectingId(Integer prospectingId) {
        this.prospectingId = prospectingId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getShowExample() {
        return showExample;
    }

    public void setShowExample(Integer showExample) {
        this.showExample = showExample;
    }

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
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

    public Long getLastUpdateUid() {
        return lastUpdateUid;
    }

    public void setLastUpdateUid(Long lastUpdateUid) {
        this.lastUpdateUid = lastUpdateUid;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", caseId=").append(caseId);
        sb.append(", caseNo=").append(caseNo);
        sb.append(", caseName=").append(caseName);
        sb.append(", level=").append(level);
        sb.append(", prospectingId=").append(prospectingId);
        sb.append(", status=").append(status);
        sb.append(", showExample=").append(showExample);
        sb.append(", areaId=").append(areaId);
        sb.append(", beginTime=").append(beginTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", addTime=").append(addTime);
        sb.append(", addUid=").append(addUid);
        sb.append(", lastUpdate=").append(lastUpdate);
        sb.append(", lastUpdateUid=").append(lastUpdateUid);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    private ZyCaseInfo(Builder b) {
        caseId = b.caseId;
        caseNo = b.caseNo;
        caseName = b.caseName;
        level = b.level;
        prospectingId = b.prospectingId;
        status = b.status;
        showExample = b.showExample;
        areaId = b.areaId;
        beginTime = b.beginTime;
        endTime = b.endTime;
        addTime = b.addTime;
        addUid = b.addUid;
        lastUpdate = b.lastUpdate;
        lastUpdateUid = b.lastUpdateUid;
        remark = b.remark;
    }

    public ZyCaseInfo() {
        super();
    }

    public static class Builder {
        private Integer caseId;

        private String caseNo;

        private String caseName;

        private Integer level;

        private Integer prospectingId;

        private Integer status;

        private Integer showExample;

        private Integer areaId;

        private Date beginTime;

        private Date endTime;

        private Date addTime;

        private Long addUid;

        private Date lastUpdate;

        private Long lastUpdateUid;

        private String remark;

        public Builder caseId(Integer caseId) {
            this.caseId = caseId;
            return this;
        }

        public Builder caseNo(String caseNo) {
            this.caseNo = caseNo;
            return this;
        }

        public Builder caseName(String caseName) {
            this.caseName = caseName;
            return this;
        }

        public Builder level(Integer level) {
            this.level = level;
            return this;
        }

        public Builder prospectingId(Integer prospectingId) {
            this.prospectingId = prospectingId;
            return this;
        }

        public Builder status(Integer status) {
            this.status = status;
            return this;
        }

        public Builder showExample(Integer showExample) {
            this.showExample = showExample;
            return this;
        }

        public Builder areaId(Integer areaId) {
            this.areaId = areaId;
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

        public Builder lastUpdateUid(Long lastUpdateUid) {
            this.lastUpdateUid = lastUpdateUid;
            return this;
        }

        public Builder remark(String remark) {
            this.remark = remark;
            return this;
        }

        public ZyCaseInfo build() {
            return new ZyCaseInfo(this);
        }
    }
}