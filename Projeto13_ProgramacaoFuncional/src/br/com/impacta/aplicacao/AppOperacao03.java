package br.com.impacta.aplicacao;

import br.com.impacta.interfaces.Operacao03;

public class AppOperacao03 {
	public static void main(String[] args) {
		
		
		Operacao03<String> op1 = p -> p.replace(" ", "").length();
		
		//tem que ser classe, nada de int, e sim Integer
		Operacao03<Integer> op2 = p -> p;
		
				
		System.out.println("Op1: " + op1.executar("Java Developer Jr na Empresa Impacta"));
		System.out.println("Op2: " + op2.executar(120));
		
		
		
		
		
		
		
	}

}
