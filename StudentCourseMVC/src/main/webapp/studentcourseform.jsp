<%@page import="com.suchiit.model.StudentCourse"%>
<%@page import="com.suchiit.model.Student"%>
<%@page import="java.util.List"%>
<%@page import="com.suchiit.daoimpl.StudentDaoImpl"%>
<%@page import="com.suchiit.dao.StudentDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% StudentDao daoimpl=new StudentDaoImpl();
List<StudentCourse> viewallstudentcourse=daoimpl.viewStudentCourse();
%>
<a href='studentform.jsp'>Back</a>
<table  border="1" width="100%" >
<th>SNAME</th><th>SADD</th><th>SEMAIL</th><th>CNAME</th><th>CDURATION</th><th>CFEE</th>
<% for(StudentCourse s:viewallstudentcourse)
{%>
<tr><td><%=s.getSname()%></td>
<td><%=s.getSadd()%></td>
<td><%=s.getEmail()%></td>
<td><%=s.getCname()%></td>
<td><%=s.getCduration()%></td>
<td><%=s.getCfee()%></td>
<tr>
<% 	
}%>
</table>
</body>
</html>