package br.com.impacta.relacionais_logicos;

public class OperadoresRelacionais02 {
	public static void main(String[] args) {
		
		int a = 10, b = 20;
		boolean b1 = (a <= 10) && (b % 2 ==0);
		
		System.out.println("B1: " + b1);
		              //true       //false     /false
		boolean b2 = (a == 10) && (a == b) || (b > 20);
		
		System.out.println("B2: " + b2);
		
		//&& vai comparar até achar um false
		//& vai comparar todas as condicoes mesmo que tenha false
		
	}
}
