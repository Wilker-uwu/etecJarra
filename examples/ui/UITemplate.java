package ui;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class UITemplate extends JFrame{
	
	@SuppressWarnings("unused")
	public UITemplate() {
		
		super("Window name");
		
		Container pane = this.getContentPane();
		pane.setLayout(null);
		
		
		//sets up the grid
		int gW		= 8,	//horizontal grid to ease coordinate usage
			gH		= 8,	//vertical grid
		
			btnW	= gW*4,	//default button dimensions
			btnH	= 26,	//vertical button dimension
			
			wWidth	= btnW*3+gW*16,	//width of the window, uses the buttons and grid dimensions for a better layout
			wHeight = btnH*8+gH*11,	//height of the window
			
			ckbW	= wWidth-(gW*4), //checkBox/radioBox dimensions: full width of the window with some spacing
			ckbH	= 20;	//checkBox/radioBox height: usual size of the text with some spacing
		
		//sets up colors
		Color	buttonsNumbers	= new Color(232,200,232),
				buttonsMemory	= new Color(190,190,232),
				buttonsFunctions= new Color(210,210,232),
				bgColor			= new Color(186,255,223);
		
		/*
		 *	TODO building and functions goes here.
		 */
		
		pane.setBackground(bgColor);						//sets the background color
		this.setVisible(true);							   //makes the window visible
		this.setSize(wWidth, wHeight);					  //gathers wWidth and wHeight to set the window size
		this.setLocationRelativeTo(null);				 //sets location relative to nothing, so it uses the center of the screen by default
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);	//closes the application process "javaw.exe" when the window is closed
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		UITemplate window = new UITemplate();
	}

}
