import java.util.Comparator;

public class ComparadorNombre implements Comparator<Alumno> {

	@Override
	public int compare(Alumno o1, Alumno o2) {
		// TODO Auto-generated method stub
		return o1.getNombreApellido().compareTo(o2.getNombreApellido());
	}
	

}
