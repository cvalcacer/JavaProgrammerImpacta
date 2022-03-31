package br.com.impacta.classes;

import br.com.impacta.interfaces.Documento;

public class DocumentoCPF implements Documento{

	private String cpf;
	
	public DocumentoCPF(String cpf) {
		super();
		this.setNumero(cpf);
	}
	
		
		@Override
		public void setNumero(String numero) {
		
			//matches usa o regex, express�o regular com os parametros de 0 a 9 e com lenght 11
			//! (NOT) deixa a condi��o falsa
		
			if (!numero.matches("[0-9]{11}")) {
				throw new NumberFormatException("O CPF: " + "deve ter 11 d�gitos");
			}
		 
			this.cpf = numero;
			
		}
	
		@Override
		public String getNumero() {
			return this.cpf;
		}
	
	

}
