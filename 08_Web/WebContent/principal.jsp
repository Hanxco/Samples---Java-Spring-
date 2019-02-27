<%@ page import="curso.modelo.entidades.Persona" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bienvenido <%=request.getParameter("nombre")%></title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css"
	integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS"
	crossorigin="anonymous">

</head>
<body>

	<div class="container" style="padding-top: 20px">
		<div class="alert alert-success" role="alert">Se ha logeado
			correctamente</div>
		<div class="jumbotron">
			<h1>
				Bienvenido
				<%=request.getParameter("nombre")%></h1>
		</div>

		<div class="card">
			<div class="card-header">
				<h5 class="card-title"><b>Ejemplo 1 : </b>Pasando valor por el request</h5>
			</div>
			<div class="card-body">
				<p class="card-text">
					El mensaje que me llega del controlador es
					<%=request.getAttribute("respuesta")%>
				</p>
			</div>			
		</div>
		<div class="card">
			<div class="card-header">
				<h5 class="card-title"><b>Ejemplo 2 : </b>Estructura for</h5>
			</div>
			<div class="card-body">
				<p class="card-text">
					<%
						for(int i=0; i<5; i++){
							out.print(i);
						}
						
					%>
				</p>
			</div>			
		</div>
		<div class="card">
			<div class="card-header">
				<h5 class="card-title"><b>Ejemplo 3 : </b>Entrando a objeto Persona</h5>
			</div>
			<div class="card-body">
				<p class="card-text">
					<%
						Persona p = (Persona)request.getAttribute("persona");
						out.print(p.getNombre());						
					%>
				</p>
			</div>			
		</div>
		<div class="card">
			<div class="card-body">
				<a href="ServletSegundo">Servlet Segundo</a>
			</div>
		</div>			
	</div>
</body>
</html>