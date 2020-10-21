<%-- 
    Document   : JSP1
    Created on : 31 Jan, 2018, 4:21:52 PM
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
       <form action = "JSP1.jsp">
       ENTER Number: <input type = "text" name = "no">
       <input type = "SUBMIT">
    </form>
        <% 
            try
            {
                int a = Integer.parseInt(request.getParameter("no"));
                if (a>0)
                {
                    %>
                    <h1> positive </h1>
                    <%    
                }
                else
                {
                    %>
                    <h1> negative </h1>
                    <%
                }
            }
            catch (Exception e)
            {
                
            }

            %>       
    </body>
</html>
