package br.com.impacta.interfaces;


//Uma interface funcional s� pode ter um m�todo. Usar o @FunctionalInterface para determinar.
@FunctionalInterface
public interface Calculo {
	
	double calcular(double x, double y);

}
