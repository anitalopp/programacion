
public class Nota {

	private String dni;
	private String asignatura;
	private Integer nota;

	@Override
	public String toString() {
		return "Nota [dni=" + dni + ", asignatura=" + asignatura + ", nota=" + nota + "]";
	}

	public Nota(String dni, String asignatura, Integer nota) {
		super();
		this.dni = dni;
		this.asignatura = asignatura;
		this.nota = nota;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}

	public Integer getNota() {
		return nota;
	}

	public void setNota(Integer nota) {
		this.nota = nota;
	}

}
