package com.kytc.database.po;

import com.kytc.po.BasePO;

public class QueryPO extends BasePO{
	private String    content;                  //查询语句
	private String    title;                //标题
	private Integer   sortNum;              //排序号
	public void setContent(String content){
		this.content = content;
	}
	public String getContent(){
		return this.content;
	}
	public void setTitle(String title){
		this.title = title;
	}
	public String getTitle(){
		return this.title;
	}
	public void setSortNum(Integer sortNum){
		this.sortNum = sortNum;
	}
	public Integer getSortNum(){
		return this.sortNum;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("QueryPO [content=");
		builder.append(content);
		builder.append(", title=");
		builder.append(title);
		builder.append(", sortNum=");
		builder.append(sortNum);
		builder.append(", id=");
		builder.append(id);
		builder.append(", gmtCreate=");
		builder.append(gmtCreate);
		builder.append(", gmtModified=");
		builder.append(gmtModified);
		builder.append("]");
		return builder.toString();
	}
}