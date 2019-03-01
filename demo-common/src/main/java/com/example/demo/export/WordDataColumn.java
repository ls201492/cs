package com.example.demo.export;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordDataColumn {

  private Map<String, Object> datas = new HashMap<>(5);
  private List<Map<String,String>> tables = new ArrayList<>();

  public Map<String, Object> getDatas() {
    return datas;
  }

  public void setDatas(Map<String, Object> datas) {
    this.datas = datas;
  }

  public List<Map<String,String>> getTables() {
    return tables;
  }

  public void setTables(List<Map<String,String>> tables) {
    this.tables = tables;
  }
}
