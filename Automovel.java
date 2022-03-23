package br.com.impacta.classes;

public class Automovel {
	
	//criando uma classe backend, sem o main, o main é front
	
	private String marca;
	private String modelo;
	private int ano;
	private String placa;
	
		public String mostrar() {
		
				String titulo = "DADOS DO AUTOMÓVEL";
			
				return  titulo + "\n\nA marca é: " + this.getMarca() + 
						"\nO modelo é: " + this.getModelo() + 
						"\nO ano do carro é: " + this.getAno() + 
						"\nA placa é: " + this.getPlaca();
				
		}
	
		public String mostrar(String titulo) {
				
						return  titulo + "\n\nA marca é: " + this.getMarca() + 
						"\nO modelo é: " + this.getModelo() + 
						"\nO ano do carro é: " + this.getAno() + 
						"\nA placa é: " + this.getPlaca();
				
		}
	
	//this referencia a própria classe, é uma referência que serve para termos
	//acesso a todos os atributos da classe. (atributos e metodos).
	
	//TODA CLASSE POSSUI UM THIS. (identifica info que fazem parte da classe)

	public void lerDados(String marca, String modelo, int ano, String placa) {
		this.setMarca(marca);                         //JOptionPane.showMessageDialog(null, "Qual a marca do carro?");
		this.setModelo(modelo);		
		this.setAno(ano);
		this.setPlaca(placa);
					
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

		
	}
	
	//caracteristicas do objeto são os atributos, no caso do carro, marca
	//modelo, ano e placa, só add atributos que tenham a ver com o objeto
	
	
	//tipo de variavel
	//default - String marca
	//public - public String marca
	//private - private String marca
	//protected - protected String marca
	
	
	
	
	

