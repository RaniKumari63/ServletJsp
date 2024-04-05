<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
ul
{
list-style-type:none;
margin:0;
padding:0;
overflow:hidden;
border: 1px solid #e7e7e7;
background-color:#f3f3f3;
}
li:first-child
{ background-color: lightgreen;
  color:white;

}
li
{
float:left;
border-right:1px solid #bbb;
}
li a
{
 display: block;
 color: #666;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;

}
li a:hover:not(.active) {
  background-color: #ddd;
}
li a.active {
  color: white;
  background-color: #04AA6D;
}

li:last-child {
  border-right: none;
}


</style>
</head>
<body>
<ul>
<li>
<a href="./productregistration.jsp">AddProducts</a>

</li>
<li>
<a href="./view.jsp">ViewAllProducts</a>

</li>
<li>
<a href="./viewone.jsp">ViewProduct</a>

</li>
<li>
<a href="Login.jsp">Login</a>

</li>
</ul>
</body>
</html>