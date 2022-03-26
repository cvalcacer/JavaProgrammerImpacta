package br.com.impacta.comandoif;

import javax.swing.JOptionPane;

public class ComandoIf01 {
	public static void main(String[] args) {
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual a sua idade?"));
		
	  System.out.println("Idade fornecida: " + ((idade < 18) ? "Menor de idade" : "Maior de idade"));
			
		
		
		
		
	}

}
