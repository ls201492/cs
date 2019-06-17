package com.example.demo.common.entity.auto;

import java.io.Serializable;
import java.util.Date;

public class ZyCaseProspectingUser implements Serializable {
    private Integer id;

    private Long userId;

    private Integer prospectingId;

    private Date addTime;

    private Long addUid;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getProspectingId() {
        return prospectingId;
    }

    public void setProspectingId(Integer prospectingId) {
        this.prospectingId = prospectingId;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", prospectingId=").append(prospectingId);
        sb.append(", addTime=").append(addTime);
        sb.append(", addUid=").append(addUid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    private ZyCaseProspectingUser(Builder b) {
        id = b.id;
        userId = b.userId;
        prospectingId = b.prospectingId;
        addTime = b.addTime;
        addUid = b.addUid;
    }

    public ZyCaseProspectingUser() {
        super();
    }

    public static class Builder {
        private Integer id;

        private Long userId;

        private Integer prospectingId;

        private Date addTime;

        private Long addUid;

        public Builder id(Integer id) {
            this.id = id;
            return this;
        }

        public Builder userId(Long userId) {
            this.userId = userId;
            return this;
        }

        public Builder prospectingId(Integer prospectingId) {
            this.prospectingId = prospectingId;
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

        public ZyCaseProspectingUser build() {
            return new ZyCaseProspectingUser(this);
        }
    }
}