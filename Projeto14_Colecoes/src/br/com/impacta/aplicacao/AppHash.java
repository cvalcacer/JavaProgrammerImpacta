package br.com.impacta.aplicacao;

public class AppHash {

	public static void main(String[] args) {
		
		String s1 = "Java";
		String s2 = "java";
		String s3 = "JaVa";
		String s4 = "C#";
		String s5 = "PHP";
		String s6 = "CSS";
		
		//hashCode é um método do object que vai mostrar os códigos hash dos objetos
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		System.out.println(s5.hashCode());
		System.out.println(s6.hashCode());
		
			

	}

}
