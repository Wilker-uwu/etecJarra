package ui;

import java.awt.Color;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;

@SuppressWarnings("serial")
public class UIBasicIO extends JFrame{
	
	JTextArea		txtaText	= new JTextArea("PLACEHOLDER TEXT");
		JScrollPane	scrText		= new JScrollPane(txtaText);
		
	JButton			btnWrite	= new JButton("Write!");
	JButton			btnRead		= new JButton("Read");
	JLabel			lblStatus	= new JLabel("Status: idle...");
	
	@SuppressWarnings("unused")
	public UIBasicIO() {
		
		super("Window name");
		
		Container pane = this.getContentPane();
		pane.setLayout(null);
		
		
		//sets up the grid
		int gW		= 8,	//horizontal grid to ease coordinate usage
			gH		= 8,	//vertical grid
		
			btnW	= gW*4,	//default button dimensions
			btnH	= 26,	//vertical button dimension
			
			wWidth	= btnW*3+gW*16,	//width of the window, uses the buttons and grid dimensions for a better layout
			wHeight = btnH*8+gH*11,	//height of the window
			
			lblW	= wWidth-(gW*4), //checkBox/radioBox dimensions: full width of the window with some spacing
			lblH	= 20;	//checkBox/radioBox height: usual size of the text with some spacing
		
		//sets up colors
		Color	buttonsNumbers	= new Color(232,200,232),
				buttonsMemory	= new Color(190,190,232),
				buttonsFunctions= new Color(210,210,232),
				bgColor			= new Color(186,255,223);
		
		
		
		//LOCATION SETUP
		scrText.setBounds		(gW*1,						gH*1,						wWidth-(gW*4),	btnH*4);
		btnWrite.setBounds		(gW,						gH*2+scrText.getHeight(),	btnW*2,			btnH);
		btnRead.setBounds		(wWidth-gW*3-btnW*2,		gH*2+scrText.getHeight(),	btnW*2,			btnH);
		lblStatus.setBounds		(gW*1,						gH*3+btnH*5,				lblW,			lblH);
		
		//BORDER SETTINGS
		scrText.setBorder(null);
		btnWrite.setBorder(null);
		btnRead.setBorder(null);
		lblStatus.setBorder(null);
		
		btnWrite.setBackground(buttonsFunctions);
		btnRead.setBackground(buttonsFunctions);
		
		//FUNCTIONAL PROPERTY SETTINGS
		scrText.setHorizontalScrollBarPolicy(
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrText.setVerticalScrollBarPolicy(
				JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		
		
		
		
		btnWrite.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				try {
					FileWriter	file		= new FileWriter("examples\\fileoutputs\\BasicIO_output.txt");
					PrintWriter	file_write	= new PrintWriter(file);
					
					file_write.print(txtaText.getText());
					
					file.close(); //saves and closes the file, but it also overwrites any existing ones
					lblStatus.setText("Status: Done! :D");
					
				} catch(IOException exp) {	//if an exception (error) occours at the 'try' block related to writing the file 
					System.out.println(exp);
					lblStatus.setText("A writing error occoured");
					
				} catch(Exception exp) {
					System.out.println(exp);
					lblStatus.setText("An exception occoured");
					
				} finally {
					//file.close();
				}
			}
			
		});
		btnRead.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				try {
					FileReader		file		= new FileReader("examples\\fileoutputs\\BasicIO_output.txt");
					BufferedReader	file_read	= new BufferedReader(file);
					
					String file_line = null; 
				     
					//TODO COMPLETE
					while (file_line != null) {
						file_line = file_read.readLine(); //gets the line counting from 0 and stores into file_line
						
				    	txtaText.replaceRange(	//replaces the text for implementing lines
				    			txtaText.getText() + "\n"	//gets what is currently written and breaks a line
		    					+file_line,					//implements the content of 'file_line'
		    					0,							//at 
		    					txtaText.getText().length());
					}
					
					file.close();
					lblStatus.setText("Reading: Done! :D");
					
				} catch(IOException exp) {
					System.out.println(exp);
					lblStatus.setText("A reading error occoured");
					
				} catch(Exception exp) {
					System.out.println(exp);
					lblStatus.setText("An exception occoured");
					
				}
		
			}
			
		});
		
		
		
		pane.add(scrText);
		pane.add(btnWrite);
		pane.add(btnRead);
		pane.add(lblStatus);
		
		pane.setBackground(bgColor);						//sets the background color
		this.setVisible(true);							   //makes the window visible
		this.setSize(wWidth, wHeight);					  //gathers wWidth and wHeight to set the window size
		this.setLocationRelativeTo(null);				 //sets location relative to nothing, so it uses the center of the screen by default
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);	//closes the application process "javaw.exe" when the window is closed
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		UIBasicIO window = new UIBasicIO();
	}

}
