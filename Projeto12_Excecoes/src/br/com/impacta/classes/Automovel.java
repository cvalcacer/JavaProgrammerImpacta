package br.com.impacta.classes;

public class Automovel implements Comparable<Automovel> {
	
	public static final String PAIS_ORIGEM = "Brasil";
	private String marca;
	private String modelo;
	private int ano;
	private String placa;
	
	private final int chassi;
	
	public Automovel(String marca, String modelo) {
		this.chassi = (int)(Math.random() * 1000);
		this.setMarca(marca);
		this.setModelo(modelo);
		}
	
	public Automovel(String marca, String modelo, int ano) {
		this(marca, modelo);
		this.setAno(ano);
	   }
	
	public Automovel(String marca, String modelo, int ano, String placa) {
		this(marca,modelo,ano);
		this.setPlaca(placa);
	   }
		
		
		public String mostrar() {
		
				String titulo = "DADOS DO AUTOMÓVEL";
			
				String resposta =   titulo + "\n\nA marca é: " + this.getMarca() + "\nO modelo é: " + this.getModelo() + "\nChassi: " + this.getChassi();
										
					if(this.getAno() > 0) {
						resposta += "\nO ano do carro é: " + this.getAno();
						}
					if(this.getPlaca() != null) {
						resposta += "\nA placa é: " + this.getPlaca();
						}
				
				resposta += "\nO país é: " + PAIS_ORIGEM;
				
				return resposta;
				
		}
	
		public String mostrar(String titulo) {
				
						return  titulo + "\n\nA marca é: " + this.getMarca() + 
						"\nO país é: " + PAIS_ORIGEM +
						"\nO modelo é: " + this.getModelo() + 
						"\nO ano do carro é: " + this.getAno() + 
						"\nA placa é: " + this.getPlaca()
						+ "\nChassi: " + this.getChassi();
				
		}
	
	

	public void lerDados(String marca, String modelo, int ano, String placa) {
		this.setMarca(marca);                        
		this.setModelo(modelo);		
		this.setAno(ano);
		this.setPlaca(placa);
					
	}

	public int getChassi() {
		return chassi;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		
		if (ano < 1970) {
			throw new NumberFormatException("O ano não pode ser menor que 1970");
		}
		
		this.ano = ano;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	@Override
	public int compareTo(Automovel arg0) {
		
		if(this.getModelo().compareTo(arg0.getModelo()) == 0) {
			return this.getMarca().compareTo(arg0.getMarca());
		}

		return this.getModelo().compareTo(arg0.getModelo());
	}
		
}
	
	
	
	
	
	

