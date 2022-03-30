package br.com.impacta.classes;

import br.com.impacta.interfaces.Figura;

public class Retangulo implements Figura{
	
	private double base, altura;

		public double getBase() {
			return base;
		}	
		public void setBase(double base) {
			this.base = base;
		}
	
		public double getAltura() {
			return altura;
		}	
		public void setAltura(double altura) {
			this.altura = altura;
		}
		
		//override obrigatorio pois a classe figura está abstract, então os filhos devem herdar o método calcularArea
		@Override
		public double calcularArea() {
			
			return this.getBase()*this.getAltura();
		}
	

}
