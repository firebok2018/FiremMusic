
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0" />
	<link href="https://fonts.googleapis.com/css?family=Bitter|Gloria+Hallelujah|Open+Sans|Paytone+One|Poppins|Roboto|Roboto+Mono|Ubuntu" rel="stylesheet">
	<link rel="stylesheet" href="CSS/style_signin.css">
	<script src="JS/jquery.min.js"></script>

	<title>Sign In</title>

	<div id="boxSingIn">
		<form action="SignIn" method="post" id="formSignIn" name="frm_signin">
			<div id="icon">Sign In Fire Music
			
			</div>
			<span>
				<%
					String mensaje=(String) request.getAttribute("MENSAJE");
					if(mensaje != null){
				%>	
					<font color="red" size="3"><%=mensaje %></font>
					
				<% }%>
			</span>
			<input id="user" type="text" placeholder="User" name="user_name">
			<input id="pwd" type="password" placeholder="Password" name="user_pwd">
			<input id="SignIn" type="submit" value="Sign In" name=btn_login>
			<a id="op" href="">Forgot your Password?</a>
		</form>
	</div>
	<script>
	
	</script>


