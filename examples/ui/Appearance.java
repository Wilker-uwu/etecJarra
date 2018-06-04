package ui;

import java.awt.Color;
import java.awt.Dimension;

public interface Appearance {
	
	static final Dimension
		grid = new Dimension(8,8),
		button = new Dimension(32,26),
		bar = new Dimension(0,20),
		WINDOW_DIMENSIONS_PLATE = new Dimension((button.width*5+grid.width*16),(button.height*8+grid.height*11)),
		WINDOW_DEFAULT_DIMENSIONS = new Dimension(640,480);
	
	static final Color
		buttonsNumbers	= new Color(232,200,232),
		buttonsMemory	= new Color(190,190,232),
		buttonsFunctions= new Color(210,210,232),
		bgColor			= new Color(186,255,223),
		bgsColor		= new Color(223,223,223);
	
}
