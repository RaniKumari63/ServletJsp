<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <%@page isELIgnored="false"%>
<html>
	<head>
		<title>c:set JSTL core tag example</title>
	</head>
	<body>
		<c:set var="website" value="826.a00.myftpupload.com"/>
		<c:out value="${website}"/>
		<c:set var="i" value="6"/>
		<c:set var="j" value="6"/>
		<c:out value="${i+j}"/>
		<c:remove var="website"/>
		<c:out value="${website}"	/>		</body>
</html>