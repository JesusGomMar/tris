$(function() {
	$('#regHorario').click(function(e) {
		window.location.replace("http://localhost:8080/registroHorario/cargaInicial?login=" +
			$login + "&nombre=" + $nombreCompleto);
	});
});