package br.com.impacta.aritmeticos;

public class OperadoresAritmeticos02 {
	public static void main(String[] args) {
		int a = 10, 
			b = 3,
			c = 5;
		
		double d1 = 10, d2 = 3;
		double divisao1 = d1/d2;
		double divisao2 = d1/b;
		
		//para termos uma divisao real
		//basta que apenas uma das variaveis seja double(real)
		
		double divisao3 = (float)a/b;
		//cast para obrigar o java a usar double em vez de int
		//ele muda o a de int para double
		
		double x = a;
		double divisao4 = x/b;
		
		//x recebeu o int a e mudou para double mudando o resultado.
		
		
		
		System.out.println("A divisão 1 é: " + divisao1);
		System.out.println("A divisão 2 é: " + divisao2);
		System.out.println("A divisão 3 é: " + divisao3);
		System.out.println("A divisão 4 é: " + divisao4);
			
				
		
		
	}
}
