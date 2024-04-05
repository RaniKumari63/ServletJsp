package com.suchiit.model;

public class Product {
private int pid;
private String pname;
private int pqty;
private  int pprice;
public Product() {
	super();
	// TODO Auto-generated constructor stub
}
public Product( String pname, int pqty, int pprice) {
	super();
	
	this.pname = pname;
	this.pqty = pqty;
	this.pprice = pprice;
}
public Product(int pid, String pname, int pqty, int pprice) {
	super();
	this.pid = pid;
	this.pname = pname;
	this.pqty = pqty;
	this.pprice = pprice;
}
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public int getPqty() {
	return pqty;
}
public void setPqty(int pqty) {
	this.pqty = pqty;
}
public int getPprice() {
	return pprice;
}
public void setPprice(int pprice) {
	this.pprice = pprice;
}
}
