let calendar = null;
$(function() {
	var currentYear = new Date().getFullYear();

	Calendar.locales['es'] = {
		days: ["Domingo", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado"],
		daysShort: ["Dom", "Lun", "Mar", "Mié", "Jue", "Vie", "Sáb"],
		daysMin: ["Do", "Lu", "Ma", "Mi", "Ju", "Vi", "Sa"],
		months: ["Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"],
		monthsShort: ["Ene", "Feb", "Mar", "Abr", "May", "Jun", "Jul", "Ago", "Sep", "Oct", "Nov", "Dic"],
		weekShort: 'S',
		weekStart: 1
	};
	calendar = new Calendar('#calendar', {
		language: 'es',
		enableContextMenu: true,
		enableRangeSelection: true,
		mouseOnDay: function(e) {
			if (e.events.length > 0) {
				var content = '';

				for (var i in e.events) {
					content += '<div class="event-tooltip-content">'
						+ '<div class="event-name" style="color:' + e.events[i].color + '">' + e.events[i].name + '</div>'
						+ '<div class="event-location">' + e.events[i].location + '</div>'
						+ '</div>';
				}

				$(e.element).popover({
					trigger: 'manual',
					container: 'body',
					html: true,
					content: content
				});

				$(e.element).popover('show');
			}
		},
		mouseOutDay: function(e) {
			if (e.events.length > 0) {
				$(e.element).popover('hide');
			}
		},
		dayContextMenu: function(e) {
			$(e.element).popover('hide');
		},
		dataSource: [
			{
				id: 0,
				name: 'Fiesta A&ntilde;o Nuevo',
				location: 'Nacional',
				startDate: new Date(currentYear, 0, 2),
				endDate: new Date(currentYear, 0, 2)
			},
			{
				id: 1,
				name: 'Fiesta Epifania del Se&ntilde;or',
				location: 'Castilla y Leon',
				startDate: new Date(currentYear, 0, 6),
				endDate: new Date(currentYear, 0, 6)
			},
			{
				id: 2,
				name: 'Periodo de Semana Santa',
				location: 'Nacional',
				startDate: new Date(currentYear, 3, 6),
				endDate: new Date(currentYear, 3, 9)
			},
			{
				id: 3,
				name: 'Fiesta de Castilla y Leon',
				location: 'Castilla y Leon',
				startDate: new Date(currentYear, 3, 24),
				endDate: new Date(currentYear, 3, 24)
			},
			{
				id: 4,
				name: 'Fiesta del trabajo',
				location: 'Nacional',
				startDate: new Date(currentYear, 4, 1),
				endDate: new Date(currentYear, 4, 1)
			},
			{
				id: 5,
				name: 'Fiesta local en Salamanca',
				location: 'Salamanca',
				startDate: new Date(currentYear, 5, 12),
				endDate: new Date(currentYear, 5, 12)
			},
			{
				id: 6,
				name: 'Dia de Santiago Apostol',
				location: 'Nacional',
				startDate: new Date(currentYear, 6, 25),
				endDate: new Date(currentYear, 6, 25)
			},
			{
				id: 7,
				name: 'Fiesta Asuncion de la Virgen',
				location: 'Nacional',
				startDate: new Date(currentYear, 7, 15),
				endDate: new Date(currentYear, 7, 15)
			},
			{
				id: 8,
				name: 'Dia de la hispanidad',
				location: 'Nacional',
				startDate: new Date(currentYear, 9, 12),
				endDate: new Date(currentYear, 9, 12)
			},
			{
				id: 9,
				name: 'Dia de Todos los Santos',
				location: 'Nacional',
				startDate: new Date(currentYear, 10, 1),
				endDate: new Date(currentYear, 10, 1)
			},
			{
				id: 10,
				name: 'Dia de la Constitucion',
				location: 'Nacional',
				startDate: new Date(currentYear, 11, 6),
				endDate: new Date(currentYear, 11, 6)
			},
			{
				id: 11,
				name: 'Dia de la Inmaculada Concepcion',
				location: 'Nacional',
				startDate: new Date(currentYear, 11, 8),
				endDate: new Date(currentYear, 11, 8)
			},
			{
				id: 12,
				name: 'Dia de Navidad',
				location: 'Nacional',
				startDate: new Date(currentYear, 11, 25),
				endDate: new Date(currentYear, 11, 25)
			}
		]
	});
});
