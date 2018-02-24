package jarra;

public class JarraStrings1 {
	public static void main(String args[]) {
		String str= "owo what's this";
		String xyz= new String("owo what's this");
		
				
		if(str==xyz)		//compares addresses, not values (if "str" is at the same space as "xyz".)
			System.out.println("owo equal");
		else
			System.out.println("lol different");
		
		System.out.println(); //skips a line
		
		if(str.equals(xyz))	//compares strings (if the value in "str" is the same as the one in "xyz".)
			System.out.println("owo equal");
		else
			System.out.println("lol different");
	
		System.out.println("\n"); //skips two lines
		
		String myString= "hello world";
		System.out.println("string lenght:\t"	+myString.length()			); //prints the length of myString
		System.out.println("sub:\t\t"			+myString.substring(0,10)	); //prints part of myString
		System.out.println("5º pos:\t\t"		+myString.charAt(9)			); //prints the character at position 9 of myString (counts from 0)
	}
}