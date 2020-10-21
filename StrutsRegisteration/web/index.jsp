<%-- 
    Document   : index
    Created on : 16 Jun, 2018, 4:54:29 PM
    Author     : SACHIN AGRAWAL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>  

<s:form action="register">
    
    <s:textfield name ="name" label="UserName"></s:textfield>  
    <s:password name="password" label="Password"></s:password>  
    <s:textfield name="email" label="Email"></s:textfield>  
    <s:radio list="{'male','female'}" name="gender"></s:radio>  
    <s:select cssStyle="width:155px;" list="{'india','pakistan','other'}" name="country" label="Country"></s:select>
        <s:submit value="register"></s:submit>  
</s:form>
