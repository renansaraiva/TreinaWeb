<%@page import="java.util.Enumeration"%>
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
	out.println(request.getParameter("nomeUsuario"));
	out.println(request.getParameter("senha"));
	String tabela = "<table>";
	Enumeration<String> parametros = request.getParameterNames();
	while (parametros.hasMoreElements()) {
		String nomeParametro = parametros.nextElement();
		tabela += "<tr>";
		tabela += "<td>";
		tabela += nomeParametro;
		tabela += "</td>";
		tabela += "<td>";
		tabela += request.getParameter(nomeParametro);
		tabela += "</td>";
		tabela += "</tr>";
	}
	tabela += "</table>";
	out.println(tabela);
%>
</body>
</html>