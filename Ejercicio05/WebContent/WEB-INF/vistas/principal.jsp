<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css"
	integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.7.1/css/all.css"
	integrity="sha384-fnmOCqbTlWIlj8LyTjo7mOUStjsKC4pOpQbqyi7RrhN7udi9RwhKkMHpvLbHG9Sr"
	crossorigin="anonymous">

<meta charset="ISO-8859-1">
<title>Tu PC a Medida</title>
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

i.fa {
	display: inline-block;
	border-radius: 60px;
	box-shadow: 0px 0px 2px #888;
	padding: 0.5em 0.6em;
}
</style>
<body>
	<div id="fondo"></div>
	<nav
		class="navbar navbar-dark bg-dark justify-content-between navbar-expand-lg ">
		<a class="navbar-brand" href="#">Tu PC a Medida</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarNav" aria-controls="navbarNav"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarNav">
			<ul class="navbar-nav">
				<li class="nav-item active"><a class="nav-link" href="#">Inicio
				</a></li>
				<li class="nav-item"><a class="nav-link" href="#">Mis
						Pedidos</a> <span class="sr-only">(current)</span></li>
			</ul>
		</div>

		<ul class="navbar-nav mr-sm-2">
			<li class="nav-item"><a class="nav-link" href="#"> <i
					class="fas fa-shopping-cart"></i>Cesta de la compra
			</a></li>
			<div class="dropdown">
				<button class="btn btn-secondary dropdown-toggle" type="button"
					id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true"
					aria-expanded="false">
					<i class="fas fa-user"></i> Mi Perfil
				</button>
				<div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
					<a class="dropdown-item" href="#">Modificar Datos</a> <a
						class="dropdown-item" href="#">Cerrar Sesión</a>
				</div>
			</div>
		</ul>
	</nav>
	<form action="	addCesta" method="POST">
		<div class="container" style="padding-top: 20px;">
			<div class="card">
				<div class="card-body">
					<div class="row justify-content-between">
						<div class="col-6">
							<h3>1. Tus datos</h3>
							<br> <small class="text-muted">Revisa si tus datos
								están correctos: </small> <br>
							<ul class="list-group list-group-flush">
								<li class="list-group-item"><strong>Nombre:</strong></li>
								<li class="list-group-item"><strong>Telefono:</strong></li>
								<li class="list-group-item"><strong>Dirección:</strong></li>
							</ul>
							<br>
							<div class="text-center">
								<button type="submit" class="btn btn-outline-warning pull-right">Modificar
									datos</button>
							  	<a href="hacerPedido" >Hacer pedido</a>
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
							<h3>2. Elige los componentes de tu pc</h3>
						</div>
					</div>

					<h1>PROCESADOR</h1>
					<ul class="list-group list-group-flush">
						<div name="procesadores" class="input-group">
							<c:forEach var="procesador" items="${listadoProcesadores}"
								varStatus="loop">
								<div class="card" style="width: 18rem;">
									<img class="card-img-top" src="${procesador.imgUrl}"
										alt="Card image cap">
									<div class="card-body">
										<h5 class="card-title">${procesador.nombre}
											${procesador.nombre}</h5>
										<p class="card-text">${procesador.caracteristicas}</p>
										<strong>${procesador.precio} Euros</strong> <br> <input
											name="procesadores" type="checkbox" aria-label=""
											value="${procesador.id}">Agregar al carrito</input>
									</div>
								</div>
							</c:forEach>
						</div>
					</ul>

					<h1>MEMORIAS RAM</h1>
					<ul class="list-group list-group-flush">
						<div name="memoriasram" class="input-group">
							<c:forEach var="ram" items="${listadoRAM}" varStatus="loop">
								<div class="card" style="width: 18rem;">
									<img class="card-img-top" src="${ram.imgUrl}"
										alt="Card image cap">
									<div class="card-body">
										<h5 class="card-title">${ram.nombre}${ram.nombre}</h5>
										<p class="card-text">${ram.caracteristicas}</p>
										<strong>${ram.precio} Euros</strong><br> <input
											name="memoriasram" type="checkbox" aria-label=""
											name="${ram.id}" value="${ram.id}">Agregar al carrito</input>
									</div>
								</div>
							</c:forEach>
						</div>
					</ul>

					<h1>TARJETAS GRÁFICAS</h1>
					<ul class="list-group list-group-flush">
						<div name="graficas" class="input-group">
							<c:forEach var="grafica" items="${listadoGraficas}"
								varStatus="loop">
								<div class="card" style="width: 18rem;">
									<img class="card-img-top" src="${grafica.imgUrl}"
										alt="Card image cap">
									<div class="card-body">
										<h5 class="card-title">${grafica.nombre}${grafica.nombre}</h5>
										<p class="card-text">${grafica.caracteristicas}</p>
										<strong>${grafica.precio} Euros</strong><br> <input
											name="graficas" type="checkbox" aria-label=""
											name="${grafica.id}" value="${grafica.id}">Agregar al
										carrito</input>

									</div>
								</div>
							</c:forEach>
						</div>
					</ul>

					<h1>ALMACENAMIENTO</h1>
					<ul class="list-group list-group-flush">
						<div name="almacenamiento" class="input-group">
							<c:forEach var="hdd" items="${listadoAlmacenamiento}"
								varStatus="loop">
								<div class="card" style="width: 18rem;">
									<img class="card-img-top" src="${hdd.imgUrl}"
										alt="Card image cap">
									<div class="card-body">
										<h5 class="card-title">${hdd.nombre}${hdd.nombre}</h5>
										<p class="card-text">${hdd.caracteristicas}</p>
										<strong>${hdd.precio} Euros</strong><br> <input
											name="almacenamiento" type="checkbox" aria-label=""
											value="${hdd.id}">Agregar al carrito</input>
									</div>
								</div>
							</c:forEach>
						</div>
					</ul>

					<h1>CAJAS</h1>
					<ul class="list-group list-group-flush">
						<div name="cajas" class="input-group">
							<c:forEach var="caja" items="${listadoCajas}" varStatus="loop">
								<div class="card" style="width: 18rem;">
									<img class="card-img-top" src="${caja.imgUrl}"
										alt="Card image cap">
									<div class="card-body">
										<h5 class="card-title">${caja.nombre}${caja.nombre}</h5>
										<p class="card-text">${caja.caracteristicas}</p>
										<strong>${caja.precio} Euros</strong><br> <input
											name="cajas" type="checkbox" aria-label="" value="${caja.id}">Agregar
										al carrito</input>
									</div>
								</div>
							</c:forEach>
						</div>
					</ul>
				</div>
			</div>
		</div>

		<div id="margenInferior" style="position: fixed; bottom: 0px; height: 80px; width: 100%; background-color: white;">
			<ul>
				<c:forEach var="ordenador" items="${pedido.listadoOrdenadores}" varStatus="loop">
						<li><i class="fas fa-desktop"></i>${ordenador}</li>
				</c:forEach>
			</ul>
				
			<button type="submit" class="btn btn-outline-warning"
				style="position: absolute; right: 200px; bottom: 20px;">
				<i class="fas fa-shopping-cart fa-2x"></i> Añadir a la cesta
			</button>
		</div>
	</form>

	
	<br>

	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>
</body>
</html>