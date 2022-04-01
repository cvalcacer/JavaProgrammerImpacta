package br.com.impacta.aplicacao;

import javax.swing.JOptionPane;

import br.com.impacta.classes.Automovel;

public class AppArray06 {
	public static void main(String[] args) {
		
		Automovel[] automoveis = new Automovel[3];
		
		automoveis[0] = new Automovel ("VW","Fusca", 1972, "BCC1234");
		automoveis[1] = new Automovel ("VW","Volvo", 2017, "BCC1234");
		automoveis[2] = new Automovel ("Toyota","Yaris", 2021, "BCC1456");
		
		for (Automovel automovel : automoveis) {
			System.out.println(automovel.mostrar());	
			JOptionPane.showMessageDialog(null, automovel.mostrar());
		}
		
		
		
		
		
	}

}
