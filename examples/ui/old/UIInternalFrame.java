package ui.old;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import ui.Appearance;

import javax.swing.JDesktopPane;


@SuppressWarnings("serial")
public class UIInternalFrame extends JFrame{
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		WindowFrame			windowMain	= new WindowFrame("Internal frame window");
		
	}

}


@SuppressWarnings("serial")
class WindowFrame extends JFrame implements Appearance{
	
	JMenuBar		tlbFile					= new JMenuBar();	//creates a tool bar named "tlbFile"
		JMenu			menuFile			= new JMenu("File...");
			JMenuItem		menuFileItem[]	=	{	//creates an array of items for the menu "File..."
													new JMenuItem("New window"),
													new JMenuItem("Quit")
												};
	
	int subFrameCount		= 0;
		
	public WindowFrame(String wName) {
		
		super(wName);
		
		Container pane = this.getContentPane();
		pane.setLayout(null);
		final JDesktopPane desktop = new JDesktopPane();
	    
		//TODO stop being dumb
		tlbFile.setBounds			(0,	0,					wWidth*3,	tlbH);
			tlbFile.setBorder(null);
		desktop.setBounds			(0,	tlbH,	wWidth*3,	wHeight*2-tlbH);
			desktop.setBorder(null);
			desktop.setBackground(bgColor);
			
		
		
		tlbFile.add(menuFile);
		for(JMenuItem item : menuFileItem) {
			menuFile.add(item);
		}
		
		
		
		menuFileItem[0].addActionListener(new ActionListener() { //adds event for clicks
			public void actionPerformed(ActionEvent event) {
				
				//creates a window
				SubFrame windowThing = new SubFrame("Internal Frame Window " + ++subFrameCount, 20*subFrameCount, 180, 180);
				desktop.add(windowThing); //draws the window on the desktop pane
				windowThing.grabFocus(); //focuses the window once it's open
			}
		});
		
		
		
		pane.add(desktop);
			desktop.setVisible(true);
		pane.add(tlbFile);
		
		menuFileItem[1].addActionListener(new ActionListener() { //adds close window function to the Exit button at the menu
			public void actionPerformed(ActionEvent event) {
				System.exit(0);	//closes the application
			}
		});
		pane.setBackground(bgColor);						//sets the background color
		this.setVisible(true);									   //makes the window visible
		this.setSize(wWidth*3, wHeight*2);  //gathers wWidth and wHeight to set the window size
		this.setLocationRelativeTo(null);						 //sets location relative to nothing, so it uses the center of the screen by default
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);			//closes the application process "javaw.exe" when the window is closed
	}
	
}

@SuppressWarnings("serial")
class SubFrame extends JInternalFrame implements Appearance{
	
	public SubFrame(String wName, int pos, int width, int height) {
		
		super(wName);
		Container pane = this.getContentPane();
		pane.setLayout(null);
		
		pane.setBackground(bgsColor);	//sets the background color
		this.setVisible(true);						//makes the window visible
		this.setLocation(pos, pos);	
		this.setSize(width, height);	 //gathers wWidth and wHeight to set the window size
		this.setResizable(true);
		
		this.toFront();
		this.addFocusListener(new FocusListener() {
			
			public void focusGained(FocusEvent e) {
				windowFocus(); //calls the method that pulls the window to front
			}

			public void focusLost(FocusEvent e) { }
		});
		
		this.setClosable(true);	//adds close button to window
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
	
	private void windowFocus() {
		this.toFront(); //pulls the window to the front of the others
	}
}
