package jarra;


/*
 * 	CLASSES AND METHODS
 *	STATIC VARIABLES; 
 */


public class JarraClassExample2 {
	
	public static void main(String[] args) {
		
		Counter c = new Counter();
		
		  //uses the class Counter itself to print "count".
		System.out.println(Counter.getCount());
		//"count" is initialized at zero. with no changes, it prints zero.
		
		
		 //uses the "c" instance to execute the method "increment",
		//which increments "count" by 1
		c.increment();
				
		System.out.println(Counter.getCount()); //prints "count" in the class Counter itself
		
		
		Counter.setCount(Counter.getCount() + 1); //increments "count" in the class itself
		System.out.println(c.getCount());
		
	}

}

class Counter {
	
	 //the value of the static attributes/variables are shared
	//between all the instances of a class.
	
	private static int count = 0; 
	
	 //it can be accessed directly via "Class.VarName" as long as
	//it is marked as "static". otherwise, only instances can access it.
	
	
	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Counter.count = count;
	}

	void increment() {
		setCount(getCount() + 1); //increments "count" by 1
	}
	
}