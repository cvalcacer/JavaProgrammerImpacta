package br.com.impacta.aplicacao;

import java.util.*;

public class AppSet02 {

	public static void main(String[] args) {
		
		//Treeset vai ordenar pela ordem natural, no caso alfabética
		Set<String> nomes = new TreeSet<>();
		nomes.add("Lucas");
		nomes.add("Neto");
		nomes.add("Nirley");
		nomes.add("Douglas");
		nomes.add("Edna");
		nomes.add("Alana");
		nomes.add("Brigadeiro");
		nomes.add("Cleoley");
		nomes.add("Lucas");
		
		nomes.forEach(s -> System.out.println(s));

	}

}
