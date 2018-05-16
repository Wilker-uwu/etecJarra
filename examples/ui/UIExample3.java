package ui;

import java.awt.Color;
import java.awt.Container;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JToolBar;
import javax.swing.JButton;

/*
 * CONTENTS:
 * 	JToolBar
 * 	JList
 * 	JTable
 * 
 */

@SuppressWarnings("serial")
public class UIExample3 extends JFrame{
	
	JToolBar		tlbFile				= new JToolBar();	//creates a tool bar named "tlbFile"
		JButton[]	btnFile				=	{	//creates an array of buttons for the tool bar
												new JButton("New"),
												new JButton("Open"),
												new JButton("Save"),
												new JButton("About")
											};
	
	@SuppressWarnings("rawtypes")
	JList			lstStates			= new JList();	//creates a list named "lstStates"
		JScrollPane	scrpaneLstStates	= new JScrollPane(lstStates);	//creates a scroll pane and gathers the info from "lstStates" to be attatched
		
	JTable			tblStates			= new JTable();	//creates a table named "tblStates"
		JScrollPane	scrpaneTblStates	= new JScrollPane(tblStates);	//creates a scroll pane and gathers the info from "tblStates" to be attatched
	
	
	@SuppressWarnings({ "unused", "unchecked", "rawtypes" })
	public UIExample3() {
		
		super("Window example 3");
		
		Container pane = this.getContentPane();
		pane.setLayout(null);
		
		
		//sets up the grid
		int gW		= 8,
			gH		= 8,		
			
			tlbH	= 22,
			btnW	= gW*4,
			btnH	= 26,
			
			wWidth	= btnW*3+gW*16,
			wHeight = btnH*8+gH*11+tlbH,
			
			ckbW	= wWidth-(gW*4),
			ckbH	= 20;
		
		//sets up colors
		Color	buttonsNumbers	= new Color(232,200,232),
				buttonsMemory	= new Color(190,190,232),
				buttonsFunctions= new Color(210,210,232),
				bgColor			= new Color(186,255,223);
		
		//random number generator just for the lols
		Random rng = new Random();
		
		//declares an array of different strings
		String	cities[]	= {"Salvador","Caetit�","Mutu�pe","Campinas"},
				states[]	= {"SP","RJ","AM","PA","MG"},
				
				columns[]	=	{"Nome", "Cidade", "Estado"},
				data[][]	=	{
									{"Eduardo Jorge",	cities[rng.nextInt(4-1)], states[rng.nextInt(4-1)]},
									{"Gustavo Neves",	cities[rng.nextInt(4-1)], states[rng.nextInt(4-1)]},
									{"Tarc�sio Ara�jo",	cities[rng.nextInt(4-1)], states[rng.nextInt(4-1)]},
									{"Rafael",			cities[rng.nextInt(4-1)], states[rng.nextInt(4-1)]}
								};
		
		lstStates			= new JList(states);	//redefines "lstStates" and gathers the String array "states" for buiding up the options
		scrpaneLstStates	= new JScrollPane(lstStates);	//redefines the scroll pane to gather the info from "lstStates"
		
		tblStates			= new JTable(data, columns); //redefines "tlbStates" and gathers the arrays "columns" and "data" for building up the columns and fields
		scrpaneTblStates	= new JScrollPane(tblStates);	//redefines its scroll pane to gather the info from "tlbStates"
		
		//inserts the buttons into the tool bar
		for(JButton fileButton : btnFile) { //repeats the 'for' loop as many times as the size of the button array
			tlbFile.add(fileButton); //implements btnFile[n] into the tool bar
		}
		
		//defines locations
		tlbFile.setBounds			(0,		0,					wWidth,				tlbH);
		scrpaneLstStates.setBounds	(gW,	tlbH+gH*1+btnH*0,	wWidth-(gW*3),		btnH*4);
		scrpaneTblStates.setBounds	(gW,	tlbH+gH*2+btnH*4,	wWidth-(gW*3),		btnH*4);
		
		//locks and looks of the tool bar
		tlbFile.setFloatable(false);
		tlbFile.setBorder(null);
		
		
		
		pane.add(tlbFile);
		pane.add(scrpaneLstStates);
		pane.add(scrpaneTblStates);
		
		pane.setBackground(bgColor);
		this.setVisible(true);
		this.setSize(wWidth, wHeight);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		UIExample3 window = new UIExample3();
	}

}
