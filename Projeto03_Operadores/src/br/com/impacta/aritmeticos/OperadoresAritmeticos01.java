package br.com.impacta.aritmeticos;

public class OperadoresAritmeticos01 {
	public static void main(String[] args) {
	int a = 10, // adiciona , pra declarar tudo junto
		b = 3,
		c = 5;
	
	int divisao1 = a/b; // se usar int no double/float vai devolver inteiro
	double divisao2 = a/b; //retorna 3.0 porque ele analisa a divisao por inteiros, double tem o inteiro mais flutuante, ficando 0
	
	int resto = a%b;
	double resto2 = a%b;
	
	System.out.println("O resultado da divis�o �: " + divisao1);
	System.out.println("O resultado da divis�o 2 �: " + divisao2);
	System.out.println("O resultado da resto divis�o �: " + resto);
	System.out.println("O resultado da resto 2 da divis�o �: " + resto2);
				
	}
}
