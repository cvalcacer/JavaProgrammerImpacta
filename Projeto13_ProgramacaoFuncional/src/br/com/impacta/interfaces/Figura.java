package br.com.impacta.interfaces;

//tem que criar de um tipo interface, se tiver class muda pra interface.
//é abstrato por definição


public interface Figura extends Comparable<Figura> {
	
	//todos os métodos de uma interface são publicos e abstratos por definição, então não precisar ser
	//declarados com public abstract.
	
	double calcularArea();
	
	//todos os atributos de uma interface são publicos, estaticos e constatntes (final) por definição
		
	String AUTOR = "Equipe Impacta";
	
	
		//metodo default pega o metodo padrao da interface.	
		default String apresentarFigura() {
		
		String resposta = "Classe: " + this.getClass().getSimpleName() + 
				"\nÁrea: " + this.calcularArea();
		
		return resposta;
		
		//o this é uma referencia ao objeto da classe que vai implementar.
		
	}
				
}

