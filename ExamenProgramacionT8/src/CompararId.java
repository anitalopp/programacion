import java.util.Comparator;

public class CompararId implements Comparator<Login> {

	@Override
	public int compare(Login o1, Login o2) {
		// TODO Auto-generated method stub
		return o1.getId().compareTo(o2.getId());
	}

}
