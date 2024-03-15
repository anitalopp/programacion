import java.util.Random;
import java.util.Scanner;

public class CuadradoDesdentado {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Por favor, introduzca un número entero");
		int numero = sc.nextInt();
		sc.nextLine();

		Random numeroRandom = new Random();
		int[][] arrayBidimensional = new int[numero][numero];
		String[][] arrayString = new String[numero][numero];

		for (int i = 0; i < arrayBidimensional.length; i++) {
			for (int j = 0; j < arrayBidimensional.length; j++) {
				if (numeroRandom.nextBoolean()) {
					arrayBidimensional[i][j] = numero;
				}

			}
		}

		for (int i = 0; i < arrayBidimensional.length; i++) {
			for (int j = 0; j < arrayBidimensional.length; j++) {
				System.out.print(arrayBidimensional[i][j]);
			}
			System.out.println();
		}

		for (int i = 0; i < arrayString.length; i++) {
			for (int j = 0; j < arrayString.length; j++) {
				if (numeroRandom.nextBoolean()) {
					arrayString[i][j] = i + "" + j;
				} else {
					arrayString[i][j] = "  ";
				}
			}
		}

		for (int i = 0; i < arrayString.length; i++) {
			for (int j = 0; j < arrayString.length; j++) {
				System.out.print(arrayString[i][j]);
			}
			System.out.println();
		}
	}

}