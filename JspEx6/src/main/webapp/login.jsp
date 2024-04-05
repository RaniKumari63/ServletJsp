<%@page import="com.suchiit.config.ConnectionManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>

<%!
String uname;
String upwd;
Connection con;
PreparedStatement ps;
ResultSet rs;

%>
<%

try{
	uname=request.getParameter("uname");
	upwd=request.getParameter("upwd");
	session.setAttribute("operation","Login");
con=ConnectionManager.getConnection();

ps=con.prepareStatement("select * from reg_user where uname=? and upwd=?");

ps.setString(1,uname);
ps.setString(2,upwd);
rs=ps.executeQuery();
boolean b=rs.next();

RequestDispatcher requestDispatcher=null;
if(b==true)
{
	requestDispatcher=application.getRequestDispatcher("/success.jsp");
requestDispatcher.forward(request, response);

}
else
{requestDispatcher=application.getRequestDispatcher("/failure.jsp");
requestDispatcher.forward(request, response);
	
}
}
catch(Exception e)
{e.printStackTrace();
	
}
%>