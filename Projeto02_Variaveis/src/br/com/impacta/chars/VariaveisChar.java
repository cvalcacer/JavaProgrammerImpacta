package br.com.impacta.chars;

import javax.swing.JOptionPane;

public class VariaveisChar {
	public static void main(String[] args) {
	char ch1 = 'X' ;
	char ch2 = 65; // na tabela ascii, 65 é A ver no site.
	char ch3 = '\n'; // \ vai entender que é especial. \n pula uma linha
	char ch4 = 27554;	
	
	System.out.println("o valor de ch1 é: "+ ch1);
	System.out.println("o valor de ch2 é: "+ ch2);
	System.out.println("o valor de ch3 é: "+ ch3);
	
	JOptionPane.showMessageDialog(null, "Ch4: " + ch4);
		
}
}
