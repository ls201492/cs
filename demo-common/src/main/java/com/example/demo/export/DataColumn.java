package com.example.demo.export;

import java.util.HashMap;
import java.util.Map;

public class DataColumn {
	/**
	 * 列表宽
	 */
	private int colWidth;

	public DataColumn() {
		col = new HashMap<String, Object>();
	}

	private Map<String, Object> col;

	public String getString(String key) {
		return (String) col.get(key);
	}

	public Object getValue(String key) {
		return col.get(key);
	}

	public Long getLong(String key) {
		return (Long) col.get(key);
	}

	public Integer getInt(String key) {
		return (Integer) col.get(key);
	}

	public Double getDouble(String key) {
		return (Double) col.get(key);
	}

	public void put(String key, Object value) {
		col.put(key, value);
	}

	/**
	 * @return the colWidth
	 */
	public int getColWidth() {
		return colWidth;
	}

	/**
	 * @param colWidth
	 *            the colWidth to set
	 */
	public void setColWidth(int colWidth) {
		this.colWidth = colWidth;
	}

	/**
	 * @return the col
	 */
	public Map<String, Object> getCol() {
		return col;
	}

	/**
	 * @param col
	 *            the col to set
	 */
	public void setCol(Map<String, Object> col) {
		this.col = col;
	}

}
