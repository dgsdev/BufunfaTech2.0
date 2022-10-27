package br.com.bufunfatech.dao;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.bufunfatech.Usuario;

public class UsuarioDAO {
	
	public List<Usuario> findAll() throws SQLException {
		List<Usuario> listaUsuarios = new ArrayList<Usuario>();
		
		Connection conn = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XEPDB1", "bufunfatech", "fiap");
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM USUARIO");
			
			while ( rs.next() ) {
				Usuario usuario = new Usuario();
				usuario.setIdUsuario( rs.getInt("ID_USUARIO") );
				usuario.setNome( rs.getString("NOME") );
				usuario.setEmail( rs.getString("EMAIL") );
				usuario.setSenha(rs.getString("SENHA") );
				usuario.setRepetirSenha( rs.getString("REPETIR_SENHA") );				
				
				listaUsuarios.add(usuario);				
			} 
			conn.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			conn = null;
		}		
		
		return listaUsuarios;
	}
	
	
}
