package br.com.treinaweb.jee.servlets;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.treinaweb.jee.dao.UsuarioDAO;
import br.com.treinaweb.jee.models.Usuario;

/**
 * Servlet implementation class ServletLogin
 */
@WebServlet(name = "ServletLogin", urlPatterns = { "/login" })
public class ServletLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ServletContext contexto;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletLogin() {
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
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String nomeUsuario = request.getParameter("nomeUsuario");
		String senha = request.getParameter("senha");
		try {
			Usuario usuario = UsuarioDAO.autenticar(nomeUsuario, senha);
			if (usuario != null) {
				contexto.setAttribute("usuarioLogado", usuario);
				response.sendRedirect("index.jsp");
			} else {
				response.sendRedirect("loginIncorreto.jsp");
			}
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
			response.sendRedirect("loginIncorreto.jsp");
		}
	}

}
