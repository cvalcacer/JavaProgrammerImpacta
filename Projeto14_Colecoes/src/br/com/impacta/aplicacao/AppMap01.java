package br.com.impacta.aplicacao;

import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;

public class AppMap01 {

	public static void main(String[] args) {
		
		//k chave e v valor
		//Map<k,v>
		
		Map<Integer,String> nomes = new HashMap<>();
		
		//quando usar hashmap, usar .put para add, afinal precisa de uma ket e um valor.
		nomes.put(123, "Neto");
		nomes.put(124, "Lucas");
		nomes.put(125, "Douglas");
		nomes.put(127, "Nirley");
		nomes.put(130, "Jed");
		
		for (Map.Entry<Integer, String> item: nomes.entrySet()) {
			//System.out.println(item);
			//System.out.println(item.getKey() + " - " + item.getValue());
		}
		
		int chave = Integer.parseInt(JOptionPane.showInputDialog("Insira uma chave!"));
		
		if(nomes.containsKey(chave)) {
			JOptionPane.showMessageDialog(null, "Valor encontrado: " + nomes.get(chave));
		}
		else {
			JOptionPane.showMessageDialog(null, "Nenhum valor encontrado.");		}
		
		
		
		
		
		
		

	}

}
