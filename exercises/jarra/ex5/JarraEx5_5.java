package jarra.ex5;

import java.util.Scanner;

//TODO fix (inserir 15 inteiros e mostrar o maior)
public class JarraEx5_5 {
	
	private static Scanner input;
	
	public static void main(String[] args) {
		
		System.out.println("insira 15 valores inteiros:");
		
		int[] number = {input.nextInt()};
		int x=0;
		
		for(int i=0; i<15; i++) {
			if(number[i]>x) {
				x=number[i];
			}
		}
		
		System.out.println("\no maior n�mero inserido � " + x);
	}

}
