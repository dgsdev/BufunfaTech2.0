package br.com.bufunfatech;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class TesteCrudEstatico {
	
	public static void main(String[] args) {
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//Connection conexao = DriverManager.getConnection(
					//"jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL", 
					//"RM93863", "031188");
			
			Connection conexao = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521/XEPDB1", 
					"bufunfatech", "fiap");
			
			
			System.out.println("Banco Oracle FIAP conectou!");
			
			Statement stmt = conexao.createStatement();
			
			ResultSet result = stmt.executeQuery("SELECT * FROM USUARIO");
			
			while ( result.next() ) {
				System.out.println( result.getInt("ID_USUARIO") + "" +
				result.getString("NOME") + "" + 
				result.getString("EMAIL") );			
							
			} 
			
			conexao.close();
			
		} catch (SQLException e) {
			System.err.println("Não Foi possível conectar no BD Oracle FIAP.");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.err.println("O Driver JDBC não foi encontrado...");
			e.printStackTrace();			
		}
	}

}
