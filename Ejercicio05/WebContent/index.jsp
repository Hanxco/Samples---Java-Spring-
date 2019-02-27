<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>TU PC</title>

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
	<div id="fondo"></div>
	<section id="cover">
		<div id="cover-caption">
			<div id="container" class="container">
				<div class="row text-white">
					<div class="col-sm-6 offset-sm-3 text-center" style="margin-top: 30px;">
						<img class="img-fluid"
							src="https://www.adslzone.net/app/uploads/2015/03/apertura-montar-pc-medida-piezas.jpg"
							style="margin-bottom: 10px; width: 80%;" /> <br>
						<div class="card">
							<div class="card-body">
								<small style="color: black">
									<%  if(request.getParameter("confirmacion")!=null){ %>
									<div class="alert alert-danger" role="alert">
										<% out.print(request.getParameter("confirmacion")); %>
									</div>
									<%	} %>
								</small>
								<div class="info-form">
									<form action="tienda/" class="form-inlin justify-content-center" method="POST">
										<div class="form-group">
											<input type="text" name="username" class="form-control" placeholder="Usuario">
										</div>
										<br>
										<div class="form-group">
											<input type="text" name="password" class="form-control" placeholder="Contraseña">
										</div>
										<br>
										<button type="submit" class="btn btn-success">Iniciar sesión</button>
										<br><br>
										<a href="" > Crear nueva cuenta </a>
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