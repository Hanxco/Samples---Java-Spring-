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
<style>
body {
	width: 100%;
	height: 2000px;
	margin: 0;
	padding: 0;
}

#fondo {
	position: fixed;
	top: 0;
	left: 0;
	border-left: 20px solid #f79554;
	border-right: 20px solid #f79554;
	width: 100%;
	height: 100%;
	margin: 0;
	padding: 0;
	box-sizing: border-box;
}
</style>
<body>
	<%
		Persona p = (Persona) request.getAttribute("user");
	%>
	<div id="fondo"></div>
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
				<li class="nav-item"><a class="nav-link" href="#">Mis Pedidos</a> <span class="sr-only">(current)</span></li>
				<li class="nav-item"><a class="nav-link" href="#">Mi usuario</a></li>
			</ul>
		</div>
	</nav>
	<div class="container" style="padding-top: 20px;">
		<div class="card">
			<div class="card-body">
				<div class="row justify-content-between">
					<div class="col-6">
						<h3>1. Tus datos</h3>
						<br> <small class="text-muted">Revisa si tus datos
							están correctos: </small> <br>
						<ul class="list-group list-group-flush">
							<li class="list-group-item"><strong>Nombre:</strong> <% out.print(p.getNombre()); %></li>
							<li class="list-group-item"><strong>Telefono:</strong> <% out.print(p.getTelefono()); %></li>
							<li class="list-group-item"><strong>Dirección:</strong> <% out.print(p.getDireccion()); %></li>
						</ul>
						<br>
						<div class="text-center">
							<button type="submit" class="btn btn-outline-warning pull-right">Modificar datos</button>
						</div>
					</div>
					<div class="col-4">
						<div class="card" style="width: 18rem; padding: 5px;">
							<img class="card-img-top"
								src="http://cecateco.com.pe/images/team-member/docentes/anonimo.png"
								alt="Card image cap">
							<div class="card-body">
								<p class="card-text">
									<strong>Usuario: </strong>
									<% out.print(p.getUsername()); %>
								</p>
							</div>
						</div>
					</div>
				</div>

			</div>
		</div>
		<br>
		<div class="card">
			<div class="card-body">
				<div class="row">
					<div class="col">
						<h3>2. Elige el tamaño de tu PizzaSpring</h3>
						<form action="PedidoServlet" method="POST">
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
									<td></td>
								</tr>
								<tr>
									<div id="tamPizza" name="tamPizza" class="btn-group" data-toggle="buttons">
										<td>
											<label class="btn btn-default">
												<input type="radio" id="q156" name="tamPizza" value="Familiar" /> Familiar <br>
												<strong>15 Euros</strong>
											</label>
										</td>
										<td>
											<label class="btn btn-default"> 
												<input type="radio" id="q156" name="tamPizza" value="Normal" /> Normal <br>
												<strong>10 Euros</strong>
											</label>
										</td>
										<td>
											<label class="btn btn-default">
												<input type="radio" id="q156" name="tamPizza" value="Individual" /> Individual
												<br><strong>5 Euros</strong>
											</label>
										</td>
									</div>
								</tr>
							</table>
					</div>
				</div>
			</div>
		</div>
		<br>
		<div class="card">
			<div class="card-body">
				<div class="row">
					<div class="col">
						<h3>3. Elige los ingredientes</h3>
						<br>
						<ul class="list-group list-group-flush">
							<div name="ingredientes" class="input-group">
								<%
									for (Ingredientes i : Ingredientes.values()) {
								%>
								<li class="list-group-item"><input name="ingredientes"
									type="checkbox" aria-label="Checkbox for following text input"
									value="<%out.print(i.ordinal());%>"> <% out.print(i); %>
									<strong>+ <% out.print(i.getPrecio()); %> Euros
								</strong></li>
								<%
									}
								%>
							</div>
						</ul>
						<br>
					</div>
				</div>
				<div class="row mt-4">
					<div class="col">
						<div class="text-right">
							<button type="submit" class="btn btn-outline-danger">Atrás</button>
							<button type="submit" class="btn btn-outline-success">Confirmar pedido</button>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>