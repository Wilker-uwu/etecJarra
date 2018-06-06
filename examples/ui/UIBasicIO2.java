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

/*
 * CONTENT DESCRIPTION:
 * 	REPLACING LINES WITH ANOTHER CONTENT
 */

@SuppressWarnings("serial")
public class UIBasicIO2 extends JFrame{
	
	JTextField		txtTextOld		= new JTextField("SEARCH_TEXT"),
					txtTextLine		= new JTextField(),
					txtTextNew		= new JTextField("NEW_TEXT");
		
	JButton			btnWrite		= new JButton("Write!"),
					btnReplace		= new JButton("Replace"),
					btnRead			= new JButton("Read");
	
	JLabel			lblStatus		= new JLabel("Status: idle..."),
					lblStatusExp	= new JLabel();
	
	
	@SuppressWarnings("unused")
	public UIBasicIO2(String name) {
		
		super(name);
		
		Container pane = this.getContentPane();
		pane.setLayout(null);
		
		
		//sets up the grid
		int gW		= 8,
			gH		= 8,
		
			btnW	= gW*7,
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
		txtTextOld.setBounds	(gW*1,							gH*1,							lblW,					lblH);
		txtTextLine.setBounds	(gW*1,							gH*1+txtTextOld.getY()
																	+txtTextOld.getHeight(),	lblH*2,					lblH);
		txtTextNew.setBounds	(gW*2+lblH*2,					gH*1+txtTextOld.getY()
																	+txtTextOld.getHeight(),	wWidth-(gW*5)-lblH*2,	lblH);
		
		//buttons
		btnWrite.setBounds		(gW,							gH*1+txtTextNew.getY()
																	+txtTextNew.getHeight(),	btnW,				btnH);
		btnReplace.setBounds	(gW*2+btnWrite.getWidth(),		gH*1+txtTextNew.getY()
																	+txtTextNew.getHeight(),	btnW,				btnH);
		btnRead.setBounds		(
									gW+(btnReplace.getWidth()+btnReplace.getY())+gW,		//X position
									gH*1+txtTextNew.getY()+txtTextNew.getHeight(),	//Y position
									btnW,	//width
									btnH	//height
								);
		
		//status labels
		lblStatus.setBounds		(gW*1,							gH	+btnRead.getY()
																	+btnRead.getHeight(),			lblW,				lblH);
		lblStatusExp.setBounds	(gW*1,							gH	+lblStatus.getY()
																	+lblStatus.getHeight(),			lblW,				lblH);
		
		//BORDER SETTINGS
		btnWrite.setBorder(null);
		btnReplace.setBorder(null);
		btnRead.setBorder(null);
		lblStatus.setBorder(null);
		
		btnWrite.setBackground(buttonsFunctions);
		btnReplace.setBackground(buttonsFunctions);
		btnRead.setBackground(buttonsFunctions);
		
		//WRITE button: writes the text from the textArea box to a file
		btnWrite.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				try {
					//selects a ¹file named ²"BasicIO_Output.txt" to write at.
					//¹it creates a new file if not existent, but not the folder.
					//²if the exact location is not specified, the root directory OF the JAR file is selected
					FileWriter	file		= new FileWriter("examples\\fileoutputs\\BasicIO_output.txt",true);
					
					//sets up the methods for writing things in the file
					PrintWriter	file_write	= new PrintWriter(file, //:the file it will be writing
																false); //:'true' to continue writing the existing file
					
					file_write.println(txtTextOld.getText().trim()); //prints out a line on the file ^-^ ("\n" is already included)
					
					file.close(); //saves and closes the file, but it also overwrites any existing ones
					lblStatus.setText("Status: Done! :D");
					
				} catch(IOException exp) {	//if an exception (error) occurs at the 'try' block related to writing the file, 
					System.out.println(exp); //prints the error in the console
					lblStatus.setText("A writing error occoured"); //sends an error message to the user
					
				} catch(Exception exp) { //if an exception other than IOException happens,
					System.out.println(exp); //does the same thing
					lblStatus.setText("An exception occoured");
					
				} finally {
					//file.close();
				}
			}
			
		});
		
		
		btnReplace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					//opens and prepares the file for reading
						FileReader		fileR		= new FileReader("examples\\fileoutputs\\BasicIO_output.txt");
						BufferedReader	file_read	= new BufferedReader(fileR);
					
					//sets up user input
						String	textSearch	= txtTextOld.getText(),
								textReplace	= txtTextNew.getText(),
								textLine	= txtTextLine.getText();
						
						int		targetLine	= -1;
					
					/* READING THE ENTIRE FILE */
						
						//reads the first line
						int i=0;
						String	file_line		= null, //current line
								file_lineGroup	= ""; //groups all the lines
						
						do {
							
							file_lineGroup +=  (file_line = file_read.readLine()) +"\n"; //reads the next line and puts into the group
							System.out.println("[READING:]\t" +file_line); //prints this line in the console
							
						} while(file_line != null); //repeat while there is a line
						
						
						String[] fileContents = file_lineGroup.split("\n"); //splits the group into lines
						
						for(String line : fileContents) {
							System.out.println("[READING DONE:]\t" +line);
						}
						
						fileR.close(); //closes the file.
					/* READING END */
					
					
					//opens and prepares the file for writing
						FileWriter		fileW		= new FileWriter("examples\\fileoutputs\\BasicIO_output.txt");
						PrintWriter		file_write	= new PrintWriter(fileW);
						
					/* WRITING THE CHANGES */
						//tries to overwrite an specific line
						
						/*
						 * TODO Complete refactor and test
						 */
						
						try { //tries to replace
							try {
								targetLine = Integer.parseInt(textLine); //gathers the number
								
								try {
									if(textSearch.equals("")) {
										fileContents[targetLine] = textReplace;
									}
								} catch(Exception exp) {
									System.out.println(exp); //prints the exception
									exp.printStackTrace();  //and other stuff about
									
									lblStatus.setText("An exception occoured.");
									lblStatusExp.setText(exp + "");
								}
								
							} catch (NumberFormatException exp) {
								//ignore and keeps the value as -1
								lblStatusExp.setText("note: line entry is invalid.");
								
								if(textSearch.equals("")) { //if there is NO search criteria
									if(textReplace.equals("")) { //and if there are no replacement arguments
										lblStatus.setText("Error: you should write something."); //then it shows an error message to the user
										
									} else { //otherwise, if there ARE replacement arguments,
										
										for(String fileLine : fileContents) { //repeats for every line in the document...
											if(fileLine.equals(textReplace //if the line of the document is the same as the replacement
													.replace("\n", "") //without line breaks
											)) {
												
												fileLine.replace(fileLine, textReplace); //replaces the text with the replacement
												
											}
										}
										
									}
								}
							}
							
							
							
							/*
							 * TODO UNUSED
							if (textSearch.equals("")) { //if there is NO specification on what to replace
								try { //tries to replace the entry
									fileContents[targetLine] = textReplace; //replaces the entire entry
									
								} catch(Exception exp) {
									lblStatus.setText("there is no such line."); //assuming the user inserted a line that doesn't exist
									lblStatusExp.setText(exp + ""); //shows exception to the user
									
									System.out.println(exp); //prints the exception
									exp.printStackTrace();  //and other stuff about
								}
								
							} else { //otherwise there IS a search criteria
								try {
									fileContents[targetLine].replace(textSearch, textReplace);
									
								} catch(Exception exp) { //if an exception happens
									lblStatus.setText("there is no such line."); //shows an error message, assuming the user entered an invalid line
									lblStatusExp.setText(exp + ""); //shows exception to the user
									
									System.out.println(exp); //prints the exception
									exp.printStackTrace();  //and other stuff about
								}
							}
							*/
							
							for(String line : fileContents) { //repeats for every entry in the array of 'fileContents'
								if(line.equals(null)) { //if the line is null
									continue; //re-do the loop
								}
								
								if(line.contains(txtTextOld.getText())) { //compares if the line is equals to the search
									line = txtTextNew.getText(); //if so, replaces with the chosen text
								}
								file_write.println(line); //writes the line ("\n" included)
								System.out.println("[WRITING:]\t" +line);
							}
							
						} catch(Exception exp) {
							System.out.println(exp); //prints the exception
							exp.printStackTrace();  //and other stuff about
							
							lblStatus.setText(	 "You must only write numbers\n"
												+"at the number space.");
							lblStatusExp.setText(exp + "");
							
							
							
						} finally {
							fileW.close(); //closes the file.
						}
						
						
					/* WRITING END */
					lblStatus.setText("Replacing: Done! :D");
					
				} catch(IOException exp) {
					System.out.println(exp); //prints the exception
					exp.printStackTrace();  //and other stuff about
					
					lblStatus.setText("A reading error occoured.");
					lblStatusExp.setText(exp + "");
					
				} catch(Exception exp) {
					System.out.println(exp); //prints the exception
					exp.printStackTrace();  //and other stuff about
					
					lblStatus.setText("An exception occoured.");
					lblStatusExp.setText(exp + "");
					
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
					System.out.println(exp); //prints the exception
					exp.printStackTrace();  //and other stuff about
					
					lblStatus.setText("A reading error occoured.");
					lblStatusExp.setText(exp + "");
					
				} catch(Exception exp) {
					System.out.println(exp); //prints the exception
					exp.printStackTrace();  //and other stuff about
					
					lblStatus.setText("An exception occoured.");
					lblStatusExp.setText(exp + "");
					
				}
		
			}
			
		});
		
		
		
		pane.add(txtTextOld);
		pane.add(txtTextLine);
		pane.add(txtTextNew);
		pane.add(btnWrite);
		pane.add(btnReplace);
		pane.add(btnRead);
		pane.add(lblStatus);
		pane.add(lblStatusExp);
		
		pane.setBackground(bgColor);						 //sets the background color
		this.setVisible(true);								//makes the window visible
		this.setSize(wWidth, wHeight);					   //gathers wWidth and wHeight to set the window size
		this.setResizable(false);						  //locks the window size
		this.setLocationRelativeTo(null);				 //sets location relative to nothing, so it uses the center of the screen by default
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);	//closes the application process "javaw.exe" when the window is closed
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		UIBasicIO2 window = new UIBasicIO2("UI_BASIC_IO 2");
	}

}

@SuppressWarnings("serial")
class UIRead extends JFrame{
	//TODO This is going to be a window that shows the file contents
}
