<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display</title>
</head>
<body>

<h1>PRODUCT DETAILS:</h1>
<hr>
<%= "Product Id : " + session.getAttribute("pId") %> <br> <br>

<%= "Product Name : " + session.getAttribute("pName") %>  <br> <br>

<%= "Product Price : " + session.getAttribute("pPrice") %>


</body>
</html>