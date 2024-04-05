<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@page isELIgnored="false"%>
<html>  
<head>  
<title>Tag Example</title>  
</head>  
<body> 
<c:out value= "${'ghghh' }"/>
<c:import var="data" url="./choose1.jsp"/>  
<c:out value="${data}"/>  

</body>  
</html> 