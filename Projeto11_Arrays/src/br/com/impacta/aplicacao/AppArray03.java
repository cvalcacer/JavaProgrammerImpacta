package br.com.impacta.aplicacao;

public class AppArray03 {
	public static void main(String[] args) {
		
		//quando declaramos e atribuimos um valor, new int[] se torna opcional
		
		int [] numeros = {17,13,18,25,39,17};
				
			for (int elemento : numeros) {
				System.out.println(elemento);
				}
		//vamos fazer um array 'numeros' referenciar outro objeto;
			
		numeros = new int[] {2,5,6,7,1};
		
			for (int elemento : numeros) {
				System.out.println(elemento);				
			}
			
			
	}
}

