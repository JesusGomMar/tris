$(function() {
	$('#regHorario').click(function() {
		window.location.replace("http://localhost:8080/registroHorario/cargaInicial?login=" +
			$login + "&nombre=" + $nombreCompleto);
	});
	$('#calLaboral').click(function() {
		window.location.replace("http://localhost:8080/calendarioLaboral/cargaInicial?login=" +
			$login + "&nombre=" + $nombreCompleto);
	});
});