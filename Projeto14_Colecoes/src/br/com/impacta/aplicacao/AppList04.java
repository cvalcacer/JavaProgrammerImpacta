package br.com.impacta.aplicacao;

import java.util.LinkedHashSet;
import java.util.Set;

import br.com.impacta.classes.Produto;

public class AppList04 {

	public static void main(String[] args) {
		
				Set<Produto> produtos = new LinkedHashSet<>();
				produtos.add(new Produto("Laticínio", "Queijo", 15.99));
				produtos.add(new Produto("Laticínio", "Leite", 0.80));
				produtos.add(new Produto("Animal", "Ovos", 9.70));
				produtos.add(new Produto("Frios", "Presunto", 1.12));
				//produtos.add(new Produto("Bebidas", "Café", 2.99));
				
				
				Produto p = new Produto("Bebidas", "Café", 2.99);
				produtos.add(p);
				produtos.add(p);
				produtos.add(p);
				produtos.add(p);
				
				
				
				
				produtos.forEach(s -> System.out.println(s));

	}

}
