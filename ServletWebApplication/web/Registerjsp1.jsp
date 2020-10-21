<%-- 
    Document   : Registerjsp1
    Created on : 28 Feb, 2018, 12:05:20 PM
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
        
        <form action ="RegisterServlet" method ="post">
            
           Name:<input type="text" name="userName"/><br/><br/>  
           Password:<input type="password" name="userPass"/><br/><br/>  
           Email Id:<input type="text" name="userEmail"/><br/><br/>  
           Country:  
            <select name="userCountry">  
            <option>India</option>  
            <option>Pakistan</option>  
            <option>other</option>  
            </select>    
           
           <br/><br/>  
            <input type="submit" value="register"/>  

        </form>
   
    </body>
</html>
