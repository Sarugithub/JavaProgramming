<%-- 
    Document   : newjsp1
    Created on : 7 Feb, 2018, 12:48:25 PM
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
        <%@page import="bean.LoginDao"%>  
        <jsp:useBean id="obj" class="bean.LoginBean"/>  
  
        <jsp:setProperty property="*" name="obj"/>  
  
        <%  
            boolean status=LoginDao.validate(obj);  
            out.print(status);
            if(status){  
            out.println("You r successfully logged in");  
            session.setAttribute("session","TRUE");  
            }  
        else  
        {  
            out.print("Sorry, email or password error");  
         %>  

         <jsp:include page="newjsp.jsp"></jsp:include>  
        <%  
        }  
        %>      

    </body>
</html>
