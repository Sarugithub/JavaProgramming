<%-- 
    Document   : loginsuccess
    Created on : 20 Jun, 2018, 6:18:43 PM
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
        <jsp:include page="index.jsp"></jsp:include>  
<hr/>  
<%@ taglib uri="/struts-tags" prefix="s" %>  
  
<br/>Welcome, <s:property value="username"/> 
    </body>
</html>
