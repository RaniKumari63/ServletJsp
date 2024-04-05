
<%@page import="com.suchiit.model.Course"%>
<%@page import="com.suchiit.daoimpl.CourseDaoImpl"%>
<%@page import="com.suchiit.dao.CourseDao"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%!CourseDao daoimpl;
int cid;
Course c;
%>

<%
cid=Integer.parseInt(request.getParameter("cid"));
daoimpl=new CourseDaoImpl();

c=daoimpl.viewCourse(cid);

%>
<html>
<body>

<a href='courseform.jsp'>Back</a>
<table  border="1" width="100%" >
<th>CID</th><th>CNAME</th><th>CDURATION</th><th>CFEE</th>
<tr><td><%=c.getCid()%></td>
<td><%=c.getCname()%></td>
<td><%=c.getCduration()%></td>
<td><%=c.getCfee()%></td>

<tr>
