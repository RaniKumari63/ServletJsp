<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
      "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>&lt;c:out&gt; Demo</title>
    </head>
    <body>
        <h1>&lt;c:out&gt; Demo</h1>
        <form name="outForm"
             action="${pageContext.request.contextPath}/tag-types/core/out.jsp"
             method="POST">
            Please enter some text (HTML allowed): <br/>
             <input type="text" name="someText"/>
             <input type="submit" value="submit"/>
       </form>
      <br/>
      <br/>
      You just entered:<br/>
     <c:out value="${param.someText}" default="Nothing!" escapeXml="false"/>
    </body>
</html>