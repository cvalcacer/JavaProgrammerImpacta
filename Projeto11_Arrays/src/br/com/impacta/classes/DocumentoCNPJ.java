package br.com.impacta.classes;

import br.com.impacta.interfaces.Documento;

public class DocumentoCNPJ implements Documento {

	private String cnpj;
	
	public DocumentoCNPJ(String cnpj) {
		super();
		this.setNumero(cnpj);
	}
	
	
	@Override
	public void setNumero(String numero) {
	
		//matches usa o regex, express�o regular com os parametros de 0 a 9 e com lenght 11
		//! (NOT) deixa a condi��o falsa
	
		if (!numero.matches("[0-9]{14}")) {
			throw new NumberFormatException("O CNPJ " + "deve ter 14 d�gitos");
		}
	 
		this.cnpj = numero;
		
	}

	@Override
	public String getNumero() {
		// TODO Auto-generated method stub
		return this.cnpj;
	}
	
}
