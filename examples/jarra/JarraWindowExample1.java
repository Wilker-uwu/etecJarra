package jarra;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class JarraWindowExample1 extends JFrame{
	
	JLabel		lblName = new JLabel("Nome: ");
	JTextField	txtName = new JTextField("lol");
	
	public JarraWindowExample1() {
		
		super("Window name");
		
		Container	pane = this.getContentPane();
		pane.setLayout(null);
		
		lblName.setBounds(20,20,40,25);
		pane.add(lblName);
		
		txtName.setBounds(64,20,255,25);
		pane.add(txtName);
		
		this.setVisible(true);
		this.setSize(400, 100);
		this.setLocation(520, 325);
		
	}

	public static void main(String[] args) {
		
		JarraWindowExample1 window = new JarraWindowExample1();
		
	}

}
