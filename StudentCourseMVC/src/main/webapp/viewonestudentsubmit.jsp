

<%@page import="com.suchiit.daoimpl.StudentDaoImpl"%>
<%@page import="com.suchiit.model.Student"%>
<%@page import="com.suchiit.dao.StudentDao"%>
<%@page import="java.util.List"%>

<%! StudentDao daoimpl;
int sid;
Student s;
%>

<%
sid=Integer.parseInt(request.getParameter("sid"));
daoimpl=new StudentDaoImpl();

s=daoimpl.viewStudent(sid);

%>
<html>
<body>

<a href='studentform.jsp'>Back</a>
<table  border="1" width="100%" >
<th>SID</th><th>SNAME</th><th>SEMAIL</th><th>SADD</th><th>CID</th>

<tr><td><%=s.getSid()%></td>
<td><%=s.getSname()%></td>
<td><%=s.getEmail()%></td>
<td><%=s.getSadd()%></td>
<td><%=s.getCid()%></td>
<tr>

</table>
</body>
</html>
