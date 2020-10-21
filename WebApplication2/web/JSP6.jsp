<%-- 
    Document   : JSP6
    Created on : 2 Feb, 2018, 4:14:19 PM
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
        
        <% try
        {
            int a,b,c;
            a = Integer.parseInt(request.getParameter("no1"));
            b = Integer.parseInt(request.getParameter("no2"));
            c = a+b;
            out.println("Addition is" +c);
        }
        catch (Exception e)
        {
                out.println(e);
        }
        
        %>
       
    </body>
</html>
