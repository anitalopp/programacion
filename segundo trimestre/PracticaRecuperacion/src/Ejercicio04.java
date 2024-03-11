import java.util.Scanner;

public class Ejercicio04 {
	public static void main(String args[]) {
		System.out.println("===EJERCICIO 4===");

		Scanner sc = new Scanner(System.in);

		System.out.println("Ingrese una cadena de texto: ");
		String cadena = sc.nextLine();

		int cantidadCaracteres = cadena.length();
		System.out.println("Hay " + cantidadCaracteres + " caracteres en esta cadena");

		int cantidadLetras = contarLetras(cadena);
		System.out.println("Hay " + cantidadLetras + " letras en esta cadena");

		int cantidadDigitos = contarDigitos(cadena);
		System.out.println("Hay " + cantidadDigitos + " dígitos en esta cadena");

		int cantidadEspacios = contarEspacios(cadena);
		System.out.println("Hay " + cantidadEspacios + " espacios en esta cadena");

		int cantidadSimbolos = contarSimbolos(cadena);
		System.out.println("Hay " + cantidadSimbolos + " símbolos en esta cadena");

		String cadenaMayusculas = mostrarMayusculas(cadena);
		System.out.println("La cadena " + cadena + " en mayúsculas sería: " + cadenaMayusculas);

		String cadenaMinusculas = mostrarMinusculas(cadena);
		System.out.println("La cadena " + cadena + " en minúsuclas sería: " + cadenaMinusculas);

		String reversa = mostrarEnReversa(cadena);
		System.out.println("La cadena en reversa sería: " + reversa);
	}

	private static int contarLetras(String cadena) {
		int cantidad = 0;
		for (int i = 0; i < cadena.length(); i++) {
			if (Character.isLetter(cadena.charAt(i))) {
				cantidad++;
			}
		}
		return cantidad;
	}

	private static int contarDigitos(String cadena) {
		int cantidad = 0;
		for (int i = 0; i < cadena.length(); i++) {
			if (Character.isDigit(cadena.charAt(i))) {
				cantidad++;
			}
		}
		return cantidad;
	}

	private static int contarEspacios(String cadena) {
		int cantidad = 0;
		for (int i = 0; i < cadena.length(); i++) {
			if (Character.isWhitespace(cadena.charAt(i))) {
				cantidad++;
			}
		}
		return cantidad;
	}

//	private static int contarEspacios(String cadena) {
//	int cantidad = 0;
//	for (int i = 0; i < cadena.length(); i++) {
//		if (cadena.charAt(i) == ' ') {
//
//		}
//	}
//	return cantidad;
//
//}

	private static int contarSimbolos(String cadena) {
		int cantidad = 0;
		for (int i = 0; i < cadena.length(); i++) {
			char caracter = cadena.charAt(i);
			if (!Character.isLetterOrDigit(caracter) && !Character.isWhitespace(caracter)) {
				cantidad++;
			}
		}
		return cantidad;
	}

	private static String mostrarMayusculas(String cadena) {
		StringBuilder mayusculas = new StringBuilder();
		for (int i = 0; i < cadena.length(); i++) {
			char caracter = cadena.charAt(i);
			if (Character.isLowerCase(caracter)) {
				mayusculas.append(Character.toUpperCase(caracter));
			} else {
				mayusculas.append(caracter);
			}
		}
		return mayusculas.toString();
	}

	private static String mostrarMinusculas(String cadena) {
		StringBuilder minusculas = new StringBuilder();

		for (int i = 0; i < cadena.length(); i++) {
			char caracter = cadena.charAt(i);
			if (Character.isUpperCase(caracter)) { // Verificar si el carácter es mayúscula
				minusculas.append(Character.toLowerCase(caracter)); // Convertir mayúscula a minúscula
				return minusculas.toString(); // Devolver la cadena construida y terminar la función
			} else {
				minusculas.append(caracter); // Mantener el carácter si no es mayúscula
			}
		}
		return minusculas.toString();
	}

	private static String mostrarEnReversa(String cadena) {
		StringBuilder reversa = new StringBuilder();
		for (int i = cadena.length() - 1; i >= 0; i--) {
			reversa.append(cadena.charAt(i));
		}
		return reversa.toString();
	}

}
