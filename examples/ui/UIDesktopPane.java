package ui;

import javax.swing.JDesktopPane;

public class UIDesktopPane extends UIContainer{
	
	JDesktopPane desktop = new JDesktopPane();
	
	public UIDesktopPane(String windowName) {
		super(windowName);
		pane.add(desktop);
		
		desktop.setBackground(bgColor);
	}
	
	public static void main(String[] args) {
		UIDesktopPane window = new UIDesktopPane("UIDesktopPane");
		window.setLocationRelativeTo(null);
	}
}
