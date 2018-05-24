package sys;

public class SYSStringSearch {
	public static void main(String args[]) {
		String str= "\towo what's this? ";		//cria a inst�ncia "str"
		System.out.println(str);				//imprime "str" cru
		
		
		System.out.println();
		
		
		String palavras[]= str.split("");		//cria o vetor "palavras". cada item do vetor = um caractere
		System.out.println(palavras[2]);		//imprime caractere 2 (terceiro caractere)
		
		
		System.out.println();
		
		
		int i= str.indexOf("?");		//cria inteiro "i", define "i" como a posi��o de '?' em "str"
		System.out.println(i);			//imprime a posição de '?' em "str"
		
		
		System.out.println();
		
		
		if (str.startsWith("olá") || str.endsWith("mundo")) {	//verifica se "str" come�a com "ol�" ou termina com "mundo"
			System.out.println(true);
		} else {
			System.out.println(false);	//imprime "falso"
		}
		
		if (str.startsWith("	owo") && str.endsWith("? ")) { 		//verifica se "str" com�a com "\towo" e termina com "? "
			System.out.println(true);	//imprime "true"
		} else {
			System.out.println(false);
		}
		
		
		System.out.println();
	}
}
