package br.com.impacta.interfaces;

public interface Operacao04<T,K> {
	
	//Parametro do tipo T, retorno do tipo K
	
	//Qual objeto vai receber e que tipo vai retornar
	//Ambos n�o tem tipo, ent�o o tipo vai ser decidido no AppOperacao04
	K executar(T item);

}
