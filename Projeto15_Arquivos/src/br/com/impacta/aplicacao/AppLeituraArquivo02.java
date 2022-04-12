package br.com.impacta.aplicacao;

import java.io.FileReader;

import javax.swing.JOptionPane;

public class AppLeituraArquivo02 {
	public static void main(String[] args) {
		
		try {
			
			FileReader reader = new FileReader("C:\\Users\\21no0707\\Documents"
					+ "\\Curso_Java\\Arquivos\\nomes.txt");
			
			//sempre utilizar quando for ler um arquivo. ele resolve o problema mais rapido
			StringBuilder sb = new StringBuilder();
						
			while(true) {
				
				int caractere = reader.read();
						if (caractere == -1)
						break;	
					
					char ch = (char)caractere;
					sb.append(ch);
																	
						}
			
					
			System.out.println(sb);
			reader.close();
			
		
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
				
	}

}
