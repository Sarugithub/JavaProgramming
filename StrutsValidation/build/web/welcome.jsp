<%-- 
    Document   : welcome
    Created on : 12 Jun, 2018, 5:03:52 PM
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
        
        <%@ taglib uri="/struts-tags" prefix="s" %>  
  
        Welcome, <s:property value="username"/>  
    </body>
</html>
