package sys;

public class SYSStringManipulations {
	public static void main(String args[]) {
		
		String str= "owo what's this";
		String xyz= new String("owo what's this");
		//both of these variables, or rather instances are the same.
		/* i swear i didn't know what this phrase meant in the day i wrote this .-. */
		
		if(str==xyz)				//compares addresses, not values (if "str" is at the same space as "xyz".)
			System.out.println("owo equal");
		else
			System.out.println("lol different");
		
		System.out.println(); //skips a line, empty "printLine"
		
		if(str.equals(xyz))			//compares strings (if the value in "str" is the same as the one in "xyz".)
			System.out.println("owo equal");
		else
			System.out.println("lol different");
	
		System.out.println("\n");	//skips two lines
		
		String myString= " hello world	"; //"\[space]hello\[space]world\t"
		System.out.println("string lenght:\t\t"		+myString.length()					); //prints the length of myString
		System.out.println("sub:\t\t\t"				+myString.substring(0,10)			); //prints part of myString
		System.out.println("5� pos:\t\t\t"			+myString.charAt(9)					); //prints the character at position 9 of myString (counts from 0)
		System.out.println("string replace:\t\t"	+myString.replace("l","w")			); //replaces every "l" with "w"
		System.out.println("String trimming:\t"		+myString.trim()					); //trims any spaces at the end or the beginning of 'myString'
	}
}