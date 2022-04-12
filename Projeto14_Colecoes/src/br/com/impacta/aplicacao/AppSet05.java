package br.com.impacta.aplicacao;

import java.util.LinkedHashSet;
import java.util.Set;

import br.com.impacta.classes.Curso;

	public class AppSet05 {
	public static void main(String[] args) {
		
		Set<Curso> cursos = new LinkedHashSet<>();
		cursos.add(new Curso(001, "Java Dev", 100, 3700));
		cursos.add(new Curso(002, "C#", 80, 700));
		cursos.add(new Curso(003, "PHP", 10, 2700));
		cursos.add(new Curso(004, "HTML", 200, 1700));
		cursos.add(new Curso(001, "Java Dev", 100, 3700));
		
		cursos.forEach(s -> System.out.println(s.mostrar() + "\n"));
		
		
		
		
		
		
		
	}

}
