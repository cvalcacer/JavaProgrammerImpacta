package br.com.impacta.estruturawhile;

import javax.swing.JOptionPane;

public class EstruturaWhile04 {
public static void main(String[] args) {
		
		/*
		 * Nesse programa, o usuario fornece uma certa quantidade de n�meros
		 * A entrada de dados termina quando o usuario digita o numero 0.
		 * 
		 * Cada n�mero informado vai ser exibido na tela.
		 * Se o usu�rio digitar um n�mero negativo vai ser ignorado.
		 * 
		 * No final, o programa deve mostrar a soma e a quantidade de n�meros
		 * informados
		 * 
		 * */
		
		int soma=0 ,quantidade = 0;
			
		
		while(true) {
			
			int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero: "));
			
			if (numero == 0) {
				break; //break s� vai sair do la�o de repeti��o
			}
			
			if (numero <= 0) {
				continue; //continue vai continuar o codigo e ignorar
				//nesse caso ignora o bloco abaixo e volta pro while
			}
			
			System.out.println(numero);
			
			soma += numero;
			quantidade++;
		}
		
		System.out.println("Soma dos n�meros informados: " + soma);
		System.out.println("Quantidade de n�meros: " + quantidade);
		
		
	}
}
