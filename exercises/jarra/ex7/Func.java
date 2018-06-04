package jarraEx7;

public class Func {
	
	public static double equals(double a, double b, char type) {
		switch (type) {
			case '+':
				return a+b;

			case '-':
				return a-b;

			case '*':
				return a*b;

			case '/':
				return a/b;
			
			default:
				return a+b;
		}
	}
}
