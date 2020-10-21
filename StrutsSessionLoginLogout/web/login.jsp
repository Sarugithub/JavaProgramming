<%-- 
    Document   : login
    Created on : 19 Jun, 2018, 6:31:36 PM
    Author     : SACHIN AGRAWAL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
 <jsp:include page="index.jsp"></jsp:include>

<%@ taglib uri="/struts-tags" prefix="s" %>  
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <s:form action="loginprocess">  
        <s:textfield name="username" label="Name"></s:textfield>  
        <s:password name="userpass" label="Password"></s:password>  
        <s:submit value="login"></s:submit>  
        </s:form>   
    </body>
    
    
</html>
