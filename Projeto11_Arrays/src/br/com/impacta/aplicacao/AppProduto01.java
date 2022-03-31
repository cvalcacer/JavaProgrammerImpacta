package br.com.impacta.aplicacao;

import javax.swing.JOptionPane;

import br.com.impacta.classes.Produto;

public class AppProduto01 {
	public static void main(String[] args) {
		
	while (true) {
		String desc = JOptionPane.showInputDialog("Informe a descrição do produto: ");
		String cat = JOptionPane.showInputDialog("Informe a categoria do produto: ");
		double prec = Double.parseDouble(JOptionPane.showInputDialog("Informe o preço do produto: "));
		Produto prod = new Produto(cat, desc, prec);
		String texto = prod.mostrarDados();
		JOptionPane.showMessageDialog(null, texto);
		
		int opcao = JOptionPane.showConfirmDialog(null, "Gostaria de continuar?","Confirmação", JOptionPane.YES_NO_OPTION);
		
		if(opcao == JOptionPane.NO_OPTION) {
			break;
		}
		
		
	}
	
	
	//crtl shift o faz todas as importações
	
	//sempre escrever a classe no singular, plural é para listas
	
	}
	
}
