package br.com.impacta.classes;

import br.com.impacta.enumeracoes.Sexo;
import br.com.impacta.interfaces.Documento;

public abstract class Pessoa implements Comparable<Pessoa>{
	
	private String nome;
	private int idade;
	private Sexo sexo;
	
	private Documento documento;
	
			public Documento getDocumento() {
				return documento;
			}
		
			public void setDocumento(Documento documento) {
				this.documento = documento;
			}

	public Pessoa() {
		super();
	}
	
		public Pessoa(String nome, int idade, Sexo sexo, Documento documento)
		//foi preciso colocar um throw aqui para subir a responsabilidade, agora vai quebrar nos filhos.
		throws IllegalAccessException{
			super();
			
			this.setNome(nome);
			this.setIdade(idade);
			this.setSexo(sexo);
			this.setDocumento(documento);
					
	}
	
	
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
			
			//trim tira os espaços, método do object
			if(nome == null || nome.trim().length() == 0) {
				throw new IllegalArgumentException("O nome foi fornecido incorretamente");								
			}
			
			
		}
		public int getIdade() {
			return idade;
		}
		
		//throws IllegalAccessException, faz o jvm forçar a ter um try/catch de acordo com o nosso erro
		public void setIdade(int idade) throws IllegalAccessException{
			
			if(idade < 0) {
				throw new IllegalAccessException("A idade não pode ser negativa.");
			}
			
			this.idade = idade;
			
		}
		public Sexo getSexo() {
			return sexo;
		}
		public void setSexo(Sexo sexo) {
			this.sexo = sexo;
		}
	
	public String mostrar(){
				
		return "Nome: " + this.getNome() +
				"\nIdade: " + this.getIdade() +
				"\nSexo: " + this.getSexo() +
				
				(this.getDocumento() instanceof DocumentoCPF ? "\nCPF: " : "\nCNPJ: ") +
		
				this.getDocumento().getNumero();
				
	}

	@Override
	public int compareTo(Pessoa o) {
		
		return this.getNome().compareTo(o.getNome());
	}
	
	
		
}
