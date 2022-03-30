package br.com.impacta.classes;

public class Circulo extends Figura{
	
	private double raio;
		
	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	@Override
	public double calcularArea() {
		
		//Math.PI tem a variavel pi j� default sem precisar escrever
		//Math.pow vai fazer o elevado ao quadrado, usando o primeiro parametro a variavel e depois a exponencia��o
		return Math.PI * Math.pow(this.getRaio(),2);
				
	}
	
	
	
	
	
	

}
