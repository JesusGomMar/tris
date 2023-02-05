<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="es">
<head>
<meta charset="ISO-8859-1">
<jsp:include page="menu.jsp"></jsp:include>
<script type="text/javascript" src="/resources/js/admUsuario.js"></script>
<title>Administracion de usuarios</title>
</head>
<body>
	<button type="button" id="btnAddUsuario" class="btn btn-primary">Agregar Usuario</button>
	<table id="tablaIncurridos"
		class="table table-striped table-bordered table-hover">
		<thead>
			<tr>
				<th scope="col">Nombre</th>
				<th scope="col">Apellidos</th>
				<th scope="col">Correo electronico</th>
				<th scope="col">Fecha Alta</th>
				<th scope="col">Activo</th>
				<th scope="col">Acciones</th>
			</tr>
		</thead>
		<tbody></tbody>
	</table>
</body>
</html>