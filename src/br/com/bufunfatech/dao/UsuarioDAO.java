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
			
			conn = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL", "RM93863", "031188");
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM USUARIO");
			
			while ( rs.next() ) {
				Usuario usuario = new Usuario();
				usuario.setIdUsuario( rs.getInt("ID") );
				usuario.setNome( rs.getString("NOME") );
				usuario.setEmail( rs.getString("EMAIL") );
				
				listaUsuarios.add(usuario);				
			} 
			System.out.println(listaUsuarios);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			conn = null;
		}
		
		
		return listaUsuarios;
	}
	
	
}
