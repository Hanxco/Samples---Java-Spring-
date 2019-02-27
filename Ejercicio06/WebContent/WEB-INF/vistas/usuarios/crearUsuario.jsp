<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Crear usuario</title>

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
					<div class="col-sm-6 offset-sm-3" style="margin-top: 30px;">
						<img class="img-fluid"
							src="https://www.adslzone.net/app/uploads/2015/03/apertura-montar-pc-medida-piezas.jpg"
							style="margin-bottom: 10px; width: 80%;" /> <br>
						<div class="card">
							<div class="card-body">
								<h4 class="text-center">Crear Usuario</h4>
								<small style="color: red" class="text-center">
									${msgErrores}
								</small>
								<div class="info-form">
									<form:form id="formulario" name="formulario" class="form-inlin" method="POST" modelAttribute="usuario">								
										<div class="form-group">
										    <label for="exampleInputEmail1">Nombre</label>
											<input type="text" name="nombre" class="form-control" placeholder="Nombre">
										</div>
										<div class="form-group">
										    <label for="exampleInputEmail1">Usuario</label>
											<input type="text" name="usuario" class="form-control" placeholder="Usuario">
										</div>
										<div class="form-group">
										    <label for="exampleInputEmail1">Contraseña</label>
											<input type="password" name="password" class="form-control" placeholder="Contraseña">
										</div>
										<br>
										<button type="submit" class="btn btn-success">Crear</button>
										<br><br>
									</form:form>
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