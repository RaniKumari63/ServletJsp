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
List<Student> viewallstudents=daoimpl.viewStudents();
%>
<a href='studentform.jsp'>Back</a>
<table  border="1" width="100%" >
<th>SID</th><th>SNAME</th><th>SEMAIL</th><th>SADD</th><th>CID</th>
<% for(Student s:viewallstudents)
{%>
<tr><td><%=s.getSid()%></td>
<td><%=s.getSname()%></td>
<td><%=s.getEmail()%></td>
<td><%=s.getSadd()%></td>
<td><%=s.getCid()%></td>
<tr>
<% 	
}%>
</table>
</body>
</html>