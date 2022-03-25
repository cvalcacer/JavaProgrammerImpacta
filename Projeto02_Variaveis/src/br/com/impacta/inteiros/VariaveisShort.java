package br.com.impacta.inteiros;

public class VariaveisShort {
	public static void main(String[] args) {
		short idade = 80; // aqui já aumenta bastante o numero
		short idade2 = 48;
		short soma = (short) (idade + idade2); //typecast
		
		//somando as duas idade e armazenando em uma terceira variável
		//java vai tentar colocar int, mas fazemos um cast para short no soma
		
		System.out.println(idade);
		System.out.println(idade2);
		System.out.println("Soma das idade é: " + soma);
	}

}
