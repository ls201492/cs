package com.example.demo.export;

public class Caption {

	public final static int TYPE_STRING = 1;
	public final static int TYPE_INT = 2;
	public final static int TYPE_DOUBLE = 3;
	public final static int TYPE_DATE = 4;
	public final static int ALIGN_LEFT = 1;
	public final static int ALIGN_RIGHT = 2;
	public final static int ALIGN_CENTER = 3;
	public final static String IMAGE = "IMAGE";

	public Caption() {
	}

	public Caption(String name, String property, Integer type, Integer width) {
		this.name = name;
		this.property = property;
		this.type = Caption.TYPE_STRING;
		this.width = 10000;
		this.align = ALIGN_CENTER;
	}

	public Caption(String name, String property, Integer type, Integer width, Integer align) {
		this.name = name;
		this.property = property;
		this.type = Caption.TYPE_STRING;
		this.width = width;
		this.align = Caption.ALIGN_CENTER;
	}

	private String name;
	private String property;
	private Integer width;
	private Integer type;
	private Integer align;
	/**
	 * 主要针对图片类型:Image,其他类型自型扩展 (yuliangsong 2017-09-21)
	 */
	private String dataType;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProperty() {
		return property;
	}

	public void setProperty(String property) {
		this.property = property;
	}

	public Integer getWidth() {
		return width;
	}

	public void setWidth(Integer width) {
		this.width = width;
	}

	public Integer getAlign() {
		return align;
	}

	public void setAlign(Integer align) {
		this.align = align;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	/**
	 * @return the dataType
	 */
	public String getDataType() {
		return dataType;
	}

	/**
	 * @param dataType
	 *            the dataType to set
	 */
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

}
