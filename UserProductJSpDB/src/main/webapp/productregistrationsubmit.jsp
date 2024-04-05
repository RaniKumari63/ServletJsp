
<%@page import="com.suchiit.daoimpl.Productdaoimpl"%>
<%@page import="com.suchiit.dao.ProductDao"%>
<%@page import="com.suchiit.model.Product"%>
<%!Product pro;
ProductDao daoimpl;
String pname;
int pqty;
int pprice;
boolean flag;



%>

<%

pname=request.getParameter("pname");
pqty=Integer.parseInt(request.getParameter("pqty"));
pprice=Integer.parseInt(request.getParameter("pprice"));
Product pro=new Product(pname,pqty,pprice);
 daoimpl=new Productdaoimpl();
flag=daoimpl.registerProducts(pro);
out.println("<html>");
out.println("<body>");
if(flag)
{

	out.println("<h3 style='color:blue;' >Product Inserted Successfully</h3>");

	out.println("<a href='Login.jsp'>Home</a>");
	out.println("<a href='productregistration.jsp'>Back</a>");
}
else
{
	out.println("Product Not Inserted Successfully");
	out.println("<a href='Login.jsp'>Home</a>");
}
%>