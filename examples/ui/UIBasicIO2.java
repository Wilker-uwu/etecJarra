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
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class UIBasicIO2 extends JFrame{
	
	JTextField		txtTextOld	= new JTextField("SEARCH_TEXT"),
					txtTextNew	= new JTextField("NEW_TEXT");
		
	JButton			btnWrite	= new JButton("Write!"),
					btnReplace	= new JButton("Replace"),
					btnRead		= new JButton("Read");
	
	JLabel			lblStatus	= new JLabel("Status: idle..."),
					lblStausExp	= new JLabel();
	
	@SuppressWarnings("unused")
	public UIBasicIO2() {
		
		super("Window name");
		
		Container pane = this.getContentPane();
		pane.setLayout(null);
		
		
		//sets up the grid
		int gW		= 8,
			gH		= 8,
		
			btnW	= gW*8,
			btnH	= 26,
			
			wWidth	= gW*28,
			wHeight = btnH*8+gH*11,	//height of the window
			
			lblW	= wWidth-(gW*4),
			lblH	= 20;
		
		//sets up colors
		Color	buttonsNumbers	= new Color(232,200,232),
				buttonsMemory	= new Color(190,190,232),
				buttonsFunctions= new Color(210,210,232),
				bgColor			= new Color(186,255,223);
		
		
		
		//LOCATION SETUP
		txtTextOld.setBounds	(gW*1,						gH*1,							wWidth-(gW*4),	lblH);
		txtTextNew.setBounds	(gW*1,						gH*2+txtTextOld.getHeight(),	wWidth-(gW*4),	lblH);
		
		btnWrite.setBounds		(wWidth/3*2-btnW*2,			gH*3+txtTextOld.getHeight()
																+txtTextNew.getHeight(),	btnW,			btnH);
		
		btnReplace.setBounds	(wWidth/3*3-btnW*2,			gH*3+txtTextOld.getHeight()
																+txtTextNew.getHeight(),	btnW,			btnH);
		
		btnRead.setBounds		(wWidth/3*4-btnW*2,			gH*3+txtTextOld.getHeight()
																+txtTextNew.getHeight(),	btnW,			btnH);
		//TODO RELATIVE POSITIONS
		lblStatus.setBounds		(gW*1,						(int)btnRead.getBounds().getHeight()+gH,		lblW,			lblH);
		lblStausExp.setBounds	(gW*1,						(int)lblStatus.getBounds().getHeight()+gH,		lblW,			lblH);
		
		//BORDER SETTINGS
		btnWrite.setBorder(null);
		btnReplace.setBorder(null);
		btnRead.setBorder(null);
		lblStatus.setBorder(null);
		
		btnWrite.setBackground(buttonsFunctions);
		btnReplace.setBackground(buttonsFunctions);
		btnRead.setBackground(buttonsFunctions);
		
		btnWrite.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				try {
					FileWriter	file		= new FileWriter("examples\\fileoutputs\\BasicIO_output.txt",true);
					PrintWriter	file_write	= new PrintWriter(file);
					
					file_write.println(txtTextOld.getText());
					
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
		
		
		btnReplace.addActionListener(new ActionListener() {
			//TODO REPLACE LINES
			public void actionPerformed(ActionEvent e) {
				try {
					FileReader		file		= new FileReader("examples\\fileoutputs\\BasicIO_output.txt");
					BufferedReader	file_read	= new BufferedReader(file);
					
					//reads the first line
					String file_line = file_read.readLine(); //think of it as "int f = 0"
				    
					//TODO COMPLETE
					int i=0;
					while (file_line != null){
						//gets the line counting from 0 and stores into file_line
						file_line = file_read.readLine();
						
						if (file_line.compareTo(txtTextOld.getText()) == 0) {
					    	System.out.println(
							    			"found at line [" + (i+1) + "]:	"
							    			+file_line	//prints the line into the console
							    		);
					    	file_line = txtTextOld.getText();
						}
				    	i++;
					};
					
					file.close();
					lblStatus.setText("Reading: Done! :D");
					
				} catch(IOException exp) {
					System.out.println(exp);
					lblStatus.setText("A reading error occoured.");
					lblStausExp.setText(exp + "");
					
				} catch(Exception exp) {
					System.out.println(exp);
					lblStatus.setText("An exception occoured.");
					lblStausExp.setText(exp + "");
					
				}
		
			}
			
		});
		
		btnRead.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				try {
					FileReader		file		= new FileReader("examples\\fileoutputs\\BasicIO_output.txt");
					BufferedReader	file_read	= new BufferedReader(file);
					
					//reads the first line
					String file_line = file_read.readLine(); //think of it as "int f = 0"
				    
					//TODO COMPLETE
					int i=0;
					while (file_line != null){
						//gets the line counting from 0 and stores into file_line
						file_line = file_read.readLine();
						
						if (file_line.compareTo(txtTextOld.getText()) == 0) {
					    	System.out.println(
							    			"found at line [" + (i+1) + "]:	"
							    			+file_line	//prints the line into the console
							    		);
						}
				    	i++;
					};
					
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
		
		
		
		pane.add(txtTextOld);
		pane.add(txtTextNew);
		pane.add(btnWrite);
		pane.add(btnReplace);
		pane.add(btnRead);
		pane.add(lblStatus);
		pane.add(lblStausExp);
		
		pane.setBackground(bgColor);						//sets the background color
		this.setVisible(true);							   //makes the window visible
		this.setSize(wWidth, wHeight);					  //gathers wWidth and wHeight to set the window size
		this.setLocationRelativeTo(null);				 //sets location relative to nothing, so it uses the center of the screen by default
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);	//closes the application process "javaw.exe" when the window is closed
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		UIBasicIO2 window = new UIBasicIO2();
	}

}
