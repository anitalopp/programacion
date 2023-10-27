
public class Ejercicio30 {
	public static void main(String[] args) {

		int edad = 56;
		int ecog = 4;
		int ldh = 250;
		boolean medula = true;
		int contador = 0;

		if (edad < 60) {
			contador++;
		}
		if (ecog >= 2) {
			contador++;
		}
		if (ldh > 250) {
			contador++;
		}
		if (medula) {
			contador++;
		}

		switch (contador) {
		case 0:
			System.out.println("Riesgo bajo");
			break;
		case 1:
			System.out.println("Riesgo intermedio-bajo");
			break;
		case 2:
			System.out.println("Riego intermedio-alto");
			break;
		case 3,4:
			System.out.println("Riesgo alto");
			break;
		}
		System.out.println(contador);

	}
}
