<!DOCTYPE html>

<html lang="en">
<head>
<meta charset="UTF-8">
<title>Hello</title>
<link rel="stylesheet" type="text/css"
	href="resources/bootstrap-3.3.7/css/bootstrap.min.css">
</head>
<body>
	<div class="jumbotron text-center">
		<h1>Lost In Translation</h1>
	</div>
	<div class="container">
		<form class="form-inline col-sm-8 col-sm-offset-4">
			<div class="form-group">
				<label for="searchBox">Enter label name:</label> 
				<input class="form-control" id="searchBox" />
			</div>
			<button id="btnSubmit" type="submit" class="btn btn-primary">Submit</button>
		</form>

	</div>
	<div class="container">
		<div class=" col-md-4 col-md-offset-4 text-center">
			<label for="result">Result:</label> 
			<input type="text" id="result" disabled>
		</div>
	</div>
</body>
<script type="text/javascript" src="resources/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="resources/lostintranslation.js"></script>
</html>