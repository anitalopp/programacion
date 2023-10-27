
public class Ejercicio20 {
	public static void main(String[] args) {

		float edadPerro = 4;
		float edadHumana;

		System.out.println("La edad del perro es " + edadPerro);
		if (edadPerro <= 2) {
			edadHumana = edadPerro * Constantes.PRIMEROS_AÑOS;
			System.out.println("La edad humana del perro es de " + edadHumana);
		} else {
			edadHumana = edadPerro * Constantes.MAS_DOS_AÑOS;
			System.out.println("La edad humana del perro es de " + edadHumana);

		}

	}
}
