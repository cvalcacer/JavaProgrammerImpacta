package colecoes.exemplos;

public class TestandoGenerics {
	
	public static void main(String[] args) {
		
		CacheGenerics<String> cacheNome = new CacheGenerics<>();
		CacheGenerics<Integer> cachePortifolio = new CacheGenerics<>();
		
		cacheNome.setValue("Impacta");
		cachePortifolio.setValue(80);
		
		System.out.println("Nome: " + cacheNome.getValue());
		System.out.println("Portifolio: " + cachePortifolio.getValue());
						
	}

}
