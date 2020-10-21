<%-- 
    Document   : Welcome.jsp
    Created on : 2 Jun, 2018, 7:00:15 PM
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
  
Product Id:<s:property value="id"/><br/>  
Product Name:<s:property value="name"/><br/>  
Product Price:<s:property value="price"/><br/>  
    </body>
</html>
