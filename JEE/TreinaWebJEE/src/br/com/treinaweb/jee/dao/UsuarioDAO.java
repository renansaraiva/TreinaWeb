package br.com.treinaweb.jee.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.treinaweb.jee.dao.utils.ConexaoUtils;
import br.com.treinaweb.jee.models.Usuario;

public class UsuarioDAO {

	public static Usuario autenticar(String nomeUsuario, String senha)
			throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		Connection conn = ConexaoUtils.criarConexao();
		Usuario usuario = null;
		PreparedStatement statement = conn
				.prepareStatement("SELECT * FROM usr_usuarios WHERE usr_login = ? AND usr_senha = ?");
		statement.setString(1, nomeUsuario);
		statement.setString(2, senha);
		ResultSet rs = statement.executeQuery();
		if (rs.next()) {
			usuario = new Usuario();
			usuario.setId(rs.getInt("usr_id"));
			usuario.setNome(rs.getString("usr_nome"));
			usuario.setNomeUsuario(rs.getString("usr_login"));
			usuario.setSenha(rs.getString("usr_senha"));
		}
		ConexaoUtils.fecharConexao(conn);
		return usuario;
	}

}
