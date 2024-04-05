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
<c:catch var="exception">
<%int x=10/0; %>
</c:catch>
<c:if test="${exception!=null }">
<c:out value="${'hai' }"/>
Occurred exception is:${exception}

</c:if>

</body>
</html>