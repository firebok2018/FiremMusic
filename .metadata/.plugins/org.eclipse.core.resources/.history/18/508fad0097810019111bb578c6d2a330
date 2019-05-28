<%@page import="model.Usuarios"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>USuaro logeado</h1>
<span>
<% 
	Usuarios xuser=(Usuarios)session.getAttribute("USUARIO");
%>
</span>
<font color="red">
<%
	if(xuser != null){
		out.print(xuser.getNick()+" "+xuser.getEmail());
	}
%>
</font>

<a HREF="SignOut">cerrar sesion </a>
</body>
</html>