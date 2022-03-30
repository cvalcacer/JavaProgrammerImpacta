package br.com.impacta.aplicacao;

import javax.swing.JOptionPane;

import br.com.impacta.classes.Automovel;

public class AppAutomovel01 {
	public static void main(String[] args) {
		
		Automovel auto = new Automovel("Honda", "Civic");
		JOptionPane.showMessageDialog(null,auto.mostrar());
		
		Automovel auto2 = new Automovel("Toyota", "Yaris", 2021);
		JOptionPane.showMessageDialog(null,auto2.mostrar());
		
		Automovel auto3 = new Automovel("Fiat", "Siena", 1999, "EBB4444");
		JOptionPane.showMessageDialog(null,auto3.mostrar());
		
		//selecionar, ctrl + shift + c pra comentar ou ctrl + contra barra
		
				
					
	}
}
