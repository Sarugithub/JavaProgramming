<%-- 
    Document   : JSP2
    Created on : 31 Jan, 2018, 4:42:56 PM
    Author     : SACHIN AGRAWAL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> JSP Page</title>
    </head>
    <body>
        <% int a,b, c;
        
        a = 90;
        b = 10;
        c = a+b;
        
        out.println("<font color = red size = 30> Addition:" +c+ "</font>");
       %>
    </body>
</html>
