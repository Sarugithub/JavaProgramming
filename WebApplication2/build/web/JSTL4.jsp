<%-- 
    Document   : JSTL4
    Created on : 5 Feb, 2018, 12:02:05 PM
    Author     : SACHIN AGRAWAL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
<h3>Number Format:</h3>
<c:set var="now" value="<%=new java.util.Date()%>" />

<p>Formatted Date (1): <fmt:formatDate type="time" 
            value="${now}" /></p>
<p>Formatted Date (2): <fmt:formatDate type="date" 
            value="${now}" /></p>
<p>Formatted Date (3): <fmt:formatDate type="both" 
            value="${now}" /></p>
<p>Formatted Date (4): <fmt:formatDate type="both" 
            dateStyle="short" timeStyle="short" 
            value="${now}" /></p>
<p>Formatted Date (5): <fmt:formatDate type="both" 
            dateStyle="medium" timeStyle="medium" 
            value="${now}" /></p>
<p>Formatted Date (6): <fmt:formatDate type="both" 
            dateStyle="long" timeStyle="long" 
            value="${now}" /></p>
<p>Formatted Date (7): <fmt:formatDate pattern="dd-MM-yyyy" 
            value="${now}" /></p>

    </body>
</html>
