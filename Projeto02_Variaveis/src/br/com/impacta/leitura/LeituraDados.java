package br.com.impacta.leitura;

import javax.swing.JOptionPane;

public class LeituraDados {
	public static void main(String[] args) {
		
		String usuario = JOptionPane.showInputDialog("Qual o seu nome?");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual a  sua idade?"));
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Qual a  sua idade?"));
		//JOptionPane.showMessageDialog(null, "Seu nome �: " + usuario );
		//JOptionPane.showMessageDialog(null, "Sua idade �: " + idade);
		//JOptionPane.showMessageDialog(null, "Sua altura �: " + altura);
		
		//JOptionPane.showInputDialog n�o importa o que for digitado, sempre vai armazenar na string
		//Integer.parseInt tira da string e coloca em int nesse caso
		//Double.parseDouble tira de string e coloca em double
		
		//gerando uma resposta unificada
		//para quebrar a string: /n
				
		String resposta = "Seu nome �: " + usuario + " \nSua idade �: " + idade + "\nE sua altura �: " + altura;
		JOptionPane.showMessageDialog(null, resposta );
		
}
}
