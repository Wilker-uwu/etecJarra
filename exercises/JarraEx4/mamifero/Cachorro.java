package JarraEx4.mamifero;

/* MAMÍFEROS */
class Cachorro extends Mamifero {
	
	private boolean tipoLatido=false;
	
	public void setLateAlto() {
		
		this.tipoLatido=true;
		
	}
	
	public void setLateBaixo() {
		
		this.tipoLatido=false;
		
	}
	
	public void falar() {}
	
}