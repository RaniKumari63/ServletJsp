
<%@page import="com.suchiit.model.Course"%>
<%@page import="com.suchiit.daoimpl.CourseDaoImpl"%>
<%@page import="com.suchiit.dao.CourseDao"%>
<%@page import="java.util.List"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% CourseDao daoimpl=new CourseDaoImpl();
List<Course> viewallcourses=daoimpl.viewCourses();
%>
<a href='courseform.jsp'>Back</a>
<table  border="1" width="100%" >
<th>CID</th><th>CNAME</th><th>CDURATION</th><th>CFEE</th>
<% for(Course c:viewallcourses)
{%>
<tr><td><%=c.getCid()%></td>
<td><%=c.getCname()%></td>
<td><%=c.getCduration()%></td>
<td><%=c.getCfee()%></td>

<tr>
<% 	
}%>
</table>
</body>
</html>