<%@ page import="curso.modelo.entidades.Pedido"%>
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
<title>Detalle del Pedido</title>
</head>
<body>
	<%
	Pedido pedido = (Pedido) request.getAttribute("pedido");
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
			<h3 class="text-center">Detalle del Pedido</h3>
			<br>
			<div class="card">
				<ul class="list-group list-group-flush">
					<li class="list-group-item"></li>
					<li class="list-group-item">Cliente : <%
						out.print(pedido.getPersona());
					%></li>
					<li class="list-group-item">Tamaño de la Pizza: <%
						out.print(pedido.getPizza().getTam());
					%></li>
					<li class="list-group-item">Ingredientes de la Pizza: <%
						out.print(pedido.getPizza().getListaIngredientes());
					%></li>
				</ul>
				<br><br><br>
				<h3>PRECIO TOTAL </h3>  <% out.print(pedido.getPizza().getPrecioTotal()); %> Euros
			</div>
		</div>
	</div>

	<h1></h1>
		
	
</body>
</html>