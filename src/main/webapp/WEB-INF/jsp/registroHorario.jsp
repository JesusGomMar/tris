<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="es">
<head>
<meta charset="ISO-8859-1">
<jsp:include page="menu.jsp"></jsp:include>
<script type="text/javascript" src="/resources/js/registroHorario.js"></script>
<title>Control de horas</title>
</head>
<body>
	<button type="button" id="btnAddIncurrido" class="btn btn-primary">Agregar Incurrido</button>
	<table id="tablaIncurridos"
		class="table table-striped table-bordered table-hover">
		<thead>
			<tr>
				<th scope="col">Proyecto</th>
				<th scope="col">Nombre Tarea</th>
				<th scope="col">Tipo Tarea</th>
				<th scope="col">Fecha Incurrida</th>
				<th scope="col">Horas</th>
				<th scope="col">Comentarios</th>
				<th scope="col">Acciones</th>
			</tr>
		</thead>
		<tbody></tbody>
	</table>
</body>
</html>