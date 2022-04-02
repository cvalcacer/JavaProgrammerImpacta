package br.com.impacta.aplicacao;

import javax.swing.JOptionPane;

public class AppExcecoes01 {

	public static void main(String[] args) {
		
		try {			
			String nome = JOptionPane.showInputDialog("Informe seu nome!");
			JOptionPane.showMessageDialog(null, "Seu nome é: " + nome.toUpperCase());

			int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite uma idade!"));
			JOptionPane.showMessageDialog(null, "A idade informada é: " + idade);
			}
		
		catch (NumberFormatException e){
			JOptionPane.showMessageDialog(null, e.getMessage());			
			}
		catch (NullPointerException e){
			JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
			}

	}

}
