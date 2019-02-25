package com.example.demo.httpbeans.response;

public class HttpResp {

  /**
   * http 响应码
   */
  private int httpCode = 200;

  /**
   * 响应结果
   */
  private String data;

  public int getHttpCode() {
    return httpCode;
  }

  public void setHttpCode(int httpCode) {
    this.httpCode = httpCode;
  }

  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("HttpResp{");
    sb.append("httpCode=").append(httpCode);
    sb.append(", data='").append(data).append('\'');
    sb.append('}');
    return sb.toString();
  }
}
