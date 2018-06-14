package ui.rewrite.base;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JMenuBar;

import ui.rewrite.Appearance;

/**
 * This class holds the basic attributes for mounting a swing application.
 * It can be extended by any other class for building your application.
 * 
 * @see JFrame
 * @see Appearance
 * 
 * @author WilkerS1
 */
public class UIBase extends JFrame implements Appearance{
	private static final long serialVersionUID = 8035225047986068229L;

//
// ATTRIBUTES / VARIABLES
//
	/**
	 * An alias for gathering the default content pane for general usage.
	 */
	Container pane = this.getContentPane();
	/**
	 * Generic <code>GridLayout</code> instance for drawing elements vertically trough the entire <code>Container</code>
	 */
	GridLayout gridLayout = new GridLayout(1,0);
	
	/**
	 * A <code>JMenuBar</code> ready for usage
	 */
	JMenuBar menu = new JMenuBar();
	
//
// CONSTRUCTORS
//
	/**
	 * Builds the window ready for usage.
	 * @param title is the display title of the window
	 * @see #UIBase(String, boolean, Color, Dimension, boolean, int)
	 */
	public UIBase(String title) {
		this(title, true, null, SIZE_WINDOW_SMALL, true, EXIT_ON_CLOSE);
	}
	
	/**
	 * @see #UIBase(String, boolean, Color, Dimension, boolean, int)
	 */
	public UIBase(String title, boolean visible) {
		this(title, visible, null, SIZE_WINDOW_SMALL, true, EXIT_ON_CLOSE);
	}
	
	/**
	 * @see #UIBase(String, boolean, Color, Dimension, boolean, int)
	 */
	public UIBase(String title, Color bgColor) {
		this(title, true, bgColor, SIZE_WINDOW_SMALL, true, EXIT_ON_CLOSE);
	}
	
	/**
	 * @see #UIBase(String, boolean, Color, Dimension, boolean, int)
	 */
	public UIBase(String title, Color bgColor, Dimension dimensions, boolean isResizable) {
		this(title, true, bgColor, dimensions, isResizable, EXIT_ON_CLOSE);
	}
	
	/**
	 * @see #UIBase(String, boolean, Color, Dimension, boolean, int)
	 */
	public UIBase(String title, boolean visible, Color bgColor) {
		this(title, visible, bgColor, SIZE_WINDOW_SMALL, true, EXIT_ON_CLOSE);
	}
	
	/**
	 * @see #UIBase(String, boolean, Color, Dimension, boolean, int)
	 */
	public UIBase(String title, boolean visible, Color bgColor, Dimension dimensions, boolean isResizable) {
		this(title, visible, bgColor, dimensions, isResizable, EXIT_ON_CLOSE);
	}
	
	/**
	 * Builds the window for usage.
	 * @param title is the display title for the window
	 * @param visible sets the initial visibility of this window
	 * @param bgColor is the background color
	 * @param dimensions sets the size of the window
	 * @param isResizable defines if the user can resize the window
	 * @param defaultCloseOperation is the default close operation
	 */
	public UIBase(String title, boolean visible, Color bgColor, Dimension dimensions, boolean isResizable, int defaultCloseOperation) {
		super(title);
		this.setVisible(true);
		this.setBackground(null);
		this.setSize(SIZE_WINDOW_SMALL);
		this.setResizable(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	/**
	 * main window for use as stand-alone.
	 * @param arguments
	 */
	public static void main(String[] arguments) {
		new UIBase(UIBase.class.getSimpleName() +" generic window").setLocationRelativeTo(null);
	}

}
