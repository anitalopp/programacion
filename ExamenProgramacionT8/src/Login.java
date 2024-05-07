
public class Login {

	private String id;
	private String nombre;
	private String fecha;

	@Override
	public String toString() {
		return "Login [id=" + id + ", nombre=" + nombre + ", fecha=" + fecha + "]";
	}

	public Login(String id, String nombre, String fecha) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.fecha = fecha;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

}
