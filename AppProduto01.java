package br.com.impacta.aplicacao;

import javax.swing.JOptionPane;

import br.com.impacta.classes.Produto;

public class AppProduto01 {
	public static void main(String[] args) {
		
	Produto prod = new Produto ();
	
	int cod = Integer.parseInt(JOptionPane.showInputDialog("Informe o c�digo do produto: "));
	String desc = JOptionPane.showInputDialog("Informe a descri��o do produto: ");
	String cat = JOptionPane.showInputDialog("Informe a categoria do produto: ");
	double prec = Double.parseDouble(JOptionPane.showInputDialog("Informe o pre�o do produto: "));
	
	prod.setCodigo(cod);
	prod.setDescricao(desc);
	prod.setCategoria(cat); //"" s� pra String
	prod.setPreco(prec); //double s� aceita ponto
	
	String texto = prod.mostrarDados();
	JOptionPane.showMessageDialog(null, texto);
	
	
	
	//crtl shift o faz todas as importa��es
	
	//sempre escrever a classe no singular, plural � para listas
	
	}
	
}
