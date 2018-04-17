package jarra;

class Tezt1 {
	public static void main(String[] args) {
		mae();								//calls "mae" function inside "Tezt1"
		System.out.println(Tezt2.stop(4)); //prints the result of 4*4
	}
	
	public static void mae() {
		System.out.println("hewwo world");
	}
}

class Tezt2 {
	public static int stop(int args) {	 //creates function "stop" with an int argument "args"
		return args * 4;				//returns the input multiplied by 4
	}
}