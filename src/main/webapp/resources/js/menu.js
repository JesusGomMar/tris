$(function(){
	$('#regHorario').click(function(e){
		$.ajax({
			type: 'GET',
			url: '/registroHorario/cargaInicial',
			data: {login: $login, nombre: $nombreCompleto},
			success: function(res){
				console.log('exito');
				console.log(res);
				//load(res);
				return false;
			}
		});	
	});
	
	
	
	
});