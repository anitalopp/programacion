
public class Ejercicio29 {
	public static void main(String[] args) {

		int edad = 45;
		boolean esNegro = true;
		int estadio = 3;
		int contador = 0;

		if (edad >= 40 && edad <= 59) {
			contador += 1;
		} else if (edad >= 60 && edad <= 79) {
			contador += 2;
		} else if (edad >= 80) {
			contador += 4;
		}
		if (esNegro) {
			contador += 1;
		}
		if (estadio == 3 & estadio == 4) {
			contador += 2;
		}

		switch (contador) {
		case 0, 1:
			System.out.println("Riesgo alto de supervivencia");
			break;
		case 2:
			System.out.println("Riesgo intermedio-alto de supervivencia");
			break;
		case 3:
			System.out.println("Riego intermedio-bajo de supervivencia");
			break;
		case 4, 5, 6, 7, 8: 
			System.out.println("Riesgo bajo de supervivencia");
			break;
		}
		System.out.println(contador);

	}
}
