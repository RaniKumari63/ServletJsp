<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <%@page isELIgnored="false"%>
<html>
  <head>
	<title>c:out JSTL core tag example</title>
  </head>
  <body>
    <c:out value="This is a c:out JSTL core tag example."/><br/>
    Sum of 10 and 20 = <c:out value="${10+20}"/><br/><br/>
 
    <c:out value="${'<h6>This is a <c:out> escape XML test </h6>'}"/>
  </body>
</html>