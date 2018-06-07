package ui.refactored;

import java.awt.Color;
import java.awt.Dimension;

public interface GenericUI {
	//sets up the grid
	Dimension grid = new Dimension(8,8);
	Dimension button = new Dimension(32,26);
	Dimension bar = new Dimension(0,20);
	
	int	wWidth	= grid.width*28;
	int	wHeight = button.height*8+grid.height*11;
	
	Color	buttonsNumbers	= new Color(232,200,232);
	Color	buttonsMemory	= new Color(190,190,232);
	Color	buttonsFunctions= new Color(210,210,232);
	Color	bgColor			= new Color(186,255,223);
}
