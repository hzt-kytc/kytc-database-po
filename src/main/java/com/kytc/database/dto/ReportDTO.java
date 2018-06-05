package com.kytc.database.dto;

public class ReportDTO {
	private String category;
	private String title;
	private String subTitle;
	private Double value;
	private String xTitle;
	private String yTitle;
	private String xList;
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Double getValue() {
		return value;
	}
	public void setValue(Double value) {
		this.value = value;
	}
	public String getSubTitle() {
		return subTitle;
	}
	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}
	public String getxTitle() {
		return xTitle;
	}
	public void setxTitle(String xTitle) {
		this.xTitle = xTitle;
	}
	public String getyTitle() {
		return yTitle;
	}
	public void setyTitle(String yTitle) {
		this.yTitle = yTitle;
	}
	public String getxList() {
		return xList;
	}
	public void setxList(String xList) {
		this.xList = xList;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ReportDTO [category=");
		builder.append(category);
		builder.append(", title=");
		builder.append(title);
		builder.append(", subTitle=");
		builder.append(subTitle);
		builder.append(", value=");
		builder.append(value);
		builder.append(", xTitle=");
		builder.append(xTitle);
		builder.append(", yTitle=");
		builder.append(yTitle);
		builder.append(", xList=");
		builder.append(xList);
		builder.append("]");
		return builder.toString();
	}
}
