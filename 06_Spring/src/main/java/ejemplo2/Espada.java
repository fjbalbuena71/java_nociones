package ejemplo2;

public class Espada extends Arma{
	
	@Override
	public void usar() {
		System.out.println("Soy una espada de tipo " + getTipo() + " y doy cania");
	}

}
