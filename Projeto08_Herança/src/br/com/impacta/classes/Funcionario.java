package br.com.impacta.classes;

public class Funcionario extends Pessoa {
	
	//extend =  herança, funcionario é subclasse de pessoa
	
	private String cargo;
	private double salario;
	
	
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
	
	

}
