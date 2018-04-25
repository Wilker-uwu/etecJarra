package jarra;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class JarraWindowTemplate extends JFrame{
	
	@SuppressWarnings("unused")
	public JarraWindowTemplate() {
		
		super("Window name");
		
		Container pane = this.getContentPane();
		pane.setLayout(null);
		
		
		//sets up the grid
		int gW		= 8,
			gH		= 8,		
		
			btnW	= gW*4,
			btnH	= 26,
			
			wWidth	= btnW*3+gW*16,
			wHeight = btnH*8+gH*11,
			
			ckbW	= wWidth-(gW*4),
			ckbH	= 20;
		
		//sets up colors
		Color	buttonsNumbers	= new Color(232,200,232),
				buttonsMemory	= new Color(190,190,232),
				buttonsFunctions= new Color(210,210,232),
				bgColor			= new Color(186,255,223);
		
		/*
		 *	TODO building and functions goes here.
		 */
		
		pane.setBackground(bgColor);
		this.setVisible(true);
		this.setSize(wWidth, wHeight);
		this.setLocation(520, 325);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		JarraWindowTemplate window = new JarraWindowTemplate();
	}

}
