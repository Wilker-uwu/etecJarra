package jarraEx7;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class UICalc extends JFrame{
	
	JTextField	txtOutput = new JTextField("0");
	
	JButton		btnMC	= new JButton("MC"), //first row
				btnMR	= new JButton("MR"),
				btnMS	= new JButton("MS"),
				btnMP	= new JButton("M+"),
				btnMM	= new JButton("M-"),
		
				btnBks	= new JButton("←"),	//second row
				btnCE	= new JButton("CE"),
				btnCls	= new JButton("C"),
				btnNeg	= new JButton("±"),
				btnSQRT	= new JButton("√"),
				
				btnDiv	= new JButton("/"),	//other functions
				btnMul	= new JButton("*"),
				btnPer	= new JButton("%"),
				btnFra	= new JButton("1/x"),
				btnSum	= new JButton("+"),
				btnSub	= new JButton("-"),
				btnEq	= new JButton("="),
				btnDec	= new JButton(","),
				
				btn0	= new JButton("0"), //number buttons
				btn1	= new JButton("1"),
				btn2	= new JButton("2"),
				btn3	= new JButton("3"),
				btn4	= new JButton("4"),
				btn5	= new JButton("5"),
				btn6	= new JButton("6"),
				btn7	= new JButton("7"),
				btn8	= new JButton("8"),
				btn9	= new JButton("9");
	
	boolean		funPressed	= false;	  //if a function button was pressed
	char		funType		= '0';		 //which function was selected
	double[]	val			= {0,0};	//numbers to calculate
	
	public UICalc() {
		super("Calculator");
		
		Container pane = this.getContentPane();
		pane.setLayout(null);
		pane.setBackground(new Color(186,186,223));
		
		
		//sets up the grid
		int btnW	= 32,
			btnH	= 26,
			
			gW		= 8,
			gH		= 8,
			
			wWidth	= btnW*5+gW*7,
			wHeight = btnH*8+gH*11;
		Color buttonsNumbers = new Color(232,186,232);
		
		
		//sets up locations
		txtOutput.setBounds	(gW,gH, wWidth-(gW*3), btnH*2);
		
		btnMC.setBounds		(gW*1,	gH*9, btnW, btnH);
		btnMR.setBounds		(gW*6,	gH*9, btnW, btnH);
		btnMS.setBounds		(gW*11,	gH*9, btnW, btnH);
		btnMP.setBounds		(gW*16,	gH*9, btnW, btnH);
		btnMM.setBounds		(gW*21,	gH*9, btnW, btnH);
		
		btnBks.setBounds	(gW*1,	gH*13, btnW, btnH);
		btnCE.setBounds		(gW*6,	gH*13, btnW, btnH);
		btnCls.setBounds	(gW*11,	gH*13, btnW, btnH);
		btnNeg.setBounds	(gW*16,	gH*13, btnW, btnH);
		btnSQRT.setBounds	(gW*21,	gH*13, btnW, btnH);
		
		btn7.setBounds		(gW*1,	gH*17, btnW, btnH);
		btn8.setBounds		(gW*6,	gH*17, btnW, btnH);
		btn9.setBounds		(gW*11,	gH*17, btnW, btnH);
		btnDiv.setBounds	(gW*16,	gH*17, btnW, btnH);
		btnPer.setBounds	(gW*21,	gH*17, btnW, btnH);
		
		btn4.setBounds		(gW*1,	gH*21, btnW, btnH);
		btn5.setBounds		(gW*6,	gH*21, btnW, btnH);
		btn6.setBounds		(gW*11,	gH*21, btnW, btnH);
		btnMul.setBounds	(gW*16,	gH*21, btnW, btnH);
		btnFra.setBounds	(gW*21,	gH*21, btnW, btnH);
		
		btn1.setBounds		(gW*1,	gH*25, btnW, btnH);
		btn2.setBounds		(gW*6,	gH*25, btnW, btnH);
		btn3.setBounds		(gW*11,	gH*25, btnW, btnH);
		btnSub.setBounds	(gW*16,	gH*25, btnW, btnH);
		btnEq.setBounds		(gW*21,	gH*25, btnW, btnH*2+gW);
		
		btn0.setBounds		(gW*1,	gH*29, btnW*2+gW, btnH);
		btnDec.setBounds	(gW*11,	gH*29, btnW, btnH);
		btnSum.setBounds	(gW*16,	gH*29, btnW, btnH);
		
		//BUTTON BORDERS START
		btn0.setBorder(null);
		btn1.setBorder(null);
		btn2.setBorder(null);
		btn3.setBorder(null);
		btn4.setBorder(null);
		btn5.setBorder(null);
		btn6.setBorder(null);
		btn7.setBorder(null);
		btn8.setBorder(null);
		btn9.setBorder(null);
		
		btnSum.setBorder(null);
		btnSub.setBorder(null);
		btnMul.setBorder(null);
		btnDiv.setBorder(null);
		
		btnNeg.setBorder(null);
		
		btnEq.setBorder(null);
		//BUTTON BORDERS END
		
		//BUTTON COLORS START
		btn0.setBackground(buttonsNumbers);
		btn1.setBackground(buttonsNumbers);
		btn2.setBackground(buttonsNumbers);
		btn3.setBackground(buttonsNumbers);
		btn4.setBackground(buttonsNumbers);
		btn5.setBackground(buttonsNumbers);
		btn6.setBackground(buttonsNumbers);
		btn7.setBackground(buttonsNumbers);
		btn8.setBackground(buttonsNumbers);
		btn9.setBackground(buttonsNumbers);
		btnDec.setBackground(buttonsNumbers);
		//BUTTON COLORS END
		
		
		
		//NUMBER BUTTONS START
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				
				if(txtOutput.getText().equals("0") || funPressed) {
					
					txtOutput.setText("0");
					
				} else {
					
					txtOutput.setText(txtOutput.getText() + 0);
					
				};
				
				System.out.println(event);
				funPressed=false;
			}
		});
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				
				if(txtOutput.getText().equals("0") || funPressed) {
					
					txtOutput.setText("1");
					
				} else {
					
					txtOutput.setText(txtOutput.getText() + 1);
					
				};

				System.out.println(event);
				funPressed=false;
			}
		});
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				
				if(txtOutput.getText().equals("0") || funPressed) {
					
					txtOutput.setText("2");
					
				} else {
					
					txtOutput.setText(txtOutput.getText() + 2);
					
				};
				
				System.out.println(event);
				funPressed=false;
			}
		});
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				
				if(txtOutput.getText().equals("0") || funPressed) {
					
					txtOutput.setText("3");
					
				} else {
					
					txtOutput.setText(txtOutput.getText() + 3);
					
				};
				
				System.out.println(event);
				funPressed=false;
			}
		});
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				
				if(txtOutput.getText().equals("0") || funPressed) {
					
					txtOutput.setText("4");
					
				} else {
					
					txtOutput.setText(txtOutput.getText() + 4);
					
				};
				
				System.out.println(event);
				funPressed=false;
			}
		});
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				
				if(txtOutput.getText().equals("0") || funPressed) {
					
					txtOutput.setText("5");
					
				} else {
					
					txtOutput.setText(txtOutput.getText() + 5);
					
				};
				
				System.out.println(event);
				funPressed=false;
			}
		});
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				
				if(txtOutput.getText().equals("0") || funPressed) {
					
					txtOutput.setText("6");
					
				} else {
					
					txtOutput.setText(txtOutput.getText() + 6);
					
				};
				
				System.out.println(event);
				funPressed=false;
			}
		});
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				
				if(txtOutput.getText().equals("0") || funPressed) {
					
					txtOutput.setText("7");
					
				} else {
					
					txtOutput.setText(txtOutput.getText() + 7);
					
				};
				
				System.out.println(event);
				funPressed=false;
			}
		});
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				
				if(txtOutput.getText().equals("0") || funPressed) {
					
					txtOutput.setText("8");
					
				} else {
					
					txtOutput.setText(txtOutput.getText() + 8);
					
				};
				
				System.out.println(event);
				funPressed=false;
			}
		});
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				
				if(txtOutput.getText().equals("0") || funPressed) {
					
					txtOutput.setText("9");
					
				} else {
					
					txtOutput.setText(txtOutput.getText() + 9);
					
				};
				
				System.out.println(event);
				funPressed=false;
			}
		});
		//NUMBER BUTTONS END
		
		//BASIC ARITHMETICS START
		btnSum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				
				if(val[0] == 0) {
					val[0]=Double.parseDouble(txtOutput.getText());
					
					System.out.println(event + "\n\tpressed +: val[0] = " + val[0]);
					
					
				} else if (val[1] == 0) {
					val[1]=Double.parseDouble(txtOutput.getText());
					
					System.out.println(event + "\n\tpressed +: val[1] = " + val[1]);
					
					txtOutput.setText(Func.equals(val[0],val[1],'+') + "");
					System.out.println(
							event + 
							"\n\tpressed +:\n\t\t" +
							val[0] + " +\n\t\t" +
							val[1] + " =\n\t\t" +
							txtOutput.getText()
					);
					
					val[0] = 0;
					val[1] = 0;
					
					
				}
				
				funPressed=true;
				funType='+';
			}
		});
		btnSub.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent event) {
				
				if(val[0] == 0) {
					val[0]=Double.parseDouble(txtOutput.getText());
					
					System.out.println(event + "\n\tpressed -: val[0] = " + val[0]);
					
					
				} else if (val[1] == 0) {
					val[1]=Double.parseDouble(txtOutput.getText());
					
					System.out.println(event + "\n\tpressed -: val[1] = " + val[1]);
					
					txtOutput.setText(Func.equals(val[0],val[1],'-') + "");
					System.out.println(
							event + 
							"\n\tpressed -:\n\t\t" +
							val[0] + " -\n\t\t" +
							val[1] + " =\n\t\t" +
							txtOutput.getText()
					);
					
					val[0] = 0;
					val[1] = 0;
					
					
				}
				
				funPressed=true;
				funType='-';
			}
		});
		btnMul.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent event) {
				
				if(val[0] == 0) {
					val[0]=Double.parseDouble(txtOutput.getText());
					
					System.out.println(event + "\n\tpressed *: val[0] = " + val[0]);
					
					
				} else if (val[1] == 0) {
					val[1]=Double.parseDouble(txtOutput.getText());
					
					System.out.println(event + "\n\tpressed *: val[1] = " + val[1]);
					
					txtOutput.setText(Func.equals(val[0],val[1],'*') + "");
					System.out.println(
							event + 
							"\n\tpressed *:\n\t\t" +
							val[0] + " *\n\t\t" +
							val[1] + " =\n\t\t" +
							txtOutput.getText()
					);
					
					val[0] = 0;
					val[1] = 0;
					
					
				}
				
				funPressed=true;
				funType='*';
			}
		}); 
		btnDiv.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent event) {
				
				if(val[0] == 0) {
					val[0]=Double.parseDouble(txtOutput.getText());
					
					System.out.println(event + "\n\tpressed /: val[0] = " + val[0]);
					
					
				} else if (val[1] == 0) {
					val[1]=Double.parseDouble(txtOutput.getText());
					
					System.out.println(event + "\n\tpressed /: val[1] = " + val[1]);
					
					txtOutput.setText(Func.equals(val[0],val[1],'/') + "");
					System.out.println(
							event + 
							"\n\tpressed /:\n\t\t" +
							val[0] + " /\n\t\t" +
							val[1] + " =\n\t\t" +
							txtOutput.getText()
					);
					
					val[0] = 0;
					val[1] = 0;
					
					
				}
				
				funPressed=true;
				funType='/';
			}
		});  
		//BASIC ARITHMETICS END
		
		btnNeg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				txtOutput.setText(-Double.parseDouble(txtOutput.getText()) + "");
			}
		});
		
		btnEq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				val[1]=Double.parseDouble(txtOutput.getText());
				txtOutput.setText(Func.equals(val[0],val[1],funType) + "");
				
				System.out.println(
						event + 
						"\n\tpressed =:\n\t\t" +
						val[0] + " " + funType + "\n\t\t" +
						val[1] + " =\n\t\t" +
						txtOutput.getText()
				);
				
				funPressed=true;
				val[0] = 0;
				val[1] = 0;
			}
		});
		
		
		
		this.setVisible(true);			  //makes the window visible
		this.setSize(wWidth, wHeight);	 //window size and
		this.setLocation(520, 325);		//location
		this.setResizable(false);	   //blocks window resizing
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //ends javaw.exe on close
		
		//draws buttons
		pane.add(txtOutput);
		pane.add(btnMC);
		pane.add(btnMR);
		pane.add(btnMS);
		pane.add(btnMP);
		pane.add(btnMM);
		pane.add(btnBks);
		pane.add(btnCE);
		pane.add(btnCls);
		pane.add(btnNeg);
		pane.add(btnSQRT);
		pane.add(btn7);
		pane.add(btn8);
		pane.add(btn9);
		pane.add(btnDiv);
		pane.add(btnPer);
		pane.add(btn4);
		pane.add(btn5);
		pane.add(btn6);
		pane.add(btnMul);
		pane.add(btnFra);
		pane.add(btn1);
		pane.add(btn2);
		pane.add(btn3);
		pane.add(btnSub);
		pane.add(btnEq);
		pane.add(btn0);
		pane.add(btnDec);
		pane.add(btnSum);
		
	}
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		UICalc window = new UICalc();
	}

}
