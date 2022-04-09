package br.com.impacta.aplicacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AppList01 {
	public static void main(String[] args) {
		
		//listas
		//todas as listas fazem a mesma coisa e tem os mesmos m�todos, mas algumas tem mais seguran�a
		//e s�o mais r�pidos.
		
		//T � um tipo gen�rico, n�s vamos determinar o tipo
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
		
		
		nomes.remove(1); //removeu quem estava na posi��o 1
		
		//remover se, variavel, lambda, condi��o
		//nesse caso vai remover tudo que termina com ley, � case sensitive.
		nomes.removeIf(p -> p.toUpperCase().endsWith("LEY")); //nesse caso, removeu "Nirley"
		
		//apresentando a lista! 3 m�todos diferentes
		
		//syso normal
		System.out.println("\n");
		System.out.println(nomes);
		System.out.println("\n");
		//usando foreach
			for (String nome : nomes) {
				System.out.println(nome);				
			}
			
		//Ordenando a cole��o
		Collections.sort(nomes);
		
			
			
			
		System.out.println("\n");
		//usando mais um foreach			
		nomes.forEach(s -> System.out.println(s));
		
		
		
		
	}

}
