<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8" />
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
    <link rel="stylesheet" href="invalid.css" />
    <title>Red362</title>
  </head>
  <body>
    <!--NavBar Identificativa colore Squadra-->
    <nav class="navbar fixed-top navbar-light red">
      <a class="navbar-brand" href="#">Dungeon and Dragons</a>
      <input type="button" value="Go Back" onclick="history.back()">
    </nav>

    <div class="wrapper">
      <div id="formContent">
        <figure>
          <img src="./images/x.jpg" width="50%" alt="error" />
          <figcaption> <span id="invalid">Invalid Login</span></figcaption>
        </figure>
      </div>
    </div>
    
  </body>
</html>
