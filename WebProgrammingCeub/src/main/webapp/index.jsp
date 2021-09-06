<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<html>

<head>

<meta charset="ISO-8859-1">
<title>Boas Vindas</title>

</head>

<body>
	Por favor, inserir primeiro e ultimo nome:
	<form action = "ServletPrimeiroEUltimoNome" method = "get">
	<input type = "text" name = "nome" />
	<input type = "text" name = "snome" />
	<input type = "submit" value = "Enviar"/>
	</form>
</body>

<body><br><br><br>
	<a href = "ServletPaginaAgenda"> Servert Pagina Agenda </a>
</body>

<body><br><br><br>
	Por favor, inserir os valores a serem somados: 
	<form action = "ServletCalculadora" method = "get">
	<input type = "text" name = "valor1" />
	<input type = "text" name = "valor2" />
	<input type = "submit" value = "Enviar"/>
	</form>
</body>

</html>