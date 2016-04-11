package br.com.treinaweb.jee.servlets;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletVerificadorIdade
 */
@WebServlet(name = "ServletVerificadorIdade", urlPatterns = { "/SvtVerificaIdade" }, initParams = {
		@WebInitParam(name = "empresa", value = "TreinaWeb") })
public class ServletVerificadorIdade extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String empresa = "";

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletVerificadorIdade() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		empresa = config.getInitParameter("empresa");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String nome = request.getParameter("nome");
		int idade = Integer.parseInt(request.getParameter("idade"));
		response.getWriter().write("<html>");
		response.getWriter().write("    <head>");
		response.getWriter().write("        <title>Verificador de Idade</title>");
		response.getWriter().write("    </head>");
		response.getWriter().write("    <body>");
		response.getWriter().write("        <table>");
		response.getWriter().write("            <tr>");
		response.getWriter().write("                <td>Seu nome é: </td>");
		response.getWriter().write("                <td>" + nome +"</td>");
		response.getWriter().write("            </tr>");
		response.getWriter().write("            <tr>");
		response.getWriter().write("                <td>Status da idade: </td>");
		if (idade >= 18) {
			response.getWriter().write("                <td>Você é maior de Idade!</td>");
		} else {
			response.getWriter().write("                <td>Você é menor de Idade!</td>");
		}
		response.getWriter().write("            </tr>");
		response.getWriter().write("            <tr>");
		response.getWriter().write("                <td>" + empresa + "</td>");
		response.getWriter().write("            </tr>");
		response.getWriter().write("        </table>");
		response.getWriter().write("    </body>");
		response.getWriter().write("</html>");
	}

}
