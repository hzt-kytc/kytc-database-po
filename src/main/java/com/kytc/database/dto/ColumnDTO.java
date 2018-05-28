package com.kytc.database.dto;


public class ColumnDTO {
	private String tableCatalog;
	private String tableSchema;
	private String tableName;
	private String columnName;
	private String ordinalPosition;
	private String columnDefault;
	private String nullable;
	private String dataType;
	private Long characterMaximumLength;
	private Long characterOctetLength;
	private Integer numericPrecision;
	private Integer numericScale;
	private Integer datetimePrecision;
	private String characterSetName;
	private String collationName;
	private String columnType;
	private String columnKey;
	private String extra;
	private String privileges;
	private String columnComment;
	private String javaName;
	public String getTableCatalog() {
		return tableCatalog;
	}
	public void setTableCatalog(String tableCatalog) {
		this.tableCatalog = tableCatalog;
	}
	public String getTableSchema() {
		return tableSchema;
	}
	public void setTableSchema(String tableSchema) {
		this.tableSchema = tableSchema;
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
	public String getOrdinalPosition() {
		return ordinalPosition;
	}
	public void setOrdinalPosition(String ordinalPosition) {
		this.ordinalPosition = ordinalPosition;
	}
	public String getColumnDefault() {
		return columnDefault;
	}
	public void setColumnDefault(String columnDefault) {
		this.columnDefault = columnDefault;
	}
	public String getNullable() {
		return nullable;
	}
	public void setNullable(String nullable) {
		this.nullable = nullable;
	}
	public String getDataType() {
		return dataType;
	}
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}
	public Long getCharacterMaximumLength() {
		return characterMaximumLength;
	}
	public void setCharacterMaximumLength(Long characterMaximumLength) {
		this.characterMaximumLength = characterMaximumLength;
	}
	public Long getCharacterOctetLength() {
		return characterOctetLength;
	}
	public void setCharacterOctetLength(Long characterOctetLength) {
		this.characterOctetLength = characterOctetLength;
	}
	public Integer getNumericPrecision() {
		return numericPrecision;
	}
	public void setNumericPrecision(Integer numericPrecision) {
		this.numericPrecision = numericPrecision;
	}
	public Integer getNumericScale() {
		return numericScale;
	}
	public void setNumericScale(Integer numericScale) {
		this.numericScale = numericScale;
	}
	public Integer getDatetimePrecision() {
		return datetimePrecision;
	}
	public void setDatetimePrecision(Integer datetimePrecision) {
		this.datetimePrecision = datetimePrecision;
	}
	public String getCharacterSetName() {
		return characterSetName;
	}
	public void setCharacterSetName(String characterSetName) {
		this.characterSetName = characterSetName;
	}
	public String getCollationName() {
		return collationName;
	}
	public void setCollationName(String collationName) {
		this.collationName = collationName;
	}
	public String getColumnType() {
		return columnType;
	}
	public void setColumnType(String columnType) {
		this.columnType = columnType;
	}
	public String getColumnKey() {
		return columnKey;
	}
	public void setColumnKey(String columnKey) {
		this.columnKey = columnKey;
	}
	public String getExtra() {
		return extra;
	}
	public void setExtra(String extra) {
		this.extra = extra;
	}
	public String getPrivileges() {
		return privileges;
	}
	public void setPrivileges(String privileges) {
		this.privileges = privileges;
	}
	public String getColumnComment() {
		return columnComment;
	}
	public void setColumnComment(String columnComment) {
		this.columnComment = columnComment;
	}
	public String getJavaName() {
		return javaName;
	}
	public void setJavaName(String javaName) {
		this.javaName = javaName;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ColumnDTO [tableCatalog=");
		builder.append(tableCatalog);
		builder.append(", tableSchema=");
		builder.append(tableSchema);
		builder.append(", tableName=");
		builder.append(tableName);
		builder.append(", columnName=");
		builder.append(columnName);
		builder.append(", ordinalPosition=");
		builder.append(ordinalPosition);
		builder.append(", columnDefault=");
		builder.append(columnDefault);
		builder.append(", nullable=");
		builder.append(nullable);
		builder.append(", dataType=");
		builder.append(dataType);
		builder.append(", characterMaximumLength=");
		builder.append(characterMaximumLength);
		builder.append(", characterOctetLength=");
		builder.append(characterOctetLength);
		builder.append(", numericPrecision=");
		builder.append(numericPrecision);
		builder.append(", numericScale=");
		builder.append(numericScale);
		builder.append(", datetimePrecision=");
		builder.append(datetimePrecision);
		builder.append(", characterSetName=");
		builder.append(characterSetName);
		builder.append(", collationName=");
		builder.append(collationName);
		builder.append(", columnType=");
		builder.append(columnType);
		builder.append(", columnKey=");
		builder.append(columnKey);
		builder.append(", extra=");
		builder.append(extra);
		builder.append(", privileges=");
		builder.append(privileges);
		builder.append(", columnComment=");
		builder.append(columnComment);
		builder.append(", javaName=");
		builder.append(javaName);
		builder.append("]");
		return builder.toString();
	}
}
