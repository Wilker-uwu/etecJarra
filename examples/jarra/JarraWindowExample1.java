package jarra;

import java.awt.Container;

import javax.swing.JFrame; //JFrame is the main class responsible for building the insterface window
import javax.swing.JLabel; //JLabels are texts that appears on the desired areas
import javax.swing.JTextField; //JTextField is a text field. you type on it. (unless locked)

@SuppressWarnings("serial")
public class JarraWindowExample1 extends JFrame{
	
	JLabel		lblName = new JLabel("Nome: ");  //creates a label to write "Nome: " on it
	JTextField	txtName = new JTextField("lol"); //creates a text field. the parameter value can be null. it currently starts with "lol" already writen on it
	
	public JarraWindowExample1() {
		
		super("Window name"); //the "super" method sets window label that you see on top of it. 
		
		Container	pane = this.getContentPane();
		pane.setLayout(null);
		
		lblName.setBounds(20,20,40,25);
		txtName.setBounds(64,20,255,25);
		
		pane.add(lblName);
		pane.add(txtName);
		
		this.setVisible(true);		//makes the window visible on the screen
		this.setSize(400, 100);		 //sets the size of the window
		this.setLocation(520, 325);	//and location
		
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		JarraWindowExample1 window = new JarraWindowExample1();
		
	}

}
