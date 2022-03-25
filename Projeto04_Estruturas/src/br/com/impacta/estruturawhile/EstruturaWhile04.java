package br.com.impacta.estruturawhile;

import javax.swing.JOptionPane;

public class EstruturaWhile04 {
public static void main(String[] args) {
		
		/*
		 * Nesse programa, o usuario fornece uma certa quantidade de números
		 * A entrada de dados termina quando o usuario digita o numero 0.
		 * 
		 * Cada número informado vai ser exibido na tela.
		 * Se o usuário digitar um número negativo vai ser ignorado.
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
			
			if (numero <= 0) {
				continue; //continue vai continuar o codigo e ignorar
				//nesse caso ignora o bloco abaixo e volta pro while
			}
			
			System.out.println(numero);
			
			soma += numero;
			quantidade++;
		}
		
		System.out.println("Soma dos números informados: " + soma);
		System.out.println("Quantidade de números: " + quantidade);
		
		
	}
}
