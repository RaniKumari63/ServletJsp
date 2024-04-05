
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
li
{
float:left;
border-right:1px solid #bbb;
}
li:first-child
{ background-color: lightgreen;
  color:white;

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
<h2 style="color:blue;" align="center">
Course Details</h2>
<a href="mainfile.jsp">Back</a>
<ul>
<li>
<a href="./addcourse.jsp">AddCourse</a>
</li>

<li>
<a href="./viewcourses.jsp">ViewCourses</a>
</li>
<li>
<a href="./viewcourse.jsp">ViewCourse</a>
</li>

</ul>
</body>
</html>