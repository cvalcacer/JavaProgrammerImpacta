package br.com.impacta.comandoif;

import javax.swing.JOptionPane;

public class ComandoIf01 {
	public static void main(String[] args) {
		int idade = Integer.parseInt(
				JOptionPane.showInputDialog("Qual a sua idade?"));
		
		if (idade < 18) //condi��o se
			System.out.println("Menor de idade");
		//se a condi��o for de uma linha n�o precisa abrir um novo bloco		
		
		else //condi��o sen�o
			System.out.println("Maior de idade"); //ele s� executa uma linha
		//ent�o o syso idade n�o fica 'dentro' do else.
			System.out.println("Idade fornecida: " + idade);
			
		
		
		
		
	}

}
