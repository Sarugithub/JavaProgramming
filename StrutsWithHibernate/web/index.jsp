<%-- 
    Document   : index
    Created on : 14 Jul, 2018, 6:51:18 PM
    Author     : SACHIN AGRAWAL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib uri = "/struts-tags" prefix="S" %>
          
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <S:form action="register">  
        <S:textfield name="name" label="Name"></S:textfield>  
        <S:submit value="register"></S:submit>  
        </S:form>
  
        
        
    </body>
</html>
