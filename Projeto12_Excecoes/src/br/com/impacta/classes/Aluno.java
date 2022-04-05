package br.com.impacta.classes;

import br.com.impacta.enumeracoes.Sexo;
import br.com.impacta.interfaces.Documento;

public class Aluno extends Pessoa {

	
	private int matricula;
	private Curso curso;
	
	public Aluno(){
		super();
	}
	
	public Aluno(String nome, int idade, Sexo sexo, int matricula, Curso curso, Documento documento) throws IllegalAccessException {
		super(nome, idade, sexo, documento);
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
					"\nMatrícula: " + this.getMatricula() +
					
					((this.getCurso() == null) ? "/nNenhum curso atribuído!" : 
						
						//if ternário
					
					"\nCurso: " + this.getCurso().mostrar());
					}
		
		//execução em cadeia 
	
	
}
