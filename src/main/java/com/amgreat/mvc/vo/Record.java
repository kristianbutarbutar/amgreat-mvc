package com.amgreat.mvc.vo;

import com.amgreat.mvc.vo.Columns;

public class Record {
	private Columns[] columns;
	private Record next;
	private int recNo;
	public int getRecNo() { return recNo; }
	public void setRecNo(int recNo) { this.recNo = recNo; }
	public Record getNext() { return next; }
	public void setNext(Record next) { this.next = next; }
	public Columns[] getColumns() { return columns; }
	public void setColumns(Columns[] columns) { this.columns = columns; }
}