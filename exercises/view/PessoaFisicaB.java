package view;
//TODO fix this eh
/*package view;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

@SuppressWarnings("serial")
public class PessoaFisica extends JFrame{
	
	PessoaFisica		pessoaFisica = new PessoaFisica();
	
	JTextField			txtNome		= new JTextField(),
						txtEnd		= new JTextField(),
						txtBairro	= new JTextField(),
						txtCidade	= new JTextField();
	
	JFormattedTextField	txtCep		= null,
						txtTel		= null,
						txtCel		= null,
						txtRg		= null,
						txtCpf		= null;
	
	JLabel				lblNome		= new JLabel("NOME: "),
						lblEnd		= new JLabel("ENDEREÇO: "),
						lblBairro	= new JLabel("BAIRRO: "),
						lblCep		= new JLabel("CEP: "),
						lblCidade	= new JLabel("CIDADE: "),	
						lblEstado	= new JLabel("ESTADO: "),
						lblTel		= new JLabel("TELEFONE: "),
						lblCel		= new JLabel("CELULAR: "),
						lblRg		= new JLabel("RG: "),
						lblCpf		= new JLabel("CPF: "),
						lblSexo		= new JLabel("SEXO: ");
	
	JComboBox			cmbEst		= new JComboBox(); //opções de estados
	
	JButton				btnSalvar	= new JButton("Salvar"),
						btnImprimir	= new JButton("Imprimir");
	
	JRadioButton[]		rdbsexo		= new JRadioButton[2]; //botão para opçoes
	ButtonGroup			grupo		= new ButtonGroup(); {  //group impede marcar mais de uma opçao no mesmo objeto
	
		rdbsexo[0] = new JRadioButton("Feminino");
		rdbsexo[1] = new JRadioButton("Masculino"); //fechar chave nos groups
		
		MaskFormatter		formatTel	= null, //add mascara
							formatCel	= null,
							formatCpf	= null,
							formatCep	= null,
							formatRg	= null;
		}
	
	private String		infNome		= null,
						infEndereco	= null;
	
	public String getInfNome() {
		return infNome;
	}
	public void setInfNome(String infNome) {
		this.infNome = infNome;
	}
	public String getInfEndereco() {
		return infEndereco;
	}
	public void setInfEndereco(String infEndereco) {
		this.infEndereco = infEndereco;
	}
	
	
	public PessoaFisica(){
		super("Cadastro PF");
		
		Container paine = this.getContentPane(); paine.setLayout(null);
		
		
		//sets up the grid
		int		gW		= 8,
				gH		= 8,
		
				btnW	= gW*4,
				btnH	= 26,
			
				wWidth	= btnW*5+gW*7,
				wHeight = btnH*8+gH*11;


		try { //add mascara antes de tudo!!!
			formatCep = new MaskFormatter("#####-###"); //a mascara
			txtCep = new JFormattedTextField(formatCep);
		} catch (Exception ex) { //exibir o erro
			ex.printStackTrace();
		}
		
		try {
			formatTel = new MaskFormatter("(##)####-####"); //a mascara
			txtTel = new JFormattedTextField(formatTel);
		} catch (Exception ext) { //exibir o erro
			ext.printStackTrace();
		}
		
		try {
			formatCel = new MaskFormatter("(##)#####-####"); //a mascara
			txtCel = new JFormattedTextField(formatCel);
		} catch (Exception exc) { //exibir o erro
			exc.printStackTrace();
		}

		try {
			formatRg = new MaskFormatter("##.###.###-A"); //a mascara
			txtRg = new JFormattedTextField(formatRg);
		} catch (Exception exr) { //exibir o erro
			exr.printStackTrace();
		}

		try {
			formatCpf = new MaskFormatter("###.###.###-##"); //a mascara
			txtCpf = new JFormattedTextField(formatCpf);
		} catch (Exception exf) { //exibir o erro
			exf.printStackTrace();
		}
	
		

		btnSalvar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				pessoaFisica.setInfNome(txtNome.getText());
				pessoaFisica.setInfEndereco(txtEnd.getText());
			}
		});

		this.setLayout(null);
		this.setVisible(true);
		this.setSize(wWidth, wHeight);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	

	@SuppressWarnings("unused")
	public static void main(String args[]){
		
	}
}*/

