package jarra;

public class JarraStrings1 {
	public static void main(String args[]) {
		String str= "owo what's this";
		String xyz= new String("owo what's this");
		
				
		if(str==xyz)
			System.out.println("owo equal");
		else
			System.out.println("lol different");
		
		System.out.println();
		
		if(str.equals(xyz))
			System.out.println("owo equal");
		else
			System.out.println("lol different");
	
		System.out.println("\n");
		
		String myString= "hello world";
		System.out.println("string lenght:\t"	+myString.length()			);
		System.out.println("sub:\t\t"			+myString.substring(0,10)	);
		System.out.println("5º pos:\t\t"		+myString.charAt(9)			);
	}
}