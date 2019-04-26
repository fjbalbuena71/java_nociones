package ejemplo1;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main1 {
	
	//arrancamos nuestro contenedor de objetos de spring
	private static ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	
	public static void main(String[] args) {
		
		// de esta manera spring no lleva el control del objeto p
		Persona p = new Persona();
		p.setNombre("Pepe");
		p.setEdad(34);
		p.setPeso(23.5);
		
		
		Persona Lisa = context.getBean("Lisa", Persona.class);
		System.out.println(Lisa.getNombre());
		
		//Ojo en los prototype cuando te devuleve el objeto la referencia ya depende de ti
		Persona p2 = context.getBean("personaGenerica", Persona.class);
		p2.setNombre("Bart Simpson");
		
		
		ArrayList<Persona> ListaPersonas = context.getBean("arrayPersonas", ArrayList.class);
		ListaPersonas.add(p2);
		System.out.println(ListaPersonas);
		
		mostrarPersona(p);
	}

	private static void mostrarPersona(Persona p) {
		imprimirPersona(p);
		
	}

	private static void imprimirPersona(Persona p) {
		System.out.println(p);
		
		//Para no tener que estar paasndo la referncia p por todos
		//los metodos, si lo declaramos arriba fuera del metodo main, lo podemos 
		//invocar aqui con el context
		Persona p2 = context.getBean("Lisa", Persona.class);
		
	}

}
