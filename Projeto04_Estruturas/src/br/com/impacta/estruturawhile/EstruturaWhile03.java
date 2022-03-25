package br.com.impacta.estruturawhile;

import javax.swing.JOptionPane;

public class EstruturaWhile03 {
	public static void main(String[] args) {
		
		/*
		 * Nesse programa, o usuario fornece uma certa quantidade de números
		 * A entrada de dados termina quando o usuario digita o numero 0.
		 * 
		 * No final, o programa deve mostrar a soma e a quantidade de números
		 * informados
		 * 
		 * */
		
		int soma=0 ,quantidade = 0;
			
		
		while(true) {
			
			int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
			
			if (numero == 0) {
				break; //break só vai sair do laço de repetição
			}
			
			soma += numero;
			quantidade++;
		}
		
		System.out.println("Soma dos números informados: " + soma);
		System.out.println("Quantidade de números: " + quantidade);
		
		
	}

}
