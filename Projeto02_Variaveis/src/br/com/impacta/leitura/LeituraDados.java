package br.com.impacta.leitura;

import javax.swing.JOptionPane;

public class LeituraDados {
	public static void main(String[] args) {
		
		String usuario = JOptionPane.showInputDialog("Qual o seu nome?");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual a  sua idade?"));
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Qual a  sua idade?"));
		//JOptionPane.showMessageDialog(null, "Seu nome é: " + usuario );
		//JOptionPane.showMessageDialog(null, "Sua idade é: " + idade);
		//JOptionPane.showMessageDialog(null, "Sua altura é: " + altura);
		
		//JOptionPane.showInputDialog não importa o que for digitado, sempre vai armazenar na string
		//Integer.parseInt tira da string e coloca em int nesse caso
		//Double.parseDouble tira de string e coloca em double
		
		//gerando uma resposta unificada
		//para quebrar a string: /n
				
		String resposta = "Seu nome é: " + usuario + " \nSua idade é: " + idade + "\nE sua altura é: " + altura;
		JOptionPane.showMessageDialog(null, resposta );
		
}
}
