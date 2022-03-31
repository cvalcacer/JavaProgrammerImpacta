package br.com.impacta.aplicacao;

import javax.swing.JOptionPane;

public class AppArray04 {
	public static void main(String[] args) {
		
		//o usuario fornece alguns nomes de pessoas para uma lista.
		String [] pessoas = new String [4];
		
		for (int i = 0; i < pessoas.length; i++){
			pessoas[i] = JOptionPane.showInputDialog("Informe o nome: " + (i+1));
		}
		
		for (String elemento : pessoas) {
			System.out.println(elemento);	
		}
				
		
		
	}

}
