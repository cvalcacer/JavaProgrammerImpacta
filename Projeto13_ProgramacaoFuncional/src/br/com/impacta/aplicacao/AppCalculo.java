package br.com.impacta.aplicacao;

import br.com.impacta.interfaces.Calculo;

public class AppCalculo {
	public static void main(String[] args) {
		
		// -> express�o lambda 
		Calculo c1 = (x,y) -> x + (2 * y);
		
		double resultado = c1.calcular(2, 7);
		
		
		
		
		
	}

}
