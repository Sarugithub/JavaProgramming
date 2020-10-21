<%-- 
    Document   : app1
    Created on : 7 Feb, 2018, 12:14:49 PM
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
        
        <form action ="newjsp.jsp">
            <input type="text" name="uname" value="Name..." onclick="this.value="/><br/>  
            <input type="text" name="uemail"  value="Email ID..." onclick="this.value="/><br/>  
            <input type="password" name="upass"  value="Password..." onclick="this.value="/><br/>  
            <input type="submit" value="register"/>  
        </form>
    </body>
</html>
