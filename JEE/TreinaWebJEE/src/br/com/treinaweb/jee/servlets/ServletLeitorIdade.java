package br.com.treinaweb.jee.servlets;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletLeitorIdade
 */
@WebServlet(name = "ServletLeitorIdade", urlPatterns = { "/LerIdade" })
public class ServletLeitorIdade extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private ServletContext contexto;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletLeitorIdade() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		contexto = config.getServletContext();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int idade = Integer.parseInt(request.getParameter("idade"));
		contexto.setAttribute("idadeUsuario", idade);
		Enumeration<String> cabecalhoHttp = request.getHeaderNames();
		response.getWriter().println("<html>");
		response.getWriter().println("    <head>");
		response.getWriter().println("        <title>Verificação da Idade</title>");
		response.getWriter().println("    </head>");
		response.getWriter().println("    <body>");
		response.getWriter().println("    <form method = 'post' action = 'ConfirmaIdade'>");
		response.getWriter().println("        <table>");
		response.getWriter().println("            <tr>");
		response.getWriter().println("                <td>Confirme sua idade: </td>");
		response.getWriter().println("                <td><input type = 'text' name = 'idadeConfirmada'/></td>");
		response.getWriter().println("            </tr>");
		response.getWriter().println("            <tr>");
		response.getWriter().println("                <td colspan = '2'><input type = 'submit' value = 'Confirmar'/></td>");
		response.getWriter().println("            </tr>");
		response.getWriter().println("        </table>");
		response.getWriter().println("    </form>");
		response.getWriter().println("    <br/>");
		response.getWriter().println("        <table>");
		while(cabecalhoHttp.hasMoreElements()) {
			String cabecalho = cabecalhoHttp.nextElement();
			String valor = request.getHeader(cabecalho);
			response.getWriter().println("            <tr>");
			response.getWriter().println("                <td>" + cabecalho + "</td>");
			response.getWriter().println("                <td>" + valor + "</td>");
			response.getWriter().println("            </tr>");
		}
		response.getWriter().println("        </table>");
		response.getWriter().println("    </body>");
		response.getWriter().println("</html>");
	}

}
