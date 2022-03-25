package br.com.impacta.exercicios;

import javax.swing.JOptionPane;

//Exerc 01, temos 125 e devemos retornar a quantidade de notas para
//o usuario em 50, 20, 10 e 5.
/*
 * Escrever um programa para solicitar o valor de saque com base no valor 125
 * e vamos apresentar a quantidade de cédulas dispensadas, considerando que 
 * as cédulas de maior valor seráo liberadas primeiro
 * 
 * */


public class Ex01_CaixaEletronico {
	public static void main(String[] args) {
	
		//solicitar o valor do saque
		
		double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do saque"));
				
		int valorsaque = (int)valor; //typecast
		
		//analisar se o valor é multiplo de cinco
				if (valorsaque % 5 != 0) {
					JOptionPane.showMessageDialog(null, "Valor inválido");
					return; //todo return vai sair do método que estamos
					        //nesse caso, o metodo main, então encerra a app
				}				
		
		//toda variavel devemos atribuir um valor.
		int qtde50, qtde20, qtde10, qtde5 = 0;
		qtde50 = qtde20 = qtde10 = qtde5 = 0;
		qtde50 = valorsaque / 50;
		valorsaque %= 50;
		qtde20 = valorsaque / 20;
		valorsaque %= 20;
		qtde10 = valorsaque / 10;
		valorsaque %= 10;
		qtde5 = valorsaque / 5;
		valorsaque %= 5;
		
		String resposta = "Valor do saque: " + valor +
				"\nNotas de 50: " + qtde50 + 
				"\nNotas de 20: " + qtde20 + 
				"\nNotas de 10: " + qtde10 + 
				"\nNotas de 5: " + qtde5; 
		
		JOptionPane.showMessageDialog(null, resposta);
		
		
		
				
		
		
		
	}

}
