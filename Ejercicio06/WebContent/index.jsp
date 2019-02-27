<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>VIDEOJUEGOS</title>

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
</style>
<body>
	<div id="fondo"></div>
	<section id="cover">
		<div id="cover-caption">
			<div id="container" class="container">
				<div class="row">
					<div class="col-sm-6 offset-sm-3 text-center" style="margin-top: 30px;">
						<img class="img-fluid"
							src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQFJ70WitskdmxClvkrOsN90-nilFs6yktlWeezJ1pZLLRD-8YMKw"
							style="margin-bottom: 10px; width: 80%;" /> <br>
						<div class="card">
							<div class="card-body">
								<small style="color: black">
								</small>
								<div class="info-form">
									<form action="tienda/" class="form-inlin" method="POST">
										<div class="form-group">
											<input type="text" name="usuario" class="form-control" placeholder="Usuario">
										</div>
										<br>
										<div class="form-group">
											<input type="password" name="password" class="form-control" placeholder="Contraseña">
										</div>
										<br>
										<button type="submit" class="btn btn-success">Iniciar sesión</button>
										<br><br>
										<a href="tienda/usuarios/crear"> Crear nueva cuenta </a>
									</form>
								</div>
							</div>
						</div>
						<br>
						<br>
						<br>
					</div>
				</div>
			</div>
		</div>
	</section>
</body>
</html>