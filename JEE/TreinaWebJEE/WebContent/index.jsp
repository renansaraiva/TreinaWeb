<%@page import="java.util.Calendar"%>
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
	<%@include file="menu.jsp"%>
	<fieldset style="width: 200px">
		<form method="post" action="infoUsuario.jsp">
			<legend>Informações do usuário</legend>
			<div style="font-weight: bold;">Nome Completo:</div>
			<div>
				<input type="text" name="nomeCompleto" />
			</div>
			<div style="font-weight: bold;">Nome de Usuário:</div>
			<div>
				<input type="text" name="nomeUsuario" />
			</div>
			<div style="font-weight: bold;">Senha:</div>
			<div>
				<input type="password" name="senha" />
			</div>
			<div>
				<input type="submit" name="Enviar" />
			</div>
		</form>
	</fieldset>
	<%!// Método para pegar a data atual
	public String getDataAtual() {
		return new Date().toString();
	}%>
	<h1>Bem-vindo ao curso de Java intermediário do TreinaWeb!</h1>
	<%
		String mensagem = "";
		mensagem = "Estou testando o JSP";
		out.println(mensagem);
	%>
	<p>
		A data atual é
		<%=getDataAtual()%></p>

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

	<%
		Calendar data = Calendar.getInstance();
		int hora = data.get(Calendar.HOUR_OF_DAY);
		if (hora >= 6 && hora < 12) {
			out.println("Bom dia!!!");
		} else if (hora >= 12 && hora < 18) {
			out.println("Boa tarde!!!");
		} else if (hora >= 18 && hora < 24) {
			out.println("Boa noite!!!");
		} else {
			out.println("Boa madrugada!!!");
		}
		int mes = data.get(Calendar.MONTH) + 1;
		switch (mes) {
		case 1:
			out.println("É Janeiro!");
			break;
		case 2:
			out.println("É Fevereiro!");
			break;
		case 3:
			out.println("É Março!");
			break;
		case 4:
			out.println("É Abril!");
			break;
		case 5:
			out.println("É Maio!");
			break;
		case 6:
			out.println("É Junho!");
			break;
		case 7:
			out.println("É Julho!");
			break;
		case 8:
			out.println("É Agosto!");
			break;
		case 9:
			out.println("É Setembro!");
			break;
		case 10:
			out.println("É Outubro!");
			break;
		case 11:
			out.println("É Novembro!");
			break;
		case 12:
			out.println("É Dezembro!");
			break;
		}
	%>

	<!-- Isso é um  comentário HTML -->
</body>
</html>