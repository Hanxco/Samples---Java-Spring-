<%@ page import="curso.modelo.entidades.Persona"%>
<%@ page import="curso.modelo.entidades.Ingredientes"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css"
	integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS"
	crossorigin="anonymous">

<meta charset="ISO-8859-1">
<title>Pedido</title>
</head>
<body>
	<%
		Persona p = (Persona) request.getAttribute("user");
	%>
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
		<a class="navbar-brand" href="#">Pizzeria SPRING</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarNav" aria-controls="navbarNav"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarNav">
			<ul class="navbar-nav">
				<li class="nav-item active"><a class="nav-link" href="#">Inicio
				</a></li>
				<li class="nav-item"><a class="nav-link" href="#">Pedidos</a> <span
					class="sr-only">(current)</span></li>
				<li class="nav-item"><a class="nav-link" href="#">Mi
						usuario</a></li>
			</ul>
		</div>
	</nav>
	<div class="container" style="padding-top: 20px;">
		<div class="card">
			<br>
			<h3 class="text-center">Datos del cliente</h3>
			<br>
			<div class="card">
				<ul class="list-group list-group-flush">
					<li class="list-group-item">Nombre : <%
						out.print(p.getNombre());
					%></li>
					<li class="list-group-item">Telefono : <%
						out.print(p.getTelefono());
					%></li>
					<li class="list-group-item">Dirección : <%
						out.print(p.getDireccion());
					%></li>
				</ul>
			</div>
		</div>
		<br>
		<div class="card">
			<form action="PedidoServlet" >
				<h3 class="text-center">Escoge el Tamaño</h3>
				<table class="table text-center">
					<tr>
						<td><img
							src="https://s3-us-east-2.amazonaws.com/bocce/uploads/2017/06/hawaii.jpg"
							width="180px" /></td>
						<td><img
							src="https://s3-us-east-2.amazonaws.com/bocce/uploads/2017/06/hawaii.jpg"
							width="150px" /></td>
						<td><img
							src="https://s3-us-east-2.amazonaws.com/bocce/uploads/2017/06/hawaii.jpg"
							width="100px" /></td>
					</tr>
					<tr>
						<div id="tamPizza" name="tamPizza" class="btn-group" data-toggle="buttons">
							<td>
								<label class="btn btn-default"> 
									<input type="radio" id="q156" name="tamPizza" value="3" /> 
									Familiar
								</label>
							</td>
							<td>
								<label class="btn btn-default"> 
									<input type="radio" id="q156" name="tamPizza" value="2" /> 
									Normal
								</label>
							</td>
							<td>
								<label class="btn btn-default"> 
									<input type="radio" id="q156" name="tamPizza" value="1" /> 
									Individual
								</label>
							</td>
						</div>
					</tr>
				</table>
				<br>
				<h3 class="text-center">Escoge los ingredientes</h3>
				<ul class="list-group list-group-flush" style="width: 150px">
					<div name="ingredientes" class="input-group">
						<li class="list-group-item">
							<input name="ingredientes" type="checkbox" aria-label="Checkbox for following text input" value="0"> Jamón
						</li>
						<li class="list-group-item">
							<input name="ingredientes" type="checkbox" aria-label="Checkbox for following text input" value="1"> Queso
						</li>
						<li class="list-group-item">
							<input name="ingredientes" type="checkbox" aria-label="Checkbox for following text input" value="2"> Bacon
						</li>
					</div>
				</ul>
				<br> <br> <br> <br>
				<button type="submit" class="btn btn-outline-success">Confirmar pedido</button>
		</div>
	</div>
</body>
</html>