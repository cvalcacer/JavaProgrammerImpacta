package colecoes.exemplos;

import java.util.TreeSet;

public class ExemploForeach {

	public static void main(String[] args) {
		TreeSet<String> cursos = new TreeSet<>();
		
		cursos.add("PHP");
		cursos.add("Linux");
		cursos.add("Asp");
		cursos.add("Java");
		cursos.add("Delphi");
		
		System.out.println("Cursos em ordem alfab�tica: \n");
		cursos.forEach(c -> System.out.println("Curso: "+ c));

	}

}
