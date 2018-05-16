package sys;


/*
 *	CLASSES AND METHODS
 *	BASICS;
 */


public class SYSClasses1 {
	public static void main(String[] args) {
		
		/* creating an example of a car */
		Car exampleCar= new Car(); //creates a Car instance called "exampleCar", where it refers to the class Car()
		
		
		/* defining the attributes of the car */
		exampleCar.model = "stuff";		  //defines the model to "stuff".
		exampleCar.color = "#74FF4F";	 //defines the color to "#74FF4F" (not hex color. still a string).
		exampleCar.engine = "generic";	//defines the engine to "generic".
		
		
		System.out.println(	//prints/shows the details of the car
				"the model is \""  + exampleCar.model  + "\".\n" +
				"the color is \""  + exampleCar.color  + "\".\n" +
				"the engine is \"" + exampleCar.engine + "\".\n"
		);
		
		
		/* making actions with the car */
		exampleCar.turnOn();		  //executes "turnOn" method on exampleCar
		exampleCar.accelerate();	 //executes "accelerate" method on exampleCar
		exampleCar.shift(+1);		//[...]
		exampleCar.shift(+1);
		exampleCar.shift(+1);
		exampleCar.shift(-3);
		exampleCar.brake();
		exampleCar.turnOff();
		
	}
}

class Car {
	
	//this is public by default. it may be accessed and modified by any other class.
	String	model,
			color,
			engine;
	
	//this is private. it may not be accessible outside of this class.
	private int shift = 0;
	
	//this is a "void" method in Car. it may return anything while it can also return nothing.
	void turnOn() {
		System.out.println("turning on engine...");
	}
	
	void turnOff() {
		System.out.println("turning off engine...");
	}
	
	void accelerate() {
		System.out.println("accelerating...");
	}
	
	void brake() {
		System.out.println("braking...");
	}
	
	//this is a "void" method that uses parameters. when calling it, a parametter is required.
	void shift(int mod) {
		System.out.println("shifting to " + (shift=(shift+mod)) + "...");
	}
}