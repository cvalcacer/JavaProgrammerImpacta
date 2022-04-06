package br.com.impacta.gui;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import br.com.impacta.classes.DocumentoCNPJ;
import br.com.impacta.classes.DocumentoCPF;
import br.com.impacta.classes.Funcionario;
import br.com.impacta.enumeracoes.Sexo;
import br.com.impacta.interfaces.Documento;

public class CadastroFuncionarios extends JFrame {

	private JPanel contentPane;
	private JTextField txtDocumento;
	private JTextField txtNome;
	private JTextField txtIdade;
	private JTextField txtCargo;
	private JTextField txtSalario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					CadastroFuncionarios frame = new CadastroFuncionarios();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CadastroFuncionarios() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 476, 353);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 398, 278);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblDocumento = new JLabel("Documento:");
		lblDocumento.setBounds(10, 11, 78, 14);
		panel.add(lblDocumento);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(10, 36, 60, 14);
		panel.add(lblNome);
		
		JLabel lblIdade = new JLabel("Idade:");
		lblIdade.setBounds(10, 61, 60, 14);
		panel.add(lblIdade);
		
		JLabel lblCargo = new JLabel("Cargo:");
		lblCargo.setBounds(10, 111, 60, 14);
		panel.add(lblCargo);
		
		JLabel lblSalrio = new JLabel("Sal\u00E1rio:");
		lblSalrio.setBounds(10, 136, 78, 14);
		panel.add(lblSalrio);
		
		txtDocumento = new JTextField();
		txtDocumento.setBounds(109, 8, 208, 20);
		panel.add(txtDocumento);
		txtDocumento.setColumns(10);
		
		txtNome = new JTextField();
		txtNome.setColumns(10);
		txtNome.setBounds(109, 33, 208, 20);
		panel.add(txtNome);
		
		txtIdade = new JTextField();
		txtIdade.setColumns(10);
		txtIdade.setBounds(109, 58, 208, 20);
		panel.add(txtIdade);
		
		txtCargo = new JTextField();
		txtCargo.setColumns(10);
		txtCargo.setBounds(109, 108, 208, 20);
		panel.add(txtCargo);
		
		txtSalario = new JTextField();
		txtSalario.setBounds(109, 133, 208, 20);
		panel.add(txtSalario);
		txtSalario.setColumns(10);
		
		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setBounds(10, 86, 60, 14);
		panel.add(lblSexo);
		
		JComboBox<Sexo> cmbSexo = new JComboBox();
		//colocando os itens na lista do combo
		cmbSexo.addItem(Sexo.MASCULINO);
		cmbSexo.addItem(Sexo.FEMINIMO);
		cmbSexo.setBounds(109, 82, 115, 22);
		panel.add(cmbSexo);
		
		JButton btnIncluirFuncionario = new JButton("Incluir funcion\u00E1rio");
		btnIncluirFuncionario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			try {
				//Obtendo o documento!
				Documento documento;
				String doc = txtDocumento.getText();
				
				if (doc.length() == 11) {
					documento = new DocumentoCPF(doc);
				}
				else if (doc.length() == 14) {
					documento = new DocumentoCNPJ(doc);
				}
				else {
					throw new Exception("O documento informado não é CPF nem CNPJ.");
				}
				
				//Obtendo o nome!
				String nome = txtNome.getText();
				
				//Obtendo a idade
				int idade = Integer.parseInt(txtIdade.getText());
				
				//Obtendo o sexo
				Sexo sexo = (Sexo)cmbSexo.getSelectedItem();
				
				//Obtendo o cargo
				String cargo = txtCargo.getText();
				
				//Obtendo o salário
				double salario = Double.parseDouble(txtSalario.getText());
				
				//Instanciando a classe Funcionario
				Funcionario funcionario = new Funcionario(
						nome,idade,sexo,cargo,salario,documento);
				
				//Apresentando os dados
				//modificando o null para acompanhar a tela
				JOptionPane.showMessageDialog(CadastroFuncionarios.this, funcionario.mostrar());
				
			}catch (Exception e2) {
				JOptionPane.showMessageDialog(CadastroFuncionarios.this, "Erro: " + e2.getMessage(), "\nErro: ", JOptionPane.ERROR_MESSAGE);
			}
			}
		});
		btnIncluirFuncionario.setBounds(10, 225, 179, 23);
		panel.add(btnIncluirFuncionario);
	}
}
