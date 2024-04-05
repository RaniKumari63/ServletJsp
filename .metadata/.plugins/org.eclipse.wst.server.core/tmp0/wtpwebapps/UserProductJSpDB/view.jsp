<%@page import="com.suchiit.daoimpl.Productdaoimpl"%>
<%@page import="com.suchiit.model.Product"%>
<%@page import="java.util.List"%>
<%@page import="com.suchiit.dao.ProductDao"%>
<html>
<head>
<script type="text/javascript" charset="utf8" src="http://ajax.aspnetcdn.com/ajax/jquery/jquery-1.8.2.min.js"></script>
<script type="text/javascript" charset="utf8" src="http://ajax.aspnetcdn.com/ajax/jquery.dataTables/1.9.4/jquery.dataTables.min.js"></script>
<script>

$(function () {
    $('#mytable').DataTable();
} );

</script>
</head>
<body>
<%! ProductDao daoimpl;
List<Product> viewallproducts;
%>

<%
daoimpl=new Productdaoimpl();

viewallproducts=daoimpl.viewAllProducts();
%>
<html>
<body>

<a href='productregistration.jsp'>AddProducts</a>
<a href='productdisplay.jsp'>Back</a>
<table id="mytable" border="1" width="100%" >
<th>PID</th><th>PNAME</th><th>PQty</th><th>PPRICE</th><th>EDIT</th><th>DELETE</th>
<% for(Product p:viewallproducts)
{%>
<tr><td><%=p.getPid()%></td>
<td><%=p.getPname()%></td>
<td><%=p.getPqty()%></td>
<td><%=p.getPprice()%></td>
<td><a href="update.jsp?pid=<%=p.getPid()%>">Edit</a></td>
<td><a href="delete.jsp?pid=<%=p.getPid()%>">Delete</a></td><tr>
<% 	
}%>
</table>
</body>
</html>

</body>
</html>