package com.example.demo.common.bean.request;

public class BaseRequest {


  private Long userId;

  private Long userAreaId;

  public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }

  public Long getUserAreaId() {
    return userAreaId;
  }

  public void setUserAreaId(Long userAreaId) {
    this.userAreaId = userAreaId;
  }
}
