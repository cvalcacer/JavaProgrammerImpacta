package br.com.impacta.exercicios;

import javax.swing.JOptionPane;

public class Ex04_Soma {
	public static void main(String[] args) {
	
		// Perguntar ao usuario quantos numeros ele deseja
		// Esta quantidade deve ser armazenada em uma variavel
		// Perguntar quantos irmãos eles possui e armazenar
		// Perguntar em qual cidade ele mora e armazenar
		//Perguntar qual o salario, incluindo centavos, armazenar em uma variavel
		//chamada salario
		//Declarar uma variavel do tipo String chamar Status
		//Se o salario informado for maior que 6000
		//esta variavel deve armazenar: "Voce esta acima da media."
		//Caso contrário, a variavel deve armazenar "Voce está dentro da média"
				
				
		int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de números: "));
		int irmaos = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de irmaos: "));
		String cidade = JOptionPane.showInputDialog("Que cidade você mora? ");
		double salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o salário? "));

		String status;
		
		if (salario > 6000) {
			status = "Voce esta acima da media.";
		}
		
		else {
			status = "Voce está dentro da média";
		}
				
		String resposta = "Quantidade de numeros:" + quantidade +
				"\nQuantidade de irmaos:" + irmaos +
				"\nCidade:" + cidade + 
				"\nSalario:" + salario +
				"\nStatus:" + status;
		
		JOptionPane.showMessageDialog(null,	resposta);	
		
		
	}
}
