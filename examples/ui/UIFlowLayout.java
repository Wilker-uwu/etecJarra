package ui;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class UIFlowLayout extends JFrame{	
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		GridLayoutWindow gridWindow = new GridLayoutWindow("Grid layouts");
		FlowLayoutWindow flowWindow	= new FlowLayoutWindow("Flow layouts");
	}

}

@SuppressWarnings("serial")
class GridLayoutWindow extends JFrame {
	
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
		
		//sets up the grid
		int gW		= 8,
		gH		= 8,
		
		btnW	= gW*4,
		btnH	= 26,
		
		wWidth	= btnW*5+gW*16,
		wHeight = btnH*8+gH*11,
		
		ckbW	= wWidth-(gW*4),
		ckbH	= 30;
		
		//sets up colors
		Color	buttonsNumbers	= new Color(232,200,232),
		buttonsMemory	= new Color(190,190,232),
		buttonsFunctions= new Color(210,210,232),
		bgColor			= new Color(186,255,223);
		
		pane.setLayout(new GridLayout(8,16));
		
		int i=0;
		for(JLabel itemInfo : lblInfo) {
			pane.add(itemInfo);
			pane.add(txtInfo[i]);
			i++;
		}
		
		pane.setBounds(10, 10, wWidth, wHeight);
		
		pane.setBackground(bgColor);						//sets the background color
		this.setVisible(true);							   //makes the window visible
		this.setSize(wWidth, ckbH*5);					  //gathers wWidth and wHeight to set the window size
		this.setLocation(200,200);				 //sets location relative to nothing, so it uses the center of the screen by default
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);	//closes the application process "javaw.exe" when the window is closed
	}

}

@SuppressWarnings("serial")
class FlowLayoutWindow extends JFrame {
	
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

	@SuppressWarnings("unused")
	public FlowLayoutWindow(String name) {
	
		super(name);
		
		//sets up the grid
		int gW		= 8,
		gH		= 8,
		
		btnW	= gW*4,
		btnH	= 26,
		
		wWidth	= btnW*10+gW*18,
		wHeight = btnH*8+gH*11,
		
		ckbW	= wWidth-(gW*4),
		ckbH	= 30;
		
		//sets up colors
		Color	buttonsNumbers	= new Color(232,200,232),
		buttonsMemory	= new Color(190,190,232),
		buttonsFunctions= new Color(210,210,232),
		bgColor			= new Color(186,255,223);
		
		Container pane = this.getContentPane();
		pane.setLayout(new FlowLayout(FlowLayout.LEFT, 6, 5)); //this layout is like a text block. the lines breaks when the element is too large to fit. 
		
		int i=0;
		for(JLabel itemInfo : lblInfo) {
			pane.add(itemInfo);
			pane.add(txtInfo[i]);
			i++;
		}
		
		pane.setBounds(10, 10, wWidth, wHeight);
		
		pane.setBackground(bgColor);						//sets the background color
		this.setVisible(true);							   //makes the window visible
		this.setSize(wWidth, ckbH*7);					  //gathers wWidth and wHeight to set the window size
		this.setLocationRelativeTo(null);				 //sets location relative to nothing, so it uses the center of the screen by default
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);	//closes the application process "javaw.exe" when the window is closed
	}

}




