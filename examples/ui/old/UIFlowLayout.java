package ui.old;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import ui.Appearance;

@SuppressWarnings("serial")
public class UIFlowLayout extends JFrame{	
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		GridLayoutWindow gridWindow = new GridLayoutWindow("Grid layouts");
		FlowLayoutWindow flowWindow	= new FlowLayoutWindow("Flow layouts");
	}

}

@SuppressWarnings("serial")
class GridLayoutWindow extends JFrame implements Appearance{
	
	JLabel[]		lblInfo	=	{
									new JLabel("Username: "),
									new JLabel("Name: "),
									new JLabel("Email: "),
									new JLabel("Password: "),
									new JLabel("Confirm password: ")
								};
	
	JTextField[]	txtInfo	=	{
									new JTextField(),
									new JTextField(),
									new JTextField(),
									new JTextField(),
									new JTextField(),
								};

	@SuppressWarnings("unused")
	public GridLayoutWindow(String name) {
	
		super(name);
		Container pane = this.getContentPane();
		
		pane.setLayout(new GridLayout(8,16));
		
		int i=0;
		for(JLabel itemInfo : lblInfo) {
			pane.add(itemInfo);
			pane.add(txtInfo[i]);
			i++;
		}
		
		pane.setBounds(10, 10, Window.WIDTH, Window.HEIGHT);
		
		pane.setBackground(bgColor);						//sets the background color
		this.setVisible(true);							   //makes the window visible
		this.setSize(WINDOW_DEFAULT_DIMENSIONS);		  //gathers wWidth and wHeight to set the window size
		this.setLocation(200,200);						 //sets location relative to nothing, so it uses the center of the screen by default
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);	//closes the application process "javaw.exe" when the window is closed
	}

}

@SuppressWarnings("serial")
class FlowLayoutWindow extends JFrame implements Appearance{
	
	JLabel[]		lblInfo	=	{
									new JLabel("Username: "),
									new JLabel("Name: "),
									new JLabel("Email: "),
									new JLabel("Password: "),
									new JLabel("Confirm password: ")
								};
	
	JTextField[]	txtInfo	=	{
									new JTextField(28),
									new JTextField(28),
									new JTextField(28),
									new JTextField(28),
									new JTextField(28),
								};
	
	public FlowLayoutWindow(String name) {
		super(name);
		
		Container pane = this.getContentPane();
		pane.setLayout(new FlowLayout(FlowLayout.LEFT, 6, 5)); //this layout is like a text block. the lines breaks when the element is too large to fit. 
		
		int i=0;
		for(JLabel itemInfo : lblInfo) {
			pane.add(itemInfo);
			pane.add(txtInfo[i]);
			i++;
		}
		
		
		pane.setBackground(bgColor);						//sets the background color
		this.setVisible(true);							   //makes the window visible
		this.setSize(WINDOW_DEFAULT_DIMENSIONS);					  //gathers wWidth and wHeight to set the window size
		this.setLocationRelativeTo(null);				 //sets location relative to nothing, so it uses the center of the screen by default
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);	//closes the application process "javaw.exe" when the window is closed
	}

}




