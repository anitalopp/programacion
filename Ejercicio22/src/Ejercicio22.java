// TODO case con ,
public class Ejercicio22 {
	public static void main(String[] args) {

		int mes = 6;
		int dia = 0;
		int anos = 2023;

		switch (mes) {
		case 1: case 3: case 5:	case 7: case 8: case 10: case 12:
			dia = 31;
			break;
		case 2:
			if (anos % 400 == 0) {
				System.out.println("El año es bisiesto");
			} else if (anos % 4 == 0 && anos % 100 != 0) {
				System.out.println("El año es bisiesto");
			} else {
				System.out.println("El año no es bisiesto");
			}
			dia = 28;

			break;
		case 4: case 6: case 9: case 11:
			dia = 30;
			break;

		default:
			System.out.println("Error. Inserte número entre el 1 y el 12");
			return;

		}
		System.out.println("El mes " + mes + " tiene " + dia + " días.");

	}
}