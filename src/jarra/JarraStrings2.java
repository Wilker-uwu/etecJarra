package jarra;

public class JarraStrings2 {
	public static void main(String args[]) {
		String str= "\towo what's this? ";		//cria a instância "str"
		System.out.println(str);				//imprime "str" cru
		
		
		System.out.println();
		
		
		String palavras[]= str.split("");		//cria o vetor "palavras". cada item do vetor é um caractere
		System.out.println(palavras[2]);		//imprime caractere 2 (terceiro caractere)
		
		
		System.out.println();
		
		
		int i= str.indexOf("?");		//cria inteiro "i", define "i" como a posição de '?' em "str"
		System.out.println(i);			//imprime a posição de '?' em "str"
		
		
		System.out.println();
		
		
		if (str.startsWith("olá") || str.endsWith("mundo")) {	//verifica se "str" começa com "olá" ou termina com "mundo"
			System.out.println(true);
		} else {
			System.out.println(false);	//imprime "falso"
		}
		
		if (str.startsWith("	owo") && str.endsWith("? ")) { 		//verifica se "str" comça com "\towo" e termina com "? "
			System.out.println(true);	//imprime "true"
		} else {
			System.out.println(false);
		}
		
		
		System.out.println();
		
		
		str= str.trim();				//remove espaços do início e final da string "str"
		System.out.println(str);		//imprime "str" com espaços cortados da linha
		
		
		System.out.println();
		
		
		str= str.replace("owo w","OwO W");		//substitui procura e substitui "owo w" com "OwO W" em "str" 
		System.out.println(str);				//imprime "OwO What's this?"
	}
}
