package br.com.impacta.inteiros;

public class VariaveisByte {
	public static void main(String[] args) {
		//tipo da variavel, nome da variavel, 
		// = atribuição
		byte idade = 80; // -128 a 127
		byte idade2 = 48;
		byte soma = (byte) (idade + idade2); //typecast
		
		//somando as duas idade e armazenando em uma terceira variável
		//java vai tentar colocar int, mas fazemos um cast para byte no soma
		
		System.out.println(idade);
		System.out.println(idade2);
		System.out.println("Soma das idade é: " + soma);
}
}
