package com.suchiit.model;

public class User {
private int uid;
private String fname;
private String lname;
private  String email;
private long mobilenumber;

private String pwd;

public int getUid() {
	return uid;
}

public void setUid(int uid) {
	this.uid = uid;
}

public String getFname() {
	return fname;
}

public void setFname(String fname) {
	this.fname = fname;
}

public String getLname() {
	return lname;
}

public void setLname(String lname) {
	this.lname = lname;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public long getMobilenumber() {
	return mobilenumber;
}

public void setMobilenumber(long mobilenumber) {
	this.mobilenumber = mobilenumber;
}

public String getPwd() {
	return pwd;
}

public void setPwd(String pwd) {
	this.pwd = pwd;
}

public User(int uid, String fname, String lname, String email, long mobilenumber, String pwd) {
	super();
	this.uid = uid;
	this.fname = fname;
	this.lname = lname;
	this.email = email;
	this.mobilenumber = mobilenumber;
	this.pwd = pwd;
}

public User() {
	super();
	// TODO Auto-generated constructor stub
}


}

