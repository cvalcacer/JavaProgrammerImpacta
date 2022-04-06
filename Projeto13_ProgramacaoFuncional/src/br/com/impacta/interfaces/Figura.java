package br.com.impacta.interfaces;

//tem que criar de um tipo interface, se tiver class muda pra interface.
//� abstrato por defini��o


public interface Figura extends Comparable<Figura> {
	
	//todos os m�todos de uma interface s�o publicos e abstratos por defini��o, ent�o n�o precisar ser
	//declarados com public abstract.
	
	double calcularArea();
	
	//todos os atributos de uma interface s�o publicos, estaticos e constatntes (final) por defini��o
		
	String AUTOR = "Equipe Impacta";
	
	
		//metodo default pega o metodo padrao da interface.	
		default String apresentarFigura() {
		
		String resposta = "Classe: " + this.getClass().getSimpleName() + 
				"\n�rea: " + this.calcularArea();
		
		return resposta;
		
		//o this � uma referencia ao objeto da classe que vai implementar.
		
	}
				
}

