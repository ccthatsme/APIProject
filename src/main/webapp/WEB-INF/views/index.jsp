<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/litera/bootstrap.min.css" rel="stylesheet" integrity="sha384-D/7uAka7uwterkSxa2LwZR7RJqH2X6jfmhkJ0vFPGUtPyBMF2WMq9S+f9Ik5jJu1" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>
<div class="container">
	<h1>Mmm, fooooood...</h1>
	
		<form action="Search">
		<input type="text" name="search-word" placeholder="Name Search">
		<input type="text" name="search-ingredient" placeholder="Ingredient Search">  
		<input class="btn btn-primary" type="submit" value="Search">
	</form>
	<br>
	<a href="favorites" class="btn btn-primary">View Favorites</a>
	
	<p>${test }</p>
	<p>${recipeList }</p>
</div>
</body>
</html>