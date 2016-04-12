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
	// Método para pegar a data atual
	public String getDataAtual() {
		return new Date().toString();
	}
	%>
	<h1>Bem-vindo ao curso de Java intermediário do TreinaWeb!</h1>
	<%
		String mensagem = "";
		mensagem = "Estou testando o JSP";
		out.println(mensagem);
	%>
	<p>A data atual é <%=getDataAtual() %></p>
	<!-- Isso é um  comentário HTML -->
</body>
</html>