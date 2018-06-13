package ui.rewrite.examples.dependencies;

import java.awt.Color;

public class Ink {
	
	private Color color = null;
	
	public Ink(int type) {
		this.setColor(new Color(type));
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
}
