package br.com.impacta.aplicacao;

import java.sql.DriverManager;

import javax.swing.JOptionPane;

import com.mysql.jdbc.Connection;

public class AppCadastroFuncionarios {

	public static void main(String[] args) {
		
		try {
			
			//criando conexao com o mysql
			//localhost é visto no mysql e o final é o nome do db
			String conexao = "Jdbc:mysql://localhost:3306/db_cadastro?autoSSL=false";
			Class.forName("com.mysql.jdbc.Driver");
			Connection cn = (Connection) DriverManager.getConnection(conexao,"root","Imp@ct@");
			JOptionPane.showMessageDialog(null, "Conexão Ok!");
			
			
			
			
			
			
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
