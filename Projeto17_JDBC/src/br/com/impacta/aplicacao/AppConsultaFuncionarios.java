package br.com.impacta.aplicacao;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysql.jdbc.Connection;

public class AppConsultaFuncionarios {

	public static void main(String[] args) {
			
			try {
			
			
			String conexao = "Jdbc:mysql://localhost:3306/db_cadastro?autoSSL=false";
			Class.forName("com.mysql.jdbc.Driver");
			Connection cn = (Connection) DriverManager.getConnection(conexao,"root","Imp@ct@");
			
			String sql = "SELECT * FROM tbfuncionarios";
			
			PreparedStatement stmt = cn.prepareCall(sql);
			
			ResultSet rs= stmt.executeQuery();
			
			//listando os registros.
			while (rs.next()) {
				
				System.out.println("Documento: " + rs.getString("DOCUMENTO"));
				System.out.println("Nome: " + rs.getString("NOME"));
				System.out.println("Idade: " + rs.getInt("IDADE"));
				System.out.println("Sexo: " + rs.getString("SEXO"));
				System.out.println("Cargo: " + rs.getString("CARGO"));
				System.out.println("Salário: " + rs.getDouble("SALARIO"));
				
				
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
