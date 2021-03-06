package br.com.impacta.aplicacao;

import javax.swing.JOptionPane;

import br.com.impacta.classes.Aluno;
import br.com.impacta.classes.Curso;
import br.com.impacta.classes.Funcionario;
import br.com.impacta.classes.Pessoa;
import br.com.impacta.enumeracoes.Sexo;

public class AppPolimorfismo02 {
	public static void main(String[] args) {
		
				Pessoa p1 = new Funcionario("Joel", 34, Sexo.FEMINIMO, "Dev", 35000);
				
				//quem executa o metodo ? o m?todo e nunca a vari?vel.
				//p1 ? apenas uma vari?vel de refer?ncia.
				//polimorfismo est? sempre relacionado ao m?todo.
				//Heran?a est? relacionada a clase, quem tem formas diferentes ? o m?todo.
				
				Aluno p2 = new Aluno("Joelson", 23, Sexo.MASCULINO, 123456,
						new Curso(123456789, "Java Dev", 9999, 98746321));
				
				mostrarPessoa(p1);
				mostrarPessoa(p2);
										
	}
		
	private static void mostrarPessoa(Pessoa p){
	String nomeClasse = p.getClass().getSimpleName();
	String resposta = p.mostrar();
	
	JOptionPane.showMessageDialog(null, "Classe: " + nomeClasse + "\n" + resposta);
	
	}
			
}
