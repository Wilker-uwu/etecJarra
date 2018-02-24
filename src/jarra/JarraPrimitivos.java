package jarra;

public class JarraPrimitivos {
	public static void main(String args[]) {
		
		int idade=18;		//int variable type (1,2,3,4,8,16,32,64...)
		
		float valor=1.99f;	//float variable type (n.nnnnn) - f means "float" instead of "double"
		
		boolean isSim=true;	//boolean variable type (true,false)
		
		char letterA='A';	//character variable type (a,b,1,6,º,™...)
		letterA=65;
		letterA='\u0041';
		
		short curto=127;
		
		double longo=1234568790;
		
		int y1=0, y2=1, y3=2, y4=3;
		
		System.out.print(
				idade+"\n"+	//"\n" is a line break
				valor+"\n"+
				isSim+"\n"+
				letterA+"\n"+
				curto+"\n"+
				longo+"\n"+
				y1+"\t"+y2+"\t"+y3+"\t"+y4 //"\t" = "	" (tabulation/tab)
				);
	}
}
