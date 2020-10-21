<%-- 
    Document   : JSP9
    Created on : 2 Feb, 2018, 6:15:41 PM
    Author     : SACHIN AGRAWAL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html"; charset=UTF-8">
        <title> JSP Page</title>
    </head>
    <body>
      <% 
          String a  = request.getParameter("uid");
          String b = request.getParameter("pass");
          
          if (a.equals("admin") && b.equals("1234"))
          {
              session.setAttribute("user", a);
              response.sendRedirect("Welcome.jsp");
              
          }
          else
          {
              response.sendRedirect("JSP2.jsp");
          }
          
       %>
       
    </body>
</html>
