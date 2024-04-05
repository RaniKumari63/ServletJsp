<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2 style="color:red;" align="center">
User Registration Form</h2>
<h3 style="color:blue;" align="center">
User Login Form</h3>
<form method="Post" action="./registration.jsp"><center>
<table>

<tr>
<td>Username</td>
<td><input type="text" name="uname"></td>

</tr>
<tr>
<td>Userpassword</td>
<td><input type="password" name="upwd"></td>

</tr>
<tr>
<td>Useremail</td>
<td><input type="text" name="uemail"></td>

</tr>
<tr>
<td>Usermobile</td>
<td><input type="text" name="umobile"></td>

</tr>
<tr>
<td><input type="submit" value="register"/></td>
</tr>
</table>

</center>
</form>
</body>
</html>