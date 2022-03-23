package br.com.impacta.aplicacao;

import javax.swing.JOptionPane;

import br.com.impacta.classes.Automovel;

public class AppAutomovel01 {
	public static void main(String[] args) {
		
		//declarando uma variavel
		//tipo, nome, instanciar
		
		Automovel auto = new Automovel();
		auto.lerDados("Honda", "Civic", 2021, "EBB1234");
		
		//auto.setAno(1959);
		
		//ctrl alt baixo copia a ultima linha
		//ctrl shift f denta o codigo
		
		String texto = auto.mostrar();
		System.out.println(texto);
		//JOptionPane.showMessageDialog(null, texto);
				
		//criar um metodo para mostrar o syso, vamos criar no automovel
		
		//int n = Integer.parseInt(JOptionPane.showInputDialog("Informe o numero"));
					
	}
}
