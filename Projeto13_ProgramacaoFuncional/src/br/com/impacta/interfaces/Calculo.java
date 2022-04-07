package br.com.impacta.interfaces;


//Uma interface funcional só pode ter um método. Usar o @FunctionalInterface para determinar.
@FunctionalInterface
public interface Calculo {
	
	double calcular(double x, double y);

}
