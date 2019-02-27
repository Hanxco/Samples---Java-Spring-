<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Videojuegos</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css"
	integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS"
	crossorigin="anonymous">
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
	border-left: 20px solid #ccc;
	border-right: 20px solid #ccc;
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
		<a class="navbar-brand" href="#">Videojuegos</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarNav" aria-controls="navbarNav"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarNav">
			<ul class="navbar-nav">
				<li class="nav-item active"><a class="nav-link" href="#">Inicio
				</a><span class="sr-only">(current)</span></li>
				<li class="nav-item"><a class="nav-link" href="verlistado">Listado de Juegos</a></li>
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
	<div class="container" style="padding-top: 20px;">
		<div class="card">
			<div class="card-body">
				<div class="row justify-content-between">
					${ listajuegos }
					<div class="col"></div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>