package com.suchiit.query;

public interface QueryConstant {
 String SELECT_U_PWD="select * from user where email=? and pwd=?";
String INSERT_USER="insert into user values (?,?,?,?,?,?)";
String SELECT_PWD="select pwd from user where email=?";

String INSERT_QUERY="insert into product (pname,pqty,pprice) values(?,?,?)";
String SELECT_QUERY="select * from product";
String DELETE_QUERY="delete from product where pid=?";
String SELECT_SPECIFIC_QUERY="select * from product where pid=?";
String UPDATE_QUERY="update product set pname=?,pqty=?,pprice=? where pid=?";
}
