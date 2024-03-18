import java.util.Random;
import java.util.Scanner;

public class BuscarTesoro {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		System.out.println("¡Bienvenido al juego de buscar el tesoro!");

		System.out.print("Ingrese el tamaño de la cuadrícula (n x n): ");
		int tamano = scanner.nextInt();

		char[][] cuadricula = generarCuadricula(tamano, random);
		imprimirCuadricula(cuadricula);

		boolean encontrado = false;
		while (!encontrado) {
			System.out.print("Ingrese la fila donde cree que está el tesoro: ");
			int fila = scanner.nextInt();
			System.out.print("Ingrese la columna donde cree que está el tesoro: ");
			int columna = scanner.nextInt();

			if (fila < 1 || fila > tamano || columna < 1 || columna > tamano) {
				System.out.println("Coordenadas fuera de rango. Intente de nuevo.");
				continue;
			}

			if (cuadricula[fila - 1][columna - 1] == 'T') {
				System.out.println(
						"¡Felicidades! Ha encontrado el tesoro en la posición (" + fila + ", " + columna + ").");
				encontrado = true;
			} else {
				System.out.println("El tesoro no está en esa posición. Inténtelo de nuevo.");
			}
		}

		scanner.close();
	}

	public static char[][] generarCuadricula(int tamano, Random random) {
		char[][] cuadricula = new char[tamano][tamano];
		int tesoroFila = random.nextInt(tamano);
		int tesoroColumna = random.nextInt(tamano);

		for (int i = 0; i < tamano; i++) {
			for (int j = 0; j < tamano; j++) {
				if (i == tesoroFila && j == tesoroColumna) {
					cuadricula[i][j] = 'T';
				} else {
					cuadricula[i][j] = 'O';
				}
			}
		}

		return cuadricula;
	}

	public static void imprimirCuadricula(char[][] cuadricula) {
		for (int i = 0; i < cuadricula.length; i++) {
			for (int j = 0; j < cuadricula[i].length; j++) {
				System.out.print("| " + cuadricula[i][j] + " ");
			}
			System.out.println("|");
		}
	}
}
