package entidades;
import java.util.ArrayList;

public class Director extends Empleado {
	
	private ArrayList <Empleado> ListaEmpleados;

	@Override
	public double calcularSueldo() {
		double sueldo = getNomina() + (ListaEmpleados.size() * 50);
		return sueldo;
	}

	public ArrayList <Empleado> getListaEmpleados() {
		return ListaEmpleados;
	}

	public void setListaEmpleados(ArrayList <Empleado> listaEmpleados) {
		ListaEmpleados = listaEmpleados;
	}
	
	

}
