package com.example.demo.export;

import java.util.HashMap;
import java.util.Map;

public class DataRow {
	
	public DataRow() {
		row = new HashMap<String, Object>();
	}

	private Map<String, Object> row;
	
	public String loadStringValue(String key){
		return (String)row.get(key);
	}
	
	public Object loadValue(String key){
		return row.get(key);
	}
	
	public Long loadLongValue(String key){
		return (Long)row.get(key);
	}
	
	public Integer loadIntValue(String key){
		return (Integer)row.get(key);
	}
	
	public Double loadDoubleValue(String key){
		return (Double)row.get(key);
	}
	
	public void put(String key, Object value) {
		row.put(key, value);
	}

	public Map<String, Object> getRow() {
		return row;
	}

	public void setRow(Map<String, Object> row) {
		this.row = row;
	}
}
