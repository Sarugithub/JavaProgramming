<%-- 
    Document   : newjsp3
    Created on : 7 Feb, 2018, 7:11:41 PM
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
               <p>Value of parameter1 = ${param.trackingId}</p>
               
               <p>Value of parameter2 = ${param.reportType}</p>
    </body>
</html>
