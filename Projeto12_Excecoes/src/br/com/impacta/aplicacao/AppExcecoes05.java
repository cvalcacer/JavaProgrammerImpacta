package br.com.impacta.aplicacao;

import javax.swing.JOptionPane;

public class AppExcecoes05 {
	public static void main(String[] args) {
		
		try {			
			String nome = JOptionPane.showInputDialog("Informe seu nome!");
			JOptionPane.showMessageDialog(null, "Seu nome é: " + nome.toUpperCase());

			int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite uma idade!"));
			JOptionPane.showMessageDialog(null, "A idade informada é: " + idade);
			}
		
		//erro geral
		catch(Exception e) {
			
			String classe = e.getClass().getSimpleName();
			
			//if criado pro NullPointer sair do erro geral.
			if (e instanceof NullPointerException) {
				e.initCause(new NullPointerException("Referências nulas não acessam métodos"));
			}
			
			//vai printar no console os erros, quais e as linhas
			e.printStackTrace();
			
			JOptionPane.showMessageDialog(null, "\nClasse: " + classe + "\nErro geral: " + e.getMessage());
			}

	}
}
