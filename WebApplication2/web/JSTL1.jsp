
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
<c:set var="balance" value="1250003.350" />

<fmt:parseNumber var="i" type="number" value="${balance}" />
<p>Parsed Number (1) : <c:out value="${i}" /></p>
<fmt:parseNumber var="i" integerOnly="true" 
                       type="number" value="${balance}" />
<p>Parsed Number (2) : <c:out value="${i}" /></p>

    </body>
</html>
