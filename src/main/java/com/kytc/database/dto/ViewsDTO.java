package com.kytc.database.dto;

public class ViewsDTO {
	private String tableCatalog;
	private String tableSchema;
	private String tableName;
	private String viewDefinition;
	private String checkOption;
	private String updatable;
	private String definer;
	private String securityType;
	private String characterSetClient;
	private String collationConnection;
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
	public String getViewDefinition() {
		return viewDefinition;
	}
	public void setViewDefinition(String viewDefinition) {
		this.viewDefinition = viewDefinition;
	}
	public String getCheckOption() {
		return checkOption;
	}
	public void setCheckOption(String checkOption) {
		this.checkOption = checkOption;
	}
	public String getUpdatable() {
		return updatable;
	}
	public void setUpdatable(String updatable) {
		this.updatable = updatable;
	}
	public String getDefiner() {
		return definer;
	}
	public void setDefiner(String definer) {
		this.definer = definer;
	}
	public String getSecurityType() {
		return securityType;
	}
	public void setSecurityType(String securityType) {
		this.securityType = securityType;
	}
	public String getCharacterSetClient() {
		return characterSetClient;
	}
	public void setCharacterSetClient(String characterSetClient) {
		this.characterSetClient = characterSetClient;
	}
	public String getCollationConnection() {
		return collationConnection;
	}
	public void setCollationConnection(String collationConnection) {
		this.collationConnection = collationConnection;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ViewsDTO [tableCatalog=");
		builder.append(tableCatalog);
		builder.append(", tableSchema=");
		builder.append(tableSchema);
		builder.append(", tableName=");
		builder.append(tableName);
		builder.append(", viewDefinition=");
		builder.append(viewDefinition);
		builder.append(", checkOption=");
		builder.append(checkOption);
		builder.append(", updatable=");
		builder.append(updatable);
		builder.append(", definer=");
		builder.append(definer);
		builder.append(", securityType=");
		builder.append(securityType);
		builder.append(", characterSetClient=");
		builder.append(characterSetClient);
		builder.append(", collationConnection=");
		builder.append(collationConnection);
		builder.append("]");
		return builder.toString();
	}
}
