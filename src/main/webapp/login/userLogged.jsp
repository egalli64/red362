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
			<a class="navbar-brand" href="#">Dungeon and Dragons</a> <input
				type="button" value="Go Back!" onclick="history.back()">
		</nav>
	<div class="wrapper">
		<form id="formContent">
			<p class="text-justify text-center text-primary">Benvenuto avventuriero, avvicinati... un po' di più... un po'
				di più... ok niente non ci vedo potresti dirmi che tipo sei?</p>
				<input type="radio" name="option" value="Guerriero" id="guerriero" checked>Guerriero <br>
				<input type="radio" name="option" value="Vate" id="vate" >Vate <br>
				<input type="radio" name="option" value="Prete" id="prete" > Prete <br>
				
				<div class="container">
				<img src="images/Guerriero.jpg" width="400" class="rounded mx-auto d-block" alt="..." id="formula">
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

