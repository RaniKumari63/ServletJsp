<%@page import="com.suchiit.dao.*,com.suchiit.daoimpl.*" %>
<%! String uname;
String pwd;
boolean flag;
UserDao userdaoimpl=new UserDaoImpl();
RequestDispatcher requestDispatcher=null;

%>


<%
uname=request.getParameter("email");
pwd=request.getParameter("pwd");
flag=userdaoimpl.validEmailAndPassWord(uname, pwd);

if(flag==true)
{
	requestDispatcher=request.getRequestDispatcher("/productdisplay.jsp");
	requestDispatcher.include(request, response);
}
else
{out.println("<html>");
out.println("<body>");
out.println("<h3 style='color:blue;' >Login Failure</h3>");
out.println("<h2 style='color:blue;' >Please Enter Valid Username and Password</h2>");

out.println("<a href='Login.jsp'>Login</a>");
}
%>