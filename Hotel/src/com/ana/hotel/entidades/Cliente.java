public class Cliente {

	private String dni;
	private String nombre;
	private String apellido;
	private Habitacion habitacion;
	
	public Cliente(String dni, String nombre, String apellido) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.habitacion = null;

	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getDni() {
		return this.dni;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return this.apellido;
	}

	public Habitacion getHabitacion() {
		return habitacion;
	}

	public void setHabitacion(Habitacion habitacion) {
		this.habitacion = habitacion;
	}

	public String getNombre() {
		return null;
	}

	public void mostrarMenu() {
		// TODO Auto-generated method stub
		
	}
}
