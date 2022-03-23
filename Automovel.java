package br.com.impacta.classes;

public class Automovel {
	
	//criando uma classe backend, sem o main, o main � front
	
	private String marca;
	private String modelo;
	private int ano;
	private String placa;
	
		public String mostrar() {
		
				String titulo = "DADOS DO AUTOM�VEL";
			
				return  titulo + "\n\nA marca �: " + this.getMarca() + 
						"\nO modelo �: " + this.getModelo() + 
						"\nO ano do carro �: " + this.getAno() + 
						"\nA placa �: " + this.getPlaca();
				
		}
	
		public String mostrar(String titulo) {
				
						return  titulo + "\n\nA marca �: " + this.getMarca() + 
						"\nO modelo �: " + this.getModelo() + 
						"\nO ano do carro �: " + this.getAno() + 
						"\nA placa �: " + this.getPlaca();
				
		}
	
	//this referencia a pr�pria classe, � uma refer�ncia que serve para termos
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
			throw new NumberFormatException("O ano n�o pode ser menor que 1970");
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
	
	//caracteristicas do objeto s�o os atributos, no caso do carro, marca
	//modelo, ano e placa, s� add atributos que tenham a ver com o objeto
	
	
	//tipo de variavel
	//default - String marca
	//public - public String marca
	//private - private String marca
	//protected - protected String marca
	
	
	
	
	

