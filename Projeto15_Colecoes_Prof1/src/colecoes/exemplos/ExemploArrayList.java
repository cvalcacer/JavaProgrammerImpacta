package colecoes.exemplos;

import java.util.ArrayList;
import java.util.List;

public class ExemploArrayList {
	
	public static void main(String[] args) {
		
		List<String> paises = new ArrayList<>();
		paises.add("Brasil");
		paises.add("EUA");
		paises.add("Inglaterra");
		paises.add("Portugal");
		paises.add("Fran�a");
		paises.add("It�lia");
		
		System.out.println("Pa�ses na ordem original");
		
		paises.forEach(curso -> System.out.println(" - " + curso)); //foreach para imprimir cada elemento da cole��o
		System.out.println("=========================================");
		System.out.println(paises.contains("EUA")); //contains retorna true/false se tem a string no array
		System.out.println(paises.get(2)); //get vai pegar o elemento do indice dois e imprimir
		System.out.println(paises.size()); //size vai mostrar o tamanho total do arrayList
		System.out.println(paises.indexOf("Fran�a")); //indexOf vai mostrar a localiza��o do elemento no ArrayList
		
		paises.replaceAll(s -> s.toUpperCase()); //muda tudo no ArrayList pra upper case
		paises.sort((x,y) -> x.compareTo(y)); //reordena a lista de acordo com a classifica��o, nesse caso alfab�tica (????????????)
		System.out.println("=========================================");
		System.out.println("Pa�ses ordenados e em mai�sculo:");
		paises.forEach(curso -> System.out.println(" - " + curso));
			
		
	}

}
