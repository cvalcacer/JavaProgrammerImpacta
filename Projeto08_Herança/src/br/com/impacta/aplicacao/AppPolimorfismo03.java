package br.com.impacta.aplicacao;

import javax.swing.JOptionPane;

import br.com.impacta.classes.Produto;
import br.com.impacta.classes.ProdutoImportado;

public class AppPolimorfismo03 {

	public static void main(String[] args) {
		
		Produto prod = new Produto("Alimentação", "Bolachas", 14.99);
		Produto prod2 = new ProdutoImportado("Alimentação", "Peixe", 55.99, 6.5);
		
		//Desejamos alterar a taxa de importação para 7.0%
		if(prod2 instanceof ProdutoImportado) {
			((ProdutoImportado) prod2).setTaxaImportacao(7);
		}
		
		JOptionPane.showMessageDialog(null, prod.mostrarDados());
		JOptionPane.showMessageDialog(null, prod2.mostrarDados());
		
		
	}

}
