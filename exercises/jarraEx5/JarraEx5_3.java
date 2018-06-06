package jarra.ex5;

import java.util.Scanner;

public class JarraEx5_3 {

	private static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);
		
		System.out.print("insira n�mero: ");
		int num = in.nextInt();
		
		for(int i=1; i<11; i++) {
			System.out.println(num + " * " + i + " = " + (num*i));
		}
	}

}
