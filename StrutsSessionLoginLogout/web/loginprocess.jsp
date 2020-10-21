<%-- 
    Document   : loginprocess
    Created on : 19 Jun, 2018, 6:56:13 PM
    Author     : SACHIN AGRAWAL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>  
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:include page="index.jsp"></jsp:include>  
<hr/>  

  
<br/>Welcome, <s:property value="username"/>  
    </body>
</html>
