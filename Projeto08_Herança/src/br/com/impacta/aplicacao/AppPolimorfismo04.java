package br.com.impacta.aplicacao;

import javax.swing.JOptionPane;

import br.com.impacta.classes.Aluno;
import br.com.impacta.classes.Curso;
import br.com.impacta.classes.Funcionario;
import br.com.impacta.classes.Pessoa;
import br.com.impacta.enumeracoes.Sexo;

public class AppPolimorfismo04 {

		public static void main(String[] args) {
			
		Pessoa p1 = new Funcionario("Joel", 34, Sexo.FEMINIMO, "Dev", 35000);
		//Desejamos alterar o valor do salário no objeto.
		
		Funcionario func = (Funcionario)p1;
		func.setSalario(1999);
		
		Curso curso = new Curso(123456, "C#", 56, 67.99);
		//Aluno aluno = (Aluno)p1;
		//aluno.setCurso(curso1);
		
		if (p1 instanceof Aluno) {
			p1.setIdade(27);
			((Aluno) p1).setCurso(curso);
		}
				
						
		JOptionPane.showMessageDialog(null, p1.mostrar());
		
		
	}

}
