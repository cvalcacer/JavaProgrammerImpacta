package br.com.impacta.aplicacao;

import javax.swing.JOptionPane;

public class AppExcecoes04 {
	public static void main(String[] args) {
		
		try {			
			String nome = JOptionPane.showInputDialog("Informe seu nome!");
			JOptionPane.showMessageDialog(null, "Seu nome �: " + nome.toUpperCase());

			int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite uma idade!"));
			JOptionPane.showMessageDialog(null, "A idade informada �: " + idade);
			}
		
		//erro geral
		catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Erro Geral: " + e.getMessage());
			}

	}
}
