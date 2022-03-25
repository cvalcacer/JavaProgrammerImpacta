package br.com.impacta.inteiros;

public class VariaveisInt {
	public static void main(String[] args) {
		int v_decimal = 100; 
		int v_octal = 0100; //0 na frente muda pra base octal 0 a 7*
		int v_hexadecimal = 0x100; //hexadecimal vai pra base 16, de A até F muito usando em cores
		int v_binario = 0b100; //
		
		
		System.out.println("v_decimal: " + v_decimal);
		System.out.println("v_octal: " + v_octal);
		System.out.println("v_hexadecimal: " +v_hexadecimal);
		System.out.println("v_binario: " + v_binario);
	}
}
