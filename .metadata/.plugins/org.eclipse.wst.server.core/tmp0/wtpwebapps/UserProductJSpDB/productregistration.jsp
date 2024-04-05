<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3 style="color:blue;" align="center">
Product Registration Form</h3>
<form action="./productregistrationsubmit.jsp">
<table border="1" align="center">
<tr>
<td>Product Name</td>
<td><input type="text" name="pname"/></td>
</tr>
<tr>
<td>Product Quantity</td>
<td><input type="text" name="pqty"/></td>
</tr>
<tr>
<td>Product Price</td>
<td><input type="text" name="pprice"/></td>
</tr>
<tr><td colspan="2" align="center">
<input type="submit" value="Register"/>
</td></tr>

</table>



</form>
</body>
</html>