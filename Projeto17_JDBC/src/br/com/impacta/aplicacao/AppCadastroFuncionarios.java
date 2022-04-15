package br.com.impacta.aplicacao;

import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

import com.mysql.jdbc.Connection;

public class AppCadastroFuncionarios {

	public static void main(String[] args) {
		
		try {
			
			//criando conexao com o mysql
			//localhost � visto no mysql e o final � o nome do db
			String conexao = "Jdbc:mysql://localhost:3306/db_cadastro?autoSSL=false";
			Class.forName("com.mysql.jdbc.Driver");
			Connection cn = (Connection) DriverManager.getConnection(conexao,"root","Imp@ct@");
			
			//incluindo novo funcionario
			String sql = "INSERT INTO TBFUNCIONARIOS(DOCUMENTO, NOME, IDADE,"
					+ "SEXO,CARGO,SALARIO) VALUES(?,?,?,?,?,?)";
			
			String documento = JOptionPane.showInputDialog("Informe o documento");
			String nome = JOptionPane.showInputDialog("Informe o nome");
			int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade"));
			String sexo = JOptionPane.showInputDialog("Informe o sexo (M/F)");
			String cargo = JOptionPane.showInputDialog("Informe o cargo");
			double salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o salario"));
			
			//preparando os valores
			PreparedStatement stmt = cn.prepareStatement(sql);
			stmt.setString(1, documento);
			stmt.setString(2, nome);
			stmt.setInt(3, idade);
			stmt.setString(4, sexo);
			stmt.setString(5, cargo);
			stmt.setDouble(6, salario);
			
			stmt.executeUpdate();
			JOptionPane.showMessageDialog(null, "Funcionario inclu�do com sucesso!");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
