package jarra.ex4.ave;

/* AVES */
@SuppressWarnings("unused")
public class Ave extends jarra.ex4.animal.Animal {	
	
	private int altura=0;
	
	public void falar() {}
	
	public void voar(int i) {
		this.altura+=i;
	}
	
}
