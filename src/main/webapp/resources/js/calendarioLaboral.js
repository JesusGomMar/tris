let calendar = null;
$(function() {
    var currentYear = new Date().getFullYear();

    calendar = new Calendar('#calendar', { 
        enableContextMenu: true,
        enableRangeSelection: true,
        contextMenuItems:[
            {
                text: 'Update',
                click: editEvent
            },
            {
                text: 'Delete',
                click: deleteEvent
            }
        ],
        selectRange: function(e) {
            editEvent({ startDate: e.startDate, endDate: e.endDate });
        },
        mouseOnDay: function(e) {
            if(e.events.length > 0) {
                var content = '';
                
                for(var i in e.events) {
                    content += '<div class="event-tooltip-content">'
                                    + '<div class="event-name" style="color:' + e.events[i].color + '">' + e.events[i].name + '</div>'
                                    + '<div class="event-location">' + e.events[i].location + '</div>'
                                + '</div>';
                }
            
                $(e.element).popover({ 
                    trigger: 'manual',
                    container: 'body',
                    html:true,
                    content: content
                });
                
                $(e.element).popover('show');
            }
        },
        mouseOutDay: function(e) {
            if(e.events.length > 0) {
                $(e.element).popover('hide');
            }
        },
        dayContextMenu: function(e) {
            $(e.element).popover('hide');
        },
        dataSource: [
            {
                id: 0,
                name: 'Fiesta Año Nuevo',
                location: 'España',
                startDate: new Date(currentYear, 1, 2),
                endDate: new Date(currentYear, 1, 2)
            },
            {
                id: 1,
                name: 'Fiesta Epifania del Señor',
                location: 'Castilla y Leon',
                startDate: new Date(currentYear, 1, 6),
                endDate: new Date(currentYear, 1, 6)
            },
            {
                id: 2,
                name: 'Periodo de Semana Santa',
                location: 'España',
                startDate: new Date(currentYear, 4, 6),
                endDate: new Date(currentYear, 4, 9)
            },
            {
                id: 3,
                name: 'Fiesta de Castilla y Leon',
                location: 'Castilla y Leon',
                startDate: new Date(currentYear, 4, 24),
                endDate: new Date(currentYear, 4, 24)
            },
            {
                id: 4,
                name: 'Fiesta del trabajo',
                location: 'España',
                startDate: new Date(currentYear, 5, 1),
                endDate: new Date(currentYear, 5, 1)
            },
            {
                id: 5,
                name: 'Fiesta local en Salamanca',
                location: 'Salamanca',
                startDate: new Date(currentYear, 6, 12),
                endDate: new Date(currentYear, 6, 12)
            },
            {
                id: 6,
                name: 'Dia de Santiago Apostol',
                location: 'España',
                startDate: new Date(currentYear, 7, 25),
                endDate: new Date(currentYear, 7, 25)
            },
            {
                id: 7,
                name: 'Fiesta Asuncion de la Virgen',
                location: 'España',
                startDate: new Date(currentYear, 8, 15),
                endDate: new Date(currentYear, 8, 15)
            },
            {
                id: 8,
                name: 'Dia de la hispanidad',
                location: 'España',
                startDate: new Date(currentYear, 10, 12),
                endDate: new Date(currentYear, 10, 12)
            },
            {
                id: 9,
                name: 'Dia de Todos los Santos',
                location: 'España',
                startDate: new Date(currentYear, 11, 1),
                endDate: new Date(currentYear, 11, 1)
            },
            {
                id: 10,
                name: 'Dia de la Constitucion',
                location: 'España',
                startDate: new Date(currentYear, 12, 6),
                endDate: new Date(currentYear, 12, 6)
            },
            {
                id: 11,
                name: 'Dia de la Inmaculada Concepción',
                location: 'España',
                startDate: new Date(currentYear, 12, 8),
                endDate: new Date(currentYear, 12, 8)
            },
            {
                id: 12,
                name: 'Dia de Navidad',
                location: 'España',
                startDate: new Date(currentYear, 12, 25),
                endDate: new Date(currentYear, 12, 25)
            }
        ]
    });
    
    $('#save-event').click(function() {
        saveEvent();
    });
});

function editEvent(event) {
    $('#event-modal input[name="event-index"]').val(event ? event.id : '');
    $('#event-modal input[name="event-name"]').val(event ? event.name : '');
    $('#event-modal input[name="event-location"]').val(event ? event.location : '');
    $('#event-modal input[name="event-start-date"]').datepicker('update', event ? event.startDate : '');
    $('#event-modal input[name="event-end-date"]').datepicker('update', event ? event.endDate : '');
    $('#event-modal').modal();
}

function deleteEvent(event) {
    var dataSource = calendar.getDataSource();
    
    calendar.setDataSource(dataSource.filter(item => item.id !== event.id));
}

function saveEvent() {
    var event = {
        id: $('#event-modal input[name="event-index"]').val(),
        name: $('#event-modal input[name="event-name"]').val(),
        location: $('#event-modal input[name="event-location"]').val(),
        startDate: $('#event-modal input[name="event-start-date"]').datepicker('getDate'),
        endDate: $('#event-modal input[name="event-end-date"]').datepicker('getDate')
    }
    
    var dataSource = calendar.getDataSource();

    if (event.id) {
        for (var i in dataSource) {
            if (dataSource[i].id == event.id) {
                dataSource[i].name = event.name;
                dataSource[i].location = event.location;
                dataSource[i].startDate = event.startDate;
                dataSource[i].endDate = event.endDate;
            }
        }
    }
    else
    {
        var newId = 0;
        for(var i in dataSource) {
            if(dataSource[i].id > newId) {
                newId = dataSource[i].id;
            }
        }
        
        newId++;
        event.id = newId;
    
        dataSource.push(event);
    }
    
    calendar.setDataSource(dataSource);
    $('#event-modal').modal('hide');
}