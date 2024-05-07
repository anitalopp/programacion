import java.util.Comparator;

public class CompararNombre2 implements Comparator<Login>{

	@Override
	public int compare(Login o1, Login o2) {
		// TODO Auto-generated method stub
		return o1.getNombre().compareTo(o2.getNombre());
	}

}
