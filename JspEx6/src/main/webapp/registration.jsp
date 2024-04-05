<%@page import="com.suchiit.config.ConnectionManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>

<%!
String uname;
String upwd;
String uemail;
long umobile;
Connection con;
PreparedStatement ps;
ResultSet rs;

%>
<%

try{
	uname=request.getParameter("uname");
	upwd=request.getParameter("upwd");
	uemail=request.getParameter("uemail");
	umobile=Long.parseLong(request.getParameter("umobile"));
	session.setAttribute("operation","Registration");
con=ConnectionManager.getConnection();
ps=con.prepareStatement("select * from reg_user where uname=?");
ps.setString(1,uname);
rs=ps.executeQuery();
boolean b=rs.next();
RequestDispatcher requestDispatcher=null;
if(b==true)
{
	requestDispatcher=application.getRequestDispatcher("/existed.jsp");
	requestDispatcher.forward(request, response);

}
else{

ps=con.prepareStatement("insert into reg_user (uname,upwd,uemail,umobile) values(?,?,?,?)");


ps.setString(1,uname);
ps.setString(2,upwd);
ps.setString(3,uemail);
ps.setLong(4,umobile);
int rowCount=ps.executeUpdate();

if(rowCount!=0)

{
requestDispatcher=application.getRequestDispatcher("/success.jsp");
requestDispatcher.forward(request, response);
	
}
else
{requestDispatcher=application.getRequestDispatcher("/failure.jsp");
requestDispatcher.forward(request, response);


	
}
}
}
catch(Exception e)
{e.printStackTrace();
	
}
%>