package br.com.impacta.interfaces;

//<T> para deixar os parametros livres na interface, podendo ser String, int, double e oq vier.
public interface Operacao03 <T> {
	
	//T item parametros livres na interface, podendo ser String, int, double e oq vier.
	int executar(T item);
	
	

}
