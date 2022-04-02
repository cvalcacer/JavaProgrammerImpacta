package br.com.impacta.classes;

import br.com.impacta.interfaces.Figura;

public class Circulo implements Figura{
	
	public Circulo(double raio) {
		this.setRaio(raio);
	}
	
	private double raio;
		
	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	@Override
	public double calcularArea() {
		
		//Math.PI tem a variavel pi já default sem precisar escrever
		//Math.pow vai fazer o elevado ao quadrado, usando o primeiro parametro a variavel e depois a exponenciação
		return Math.PI * Math.pow(this.getRaio(),2);
				
	}
	
	
	
	
	
	
	

}
