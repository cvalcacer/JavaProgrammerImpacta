package br.com.impacta.classes;

public class Produto {
	
	private final int codigo;
	private String descricao;
	private String categoria;
	private double preco;
	
	private static int contador = 1;
	
		public Produto(String descricao, String categoria, double preco) {
		this.codigo = contador++;
		this.setDescricao(descricao);
		this.setCategoria(categoria);
		this.setPreco(preco);
		}
		
			public int getCodigo() {
				return codigo;
			}
			public String getDescricao() {
				return descricao;
			}
			public void setDescricao(String descricao) {
					this.descricao = descricao;
				}
			public String getCategoria() {
				return categoria;
				}
			public void setCategoria(String categoria) {
					this.categoria = categoria;
				}
			public double getPreco() {
				return preco;
			}
				public void setPreco(double preco) {
					this.preco = preco;
				}
		
				public String mostrarDados(){
					
				 
				
					return "Código: " + this.getCodigo() +
							"\nDescrição: " + this.getDescricao() +
							"\nCategoria: " + this.getCategoria() + 
							"\nPreço: " + this.getPreco();
					
				}

				@Override
				public String toString() {
					
					return "(" + this.getCodigo() + ", "
							+ this.getCategoria() + ", "
							+ this.getDescricao() + ") ";
				}
	

}
