import java.util.Arrays;

public class MainFunciones {
	//funcion principal, en java son metodos, no existen funciones globales, todos los metodos estan
	//asociados a una clase
	public static void main(String[] args) {
		
		saludo("Felix");
		saludo("Marta");
		int resultado = suma(2,4);
		System.out.println(resultado);
		
		int [ ]resultados = operaciones(4,2);
		System.out.println(Arrays.toString(resultados));
		
		double resultadoReal = suma(3.4, 5.3);
		System.out.println(resultadoReal);
		
		suma (1,67,89,34);
		
	}
	
	/* sintaxis:
	 * 1 visibilidad
	 * 2 estatico o dinamico
	 * 3 valor de retorno
	 * 4 nombre del metodo
	 * 5 argumentos de entrada
	 */
	public static void saludo(String nombre) {
 		System.out.println("Yo te saludo " + nombre);
	}
	
	public static int suma (int numero1, int numero2) {
		int resultado = numero1 + numero2;
		return resultado;
	}
	 
	public static int[] operaciones(int numero1, int numero2) {
		int[] resultados = new int[4];
		resultados[0] = numero1 + numero2;
		resultados[1] = numero1 - numero2;
		resultados[2] = numero1 * numero2;
		resultados[3] = numero1 / numero2;
		
		return resultados;
		
	}
	
	//sobrecarga de metodos. Un metodo esta sobrecargado cuando tiene un mismo nombre pero distinto
	// tipo o numero de argumentos de entrada, pero nunca el tipo de salida
	public static double suma (double real1, double real2) {
		return real1 + real2;
	}
	
	//tambien se puede hacar variable el numero de parametros de un metodo
	public static int suma(int... numeros) {
		//numeros sera tratado como un array
		int resultado=0;
		for(int i : numeros) {
			resultado += i;
		}
		return resultado;
	}

}