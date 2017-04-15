<!DOCTYPE html>

<html lang="en">
<head>
<meta charset="UTF-8">
<title>Lost In Translation</title>
<link rel="stylesheet" type="text/css"
	href="resources/bootstrap-3.3.7/css/bootstrap.min.css">
</head>
<body>
	<div class="jumbotron text-center">
		<h1>Lost In Translation</h1>
	</div>
	<div class="container">
		<div class="row">
			<form class="form-inline col-sm-8 col-sm-offset-4">
				<div class="form-group">
					<label for="searchBox">Enter label name:</label> 
					<input class="form-control" id="searchBox" />
				</div>
				<button id="btnSubmit" type="submit" class="btn btn-primary">Submit</button>
			</form>
		</div>
		<div class="row">
			<input type="text"class="input-lg col-sm-6 col-sm-offset-3 text-center" id="result" disabled>
		</div>
	</div>	
</body>
<script type="text/javascript" src="resources/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="resources/lostintranslation.js"></script>
</html>