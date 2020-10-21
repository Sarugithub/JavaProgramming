<%-- 
    Document   : JSP15
    Created on : 7 Feb, 2018, 6:32:17 PM
    Author     : SACHIN AGRAWAL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> JSP Page</title>
    </head>
    <body>
      
        <c:catch var = "catchException">
            
            <%  int x = 5/0; %>
            
            
        </c:catch>
        
        <c:if test = "${catchException!=null}">
        <p> The exception is : ${catchException} <br/>
            There is an exception: ${catchException.message} </p>
           
        </c:if>
        
    </body>
</html>
