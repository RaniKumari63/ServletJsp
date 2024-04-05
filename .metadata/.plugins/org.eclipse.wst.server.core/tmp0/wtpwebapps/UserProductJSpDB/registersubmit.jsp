<%@page import="com.suchiit.dao.UserDao"%>
<%@page import="com.suchiit.daoimpl.UserDaoImpl"%>
<%@page import="com.suchiit.model.User"%>
<%!
UserDao userdaoimpl;
int uid;

String uname;
String password;

String fname;
String lname;
long mobilenumber;
User user;
boolean flag;%>


<%
userdaoimpl=new UserDaoImpl();
uid=Integer.parseInt(request.getParameter("uid"));
 uname=request.getParameter("uname");
password=request.getParameter("pwd");
fname=request.getParameter("fname");
lname=request.getParameter("lname");
mobilenumber=Long.parseLong(request.getParameter("mobilenumber"));
user=new User(uid,fname,lname,uname,mobilenumber,password);
flag=userdaoimpl.register(user);
out.println("<html>");
out.println("<body>");
if(flag)
{    
	out.println("<h3 style='color:blue;' >User Account Created</h3>");
	
	
	
	out.println("<a href='Login.jsp' >Login</a>");
}
else
{
	out.println("<h3 style='color:blue;'>Unable toCreate Account</h3>");
	
	
	
	
	out.println("<a href='register.jsp'>Registration</a>");
}


%>