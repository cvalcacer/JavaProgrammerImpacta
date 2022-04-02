package br.com.impacta.aplicacao;

import javax.swing.JOptionPane;

import br.com.impacta.classes.DocumentoCNPJ;
import br.com.impacta.classes.DocumentoCPF;
import br.com.impacta.classes.Funcionario;
import br.com.impacta.enumeracoes.Sexo;

public class AppPessoaDocumento {

	public static void main(String[] args) {


		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Neto Valcacer");
		funcionario.setIdade(30);
		funcionario.setSexo(Sexo.MASCULINO);
		funcionario.setSalario(15000.00);
		funcionario.setDocumento(new DocumentoCPF("44211021004"));
		
		JOptionPane.showMessageDialog(null, funcionario.mostrar());
		
		Funcionario funcionario2 = new Funcionario();
		funcionario2.setNome("Neto Valcacer");
		funcionario2.setIdade(30);
		funcionario2.setSexo(Sexo.MASCULINO);
		funcionario2.setSalario(15000.00);
		funcionario2.setDocumento(new DocumentoCNPJ("12345678912345"));
		
		JOptionPane.showMessageDialog(null, funcionario2.mostrar());
		
		
		
		
		
		
		
		
		
		
		

	}

}
