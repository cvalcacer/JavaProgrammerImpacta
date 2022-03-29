package br.com.impacta.classes;

import br.com.impacta.enumeracoes.Sexo;

public class Aluno extends Pessoa {

	
	private int matricula;
	private Curso curso;
	
	public Aluno(){
		super();
	}
	
	public Aluno(String nome, int idade, Sexo sexo, int matricula, Curso curso) {
		super(nome, idade, sexo);
		this.setMatricula(matricula);
		this.setCurso(curso);
	}
	
		public int getMatricula() {
			return matricula;
		}
		public void setMatricula(int matricula) {
			this.matricula = matricula;
		}
		public Curso getCurso() {
			return curso;
		}
		public void setCurso(Curso curso) {
			this.curso = curso;
		}
		
		@Override
		public String mostrar(){
			
			return super.mostrar() +
					"\nMatr�cula: " + this.getMatricula() +
					
					((this.getCurso() == null) ? "/nNenhum curso atribu�do!" : 
						
						//if tern�rio
					
					"\nCurso: " + this.getCurso().mostrar());
					}
		
		//execu��o em cadeia 
	
	
}
