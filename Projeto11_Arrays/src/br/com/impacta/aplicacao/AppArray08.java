package br.com.impacta.aplicacao;
import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;

import java.util.Arrays;

import br.com.impacta.classes.Curso;

//se vc mudar o import para static e importar o método junto não precisa escrever o começo
//ex: jop, interger e etc.

public class AppArray08 {

	public static void main(String[] args) {
		
		//definindo um array de curso
		//solicitando a quantidade de cursos
		
		int quantidade = parseInt
				(showInputDialog("Informe a quantidade de cursos!"));
		Curso[] cursos = new Curso[quantidade];
		
		//solicitando os dados do curso para o usuário:
		
		for (int i = 0; i < cursos.length; i++) {
			int codigo = parseInt(showInputDialog("Informe o código" + (i+1)));			
			String descricao = showInputDialog("Desrição do curso: " + (i+1));			
			int cargaHoraria = parseInt(showInputDialog("Informe a carga horária do curso: " +(i+1)));
			double preco = parseDouble(showInputDialog("Preço do curso: " + (i+1)));	
			
			cursos[i] = new Curso(codigo, descricao, cargaHoraria, preco);
			
		}
		
		Arrays.sort(cursos);

		for (Curso curso : cursos) {
			System.out.println(curso.mostrar());
			System.out.println();
			
		}
	}

}
