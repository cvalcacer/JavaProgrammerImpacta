package br.com.impacta.classes;

import br.com.impacta.enumeracoes.Sexo;

public class Funcionario extends Pessoa {
	
	//extend =  herança, funcionario é subclasse de pessoa
	
	private String cargo;
	private double salario;
	
	public Funcionario() {
		super();
	}
	
	public Funcionario(String nome, int idade, Sexo sexo, String cargo, double salario) {
		super(nome, idade, sexo);
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
					"\nSalário: " + this.getSalario();
					}

}
