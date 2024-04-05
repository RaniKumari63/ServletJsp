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
<c:set var="salary" scope="session" value="${2000*2}"/>
<c:out value="${salrary}"/>
<p>The person's name is <c:out value="${person.name}" /></p>
<p>The person's name is ${person.name}</p>
</body>
</html>