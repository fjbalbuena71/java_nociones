package entidades;

public class Jefe extends Empleado{
	private double incentivos;

	public double getIncentivos() {
		return incentivos;
	}

	public void setIncentivos(double incentivos) {
		this.incentivos = incentivos;
	}

	@Override
	public double calcularSueldo() {
		return getNomina() + incentivos;
	}

	@Override
	public String toString() {
		return "Jefe [incentivos=" + incentivos + "]";
	}
	
	

}
