<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="es">
<head>
<meta charset="ISO-8859-1">
<!-- Required meta tags -->
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.6.3.js"
	integrity="sha256-nQLuAZGRRcILA+6dMBOvcRh5Pe310sBpanc6+QBmyVM="
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.14.7/dist/umd/popper.min.js"
	integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js"
	integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
	crossorigin="anonymous"></script>
<script type="text/javascript" src="/resources/js/menu.js"></script>
<link href="/resources/css/menu.css" rel="stylesheet" type="text/css">
<script type="text/javascript">
	var $login = '${login}';
	var $nombreCompleto = '${nombreCompleto}';
</script>
<title>TRIS Menu</title>
</head>
<body>
	<nav class="navbar navbar-light" style="background-color: #e3f2fd;">
		<div id="navbarText">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item">
					<div>
						<a class="nav-link"
							href="http://localhost:8080/underConstruction/cargaInicial">Administración
							usuarios</a>
					</div>
				</li>
				<li class="nav-item">
					<div>
						<a class="nav-link"
							href="http://localhost:8080/underConstruction/cargaInicial">Administración
							calendario laboral</a>
					</div>
				</li>
				<li class="nav-item">
					<div>
						<a class="nav-link"
							href="http://localhost:8080/underConstruction/cargaInicial">Administración
							Informes</a>
					</div>
				</li>
				<li class="nav-item">
					<div>
						<a class="nav-link" id="regHorario">Registro horario</a>
					</div>
				</li>
				<li class="nav-item">
					<div>
						<a class="nav-link" 
							href="http://localhost:8080/underConstruction/cargaInicial">Justificantes</a>
					</div>
				</li>
				<li class="nav-item" id="logout">
					<div>
						<a class="nav-link" href="http://localhost:8080/">${nombreCompleto}
							Logout</a>
					</div>
				</li>
			</ul>
		</div>
	</nav>
</body>
</html>