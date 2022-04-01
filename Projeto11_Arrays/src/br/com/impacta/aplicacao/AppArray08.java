package br.com.impacta.aplicacao;
import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;

import java.util.Arrays;

import br.com.impacta.classes.Curso;

//se vc mudar o import para static e importar o m�todo junto n�o precisa escrever o come�o
//ex: jop, interger e etc.

public class AppArray08 {

	public static void main(String[] args) {
		
		//definindo um array de curso
		//solicitando a quantidade de cursos
		
		int quantidade = parseInt
				(showInputDialog("Informe a quantidade de cursos!"));
		Curso[] cursos = new Curso[quantidade];
		
		//solicitando os dados do curso para o usu�rio:
		
		for (int i = 0; i < cursos.length; i++) {
			int codigo = parseInt(showInputDialog("Informe o c�digo" + (i+1)));			
			String descricao = showInputDialog("Desri��o do curso: " + (i+1));			
			int cargaHoraria = parseInt(showInputDialog("Informe a carga hor�ria do curso: " +(i+1)));
			double preco = parseDouble(showInputDialog("Pre�o do curso: " + (i+1)));	
			
			cursos[i] = new Curso(codigo, descricao, cargaHoraria, preco);
			
		}
		
		Arrays.sort(cursos);

		for (Curso curso : cursos) {
			System.out.println(curso.mostrar());
			System.out.println();
			
		}
	}

}
