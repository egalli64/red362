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
<link rel="stylesheet" href="login.css" />
<title>Red362</title>
</head>
<body>
	<!--NavBar Identificativa colore Squadra-->
	<nav class="navbar fixed-top navbar-light red">
		<a class="navbar-brand" href="#">Dungeon and Dragons</a> <input
			type="button" value="Go Back" onclick="history.back()">
	</nav>



	<div class="wrapper fadeInDown">
		<div id="formContent">

			<c:if test="${userRegistered != null}">
				<div class="container">
					<p class="text-success">${userRegistered}</p>
				</div>
				
			</c:if>

			<!--Image Form-->
			<div class="fadeIn first">
				<img src="./images/Ulisse.jpg" id="icon" alt="User Icon" />
			</div>

			<!-- Login Form -->
			<form action="LoginServlet" method="post">
				<input type="email" id="login" class="fadeIn second" name="email"
					placeholder="Email"> <input type="password" id="password"
					class="fadeIn third" name="password" placeholder="Password">
				<input type="submit" class="fadeIn fourth" value="Log In">
			</form>

			<!-- Sign In -->
			<div id="formFooter">
				<a class="underlineHover" href="./signIn.jsp">Non sei
					registrato? Registrati</a>
			</div>

		</div>
	</div>

	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>
</body>
</html>
