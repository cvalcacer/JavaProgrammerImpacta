package br.com.impacta.aplicacao;

import java.io.FileReader;

import javax.swing.JOptionPane;

public class AppLeituraArquivo01 {
	public static void main(String[] args) {
		
		try {
			
			FileReader reader = new FileReader("C:\\Users\\21no0707\\Documents"
					+ "\\Curso_Java\\Arquivos\\nomes.txt");
			
			//criando uma variavel para leitura do arquivo, o jvm lê caracter por caracter
			String arquivo = "";
			
			while(true) {
				
				//EOF, end of file
				int caractere = reader.read();
				System.out.println(caractere);
					//o jvm sabe que o arquivo terminou quando retorna -1, então foi criada uma variavel caractere
					//que vai contar os caracteres até -1
					if (caractere == -1)
						break;	
					
					char ch = (char)caractere;
					
					//armazenando em arquivo
					arquivo += ch;
																	
						}
			
					
			System.out.println(arquivo);
			//smpre informar quando parar de ler o arquivo
			reader.close();
			
		
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
				
	}

}
