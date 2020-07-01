<!DOCTYPE html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no" />

<head>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
</head>

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
			<p class="text-justify text-center text-primary">Benvenuto avventuriero, avvicinati... un po' di pi�... un po'
				di pi�... ok niente non ci vedo potresti dirmi che tipo sei?</p>
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
    $(document).ready(function(){
        $("input:radio[name=option]").click(function() {
            var value = $(this).val();
            var image_name;
            if(value == 'Guerriero'){
                image_name = "images/Guerriero.jpg";
            }else{
                if(value == 'Vate'){
                    image_name = "images/Vate.jpg";
                }else{
                    image_name = "images/Prete.jpg";
                }
            }
             $('#formula').attr('src', image_name);
        });
    });

	function guerClick() {
		var image = document.getElementsByName("showimage");
		image.innerHTML = '<img src="images/Guerriero.jpg">';
	}
	function vateClick() {
		var image = document.getElementsByName("showimage");
		image.src = '<img src="images/Vate.jpg">';
	}
	function preteClick() {
		System.out.println("click verified");
		document.getElementsByName("showimage").image.src = '<img src="images/Prete.jpg">';
	}
</script>
	
</script>
</html>

