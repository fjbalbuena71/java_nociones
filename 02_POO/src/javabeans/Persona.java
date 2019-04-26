package javabeans;

//java beans es un convenio java sobre la creacion de objetos simples tambien llamados POJOS
// basicamente son objetos sencillos que no tienen herencia ni logica compleja

public class Persona {
	private String nombre;
	private int edad;
	private double peso;
	
	
	
	public Persona(String nombre, int edad, double peso) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		if (edad < 0)
			edad = 0;
		
		this.edad = edad;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + "]";
	}
	
	
	

}