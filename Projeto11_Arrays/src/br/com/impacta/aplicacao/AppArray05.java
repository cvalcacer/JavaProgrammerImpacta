package br.com.impacta.aplicacao;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class AppArray05 {
	public static void main(String[] args) {
		
		int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Informe uma quantidade de nomes!"));
		
			if(quantidade <= 0){
				JOptionPane.showMessageDialog(null, "A quantidade deve ser maior que zero!","Erro", JOptionPane.ERROR_MESSAGE);
				
							//pra sair do método
				return;
			}
		
		String [] nomes = new String [quantidade];
		
			for (int i = 0; i < nomes.length; i++){
				nomes[i] = JOptionPane.showInputDialog("Informe o nome: " + (i+1));
			}
			
			//o Arrays é uma classe do Java, usa o sort pra mostrar o parametro em ordem alfabetica.
			//Usa tabela ASCII, primeiro maiusculo e depois minusculo
			Arrays.sort(nomes);
			
			for (String elemento : nomes) {
				System.out.println(elemento);	
			}
								
	}

}
