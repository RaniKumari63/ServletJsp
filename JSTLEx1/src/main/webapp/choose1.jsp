<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@page isELIgnored="false"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:set var="num" value="6"/>
<c:choose>
<c:when test="${num>10}">
number is greater than 10</c:when>
<c:when test="${num<10&&num>5 }">
number is  than 5</c:when>
<c:otherwise>number is  greater than 5</c:otherwise>
</c:choose>
</body>
</html>