<%-- 
    Document   : errorpage
    Created on : 15 Sep, 2018, 6:45:46 PM
    Author     : SACHIN AGRAWAL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
      ${message}  
        <jsp:include page="/index.jsp"></jsp:include>
    </body>
</html>
