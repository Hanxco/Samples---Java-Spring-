<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>FORMULARIO</title>
	<link rel="stylesheet"
		href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css"
		integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS"
		crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<h1>Bienvenido a nuestra página echa con SPRING MVC</h1>
		<h1><font style="color:blue">Formulario Saludo</font></h1>
		<form action="saludo">
			Nombre: <input type="text" name="nombre" />
			<button type="submit" value="Enter">Enter</button>
		</form>
	</div>

</body>
</html>