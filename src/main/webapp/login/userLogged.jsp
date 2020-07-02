<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no" />

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous" />
<link rel="stylesheet" href="registration.css" />
<title>Red362</title>
</head>

<body>
	<!--NavBar Identificativa colore Squadra-->
	<nav class="navbar fixed-top navbar-light red">
		<a class="navbar-brand" href="userLogged.jsp">Dungeon and Dragons</a>
	</nav>
	<div class="wrapper">
		<form id="formContent" action="../gameplay/play">
			<h2 class="font-weight-bold text-success">
				Benvenuto:
				<c:out value="${sessionScope.user.username}" />
			</h2>
			<br>
			<div class="input-group mb-3">
				<div class="input-group-prepend">
					<span class="input-group-text" id="basic-addon3">Inserisci
						nickname</span>
				</div>
				<input type="text" class="form-control" id="basic-url"
					aria-describedby="basic-addon3" name="nickname">
			</div>
			<br> <input type="radio" name="option" value="Guerriero"
				id="guerriero" checked>Guerriero <br> <input
				type="radio" name="option" value="Vate" id="vate">Vate <br>
			<input type="radio" name="option" value="Prete" id="prete">
			Prete <br>
			<div class="container-image">
				<img src="images/Guerriero.jpg" class="rounded mx-auto d-block"
					alt="..." id="formula">
			</div>
			<div id="formFooter">
				<button class="btn btn-primary text-uppercase font-weight-bold"
					type="submit">Gioca</button>
			</div>
		</form>
	</div>



</body>

<script type='text/javascript'>
	window.onload = myFunction();
	function myFunction() {
		document.getElementById("guerriero").onclick = function() {
			document.getElementById("formula").src = "images/Guerriero.jpg";
		}
		document.getElementById("vate").onclick = function() {
			document.getElementById("formula").src = "images/Vate.jpg";
		}
		document.getElementById("prete").onclick = function() {
			document.getElementById("formula").src = "images/Prete.jpg";
		}
	}
</script>

</html>

