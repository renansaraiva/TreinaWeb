package br.com.treinaweb.jee.servlets;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletExemplo1
 */
@WebServlet("/ServletExemplo1")
public class ServletExemplo1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private String mensagem;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletExemplo1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		mensagem = config.getInitParameter("mensagem");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nome = request.getParameter("nome");
		response.getWriter().write("<html>");
		response.getWriter().write("    <head>");
		response.getWriter().write("        <title>Teste de Servlet</title>");
		response.getWriter().write("    </head>");
		response.getWriter().write("    <body>");
		response.getWriter().write("        <h1>" + mensagem + "</h1>");
		response.getWriter().write("        <p>Bem-vindo, "+ nome +"</p>");
		response.getWriter().write("    </body>");
		response.getWriter().write("</html>");
	}

}
