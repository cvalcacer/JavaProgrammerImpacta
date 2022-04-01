package br.com.impacta.utilitarios;

public class Utilitarios {
     
	//static dispensa o uso de objetos.
	//pelo fato de ser static o this não funciona.
	
	public static double somar(double x, double y) {
		return x + y;
		
	//esrever um metodo que receba como parametro um texto e retorne esse texto sem espaços	
		}
	
	public static String removerEspacos(String texto) {
		return texto.replace(" " , "");
	//método replace da classe stringm usar para remover espaços ou mudar caracteres de acordo com os parametros
		}
	
	//Escrever um metodo que receba como parametro um nome e sobrenome e retonar um email formato: nome.sobrenome@impacta.com.br
	
	public static String gerarEmail(String nome, String sobrenome) {
		return removerEspacos(nome.toLowerCase()+"."+sobrenome.toLowerCase()+"@impacta.com.br");
		}
	
	//escreva um metodo que receba um array e 
	
	public static double calcularMediaArray(double[] numeros) {
		double soma = 0;
		
		for (int i = 0; i < numeros.length; i++) {
			soma += numeros[i];			
		}
		
		return soma / numeros.length;
	}
	
	
	}
	
	
	

