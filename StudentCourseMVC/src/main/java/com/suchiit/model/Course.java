package com.suchiit.model;

public class Course {
private int cid;
private String cname;
private String cduration;
private long cfee;
public Course() {
	super();
	// TODO Auto-generated constructor stub
}
public Course(int cid, String cname, String cduration, long cfee) {
	super();
	this.cid = cid;
	this.cname = cname;
	this.cduration = cduration;
	this.cfee = cfee;
}
public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public Course(String cname, String cduration, long cfee) {
	super();
	this.cname = cname;
	this.cduration = cduration;
	this.cfee = cfee;
}
public String getCduration() {
	return cduration;
}
public void setCduration(String cduration) {
	this.cduration = cduration;
}
public long getCfee() {
	return cfee;
}
public void setCfee(long cfee) {
	this.cfee = cfee;
}
}
