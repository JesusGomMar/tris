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
<link rel="stylesheet"
	href="https://unpkg.com/js-year-calendar@latest/dist/js-year-calendar.min.css">
<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.6.3.js"
	integrity="sha256-nQLuAZGRRcILA+6dMBOvcRh5Pe310sBpanc6+QBmyVM="
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js"
	integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
	crossorigin="anonymous"></script>
<script
	src="https://unpkg.com/js-year-calendar@latest/dist/js-year-calendar.js">
</script>
<jsp:include page="menu.jsp"></jsp:include>
<script type="text/javascript" src="/resources/js/calendarioLaboral.js"></script>
<link href="/resources/css/calendarioLaboral.css" rel="stylesheet" type="text/css">
<title>Calendario Laboral</title>
</head>
<body>

	<div id="calendar"></div>

	<div class="modal fade" id="event-modal">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title">Event</h5>
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<div class="modal-body">
					<input type="hidden" name="event-index">
					<form class="form-horizontal">
						<div class="form-group row">
							<label for="event-name" class="col-sm-4 control-label">Name</label>
							<div class="col-sm-8">
								<input id="event-name" name="event-name" type="text"
									class="form-control">
							</div>
						</div>
						<div class="form-group row">
							<label for="event-location" class="col-sm-4 control-label">Location</label>
							<div class="col-sm-8">
								<input id="event-location" name="event-location" type="text"
									class="form-control">
							</div>
						</div>
						<div class="form-group row">
							<label for="min-date" class="col-sm-4 control-label">Dates</label>
							<div class="col-sm-8">
								<div class="input-group input-daterange"
									data-provide="datepicker">
									<input id="min-date" name="event-start-date" type="text"
										class="form-control">
									<div class="input-group-prepend input-group-append">
										<div class="input-group-text">to</div>
									</div>
									<input name="event-end-date" type="text" class="form-control">
								</div>
							</div>
						</div>
					</form>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">Cancel</button>
					<button type="button" class="btn btn-primary" id="save-event">
						Save</button>
				</div>
			</div>
		</div>
	</div>
	<div id="context-menu"></div>
</body>
</html>