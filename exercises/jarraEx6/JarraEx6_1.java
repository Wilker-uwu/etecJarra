package jarraEx6;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class JarraEx6_1 extends JFrame{
	
	private static final long serialVersionUID = 5557095595470639847L;
	
	//sets up text container contents
	JLabel		lblTitle	= new JLabel("Preencha os campos e clique em \"Gravar dados\"");
	JLabel		lblName		= new JLabel("Nome:");
	JLabel		lblAddress	= new JLabel("Endereço:");
	JLabel		lblDistrict	= new JLabel("Bairro:");
	JLabel		lblState	= new JLabel("Estado:");
	JLabel		lblPhone	= new JLabel("Telefone:");
	JLabel		lblCPhone	= new JLabel("Celular:");
	JLabel		lblEmail	= new JLabel("Email:");
	
	//sets up text boxes
	JTextField	txtName		= new JTextField();
	JTextField	txtAddress	= new JTextField();
	JTextField	txtDistrict	= new JTextField();
	JTextField	txtState	= new JTextField();
	JTextField	txtPhone	= new JTextField();
	JTextField	txtCPhone	= new JTextField();
	JTextField	txtEmail	= new JTextField();
	
	//sets up buttons
	JButton		btnConfirm	= new JButton("confirm");
	JButton		btnClear	= new JButton("clear");
	JButton		btnCancel	= new JButton("cancel");
	
	
	public JarraEx6_1() {
		
		super("Window name");
		
		Container	pane = this.getContentPane();
		pane.setLayout(null);
		int g=22,
			alt=22,
			minlbl=g*2,
			mintxt=minlbl+g*4,
			btnW=g*4,
			
			wWidth=380,
			wHeight=460; //grid
		
		
		//sets up label container positions
		lblTitle.setBounds		(minlbl, g*1, g*16, alt);
		lblName.setBounds		(minlbl, g*3, g*4, alt);
		lblAddress.setBounds	(minlbl, g*4, g*4, alt);
		lblDistrict.setBounds	(minlbl, g*5, g*4, alt);
		lblState.setBounds		(minlbl, g*6, g*4, alt);
		lblPhone.setBounds		(minlbl, g*7, g*4, alt);
		lblCPhone.setBounds		(minlbl, g*8, g*4, alt);
		lblEmail.setBounds		(minlbl, g*9, g*4, alt);
		//sets up text box positions
		txtName.setBounds		(mintxt, g*3, g*9, alt);
		txtAddress.setBounds	(mintxt, g*4, g*9, alt);
		txtDistrict.setBounds	(mintxt, g*5, g*9, alt);
		txtState.setBounds		(mintxt, g*6, g*9, alt);
		txtPhone.setBounds		(mintxt, g*7, g*9, alt);
		txtCPhone.setBounds		(mintxt, g*8, g*9, alt);
		txtEmail.setBounds		(mintxt, g*9, g*9, alt);
		//sets up buttons
		btnConfirm.setBounds	(wWidth/2-(btnW/2), g*12, btnW, alt);
		btnClear.setBounds		(wWidth/2-(btnW/2), (int) (g*13.2), btnW, alt);
		btnCancel.setBounds		(wWidth/2-(btnW/2), (int) (g*14.4), btnW, alt);
		
		//draws label containers
		pane.add(lblTitle);
		pane.add(lblName);
		pane.add(lblAddress);
		pane.add(lblDistrict);
		pane.add(lblState);
		pane.add(lblPhone);
		pane.add(lblCPhone);
		pane.add(lblEmail);
		
		//draws text boxes
		pane.add(txtName);
		pane.add(txtAddress);
		pane.add(txtDistrict);
		pane.add(txtState);
		pane.add(txtPhone);
		pane.add(txtCPhone);
		pane.add(txtEmail);
		
		//draws buttons
		pane.add(btnConfirm);
		pane.add(btnClear);
		pane.add(btnCancel);
		
		this.setVisible(true);			  //makes the window visible
		this.setSize(wWidth, wHeight);	 //window size and
		this.setLocation(520, 325);		//location
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //ends javaw.exe on close
	}

	public static void main(String[] args) {
		
		JarraEx6_1 window = new JarraEx6_1();
		
	}

}
