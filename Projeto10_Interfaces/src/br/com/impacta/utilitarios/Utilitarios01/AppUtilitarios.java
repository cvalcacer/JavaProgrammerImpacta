package br.com.impacta.utilitarios.Utilitarios01;

import br.com.impacta.utilitarios.Utilitarios;

public class AppUtilitarios {
	public static void main(String[] args) {
		
		double soma = Utilitarios.somar(9, 10);
		
		System.out.println(soma);
		
		
		String novaFrase = Utilitarios.removerEspacos("Eu estou estudando Java");
		System.out.println(Utilitarios.removerEspacos(novaFrase));
		
		String email = Utilitarios.gerarEmail("Neto", "Valcacer");
		System.out.println(email);
		
			
		
	}
	

}
