<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<link href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/litera/bootstrap.min.css" rel="stylesheet">
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="container">
	<h1>Search Results</h1>	
<table class="table">
  <tr>
    <th>Food Name</th>
    <th></th>
    <th>Ingredients</th>
    <th>Favorites</th>
  </tr>
  <c:forEach var="c" items="${results}">
  <tr>
    <td><a href="${c.href }">${c.title }</a></td>
    <td><img src="${c.thumbnail }"></td>
    <td>${c.ingredients }</td>
    <td><a href="add-favorite" class="btn btn-primary">Add to Favorites</a></td>
  </tr>
  </c:forEach>
</table>
<a href="favorites" class="btn btn-primary">View Favorites</a>
</div>
</body>
</html>