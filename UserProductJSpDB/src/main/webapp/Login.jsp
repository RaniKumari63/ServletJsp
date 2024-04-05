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
<form action="./loginsubmit.jsp" method="post">

<table border="1" align="center" >
<tr>
<td>UserName</td>
<td><input type="text" name="email"/>
</tr>
<tr>
<td>Password</td>
<td><input type="password" name="pwd"/>
</tr>

<tr>
<td colspan="2" align="center">
<input type="submit" value="Login"/>
</td>
</tr>
<tr><td>
 
<a href="register.jsp">CreateNewAccount</a></td>

<td><a href="forgot.jsp">ForgotPassword</a></td>
</tr>
</table>

</form>

</body>
</html>