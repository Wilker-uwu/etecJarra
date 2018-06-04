package ui;

import javax.swing.JTextArea;

public class UITextArea extends UIContainer{
	
	JTextArea txtarea = new JTextArea();
	
	public UITextArea(String windowName) {
		super(windowName);
		pane.add(txtarea);
	}
	
	public static void main(String[] args) {
		UITextArea window = new UITextArea("UIDesktopPane");
		window.setLocationRelativeTo(null);
	}
}
