<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@ include file = "menu.jsp" %>
	<%!
	// M�todo para pegar a data atual
	public String getDataAtual() {
		return new Date().toString();
	}
	%>
	<h1>Bem-vindo ao curso de Java intermedi�rio do TreinaWeb!</h1>
	<%
		String mensagem = "";
		mensagem = "Estou testando o JSP";
		out.println(mensagem);
	%>
	<p>A data atual � <%=getDataAtual() %></p>
	
	<%
	String tabela = "";
	tabela = "<table>";
	for (int i = 0; i <= 10; i++) {
		int resultado = 2 * i;
		tabela += "<tr>";
		tabela += "<td>";
		tabela += "2 x " + i + " = ";
		tabela += "</td>";
		tabela += "<td>";
		tabela += resultado;
		tabela += "</td>";
		tabela += "</tr>";
	}
	tabela += "</table>";
	out.println(tabela);
	%>
	
	<!-- Isso � um  coment�rio HTML -->
</body>
</html>