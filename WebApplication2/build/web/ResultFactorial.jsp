<%-- 
    Document   : ResultFactorial.jsp
    Created on : 2 Feb, 2018, 4:50:45 PM
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
        <%
        int fact =1;
        int number1 = Integer.parseInt(request.getParameter("Num1"));
        for(int i =1; i<=number1; i++)
        {
            fact = fact*i;
        }
        
        out.println("Factorial is" +fact);
        
                
              
                
         %>
    </body>
</html>
