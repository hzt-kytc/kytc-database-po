package com.kytc.database.vo;

import com.kytc.vo.BaseVO;

public class TableVO extends BaseVO {
	private String database;
	private String tableName;
	private String columnName;
	private String columnValue;
	public String getDatabase() {
		return database;
	}
	public void setDatabase(String database) {
		this.database = database;
	}
	public String getTableName() {
		return tableName;
	}
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
	public String getColumnName() {
		return columnName;
	}
	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}
	public String getColumnValue() {
		return columnValue;
	}
	public void setColumnValue(String columnValue) {
		this.columnValue = columnValue;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TableVO [database=");
		builder.append(database);
		builder.append(", tableName=");
		builder.append(tableName);
		builder.append(", columnName=");
		builder.append(columnName);
		builder.append(", columnValue=");
		builder.append(columnValue);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
}
