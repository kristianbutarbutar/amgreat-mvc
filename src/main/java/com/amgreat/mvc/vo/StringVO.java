package com.amgreat.mvc.vo;

public class StringVO extends StatusVO {
	private String row;
	private StringVO[] rows;
	private String targetId;
	public String getTargetId() { return targetId; }
	public void setTargetId(String targetId) { this.targetId = targetId; }
	public String getRow() { return row; }
	public void setRow(String row) { this.row = row; }
	public StringVO[] getRows() { return rows; }
	public void setRows(StringVO[] rows) { this.rows = rows; }
}
