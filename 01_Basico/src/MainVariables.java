
public class MainVariables {
	public static void main(String[] args) {
		//En java tenemos 2 tipos de variables, primitivos y referencias
		
		//primitivas: son aquellas que el valor se guarda dentro de la variable
		int entero1 = 10;
		double reales=23.24;
		long enterogrande=111_000_000_000L;
		boolean verdadero=true;
		boolean falso=false;
		
		System.out.println(enterogrande);
		
		// variables de referencia, las referencias apunta a objetos
		// lo que guarda la referencia es la posicion de memoria donde se 
		//guardan los datos
		String cadena="Esto es una cadena de texto";
		
		cadena = cadena + " cadena anexada";
		System.out.println(cadena);
	}
	
}