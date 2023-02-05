$(function() {
	$.ajax({
		type: 'GET',
		cache: false,
		data: "login=" + $login,
		url: 'http://localhost:8080/admUsuario/cargaGrid',
		dataType: 'json',
		success: function(res) {
			if (null !== res) {
				var data;
				var activo; 
				for (i = 0; i < res.length; i++) {
					data = res[i];
					if (data.activo ===1){
						activo = 'Si';
					} else{
						activo = 'No';
					}
					var newRowContent = "<tr><td>" + data.nombre
						+ "</td><td>" + data.apellidos + "</td><td>" + data.mail
						+ "</td><td>" + data.fechaAltaSt + "</td><td>" + activo
						+ "</td><td><button type='button' id='btnEditarUsuario' class='btn btn-primary'>Editar</button></td>";
					$("#tablaIncurridos tbody").append(newRowContent);
				}
			}
		}
	});
	$('#btnEditarUsuario').click(function() {
		alert('Pendiente Implementacion');
	});
	$('#btnAddUsuario').click(function() {
		alert('Pendiente Implementacion');
	});
});