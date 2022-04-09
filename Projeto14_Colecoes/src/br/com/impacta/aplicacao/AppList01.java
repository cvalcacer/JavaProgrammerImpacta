package br.com.impacta.aplicacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AppList01 {
	public static void main(String[] args) {
		
		//listas
		//todas as listas fazem a mesma coisa e tem os mesmos métodos, mas algumas tem mais segurança
		//e são mais rápidos.
		
		//T é um tipo genérico, nós vamos determinar o tipo
		//List <T>
		
		List <String> nomes = new ArrayList<>();
		nomes.add("Lucas");
		nomes.add(0,"Neto");
		nomes.add("Nirley");
		nomes.add("Douglas");
		nomes.add("Edna");
		nomes.add("Alana");
		nomes.add("Brigadeiro");
		nomes.add("Cleoley");
		
		
		nomes.remove(1); //removeu quem estava na posição 1
		
		//remover se, variavel, lambda, condição
		//nesse caso vai remover tudo que termina com ley, é case sensitive.
		nomes.removeIf(p -> p.toUpperCase().endsWith("LEY")); //nesse caso, removeu "Nirley"
		
		//apresentando a lista! 3 métodos diferentes
		
		//syso normal
		System.out.println("\n");
		System.out.println(nomes);
		System.out.println("\n");
		//usando foreach
			for (String nome : nomes) {
				System.out.println(nome);				
			}
			
		//Ordenando a coleção
		Collections.sort(nomes);
		
			
			
			
		System.out.println("\n");
		//usando mais um foreach			
		nomes.forEach(s -> System.out.println(s));
		
		
		
		
	}

}
