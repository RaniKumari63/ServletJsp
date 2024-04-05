<%@page import="com.suchiit.daoimpl.Productdaoimpl"%>
<%@page import="com.suchiit.model.Product"%>
<%@page import="com.suchiit.dao.ProductDao"%>
<%! int pid;
ProductDao daoimpl;
Product product;

%>
<% 
pid=Integer.parseInt(request.getParameter("pid"));
daoimpl=new Productdaoimpl();
product=daoimpl.viewProduct(pid);
%>

<html>
<body>
<form action="./submitupdate.jsp">
<table>
<tr><td>PID</td>
<td><input type='hidden' name='pid' value=<%=product.getPid()%> ></td></tr>
<tr><td>PNAME</td>
<td><input type='text' name='pname' value=<%=product.getPname()%> ></td></tr>
<tr><td>PQTY</td>
<td><input type='text' name='pqty' value=<%=product.getPqty()%>></td></tr>
 <tr><td>PPRICE</td>
<td><input type='text' name='pprice' value=<%=product.getPprice()%>></td></tr>
<tr><td><input type='submit' value='update'/></td></tr>
</table>
</form>
</body>
</html>