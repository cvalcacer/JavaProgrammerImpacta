package br.com.impacta.exercicios;

import javax.swing.JOptionPane;

public class Ex04_Soma {
	public static void main(String[] args) {
	
		// Perguntar ao usuario quantos numeros ele deseja
		// Esta quantidade deve ser armazenada em uma variavel
		// Perguntar quantos irm�os eles possui e armazenar
		// Perguntar em qual cidade ele mora e armazenar
		//Perguntar qual o salario, incluindo centavos, armazenar em uma variavel
		//chamada salario
		//Declarar uma variavel do tipo String chamar Status
		//Se o salario informado for maior que 6000
		//esta variavel deve armazenar: "Voce esta acima da media."
		//Caso contr�rio, a variavel deve armazenar "Voce est� dentro da m�dia"
				
				
		int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de n�meros: "));
		int irmaos = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de irmaos: "));
		String cidade = JOptionPane.showInputDialog("Que cidade voc� mora? ");
		double salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o sal�rio? "));

		String status;
		
		if (salario > 6000) {
			status = "Voce esta acima da media.";
		}
		
		else {
			status = "Voce est� dentro da m�dia";
		}
				
		String resposta = "Quantidade de numeros:" + quantidade +
				"\nQuantidade de irmaos:" + irmaos +
				"\nCidade:" + cidade + 
				"\nSalario:" + salario +
				"\nStatus:" + status;
		
		JOptionPane.showMessageDialog(null,	resposta);	
		
		
	}
}
