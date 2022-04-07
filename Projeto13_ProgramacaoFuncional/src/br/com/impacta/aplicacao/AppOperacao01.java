package br.com.impacta.aplicacao;

import br.com.impacta.interfaces.Operacao01;

public class AppOperacao01 {
	
	public static int contarPalavras(String s) {
		
			String texto = s.trim();			
			String[] itens = texto.split(" ");
			int contador = 0;
			
				for (String elemento : itens) {
					if(elemento.length() > 0)
					contador++;			
				}
				return contador;
			};
		
		
	public static void main(String[] args) {
		
		//variavel vai ser s
		//op1 só aponta e prepara a operação
		//op1.executar recebe uma string e jogar pro s.lenght() pra contar os caracteres
		//s recebe o numero de caracteres e devolve pro retorno
		
		Operacao01 op1 = s -> s.length();
			int retorno = op1.executar("Curso Java");
			
			System.out.println(retorno);
		
		//parametro tem que ser um texto, retorno tem que ser int (numero de palavras)
	
		Operacao01 op2 = s-> {
			String texto = s.trim();			
			String[] itens = texto.split(" ");
			int contador = 0;
			
				for (String elemento : itens) {
					if(elemento.length() > 0)
					contador++;			
				}
				return contador;
			};
		
		String texto = "O curso de Java termina dia 14";
		int resultado = op2.executar(texto);
		
		System.out.println(resultado);
		System.out.println("O resultado é: \"" + resultado + "\"");
		
		Operacao01 op3 = s -> contarPalavras(s);
		int resultado3 = op3.executar("Essa é uma demonstração do contador de palavras criado");
		
		System.out.println(resultado3);
		
		
	}

}
