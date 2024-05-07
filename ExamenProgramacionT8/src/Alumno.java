import java.util.ArrayList;
import java.util.List;

public class Alumno {

	private String dni;
	private String nombreApellido;
	private Integer edad;

	public Alumno(String dni, String nombreApellido, int edad) {
		super();
		this.dni = dni;
		this.nombreApellido = nombreApellido;
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Alumno [dni=" + dni + ", nombreApellido=" + nombreApellido + ", edad=" + edad;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombreApellido() {
		return nombreApellido;
	}

	public void setNombreApellido(String nombreApellido) {
		this.nombreApellido = nombreApellido;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}


}
