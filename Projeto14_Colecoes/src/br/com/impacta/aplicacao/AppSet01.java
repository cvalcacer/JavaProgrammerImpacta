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
		
		//HashSet não garante ordem, por isso a eficiência. Ele analisa os hashs.
		//Não dá pra setar uma ordenação, a não ser que use o TreeSet
		//Ele não exibe duplicados!
				
		nomes.forEach(s -> System.out.println(s));
		
		
		
		
		
		
	}

}
