package br.com.impacta.comandoif;

import javax.swing.JOptionPane;

public class ComandoIf01 {
	public static void main(String[] args) {
		int idade = Integer.parseInt(
				JOptionPane.showInputDialog("Qual a sua idade?"));
		
		if (idade < 18) //condição se
			System.out.println("Menor de idade");
		//se a condição for de uma linha não precisa abrir um novo bloco		
		
		else //condição senão
			System.out.println("Maior de idade"); //ele só executa uma linha
		//então o syso idade não fica 'dentro' do else.
			System.out.println("Idade fornecida: " + idade);
			
		
		
		
		
	}

}
