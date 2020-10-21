<%-- 
    Document   : newjsp
    Created on : 7 Feb, 2018, 12:18:18 PM
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
        <%@page import="bean.RegisterDao"%>  
        <jsp:useBean id="obj" class="bean.User"/>  
  
        <jsp:setProperty property="*" name="obj"/> 
        
        <%  
            int status=RegisterDao.register(obj);  
            if(status>0)  
            out.print("You are successfully registered");  
  
        %>  

        
    </body>
</html>
