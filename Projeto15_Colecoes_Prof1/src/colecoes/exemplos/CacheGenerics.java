package colecoes.exemplos;

public class CacheGenerics<T> {
	
	private T value;
	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
	
}
