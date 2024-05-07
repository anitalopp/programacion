import java.util.Comparator;

public class ComparadorEdad implements Comparator<Alumno>{

	@Override
	public int compare(Alumno o1, Alumno o2) {
		// TODO Auto-generated method stub
		return o1.getEdad().compareTo(o2.getEdad());
	}

	
}
