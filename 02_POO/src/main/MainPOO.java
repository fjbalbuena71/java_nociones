package main;

import entidades.Persona;
import entidades.Direccion;

public class MainPOO {
	public static void main(String[] args) {
		Persona p = new Persona();
		p.nombre = "Felix";
		p.edad = 39;
		p.peso = 82;
		
		Persona p2 = new Persona();
		p2.nombre = "Marta";
		p2.edad = 45;
		p2.peso = 67.8;
		
		p.andar (10);
		// p.metros = 45; esto es erroneo porque metros es private y aqui no lo ves
		
		Persona p3 = p2; // apuntamos al mismo objeto donde apunte p2 y lo que cambies en uno se 
		//cambiara en el otro, esto es muy importante.
		System.out.println(p3.getMetros());
		
		Persona p4 = p;
		p4.edad = 55;
		System.out.println(p.edad);
		
		cambiarEdad(p4);
		System.out.println(p4.edad);
		
		int numero = 5;
		cambiarNumero(numero);
		System.out.println(numero); // esto imprimira 5 porque la variable es primitiva no referencia
		
		Persona p5 = crearPersona();
		
		Persona p6 = new Persona("Ramon",54,80,0); // lo crea con el constructor de los parametros
		
		Persona p7 = null;
		//System.out.println(p7.edad); esto es una cagada puesto que da core porque p7 es null
		
		p7 = new Persona ("Ana", 66,58,0);
		p7.direccion = new Direccion();
		p7.direccion.tipoVia="Calle";
		
		
			
		
		
	}
	
	public static void  cambiarEdad(Persona p) {
		p.edad=66;
	}
	
	public static void  cambiarNumero(int numero) {
		numero = 10;
	}
	
	public static Persona  crearPersona() {
		Persona p = new Persona();
		p.edad=51;
		return p;
		
	}
	
	

}
