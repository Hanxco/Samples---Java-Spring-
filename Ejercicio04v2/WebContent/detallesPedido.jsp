<%@ page import="curso.modelo.entidades.Ingredientes"%>
<%@ page import="curso.modelo.entidades.Pedido"%>
<%@ page import="curso.modelo.entidades.Persona"%>
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
<title>Detalle del pedido</title>
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
				<li class="nav-item"><a class="nav-link" href="#">Mi usuario</a></li>
			</ul>
		</div>
	</nav>
	<div class="container" style="padding-top: 20px;">
		<div class="card">
			<div class="card-body">
				<h3 class="text-center">Detalle del Pedido</h3>
				<hr>
				<div class="tarjeta" style="padding-left : 15px; padding-right : 15px;">
					<div class="row">
						<div class="col">
							<h4>Tus datos:</h4> 
							<br>
							<ul class="list-group list-group-flush">
								<li class="list-group-item"><strong>Nombre:</strong> <% out.print(pedido.getPersona().getNombre()); %></li>
								<li class="list-group-item"><strong>Telefono:</strong> <% out.print(pedido.getPersona().getTelefono()); %></li>
								<li class="list-group-item"><strong>Dirección:</strong> <% out.print(pedido.getPersona().getDireccion()); %></li>
							</ul>
							<br>
							<img src="http://www.delonghi.com/Global/recipes/multifry/pizza_fresca.jpg" width="350px;" />
						</div>
						<div class="col">
							<div class="card">
								<div class="card-header">
									<h4>Tu pedido</h4>
								</div>
								<div class="card-body">
									<strong>Pizza <% out.print(pedido.getPizza().getTam()); %></strong>
									<p class="card-text">
										<ul class="list-group list-group-flush">
											<%  for( Ingredientes item : pedido.getPizza().getListaIngredientes() ){ %>
													<li class="list-group-item">
														<% out.print(item); %> <strong> + <% out.print(item.getPrecio()); %> Euros </strong>
													</li>
											<%	}  %>
										</ul>
									</p>
								</div>
							</div>
							
							
							<hr>
							<strong>Total:</strong>
							<button type="button" class="btn btn-light">
								<% out.print(pedido.getPizza().getPrecioTotal()); %> Euros
							</button>
						</div>
					</div>
					<div class="row mt-4">
						<div class="col">
							<div class="text-right">
								<button type="submit" class="btn btn-outline-danger">Atrás</button>
								<button type="submit" class="btn btn-outline-success">Realizar pedido</button>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

	<h1></h1>


</body>
</html>