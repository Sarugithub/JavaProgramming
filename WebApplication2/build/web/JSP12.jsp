<%@page contentType="text/html" import="java.io.*,java.util.*,java.sql.*" pageEncoding="UTF-8"%>
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
 <sql:setDataSource driver="com.mysql.jdbc.Driver"
            url="jdbc:mysql://localhost:3306/Emp"
            var="localSource" 
            user="root"  
            password="admin123"/>

 <sql:query dataSource="${localSource}" var="result">
SELECT * from Employees;
</sql:query>
 
<table border="1" width="100%">
<tr>
<th>EmpID</th>
<th>Name</th>
<th>Salary</th>

</tr>
<c:forEach var="row" items="${result.rows}">
<tr>
<td><c:out value="${row.id}"/></td>
<td><c:out value="${row.name}"/></td>
<td><c:out value="${row.salary}"/></td>

</tr>
</c:forEach>
</table>
    </body>
</html>
