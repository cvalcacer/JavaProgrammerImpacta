package br.com.impacta.classes;

import br.com.impacta.enumeracoes.Sexo;
import br.com.impacta.interfaces.Documento;

public class Funcionario extends Pessoa {
	
	//extend =  heran?a, funcionario ? subclasse de pessoa
	
	private String cargo;
	private double salario;
	
	public Funcionario() {
		super();
	}
	
	public Funcionario(String nome, int idade, Sexo sexo, String cargo, double salario, Documento documento) throws IllegalAccessException {
		super(nome, idade, sexo, documento);
		this.setCargo(cargo);
		this.setSalario(salario);
		
	}
	
	
		public String getCargo() {
			return cargo;
		}
		public void setCargo(String cargo) {
			this.cargo = cargo;
		}
		public double getSalario() {
			return salario;
		}
		public void setSalario(double salario) {
			this.salario = salario;
		}
	
		@Override //opcional, porem garante o override
		public String mostrar(){
			
			return super.mostrar() +
					"\nCargo: " + this.getCargo()  +
					"\nSal?rio: " + this.getSalario();
					}

}
