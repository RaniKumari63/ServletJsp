<%@page import="com.suchiit.daoimpl.Productdaoimpl"%>
<%@page import="com.suchiit.dao.ProductDao"%>
<%@page import="com.suchiit.model.Product"%>
<%! int pid;
String pname;
int pqty;
int pprice;
Product product;
ProductDao daoimpl;
RequestDispatcher requestDispatcher;
%>

<%
 pid=Integer.parseInt(request.getParameter("pid"));
pname=request.getParameter("pname");
pqty=Integer.parseInt(request.getParameter("pqty"));
pprice=Integer.parseInt(request.getParameter("pprice"));
product=new Product(pid,pname,pqty,pprice);
ProductDao daoimpl=new Productdaoimpl();
daoimpl.updateProduct(product);


requestDispatcher=request.getRequestDispatcher("view.jsp");
requestDispatcher.forward(request, response);


%>