<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="es">
<head>
<meta charset="ISO-8859-1">
<link href="/resources/css/error.css" rel="stylesheet" type="text/css">

<title>ERROR</title>

</head>
<body>
	<h1>ERROR DE TRIS</h1>
	<h1>
		<a href="http://localhost:8080/">Login</a>
	</h1>

	<table>
		<tr>
			<td>Date</td>
			<td>${timestamp}</td>
		</tr>
		<tr>
			<td>Error</td>
			<td>${error}</td>
		</tr>
		<tr>
			<td>Status</td>
			<td>${status}</td>
		</tr>
		<tr>
			<td>Message</td>
			<td>${message}</td>
		</tr>
		<tr>
			<td>Exception</td>
			<td>${exception}</td>
		</tr>
		<tr>
			<td>Trace</td>
			<td><pre>${trace}</pre></td>
		</tr>
	</table>
</body>
</html>