package colecoes.exemplos;

public class ExemploHashCode {
	public static void main(String[] args) {
		
		Pessoa a = new Pessoa("Rodrigo",23);
		Pessoa b = new Pessoa("Claudio",20);
		
		System.out.println(a.nome + " é igual a " + b.nome + "? " + (a.nome.hashCode() == (b.nome.hashCode())));
		
		a.nome = b.nome;
		
		System.out.println(a.nome + " é igual a " + b.nome + "? " + (a.nome.hashCode() == (b.nome.hashCode())));
		
		a = b;
		
		System.out.println(a.nome + " é igual a " + b.nome + "? " + (a.nome.hashCode() == (b.nome.hashCode())));

	}
}
