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
		
		//executando o metodo calcularMediaArray()
		double[] lista = {2.3, 4.5, 5.0, 6.9, 70.9};
		double media = Utilitarios.calcularMediaArray(lista);
		
		System.out.println("Média dos elementos do array: " + media);
		
		//executando o metodo calcularMediaNumeros();
		double m1 = Utilitarios.calcularMediaNumeros();
		double m2 = Utilitarios.calcularMediaNumeros(2,3);
		double m3 = Utilitarios.calcularMediaNumeros(4,5,6.9,7.8,1,2);
		double m4 = Utilitarios.calcularMediaNumeros(lista);
		
		System.out.println("Média dos elementos do array: " + m1 +
				"\nMédia dos elementos do array: " + m2 +
				"\nMédia dos elementos do array: " + m3 +
				"\nMédia dos elementos do array: " + m4);
				
		
	}
	

}
