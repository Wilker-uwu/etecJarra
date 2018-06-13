package ui.rewrite.examples.dependencies;

import java.awt.Color;

@SuppressWarnings("unused")
public class Cartridge {
	
	private Ink inkType = null;
	private Color color = null;
	private double size = -1;
	
	public Cartridge(int type, double ammount) {
		this.inkType = new Ink(type);
		this.color = inkType.getColor();
		this.size = ammount;
	}
}
