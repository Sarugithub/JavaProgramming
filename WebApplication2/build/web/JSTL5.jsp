<%-- 
    Document   : JSTL5
    Created on : 5 Feb, 2018, 12:25:35 PM
    Author     : SACHIN AGRAWAL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
 <h3>Books Info:</h3>

<c:set var="xmltext">
  <books>
    <book>
      <name>Padam History</name>
      <author>ZARA</author>
      <price>100</price>
    </book>
    <book>
      <name>Great Mistry</name>
      <author>NUHA</author>
      <price>2000</price>
    </book>
  </books>
</c:set>

<x:parse xml="${xmltext}" var="output"/>
<b>The title of the first book is</b>: 
<x:out select="$output/books/book[1]/name" />
<br>
<b>The price of the second book</b>: 
<x:out select="$output/books/book[2]/price" />
    </body>
</html>
