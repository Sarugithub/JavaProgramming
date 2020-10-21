<%-- 
    Document   : JSTL2
    Created on : 5 Feb, 2018, 11:44:38 AM
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
<c:set var="now" value="20-10-2010" />

<fmt:parseDate value="${now}" var="parsedEmpDate" 
                              pattern="dd-MM-yyyy" />
<p>Parsed Date: <c:out value="${parsedEmpDate}" /> </p>

    </body>
</html>
