package br.com.impacta.chars;

import javax.swing.JOptionPane;

public class VariaveisChar {
	public static void main(String[] args) {
	char ch1 = 'X' ;
	char ch2 = 65; // na tabela ascii, 65 � A ver no site.
	char ch3 = '\n'; // \ vai entender que � especial. \n pula uma linha
	char ch4 = 27554;	
	
	System.out.println("o valor de ch1 �: "+ ch1);
	System.out.println("o valor de ch2 �: "+ ch2);
	System.out.println("o valor de ch3 �: "+ ch3);
	
	JOptionPane.showMessageDialog(null, "Ch4: " + ch4);
		
}
}
