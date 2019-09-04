<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<link href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/spacelab/bootstrap.min.css" rel="stylesheet">
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="container">
	<h1>Favorites</h1>	
<table>
  <tr>
    <th>Food Name</th>
    <th></th>
    <th>Ingredients</th>
    <th>Delete</th>
  </tr>
  <c:forEach var="c" items="${favorites}">
  <tr>
    <td><a href="${c.href }">${c.title }</a></td>
    <td>${c.thumbnail }</td>
    <td>${c.ingredients }</td>
    <td><input class="btn btn-primary" action="delete" value="Remove"></td>
  </tr>
  </c:forEach>
</table>
</div>
</body>
</html>