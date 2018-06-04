package ui;

import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JMenuBar;

public class UIContainer extends JFrame implements Appearance{
	
	protected JMenuBar menu = new JMenuBar();
	protected Container pane = this.getContentPane();
	
	public UIContainer(String windowName) {
		super(windowName);
		this.setSize(WINDOW_DEFAULT_DIMENSIONS);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		this.setJMenuBar(menu);
		menu.setMinimumSize(new Dimension(0, 20));
		menu.setPreferredSize(new Dimension(0, 20));
		
	}
	
	public static void main(String[] args) {
		UIContainer window = new UIContainer("UIContainer");
		window.setLocationRelativeTo(null);
	}

}
