package br.com.impacta.aplicacao;

import br.com.impacta.classes.Pessoa;
import br.com.impacta.enumeracoes.Sexo;

public class AppPessoa {
	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa();
		pessoa1.nome = "Neto";
		pessoa1.idade = 34;
		pessoa1.sexo = Sexo.FEMINIMO;
		
	}

}
