<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

</head>
<h2 style="color:red" align="center">AddStudents</h2>
<form action="addstudent" method="post">
<table  border="1"  align="center">
<tr><td>
Student Name

</td>
<td>
<input type="text" name="sname"/>
</td>
</tr>
<tr><td>
Student Address

</td>
<td>
<input type="text" name="sadd"/>
</td>
</tr>
<tr><td>
Student Email

</td>
<td>
<input type="text" name="semail"/>
</td>
</tr>
<tr><td>
CourseId

</td>
<td>
<input type="text" name="scid"/>
</td>
</tr>
<tr >

<td colspan="2" align="center">
<input type="submit" value="AddStudents"/>
</td>
</tr>
</table>


</form>
</body>
</html>