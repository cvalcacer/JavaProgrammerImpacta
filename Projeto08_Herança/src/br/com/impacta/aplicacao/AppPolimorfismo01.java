package br.com.impacta.aplicacao;

import javax.swing.JOptionPane;

import br.com.impacta.classes.Aluno;
import br.com.impacta.classes.Curso;
import br.com.impacta.classes.Funcionario;
import br.com.impacta.classes.Pessoa;
import br.com.impacta.enumeracoes.Sexo;

public class AppPolimorfismo01 {
	public static void main(String[] args) {
		
		Pessoa p1 = new Funcionario("Joel", 34, Sexo.FEMINIMO, "Dev", 35000);
		
		//quem executa o metodo é o método e nunca a variável.
		//p1 é apenas uma variável de referência.
		//polimorfismo está sempre relacionado ao método.
		//Herança está relacionada a clase, quem tem formas diferentes é o método.
		
		p1 = new Aluno("Joelson", 23, Sexo.MASCULINO, 123456,
				new Curso(123456789, "Java Dev", 9999, 98746321));
		

		
		
	
		
		
		
		
		
		
		
		
		
	}
}
