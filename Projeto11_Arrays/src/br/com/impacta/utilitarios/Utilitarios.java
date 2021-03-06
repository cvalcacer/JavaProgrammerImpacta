package br.com.impacta.utilitarios;

public class Utilitarios {
     
	//static dispensa o uso de objetos.
	//pelo fato de ser static o this n?o funciona.
	
	public static double somar(double x, double y) {
		return x + y;
		
	//esrever um metodo que receba como parametro um texto e retorne esse texto sem espa?os	
		}
	
	public static String removerEspacos(String texto) {
		return texto.replace(" " , "");
	//m?todo replace da classe stringm usar para remover espa?os ou mudar caracteres de acordo com os parametros
		}
	
	//Escrever um metodo que receba como parametro um nome e sobrenome e retonar um email formato: nome.sobrenome@impacta.com.br
	
	public static String gerarEmail(String nome, String sobrenome) {
		return removerEspacos(nome.toLowerCase()+"."+sobrenome.toLowerCase()+"@impacta.com.br");
		}
	
	//escreva um metodo que receba um array e calcule a media de todos os itens somados
	
	public static double calcularMediaArray(double[] numeros) {
		double soma = 0;
		
		for (int i = 0; i < numeros.length; i++) {
			soma += numeros[i];			
		}
		
		return numeros.length > 0 ? soma / numeros.length : soma; //para n?o retornar nan
	}
	
	//criando um novo m?todo para calcular a media dos numeros com um novo metodo
	//...varargs sempre vai considerar o array, m?todo fica dinamico, pode receber tanto um quanto cinquenta
	//o array vai ser criado quando o m?todo for utilizado.
	
	public static double calcularMediaNumeros(double...numeros) {
		return calcularMediaArray(numeros);
	}
}
	
	
	

