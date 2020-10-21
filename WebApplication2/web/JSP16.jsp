<%-- 
    Document   : JSP16
    Created on : 7 Feb, 2018, 7:07:41 PM
    Author     : SACHIN AGRAWAL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <c:url value="newjsp3.jsp" var="myURL">
        <c:param name="trackingId" value="1234"/>
        <c:param name="reportType" value="summary"/>
        </c:url>
        <a href="${myURL}">newjsp3.jsp</a>
        <p>Generated URL = ${myURL}</p>

    </body>
</html>
