<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@page isELIgnored="true"%>
<html>  
<head>  
<title>Tag Example</title>  
</head>  
<body> 
<c:out value= "${'ghghh' }"/>
<c:import var="data" url="http://www.google.com"/>  
<c:out value="${data}"/>  

</body>  
</html> 