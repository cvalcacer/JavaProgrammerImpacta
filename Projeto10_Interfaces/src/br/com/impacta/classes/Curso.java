package br.com.impacta.classes;

public class Curso {

	private int codigo;
	private String descricao;
	private int cargaHoraria;
	private double preco;
	
		public Curso(int codigo, String descricao, int cargaHoraria, double preco) {
		this.setCodigo(12355);
		this.setDescricao("Java programmer");
		this.setCargaHoraria(125635);
		this.setPreco(1245.12);
		}
		
			public int getCodigo() {
				return codigo;
			}
			public void setCodigo(int codigo) {
				this.codigo = codigo;
			}
			public String getDescricao() {
				return descricao;
			}
			public void setDescricao(String descricao) {
				this.descricao = descricao;
			}
			public int getCargaHoraria() {
				return cargaHoraria;
			}
			public void setCargaHoraria(int cargaHoraria) {
				this.cargaHoraria = cargaHoraria;
			}
			public double getPreco() {
				return preco;
			}
			public void setPreco(double preco) {
				this.preco = preco;
			}
			
			
			public String mostrar(){
				
				return 	"\nCódigo: " + this.getCodigo()  +
						"\nDescrição: " + this.getDescricao() +
						"\nCarga Horária: " + this.getCargaHoraria() +
						"\nPreço: " + this.getPreco();
						}
	
	
}
