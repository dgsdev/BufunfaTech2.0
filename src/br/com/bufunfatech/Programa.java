package br.com.bufunfatech;

import java.sql.SQLException;
import java.util.List;

import br.com.bufunfatech.dao.UsuarioDAO;

public class Programa {
	public static void main(String[] args) {
				
        try {
			
			UsuarioDAO dao = new UsuarioDAO();
			List<Usuario> listaUsuarios = dao.findAll();

			for (Usuario usuario : listaUsuarios) {
				System.out.println(usuario);
			}
			//System.out.println(listaUsuarios);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}      
        
    }
	
}
