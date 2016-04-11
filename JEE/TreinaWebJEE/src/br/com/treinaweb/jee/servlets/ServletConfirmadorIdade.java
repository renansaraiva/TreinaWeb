package br.com.treinaweb.jee.servlets;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletConfirmadorIdade
 */
@WebServlet(
		name = "ServletConfirmadorIdade",
		urlPatterns = {"/ConfirmaIdade"}
)
public class ServletConfirmadorIdade extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ServletContext contexto;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletConfirmadorIdade() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		contexto = config.getServletContext();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int idadeConfirmada = Integer.parseInt(request.getParameter("idadeConfirmada"));
		int idade = Integer.parseInt(contexto.getAttribute("idadeUsuario").toString());
		response.getWriter().println("<html>");
		response.getWriter().println("    <head>");
		response.getWriter().println("        <title>Resultado</title>");
		response.getWriter().println("    </head>");
		response.getWriter().println("    <body>");
		if (idade == idadeConfirmada) {
			response.getWriter().println("<h2>As idades são iguais!</h2>");
		} else {
			response.getWriter().println("<h2>As idades NÃO são iguais!</h2>");
		}
		response.getWriter().println("    </body>");
		response.getWriter().println("</html>");
		contexto.removeAttribute("idade");
	}

}
