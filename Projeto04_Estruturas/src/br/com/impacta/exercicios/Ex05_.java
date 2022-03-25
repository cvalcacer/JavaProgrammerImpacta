package br.com.impacta.exercicios;

import javax.swing.JOptionPane;

public class Ex05_ {
	public static void main(String[] args) {
		
		//Produz um n�mero entre 0 e 100, iterativamente, programa pede para
		//o usuario digitar um numero
		//Enquanto o usu�rio n�o acertar o programa registra a tentativa. 
		//no final, o programa deve apresentar a msg:
		//"Voc� acertou em ? tentativas;
		
		int numero = ((int)Math.random() * 100)+1;
		int min = 1;
		int max = 100;
		int i=0;
		
		while (true) {
			
			int tentativa = Integer.parseInt(JOptionPane.showInputDialog
					("Digite um n�mero entre: " + min + "e: " +max));
			if(numero == tentativa)
				continue;
			if (min < tentativa){
				min = tentativa + 1;
			}
			else {
				max = tentativa;
			}
			
			i++;
			JOptionPane.showMessageDialog(null, "Tente novamente!");
			continue;
		}
		
	}

}
