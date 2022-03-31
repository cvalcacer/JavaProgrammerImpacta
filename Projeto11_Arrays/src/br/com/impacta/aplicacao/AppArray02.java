package br.com.impacta.aplicacao;

public class AppArray02 {

	public static void main(String[] args) {
		
	//definindo um array de inteiros implicitamente
		
	int [] numeros = {17,13,18,25,39,17};
	
	//apresentar os dados do array utilizando a estrutura for aprimorada (a partir do Java 5.0)
	//foreach mas continua for for(elemento da coleção : colecao)	
	//for (int elemento : numeros)
	
	for (int elemento : numeros) {
		
		System.out.println(elemento);
		}
	}
}
