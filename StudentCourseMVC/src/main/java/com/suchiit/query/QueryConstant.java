package com.suchiit.query;

public interface QueryConstant {
String INSERT_COURSE_QUERY="insert into course(cname,cduration,cfee) values(?,?,?)";
String SELECT_COURSE_QUERY="select * from course";
String SELECT_COURSE_SPECIFIC_QUERY="select * from course where cid=?";
String INSERT_STUDENT_QUERY="insert into student1(sadd,email,sname,cid) values(?,?,?,?)";
String SELECT_STUDENT_QUERY="select * from student1";
String SELECT_STUDENT_SPECIFIC_QUERY="select * from student1 where sid=?";
String SELECT_STUDENT_COURSE_QUERY="select s.sname,s.sadd,s.email,c.cname,c.cduration,c.cfee from student1 s ,course c where s.cid=c.cid";
}
