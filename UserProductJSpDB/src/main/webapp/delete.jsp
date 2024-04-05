<%@page import="com.suchiit.daoimpl.Productdaoimpl"%>
<%@page import="com.suchiit.dao.ProductDao"%>
<%!
int pid;
ProductDao daoimpl;
RequestDispatcher requestDispatcher;
%>
<%
 pid=Integer.parseInt(request.getParameter("pid"));
 daoimpl=new Productdaoimpl();
daoimpl.deleteProduct(pid);



requestDispatcher=request.getRequestDispatcher("/view.jsp");
requestDispatcher.forward(request, response);
 




%>