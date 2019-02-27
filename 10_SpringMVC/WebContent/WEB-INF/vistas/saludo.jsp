<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
	<link rel="stylesheet"
		href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css"
		integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS"
		crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<h1>SALUDO</h1>
		<h1>${saludo}</h1>
		<h1 style="color:red;">${ persona.nombre }</h1>
		
		<h1 style="color: blue">${ listaSaludos }</h1>
		<a href="verFormularioSaludo">Volver</a>
	</div>
</body>
</html>