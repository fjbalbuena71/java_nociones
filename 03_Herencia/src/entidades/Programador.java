package entidades;

public class Programador extends Empleado{

	@Override
	public double calcularSueldo() {
		return getNomina();
	}
	
	

}
