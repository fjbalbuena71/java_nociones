package entidades;

import java.util.ArrayList;

public class MainHerencia {
	public static void main(String[] args) {
		
		Empleado empleado = new Programador();	
		empleado.setDni("5433331");
		empleado.setNombre("Paco");
		empleado.setNomina(1000);
		
		Jefe jefe = new Jefe();
		jefe.setDni("454545450");
		jefe.setNombre("Pepe");
		jefe.setNomina(5000);
		jefe.setIncentivos(1000);
		
		Director director = new Director();
		director.setDni("8884545450");
		director.setNombre("Lucas");
		director.setNomina(8000);
		
		ArrayList<Empleado> ListaEmpleados = new ArrayList<>();
		ListaEmpleados.add(empleado);
		ListaEmpleados.add(jefe);
		
		director.setListaEmpleados(ListaEmpleados);
		
		ArrayList<Empleado> empresa = new ArrayList<>();
		empresa.add(empleado); //0
		empresa.add(jefe); //1
		empresa.add(director); //2
		
		calcularSueldo(empresa);
		
		Empleado empleado1 = empresa.get(1); //hacemos referencia al elemento 1 del array	
		System.out.println(empleado1.getNombre());
		
        if (empresa.get(1) instanceof Jefe) { // nos aseguramos que ese elemento es tipo Jefe
		   Jefe jefe1 = (Jefe)empresa.get(1); // lo podemos castear pero hay que estar seguro que es de ese tipo
		   System.out.println(jefe1.getIncentivos());
        }
		
	}
	public static void calcularSueldo(ArrayList<Empleado> empresa) {
		for (Empleado e: empresa) {
			System.out.println(e);
			System.out.println(e.calcularSueldo());
		}
	}

}
