<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="./bootstrap-italia.min.css">

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">


</head>
<body>
	<p>Utente Loggato Correttamente</p>
<font face="Verdana" size="4" >
<i><p id="des"></p></i>
</font>

<div>
  <div class="form-check">
    <input name="gruppo1" type="radio" id="radio1" checked>
    <label for="radio1"> <p id="ob1"></p> </label>
  </div>
  <div class="form-check">
    <input name="gruppo1" type="radio" id="radio2">
    <label for="radio2"><p id="ob2"></p></label>
  </div>
    <div class="form-check">
    <input name="gruppo1" type="radio" id="radio2">
    <label for="radio2"><p id="ob3"></p></label>
  </div>
</div>
</div>

<button class="btn btn-primary" type="submit" onclick= "myFunction()">Process Data</button>





<script>
ob1 = "Prima Scelta Dinamica";
ob2 = "Seconda Scelta Dinamica";
ob3 = "Terza Scelta Dinamica";
des = "Descrizione Dinamica";
document.getElementById("ob1").innerHTML = ob1;
document.getElementById("ob2").innerHTML = ob2;
document.getElementById("ob3").innerHTML = ob3;
document.getElementById("des").innerHTML = des;

function myFunction() {
	  ob1 = "Prima scelta modificata";
	  ob2 = "Seconda scelta modificata";
	  ob3 = "Terza scelta modificata";
	  des = "Descrizione dinamica modifcata"
	  document.getElementById("ob1").innerHTML = ob1;
	  document.getElementById("ob2").innerHTML = ob2;
	  document.getElementById("ob3").innerHTML = ob3;
	  document.getElementById("des").innerHTML = des;
}
</script> 



</body>
</html>

<p id="demo"></p>

