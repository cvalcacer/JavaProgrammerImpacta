package br.com.impacta.aritmeticos;

public class OperadoresAritmeticos03 {
	public static void main(String[] args) {
	
		/*
		 * Nessa classe apresentaremos os conceitos de operadores de atribuição
		 * reduzida
		 * +=
		 * -=
		 * *=
		 * /=
		 * %=
		 *  
		 * */
		
		int a = 10, b = 3;
		
		a *= 2; // a = 20  sendo a = a * 2
		b /= 3; // b = 1   sendo b = b/3
		a += b; // a = 21  sendo a = a + b
		b -= a + 1; // b = -21 sendo b = b - (a+1)
		a %= 2; // resto da divisão a = 1 sendo a = a/2 mas retorna apenas o resto
				
		System.out.println(b);
		System.out.println(a);
		
		
		
	}
}
