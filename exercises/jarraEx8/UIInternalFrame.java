package jarraEx8;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JDesktopPane;


//TODO MAKE AN INTERNAL FRAME

@SuppressWarnings("serial")
public class UIInternalFrame extends JFrame{
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		WindowFrame			windowMain	= new WindowFrame("Internal frame window");
		SubFrame			windowSub	= new SubFrame("e");
		
	}

}


@SuppressWarnings("serial")
class WindowFrame extends JFrame {
	
	JDesktopPane desktop = new JDesktopPane();
	
	JMenuBar		tlbFile					= new JMenuBar();	//creates a tool bar named "tlbFile"
		JMenu			menuFile			= new JMenu("File...");
			JMenuItem		menuFileItem[]	=	{	//creates an array of items for the menu "File..."
													new JMenuItem("New window"),
													new JMenuItem("Quit")
												};
	
	public WindowFrame(String wName) {
		
		super(wName);
		Container pane = this.getContentPane();
		pane.setLayout(null);
		
	    
		
		tlbFile.setBounds			(0,	0,	Appearance.wWidth,	Appearance.tlbH);
			tlbFile.setBorder(null);
		
		
		tlbFile.add(menuFile);
		for(JMenuItem item : menuFileItem) {
			menuFile.add(item);
		}
		
		
		pane.add(tlbFile);
		
		menuFileItem[1].addActionListener(new ActionListener() { //adds close window function to the Exit button at the menu
			public void actionPerformed(ActionEvent event) {
				System.exit(0);	//closes the application
			}
		});
		pane.setBackground(Appearance.bgColor);							//sets the background color
		this.setVisible(true);								   //makes the window visible
		this.setSize(Appearance.wWidth, Appearance.wHeight);						  //gathers wWidth and wHeight to set the window size
		this.setLocationRelativeTo(null);					 //sets location relative to nothing, so it uses the center of the screen by default
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);		//closes the application process "javaw.exe" when the window is closed
	}
	
}

@SuppressWarnings("serial")
class SubFrame extends JInternalFrame {
	
	JDesktopPane desktop = new JDesktopPane();
	
	public SubFrame(String wName) {
		
		super(wName);
		Container pane = this.getContentPane();
		pane.setLayout(null);
		
		
	    desktop.setVisible(true);
		
		
		pane.setBackground(Appearance.buttonsNumbers);					   //sets the background color
		this.setVisible(true);									  //makes the window visible
		this.setSize(Appearance.wWidth, Appearance.wHeight);	 //gathers wWidth and wHeight to set the window size
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);			//closes the application process "javaw.exe" when the window is closed
	}
	
}

final class Appearance {
	//sets up the grid
	static int	gW		= 8,	//horizontal grid to ease coordinate usage
				gH		= 8,	//vertical grid
				
				tlbH	= 22,
				btnW	= gW*4,	//default button dimensions
				btnH	= 26,	//vertical button dimension
				
				wWidth	= (btnW*3+gW*16)*3,	//width of the window, uses the buttons and grid dimensions for a better layout
				wHeight = (btnH*8+gH*11)*2,	//height of the window
				
				ckbW	= wWidth-(gW*4), //checkBox/radioBox dimensions: full width of the window with some spacing
				ckbH	= 20;	//checkBox/radioBox height: usual size of the text with some spacing
	
	//sets up colors
	static Color	buttonsNumbers	= new Color(232,200,232),
					buttonsMemory	= new Color(190,190,232),
					buttonsFunctions= new Color(210,210,232),
					bgColor			= new Color(186,255,223);
}
