<%@page import="br.com.treinaweb.jee.models.Usuario"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		String valorCookie = "";
		Cookie[] cookies = request.getCookies();
		for (Cookie c : cookies) {
			if (c.getName().equals("_nomeUsuarioConectado_")) {
				valorCookie = c.getValue();
				break;
			}
		}
	%>
	<a href = "http://www.google.com.br">Ir ao Google</a> |
	<a href = "http://www.bing.com.br">Ir ao Bing</a> |
	<a href = "http://localhost:8085/TreinaWebJEE/TesteIdade.jsp">Teste Idade</a> |
	<a href = "http://localhost:8085/TreinaWebJEE/VerificaIdade.jsp">Verifica Idade</a>
	Bem-vindo, <%= valorCookie %>.
	<hr />
</body>
</html>