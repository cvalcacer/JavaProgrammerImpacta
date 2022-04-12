package br.com.impacta.aplicacao;

import java.awt.HeadlessException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

import br.com.impacta.classes.Tarefa;

public class AppTarefa {
	public static void main(String[] args) {
		
		try {
			//Data e hora atuais.
			Date date = new Date();
			//data atual
			//System.out.println(date);
			
			//pegando a data do usuário
			String sdata = JOptionPane.showInputDialog("Informe uma data no formato dd/mm/aaa");
			//convertendo o texto para um objeto Date.
			DateFormat dt = new SimpleDateFormat("dd/MM/yyyy");
			Date dateUser = dt.parse(sdata);
			
			System.out.println(dateUser);
			System.out.println("\n");
			
			//System.out.println(dt.format(date));
			//System.out.println(dt.format(dateUser));
			
			Tarefa t1 = new Tarefa(new Date(), "Gerar relatório.", 10);
			Tarefa t2 = new Tarefa(dateUser, "Imprimir recibo NF", 5);
			
			System.out.println(t1);
			System.out.println(t2);
			
			
			
			
		} catch (HeadlessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
