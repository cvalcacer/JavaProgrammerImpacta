package br.com.impacta.aplicacao;

import javax.swing.JOptionPane;

import br.com.impacta.classes.Aluno;
import br.com.impacta.classes.Curso;
import br.com.impacta.classes.Funcionario;
import br.com.impacta.classes.Pessoa;
import br.com.impacta.enumeracoes.Sexo;

public class AppPessoa {
	public static void main(String[] args) {
		
//		Pessoa pessoa = new Pessoa();
//		pessoa.setNome("Neto");
//		pessoa.setIdade(28);
//		pessoa.setSexo(Sexo.MASCULINO);
//		JOptionPane.showMessageDialog(null, pessoa.mostrar());
//		
		
		
			Pessoa funcionario = new Funcionario();
			funcionario.setNome("Joel");
			funcionario.setIdade(32);
			funcionario.setSexo(Sexo.MASCULINO);
			((Funcionario)funcionario).setCargo("Analista Jr.");
			((Funcionario)funcionario).setSalario(2500.00);
			JOptionPane.showMessageDialog(null, funcionario.mostrar());
			
			Pessoa aluno = new Aluno();
			aluno.setNome("Elci");
			aluno.setIdade(91);
			aluno.setSexo(Sexo.FEMINIMO);
			((Aluno)aluno).setMatricula(125478);
			
			((Aluno)aluno).setCurso(new Curso(222, "Java Dev", 12458, 12345));
			JOptionPane.showMessageDialog(null, aluno.mostrar());
			
			
						
			}
		
		
	}


