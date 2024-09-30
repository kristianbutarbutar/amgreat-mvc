package com.amgreat.mvc.vo;

public class PageVO {
	private String id;
	private String html;
	private String cmdName;
	private String par;
	
	public String getPar() { return par; }
	public void setPar(String par) { this.par = par; }
	public String getId() { return id; }
	public void setId(String id) { this.id = id; }
	public String getHtml() {return html; }
	public void setHtml(String html) { this.html = html; }
	public String getCmdName() { return cmdName; }
	public void setCmdName(String cmdName) { this.cmdName = cmdName; }
	private String selective;
	public String getSelective() { return selective; }
	public void setSelective(String selective) { this.selective = selective; }
}
