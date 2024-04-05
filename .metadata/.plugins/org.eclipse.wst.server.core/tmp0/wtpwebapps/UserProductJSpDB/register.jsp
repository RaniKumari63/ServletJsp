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
User Login Form</h3>
<form action="./registersubmit.jsp">
<table border="1" align="center">
<tr>
<td>UserId</td>
<td><input type="text" name="uid"></td>

</tr>
<tr>
<td>UserName</td>
<td><input type="text" name="uname"></td>

</tr>
<tr>
<td>Password</td>
<td><input type="password" name="pwd"></td></tr>
<tr>
<td>FirstName</td>
<td><input type="text" name="fname"></td>

</tr>

<tr>
<td>LastName</td>
<td><input type="text" name="lname"></td>
</tr>

<tr>
<td>MobileNumber</td>
<td><input type="text" name="mobilenumber"></td>

</tr>
<tr>
<td colspan="2" align="center">
<input type="submit" value="Register"/>
</td>
</tr>
</table>



</form>
</body>
</html>