package br.com.impacta.relacionais_logicos;

public class OperadoresRelacionais01 {
	public static void main(String[] args) {
		int a = 10, b = 20;
		boolean b1 = (a > 0); //boas pr�ticas colocar a opera��o do boolean entre parenteses
		boolean b2 = (b >= a);
		boolean b3 = (b++ == 20); //true pq o incremento est� depois
		
		System.out.println("B3: " + b3);
		
		boolean b4 = (--a == 10); //false porque o decremento est� antes
		
		System.out.println("B4: " + b4);
	}

}
