package br.com.impacta.comandoif;

import javax.swing.JOptionPane;

public class ComandoIf02 {
	public static void main(String[] args) {
		/*
		 * Um funcionario tera um valor de 10% de desconto SE o salario bruto
		 * for superior de 5000 reais, o desconto ser� calculado sobre a dif
		 * entre o valor do salario e o valor base de 5000.
		 * */
		
		double salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o sal�rio"));
		double desconto = 0;
		
		if (salario > 5000) {
			desconto = ((salario - 5000) * 10 / 100);
		}
		
		String resposta = "Sal�rio bruto : " + salario + "\nDesconto: "  + desconto +
				"\nSal�rio L�quido: " + (salario - desconto);
		
		JOptionPane.showMessageDialog(null, resposta);
		
		
		
		
		
		
		
		
		
		
		
	}

}
