package br.com.impacta.aplicacao;

import java.io.FileWriter;

import javax.swing.JOptionPane;

public class AppGravacaoArquivo03 {

	public static void main(String[] args) {
		
		try {
			//Classe FileWriter
			
			FileWriter writer = new FileWriter("C:\\Users\\21no0707\\Documents"
					+ "\\Curso_Java\\Arquivos\\nomes.txt", true); //sobrecarga com o append true para continuar escrevendo
			//no mesmo arquivo
			
			while (true) {
				
				String texto = JOptionPane.showInputDialog("Escreva um nome: ");
				///r e /n juntos para pular linha em todas as tabels (asc ou unicode)
				writer.write(texto + "\r\n");
				
					int opcao = JOptionPane.showConfirmDialog(null,
							"Deseja continuar?",
							"Confirmação",
							JOptionPane.YES_NO_OPTION);
					
								if(opcao == JOptionPane.NO_OPTION) {
									break;
								}
												
						}
			
					writer.close();
					
					JOptionPane.showMessageDialog(null, "Arquivo criado com sucesso!");
			
			
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
			}


	}

}
