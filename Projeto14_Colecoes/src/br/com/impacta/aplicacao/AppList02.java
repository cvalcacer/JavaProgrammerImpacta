package br.com.impacta.aplicacao;

import java.util.ArrayList;
import java.util.Collections;

import br.com.impacta.classes.OrdenacaoCategoria;
import br.com.impacta.classes.Produto;

public class AppList02 {
	public static void main(String[] args) {
		
		//interface              //tipo
		ArrayList<Produto> produtos = new ArrayList<>();
		
		produtos.add(new Produto("Laticínio", "Queijo", 15.99));
		produtos.add(new Produto("Laticínio", "Leite", 0.80));
		produtos.add(new Produto("Animal", "Ovos", 9.70));
		produtos.add(new Produto("Frios", "Presunto", 1.12));
		produtos.add(new Produto("Bebidas", "Café", 2.99));
		
		//foi preciso usar uma sobrecarga, override, no Produto com toString
		produtos.forEach(s -> System.out.println(s));
		
		Collections.sort(produtos, new OrdenacaoCategoria());
		
		System.out.println("\n");
		
		System.out.println("Lista ordenada pela descrição: ");
		produtos.forEach(s -> System.out.println(s));
		
		
		
		
		
		
	}

}
