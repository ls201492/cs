package com.example.demo.export;

import java.util.HashMap;
import java.util.Map;

public enum UserImportColumn {

  ACCOUNT(0, "帐号（手机号）", 2000),

  NAME(1, "姓名", 2000),

  GENDER(2, "性别", 1000),

  IDNUMBER(3, "身份证号", 8000),

  ADDRESS(4, "住址", 12000),

  CONTACTNAME(5, "紧急联系人", 2000),

  CONTACTMOBILE(6, "紧急联系人电话", 2000),

  RECTIFYBEGIN(7, "矫正起始日期", 2000),

  RECTIFYEND(8, "矫正结束日期", 2000),

  RECTIFYLEVEL(9, "矫正级别", 2000),

  CRIMINALTYPE(10, "犯罪类型", 3000),

  ACCUSATION(11, "犯罪罪名", 5000),

  RECTIFYLEARNTYPE(12, "学习类型", 5000),

  COMMUNITYSERVICETYPE(13, "社区服务考核类型", 5000);

  private int idx;
  private String title;
  private int validationType;
  private int columnWidth;

  private Map<Integer, String> columMap = new HashMap<>();

  UserImportColumn(int idx, String title, int width) {
    this.idx = idx;
    this.title = title;
    this.columnWidth = width;
    columMap.put(idx, title);
  }

  public int getIdx() {
    return idx;
  }

  public String getTitle() {
    return title;
  }

  public int getValidationType() {
    return validationType;
  }

  public int getColumnWidth() {
    return columnWidth;
  }

  public Map<Integer, String> getColumMap() {
    return columMap;
  }

}
