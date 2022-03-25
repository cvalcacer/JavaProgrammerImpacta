package br.com.impacta.estruturafor;

import javax.swing.JOptionPane;

public class EstruturaFor02 {
	public static void main(String[] args) {
		
		int qtpessoas = Integer.parseInt
				(JOptionPane.showInputDialog("Quantas pessoas estão na sala?"));
		int maior = 0;
		int posicao = 0;
		
		for (int i = 1; i <= qtpessoas; i++) {
			String pergunta = "Pessoa" + i + 
					"\nQual a idade da pessoa " + i + "?";
			int idade = Integer.parseInt(JOptionPane.showInputDialog(pergunta));
			
			if(idade > maior) {
				maior = idade;
				posicao = i;
				//System.out.println("pessoa" + posicao + "idade" + maior);
			}
			
			String resposta = "Maior idade: " + maior + 
								"\nPessoa" + posicao;
			
			JOptionPane.showMessageDialog(null, resposta);
										
		}
		
	}

}
