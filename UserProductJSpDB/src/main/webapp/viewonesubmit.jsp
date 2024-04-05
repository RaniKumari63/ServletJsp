<%@page import="com.suchiit.daoimpl.Productdaoimpl"%>
<%@page import="com.suchiit.model.Product"%>
<%@page import="java.util.List"%>
<%@page import="com.suchiit.dao.ProductDao"%>
<%! ProductDao daoimpl;
int pid;
Product product;
%>

<%
pid=Integer.parseInt(request.getParameter("pid"));
daoimpl=new Productdaoimpl();

product=daoimpl.viewProduct(pid);
System.out.println("eeeeeeeeeeeeee"+product);
%>
<html>
<body>

<a href="productregistration.jsp">AddProducts</a>
<table border="1" width="100% ">
<th>PID</th>
<th>PNAME</th>
<th>PQty</th>
<th>PPRICE</th>
<th>EDIT</th
><th>DELETE</th>

<tr><td><%=product.getPid()%></td><td><%=product.getPname()%></td><td><%=product.getPqty()%>"</td><td><%=product.getPprice()%>"</td>
<td><a href="update.jsp?pid=<%=product.getPid()%>">Edit</a>
</td>
<td><a href="delete.jsp?pid=<%=product.getPid()%>">Delete</a></td><tr>
	

</table>
</body>
</html>
