$(function() {
	$.ajax({
		type: 'GET',
		cache: false,
		data: "login=" + $login,
		url: 'http://localhost:8080/registroHorario/cargaGrid',
		dataType: 'json',
		success: function(res) {
			if (null !== res) {
				var data;
				for (i = 0; i < res.length; i++) {
					data = res[i];
					var newRowContent = "<tr><td>" + data.nombreProyecto
						+ "</td><td>" + data.nombreTarea + "</td><td>" + data.nombreTipoTarea
						+ "</td><td>" + data.fecha + "</td><td>" + data.tiempo
						+ "</td><td>" + data.comentarios
						+ "</td><td><button type='button' id='btnEditarIncurrido' class='btn btn-primary'>Editar</button></td>";
					$("#tablaIncurridos tbody").append(newRowContent);
				}
			}
		}
	});
	$('#btnEditarIncurrido').click(function() {
		alert('Pendiente Implementacion');
	});
	$('#btnAddIncurrido').click(function() {
		alert('Pendiente Implementacion');
	});
});