package br.com.impacta.aplicacao;

public class AppArray01 {

	public static void main(String[] args) {
		
		//definindo um array de inteiros
		//não é possível redimensionar um array, depois de criado não muda mais
		int[] numeros = new int [5];
		
			//atribuir valores individualmente
			numeros[0] = 20;
			numeros[1] = 10;
			numeros[2] = -50;
			numeros[3] = 60;
			numeros[4] = 90;
			
		//numero.lenght propriedade do array que vai percorrer sempre utilizar a quantidade de espaço
		for(int i = 0; i < numeros.length ;i++) {
			System.out.println(numeros[i]);		
		}
		
		for(int i = numeros.length - 1 ; i >= 0 ; i--) {
			System.out.println(numeros[i]);			
		}
			
	}

}
