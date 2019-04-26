package entidades;

/**
 * Interfaz que hace que los objectos se puedan mover. Cada objeto se novera como
 * corresponda
 * 
 * @author FBH
 * @version 1.0
 * @since 26/04/2019
 *
 */

public interface Movible {
	//siempre son abstracto y publicos los metodos
	//No podemos declarar atributos, solo constantes
	
	int i= 5;//constante
	
	/**
	 * Este metodo hace que el objeto se mueva lo mas lento posible
	 */
	public void moverseLento();
	
	/**
	 * Este metodo hace que el objeto se mueva lo mas rapido posible
	 */
	public void moverseRapido();
	/**
	 * Este metodo hace que el objeto se mueva una cantidad de metros
	 * @param metros representa los metros que se movera
	 * @return la posicion donde se encuentra
	 */
	public int moverse(int metros);
	

}
