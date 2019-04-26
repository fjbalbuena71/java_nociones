package entidades;

import java.util.ArrayList;

import javax.management.openmbean.*;

public class MainInterfaces {
	public static void main(String[] args) {
		Movible movible = new Coche();
		movible.moverseRapido();
		
		Persona p1 = new Persona();
		p1.setNombre("Paco");
		p1.setDni("0001");
		
		Coche c1 = new Coche();
		c1.setMarca("Ferrari");
		c1.setMatricula("002");
		
		Persona p2 = new Persona();
		p2.setNombre("Pepe");
		p2.setDni("0002");
		
		Coche c2 = new Coche();
		c2.setMarca("Lotus");
		c2.setMatricula("003");
		
		
		ArrayList<Movible> carrera = new ArrayList<>();
		carrera.add(p1);
		carrera.add(p2);
		carrera.add(c1);
		carrera.add(c2);
		
		for (Movible participante : carrera) {
			participante.moverseRapido();
		}
	}

}
