package jarraEx7;

import java.awt.Container;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Calc extends JFrame{
	
	//TODO comment buttons
	JTextField	txtOutput = new JTextField("0");
	
	JButton		btnMC	= new JButton("MC"),
				btnMR	= new JButton("MR"),
				btnMS	= new JButton("MS"),
				btnMP	= new JButton("M+"),
				btnMM	= new JButton("M-"),
		
				btnBks	= new JButton("←"),
				btnCE	= new JButton("CE"),
				btnCls	= new JButton("C"),
				btnPN	= new JButton("±"),
				btnSQRT	= new JButton("√"),
				
				btnDiv	= new JButton("/"),
				btnPer	= new JButton("%"),
				btnFra	= new JButton("1/x"),
				btnSum	= new JButton("+"),
				btnSub	= new JButton("-"),
				btnEq	= new JButton("="),
				btnDec	= new JButton(","),
				
				btn0	= new JButton("0"),
				btn1	= new JButton("1"),
				btn2	= new JButton("2"),
				btn3	= new JButton("3"),
				btn4	= new JButton("4"),
				btn5	= new JButton("5"),
				btn6	= new JButton("6"),
				btn7	= new JButton("7"),
				btn8	= new JButton("8"),
				btn9	= new JButton("9");
				
	
	
	public Calc() {
		super("Calculator");
		
		Container pane = this.getContentPane();
		pane.setLayout(null);
		
		
		int wWidth	= 220,
			wHeight = 286,
			
			gW		= 8,
			gH		= 8,
			
			btnW	= 32,
			btnH	= 26;
		
		
		txtOutput.setBounds(gW,gH, wWidth-(gW*3), gH*8);
		
		btnMC.setBounds		(gW*1, gH*10, btnW, btnH);
		btnMR.setBounds		(gW*6, gH*10, btnW, btnH);
		btnMS.setBounds		(gW*11, gH*10, btnW, btnH);
		btnMP.setBounds		(gW*16, gH*10, btnW, btnH);
		btnMM.setBounds		(gW*21, gH*10, btnW, btnH);
		
		btnBks.setBounds	(gW*1, gH*14, btnW, btnH);
		btnCE.setBounds		(gW*6, gH*14, btnW, btnH);
		btnCls.setBounds	(gW*11, gH*14, btnW, btnH);
		btnPN.setBounds		(gW*16, gH*14, btnW, btnH);
		btnSQRT.setBounds	(gW*21, gH*14, btnW, btnH);
		
		//TODO make other buttons
		btnBks.setBounds	(gW*1, gH*14, btnW, btnH);
		btnCE.setBounds		(gW*6, gH*14, btnW, btnH);
		btnCls.setBounds	(gW*11, gH*14, btnW, btnH);
		btnPN.setBounds		(gW*16, gH*14, btnW, btnH);
		btnSQRT.setBounds	(gW*21, gH*14, btnW, btnH);
		
		
		this.setVisible(true);			  //makes the window visible
		this.setSize(wWidth, wHeight);	 //window size and
		this.setLocation(520, 325);		//location
		this.setResizable(false);	   //blocks window resizing
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //ends javaw.exe on close
		
		//draws buttons
		//TODO add other buttons
		pane.add(txtOutput);
		pane.add(btnMC);
		pane.add(btnMR);
		pane.add(btnMS);
		pane.add(btnMP);
		pane.add(btnMM);
		pane.add(btnBks);
		pane.add(btnCE);
		pane.add(btnCls);
		pane.add(btnPN);
		pane.add(btnSQRT);
		
	}
	
	
	
	public static void main(String[] args) {
		Calc window = new Calc();
	}

}
