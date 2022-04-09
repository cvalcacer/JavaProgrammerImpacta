package br.com.impacta.classes;

public class Curso implements Comparable<Curso> {

	private int codigo;
	private String descricao;
	private int cargaHoraria;
	private double preco;
	
		public Curso(int codigo, String descricao, int cargaHoraria, double preco) {
			
		
		this.setCodigo(codigo);
		this.setDescricao(descricao);
		this.setCargaHoraria(cargaHoraria);
		this.setPreco(preco);
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
				
				return 	"\nC�digo: " + this.getCodigo()  +
						"\nDescri��o: " + this.getDescricao() +
						"\nCarga Hor�ria: " + this.getCargaHoraria() +
						"\nPre�o: " + this.getPreco();
						}

			@Override
			public int compareTo(Curso arg0) {
				
				return this.getDescricao().compareTo(arg0.getDescricao());
			}

			@Override
			public boolean equals(Object obj) {
				if (obj instanceof Curso) {
					Curso s = (Curso)obj;
					
					if(this.getCodigo() == s.getCodigo() && 
							this.getDescricao() == s.getDescricao() && 
							this.getPreco() == s.getPreco() && 
							this.getCargaHoraria() == s.getCargaHoraria()){
								return true;
							}
					
					
				}
				return false;
					
					
					
			}
	
			
			
	
}
