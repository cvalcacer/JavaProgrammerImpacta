package br.com.impacta.aplicacao;

import java.util.ArrayList;

import br.com.impacta.classes.Produto;

public class AppList03 {
	public static void main(String[] args) {
		
		
		ArrayList<Produto> produtos = new ArrayList<>();
				
		produtos.add(new Produto("Laticínio", "Queijo", 15.99));
		produtos.add(new Produto("Laticínio", "Leite", 0.80));
		produtos.add(new Produto("Animal", "Ovos", 9.70));
		produtos.add(new Produto("Frios", "Presunto", 1.12));
		produtos.add(new Produto("Bebidas", "Café", 2.99));
				
		System.out.println("Lista original: ");		
		produtos.forEach(s -> System.out.println(s));
		System.out.println("\n");
		
		//ordenacao pela categoria
		produtos.sort((a,b) -> a.getCategoria().compareTo(b.getCategoria()));	
		System.out.println("Lista por categoria: ");		
		produtos.forEach(s -> System.out.println(s));
		
		
	}

}
