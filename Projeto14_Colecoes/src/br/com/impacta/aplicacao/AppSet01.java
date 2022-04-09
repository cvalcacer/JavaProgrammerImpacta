package br.com.impacta.aplicacao;

import java.util.HashSet;
import java.util.Set;

public class AppSet01 {
	public static void main(String[] args) {
		
		Set<String> nomes = new HashSet<>();
		nomes.add("Lucas");
		nomes.add("Neto");
		nomes.add("Nirley");
		nomes.add("Douglas");
		nomes.add("Edna");
		nomes.add("Alana");
		nomes.add("Brigadeiro");
		nomes.add("Cleoley");
		nomes.add("Lucas");
		
		//HashSet n�o garante ordem, por isso a efici�ncia. Ele analisa os hashs.
		//N�o d� pra setar uma ordena��o, a n�o ser que use o TreeSet
		//Ele n�o exibe duplicados!
				
		nomes.forEach(s -> System.out.println(s));
		
		
		
		
		
		
	}

}
