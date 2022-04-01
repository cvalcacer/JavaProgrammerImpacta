package br.com.impacta.exercicios;

import javax.swing.JOptionPane;

public class Ex01_Diasrestantes {
	public static void main(String[] args) {
		
	//Neste exercicio, o usuario deve fornecer dia, mes, ano. Com base nestas informa��es, determinar
	//quantos dias restam para o ano informado terminar.
		
		int dia = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia"));
					
		int mes = Integer.parseInt(JOptionPane.showInputDialog("Digite o m�s"));
			if(mes <1 || mes> 12) {
				JOptionPane.showMessageDialog(null, "M�s inv�lido!");
				return;
			}
		
		
		int ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano"));
		
		//if tern�rio em fevereiro pra saber se o ano � bisexto
		int [] meses = {31,ano % 4 == 0?28:29,31,30,31,30,31,31,30,31,30,31};
		
		if(dia < 1 || dia > meses[mes-1]) {
			JOptionPane.showMessageDialog(null, "Dia inv�lido!");
			return;
			
		}
		
		int diasRestantes = (meses[mes] - 1) - dia;
		
		for (int i = mes; i < meses.length; i++) {
			diasRestantes+= meses[i];
			
		}
		
		JOptionPane.showMessageDialog(null, "Faltam " + diasRestantes + " pro Bolsonaro sair do governo, vagabundo.");
		
		
	
	
		
		
	}
	

}
