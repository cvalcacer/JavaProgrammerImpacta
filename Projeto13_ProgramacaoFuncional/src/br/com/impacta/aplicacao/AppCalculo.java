package br.com.impacta.aplicacao;

import br.com.impacta.interfaces.Calculo;

public class AppCalculo {
	public static void main(String[] args) {
		
		//(double x, double y) parametros de entrada da interface
		//-> produz, o que será produzido
		//x + (2 * y) saída do método.
		//(double x, double y) -> x + (2 * y); expressão lambda
		
		Calculo c1 = (double x, double y) -> x + (2 * y);
		
		double resultado = c1.calcular(2, 7);
		
		
		
		
		
	}

}
