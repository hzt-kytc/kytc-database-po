package com.kytc.database.vo;

import com.kytc.vo.BaseVO;

public class QueryVO extends BaseVO {
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("QueryVO [getId()=");
		builder.append(getId());
		builder.append(", getPage()=");
		builder.append(getPage());
		builder.append(", getRows()=");
		builder.append(getRows());
		builder.append(", getSort()=");
		builder.append(getSort());
		builder.append(", getOrder()=");
		builder.append(getOrder());
		builder.append(", getStart()=");
		builder.append(getStart());
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append(", getClass()=");
		builder.append(getClass());
		builder.append(", hashCode()=");
		builder.append(hashCode());
		builder.append("]");
		return builder.toString();
	}
}