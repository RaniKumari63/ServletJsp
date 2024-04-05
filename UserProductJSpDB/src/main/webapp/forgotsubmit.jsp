<%@page import="com.suchiit.daoimpl.UserDaoImpl"%>
<%@page import="com.suchiit.dao.UserDao"%>
<%!String email;
String password;
UserDao userdaoimpl;
%>
<%
userdaoimpl=new UserDaoImpl();
email=request.getParameter("email");
password=userdaoimpl.getPassword(email);
if(password.equals("null"))
{
	out.println("Please Enter Valid Email");
	out.println("<a href='Login.jsp'>Login</a>");
	
}
else
{ out.println("<html>");
out.println("<body>");
out.println("<h3 style='color:blue;' > Password is</h3>"+password);
out.println("<a href='Login.jsp'>Login</a>");
out.println("</body>");
out.println("</html>");

}

%>