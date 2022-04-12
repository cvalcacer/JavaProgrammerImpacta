package br.com.impacta.aplicacao;

import java.util.HashMap;
import java.util.Map;

public class AppMap02 {
	public static void main(String[] args) {
		
		Map<Integer,String> nomes = new HashMap<>();
		
		nomes.put(123, "Neto");
		nomes.put(124, "Lucas");
		nomes.put(125, "Douglas");
		nomes.put(127, "Nirley");
		nomes.put(130, "Jed");
		
		nomes.forEach((k,v) -> System.out.println(k + " - " + v));
			
		}
		
		
		
		
		
		
	}


