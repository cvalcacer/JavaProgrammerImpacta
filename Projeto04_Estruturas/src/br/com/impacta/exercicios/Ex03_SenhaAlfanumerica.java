package br.com.impacta.exercicios;

import javax.swing.JOptionPane;

public class Ex03_SenhaAlfanumerica {
	public static void main(String[] args) {
		/*
		 * Esse programa deve gerar uma senha com 6 d�gitos, onde cada digito
		 * � um numero entre 0 e 9. A senha final � uma String
		 * */
		
		String senha = "";
		
		for (int i = 0; i < 6; i++) {
		senha += (int)(Math.random() * 10);
			System.out.println(senha);
		}
		
		JOptionPane.showMessageDialog(null, senha);
	}

}
