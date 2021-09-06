<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">
<title>Formulario</title>
</head>

<body>
	<form action = "ServletAgenda" method = "get">	
	Nome:	<input type = "text" name = "nome" />
	Telefone:	<input type = "text" name = "tele" />
	D.Nacimento:<input type = "text" name = "dnac" />	
	<input type = "submit" Value = "Enviar" />
	</form>
</body>

</html>