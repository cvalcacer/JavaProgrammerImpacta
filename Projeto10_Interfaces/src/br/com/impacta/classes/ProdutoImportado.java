package br.com.impacta.classes;

public class ProdutoImportado extends Produto {
	
	private double taxaImportacao;
	
	public ProdutoImportado(String categoria, String descricao, double preco) {
		super(categoria, descricao, preco);
		
	}
	
	public ProdutoImportado(String categoria, String descricao, double preco, double taxaImportacao) {
		this(categoria, descricao, preco);
		this.setTaxaImportacao(taxaImportacao);
		
	}

		public double getTaxaImportacao() {
			return taxaImportacao;
		}
	
		public void setTaxaImportacao(double taxaImportacao) {
			this.taxaImportacao = taxaImportacao;
		}

		@Override
		public String mostrarDados() {
			// TODO Auto-generated method stub
			return super.mostrarDados() + "\nTaxa de Importa��o: " + this.getTaxaImportacao();
		}
		
		
	
	
	
	
}
