package br.com.impacta.aplicacao;

import javax.swing.JOptionPane;

import br.com.impacta.classes.Circulo;
import br.com.impacta.classes.Retangulo;
import br.com.impacta.interfaces.Figura;

public class AppArray07 {
	public static void main(String[] args) {
		
		//definindo um array de interface! (figura)
		Figura[] figuras = new Figura[3];
		
		figuras[0] = new Retangulo(12,17);
		figuras[1] = new Circulo(17);
		figuras[2] = new Retangulo(25,45);
		
		for (Figura figura : figuras) {
			System.out.println(figura.apresentarFigura());	
			JOptionPane.showMessageDialog(null, figura.apresentarFigura());
		}
		
		
	}

}
