/**
 * @author WilkerS1
 */
package ui.rewrite;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.Icon;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

/**
 * Set of variables and methods for helping setting the appearance of the user interface.
 * @author WilkerS1
 */
public interface Appearance {

	//16x16 icons
	public final Icon	ICON_COMPUTER	= UIManager.getIcon("FileView.computerIcon");
	public final Icon	ICON_DIRECTORY	= UIManager.getIcon("FileView.directoryIcon");
	public final Icon	ICON_FILE		= UIManager.getIcon("FileView.fileIcon");
	public final Icon	ICON_FLOPPY		= UIManager.getIcon("FileView.floppyDriveIcon");
	public final Icon	ICON_HARD_DRIVE	= UIManager.getIcon("FileView.hardDriveIcon");
	//32x32 icons
	public final Icon	ICON_INFO		= UIManager.getIcon("OptionPane.questionIcon");
	
	//Dimensions ready for usage
	public 		 Dimension GRID					= new Dimension(8,8);
	public final Dimension SIZE_BAR_PREFERRED	= new Dimension(0,20);
	public final Dimension SIZE_BUTTON			= new Dimension(32,26);
	public final Dimension SIZE_WINDOW_BOARD	= new Dimension(224,296);
	public final Dimension SIZE_WINDOW_SMALL	= new Dimension(480,360);
	public final Dimension SIZE_WINDOW_MEDIUM	= new Dimension(540,480);
	
	/**
	 * Colors ready for usage
	 */
	public final Color C[] =	{
									new Color(232,200,232),
									new Color(190,190,232),
									new Color(210,210,232),
									new Color(186,255,223)
								};
	
	/**
	 * Monospaced plain font of size 12 For general purpose,
	 * usually for writing text or showing console logs.
	 */
	public final Font MONOSPACED_TEXT = new Font(Font.MONOSPACED, Font.PLAIN, 12);
	
	/**
	 * Layout manager to fill the elements on the container.
	 * It will align those elements vertically.
	 */
	public GridLayout grid = new GridLayout(0,1);
	
	/**
	 * Makes this Swing window have the look and feel
	 * of the native system this program is running at.
	 * 
	 * @return if an exception occurs in the process, <code>true</code> is returned.
	 * @param parent is the parent component of the tree
	 * that will have its UI updated to avoid visual glitches
	 */
	public default boolean setSystemLookAndFeel(Component parent) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			SwingUtilities.updateComponentTreeUI(parent);
			return false;
		} catch (Exception exp) {
			exp.printStackTrace();
			return true;
		}
	}
}
