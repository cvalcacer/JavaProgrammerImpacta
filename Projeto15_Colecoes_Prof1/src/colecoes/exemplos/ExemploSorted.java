package colecoes.exemplos;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ExemploSorted {
	public static void main(String[] args) {
		
		List<Funcionario> lista = new ArrayList<>();
		lista.add(new Funcionario(3018, "Joaquin Batista", "Desenvolvedor", 5500));
		lista.add(new Funcionario(1045, "Maria das Dores", "Analista", 6250));
		lista.add(new Funcionario(1780, "João Ricardo", "Desenvolvedor", 7100));
		lista.add(new Funcionario(5200, "Ana Maria", "Vendedor", 4100));
		lista.add(new Funcionario(3999, "Robson Gusmão", "Analista", 6500));
		lista.add(new Funcionario(2389, "Eduardo Alves", "Desenvolvedor", 3200));
		
		lista.stream()
		.sorted(Comparator.comparing(Funcionario::getNome))
		.forEach(System.out::println);
				
	}

}
