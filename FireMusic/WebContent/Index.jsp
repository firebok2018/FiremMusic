<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Index</title>
	<link href="https://fonts.googleapis.com/css?family=Bitter|Gloria+Hallelujah|Open+Sans|Paytone+One|Poppins|Roboto|Roboto+Mono|Ubuntu" rel="stylesheet">
	<link rel="stylesheet" href="CSS/style_index.css">
<script src="JS/jquery.min.js"></script>
	<style>
		*,
		*::after,
		*::before{
			box-sizing: border-box;
			padding: 0;
			margin: 0;
		}
		*:focus {outline: none;}
		body{
			background-image: url(Imagen/audio.jpg);
			box-sizing: border-box;
			background-repeat: no-repeat;
			background-size: cover;
			background-attachment: fixed;
			user-select: none; 
		}
	</style>
</head>
<body>
	<head>
		<jsp:include page="Header.jsp"/>
	</head>

	
	<section id="sx">
		<jsp:include page="Search.jsp"/>
	</section>
	
		<jsp:include page="Footer.jsp"/>
	
		

	
</body>
</html>