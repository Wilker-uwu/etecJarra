package jarra.ex5;

import java.util.Scanner;

//TODO fix (exiba n�meros �mpares entre os valores que o usu�rio digitar)
public class JarraEx5_2 {

	private static Scanner in;

	public static void main(String[] args) {
		
		in = new Scanner(System.in);
		
		System.out.println("insira in�cio e fim:");
		int[] num= {in.nextInt(),in.nextInt()};
		
		if(num[0]>=num[1]) {
			for(int i=num[0]; num[0]>=num[1]; i--) {
				if(i%2 != 0) {
					System.out.println(i + " � �mpar.");
				}
			}
		} else {
			for(int i=num[1]; num[1]>=num[0]; i--) {
				if(i%2 != 0) {
					System.out.println(i + " � �mpar.");
				}
			}
		}
	}

}
