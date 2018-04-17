package jarra;

import java.awt.Container; //Container is responsible for the background and for enabling the layouts

import javax.swing.JFrame; //JFrame is the main class responsible for building the interface window
import javax.swing.JLabel; //JLabels are texts that appears on the desired areas
import javax.swing.JTextField; //JTextField is a text field. you type on it. (unless locked)

@SuppressWarnings("serial")
public class JarraWindowExample1 extends JFrame{
	
	JLabel		lblName = new JLabel("Nome: ");  //creates a label to write "Nome: " on it
	JTextField	txtName = new JTextField("lol"); //creates a text field. the parameter value can be null. it currently starts with "lol" already writen on it
	
	public JarraWindowExample1() {
		
		super("Window name"); //the "super" method sets window label that you see on top of it. 
		
		Container	pane = this.getContentPane(); //still figuring these two lines. i was told that they draws the container of the window, where all the interface sits
		pane.setLayout(null); //and removes the current layout for you to be able to design your own.
		
		//sets the size and locations of anything related to the JFrame (JLabel,JTextField,etc.)
		lblName.setBounds(20,20,40,25);	//<item>.setBounds(int xPosition, int yPosition, int width, int height); 
		txtName.setBounds(64,20,255,25);
		
		//draws those fields
		pane.add(lblName); //<window instance name>.add(field instance);
		pane.add(txtName);
		
		this.setVisible(true);		//makes the window visible on the screen (bool isVisible)
		this.setSize(400, 100);		 //sets the size of the window (int width, int height)
		this.setLocation(520, 325);	//and location (int xPos, int yPos)
		this.setDefaultCloseOperation(EXIT_ON_CLOSE); //kills the javaw.exe process on close
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		JarraWindowExample1 window = new JarraWindowExample1(); //calls the window for usage
		
	}

}
