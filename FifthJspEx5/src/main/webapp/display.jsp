<%!
int eno;
String ename;
float esal;
String eaddr;
%>
<%
try
{
	eno=Integer.parseInt(request.getParameter("eno"));
	ename=request.getParameter("ename");
	 esal=Float.parseFloat(request.getParameter("esal"));
	 eaddr=request.getParameter("eaddr");

	
}catch(Exception e)
{
	e.printStackTrace();
	
}

%>

<html>
<body>
<center><h1>Employee Details</h1>
</center>
<center>
Employee Id : <%=eno %><br><br>
Employee Name : <%=ename %><br><br>
Employee Salary : <%=esal %><br><br>
Employee Address:<%=eaddr %>
</center>



</body>

</html>