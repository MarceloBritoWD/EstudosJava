
public class Algarismo {
	private int numeroDigitado;
	
	
	public int getNumeroDigitado(){
		return this.numeroDigitado;
	}
	
	public void setNumeroDigitado(int numero){
		this.numeroDigitado = numero;
	}
	
	public int getUnidades() {
		return this.numeroDigitado%10;
	}
	
	public int getDezenas() {
		return this.numeroDigitado/10%10;
	}
	
	public int getCentenas() {
		return this.numeroDigitado/100%10;
	}


}
