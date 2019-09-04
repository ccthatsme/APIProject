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
	<h1>Individual Details</h1>	
<table>
  <tr>
    <td><a href="${individual.href }">${individual.title }</a></td>
    <td>${individual.thumbnail }</td>
  </tr>
  <tr>
    <td>${individual.ingredients }</td>
    </tr>
</table>
<input action="favorites" class="btn btn-primary" type="submit" value="View Favorites">
</div>
</body>
</html>