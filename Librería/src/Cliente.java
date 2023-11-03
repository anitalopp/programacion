
public class Cliente {

	private String nombre;
	private int edad;
	private String ciudad;

	public Cliente(String nombre, int edad, String ciudad) {
		this.nombre = nombre;
		this.edad = edad;
		this.ciudad = ciudad;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setEdad(int edad) {
		if (edad < 0) {
			this.edad = 10;
		} else {
			this.edad = edad;
		}
	}
	public int getEdad() {
		return this.edad;
	}
	
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
	public String getCiudad() {
		return this.ciudad;
	}
	
	public boolean esVip() {
		// Consulta a la base de datos cuánto ha gastado en el último año

		boolean tieneGastoAlto = true;

		if (tieneGastoAlto)
			return true;

		return false;

	}
}
