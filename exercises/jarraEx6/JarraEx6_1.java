package jarraEx6;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class JarraEx6_1 extends JFrame{
	
	//sets up text container contents
	JLabel		lblTitle	= new JLabel("Preencha os campos e clique em \"Gravar dados\"");
	JLabel		lblName		= new JLabel("Nome:");
	JLabel		lblAddress	= new JLabel("Endereço:");
	JLabel		lblDistrict	= new JLabel("Bairro:");
	JLabel		lblState	= new JLabel("Estado:");
	JLabel		lblPhone	= new JLabel("Telefone:");
	JLabel		lblCPhone	= new JLabel("Celular:");
	JLabel		lblEmail	= new JLabel("Email:");
	
	JTextField	txtName		= new JTextField();
	
	public JarraEx6_1() {
		
		super("Window name");
		
		Container	pane = this.getContentPane();
		pane.setLayout(null);
		int g=16; //grid
		
		lblTitle.setBounds		(32, g*1, g*16, 25);	//sets up text container positions
		lblName.setBounds		(32, g*3, g*4, 25);
		lblAddress.setBounds	(32, g*4, g*4, 25);
		lblDistrict.setBounds	(32, g*5, g*4, 25);
		lblState.setBounds		(32, g*6, g*4, 25);
		lblPhone.setBounds		(32, g*7, g*4, 25);
		lblCPhone.setBounds		(32, g*8, g*4, 25);
		lblEmail.setBounds		(32, g*9, g*4, 25);
		
		pane.add(lblTitle);		//draws text container positions
		pane.add(lblName);
		pane.add(lblAddress);
		pane.add(lblDistrict);
		pane.add(lblState);
		pane.add(lblPhone);
		pane.add(lblCPhone);
		pane.add(lblEmail);
		
		this.setVisible(true);		  //makes the window visible
		this.setSize(380, 460);		 //window size
		this.setLocation(520, 325); //window location
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //ends javaw.exe on close
	}

	public static void main(String[] args) {
		
		JarraEx6_1 window = new JarraEx6_1();
		
	}

}
