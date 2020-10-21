<%-- 
    Document   : ResultEvenOdd
    Created on : 2 Feb, 2018, 4:28:21 PM
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
            String s = request.getParameter("Number1");
            if (s.trim().equals (""))
            {
                out.println("Empty");
            }
            else
            {
                int num = Integer.parseInt(s.trim());
                if(num%2 == 0)
                {
                    out.println("Even");
                }
                else
                {
                    out.println("odd");
                }
                
            }
 
        %>
    </body>
</html>
