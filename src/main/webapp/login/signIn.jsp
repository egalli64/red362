<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="it">
  <head>
    <!-- Required meta tags -->
    <meta charset="ISO-8859-1" />
    <meta
      name="viewport"
      content="width=device-width, initial-scale=1, shrink-to-fit=no"
    />

    <!-- Bootstrap CSS -->
    <link
      rel="stylesheet"
      href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
      integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
      crossorigin="anonymous"
    />
    <link rel="stylesheet" href="signIn.css" />
    <title>Red362</title>
  </head>
  <body>
    <!--NavBar Identificativa colore Squadra-->
    <nav class="navbar fixed-top navbar-light red">
      <a class="navbar-brand" href="login.html">Dungeon and Dragons</a>
    </nav>

    <div class="wrapper">
      <div id="formContent">
        <div>
          <img src="./images/Ulisse.jpg" id="icon" alt="User Icon" />
        </div>

        <!-- Login Form -->
        <form name="signin" method="post" action="signIn" onsubmit="return validateForm()">
          <input type="email" name="email" id="email" placeholder="Email" />
          <label id="errorEmail" for="email"></label>
          <input
            type="text"
            name="username"
            id="username"
            placeholder="Inserisci il tuo nome utente"
            required
          />
          <label id="errorEmail" for="username"></label>
          <input
            type="password"
            name="password"
            id="password"
            placeholder="Password (min 8 char)"
            required
          />
          <label id="errorPassword" for="password"></label>
          <input
            type="password"
            name="repeatedPassword"
            id="repeatedPassword"
            placeholder="Ripeti la password"
            required
          />
          <label id="errorRepeated" for="repeatedPassword"></label>
          <input type="submit" id="signin" value="Sign In" />
        </form>
      </div>
    </div>

    <script type="text/javascript">
      function validateForm() {
        var username = document.forms["signin"]["username"].value;
        var password = document.forms["signin"]["password"].value;
        var repeated = document.forms["signin"]["repeatedPassword"].value;
        if (username == "") {
          document.getElementById("errorEmail").innerHTML = "Campo Vuoto";
          return false;
        }
        if (password == "" || password.length < 8) {
            document.getElementById("errorPassword").innerHTML = "Campo password non valido";
            return false;
        }
        if (password !== repeated) {
            document.getElementById("errorRepeated").innerHTML = "Ripetere bene la password";
            return false;
        }
        return true;
        
      }
    </script>

    <script
      src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
      integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
      crossorigin="anonymous"
    ></script>
    <script
      src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
      integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
      crossorigin="anonymous"
    ></script>
    <script
      src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
      integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
      crossorigin="anonymous"
    ></script>
  </body>
</html>

