package jarra;

import java.awt.Color;
import java.awt.Container; //Container is responsible for the background and for enabling the layouts

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

@SuppressWarnings("serial")
public class JarraWindowExample2 extends JFrame{
	
	JLabel			lblName 	= new JLabel("Nome: ");
	JTextField		txtName		= new JTextField("lol");
	
	JButton			btn1		= new JButton("1"),
					btn2		= new JButton("2"),
					btn3		= new JButton("3");
	
	JTextArea		txtaText	= new JTextArea("PLACEHOLDER TEXT",16,32);
		JScrollPane	scrText		= new JScrollPane(txtaText);
	
	JCheckBox[]		ckbOption	=	{
									new JCheckBox("ckbOption0"),
									new JCheckBox("ckbOption1"),
									new JCheckBox("ckbOption2")
									};
	
	JRadioButton[]	rdbOption	=	{
									new JRadioButton("ckbOption0"),
									new JRadioButton("ckbOption1"),
									new JRadioButton("ckbOption2")
									};
	
	ButtonGroup		grpRdbOption= new ButtonGroup();
	
	@SuppressWarnings("unused")
	public JarraWindowExample2() {
		
		super("Window example 2");
		
		Container pane = this.getContentPane();
		pane.setLayout(null);
		
		
		//sets up the grid
		int gW		= 8,
			gH		= 8,		
		
			btnW	= gW*4,
			btnH	= 26,
			
			wWidth	= btnW*3+gW*16,
			wHeight = btnH*8+gH*11,
			
			ckbW	= wWidth-(gW*4),
			ckbH	= 20;
		
		//sets up colors
		Color	buttonsNumbers	= new Color(232,200,232),
				buttonsMemory	= new Color(190,190,232),
				buttonsFunctions= new Color(210,210,232),
				bgColor			= new Color(186,255,223);
		
		txtaText.setBounds		(gW*1,			gH*1,					wWidth-(gW*4),	btnH*4);
		
		rdbOption[0].setBounds	(gW*1+btnW*0,	gH*2+btnH*4+ckbH*0,		ckbW,			ckbH);
		rdbOption[1].setBounds	(gW*1+btnW*0,	gH*2+btnH*4+ckbH*1,		ckbW,			ckbH);
		rdbOption[2].setBounds	(gW*1+btnW*0,	gH*2+btnH*4+ckbH*2,		ckbW,			ckbH);
		
		btn1.setBounds			(gW*2+btnW*1,	gH*3+btnH*4+ckbH*3,		btnW,			btnH);
		btn2.setBounds			(gW*3+btnW*2,	gH*3+btnH*4+ckbH*3,		btnW,			btnH);
		btn3.setBounds			(gW*4+btnW*3,	gH*3+btnH*4+ckbH*3,		btnW,			btnH);
		
		
		txtaText.setBorder(null);
		btn1.setBorder(null);
		btn2.setBorder(null);
		btn3.setBorder(null);
		
		btn1.setBackground(buttonsFunctions);
		btn2.setBackground(buttonsFunctions);
		btn3.setBackground(buttonsFunctions);
		
		
		scrText.setHorizontalScrollBarPolicy(
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrText.setVerticalScrollBarPolicy(
				JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		
		pane.add(txtaText);
		
		//TODO complete
		for (int i = 0; i <3; i++) {
			rdbOption[i].setBorder(null);
			rdbOption[i].setBackground(bgColor);
			grpRdbOption.add(rdbOption[i]);
			pane.add(rdbOption[i]);
		}
		pane.add(btn1);
		pane.add(btn2);
		pane.add(btn3);
		
		pane.setBackground(bgColor);
		this.setVisible(true);
		this.setSize(wWidth, wHeight);
		this.setLocation(520, 325);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		JarraWindowExample2 window = new JarraWindowExample2(); //calls the window for usage
		
	}

}
