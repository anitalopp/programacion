import java.util.Random;
import java.util.Scanner;
import com.github.javafaker.Faker;

public class Ejercicio02 {

	public static void main(String args[]) {
		System.out.println("================");
		System.out.println("==EJERCICIO 02==");
		System.out.println("================");

		Scanner sc = new Scanner(System.in);
		System.out.println("Dígame un número: ");

		int numero = sc.nextInt();
		sc.nextLine();

		Faker fk = new Faker();
		String[] arrayNombres = new String[numero];

		for (int i = 0; i < numero; i++) {
			arrayNombres[i] = fk.name().firstName();
		}

		Random r = new Random();
		int nRandom;

		do {
			nRandom = r.nextInt(numero);

			if (!arrayNombres[nRandom].equals("X")) {
				System.out.println("Se ha dado a " + arrayNombres[nRandom]);
				arrayNombres[nRandom] = "X";
			} else {
				System.out.println("Se ha errado el tiro");
			}

			numero--;

		} while (numero > 0);
		System.out.println("Dígame un número");

		numero = sc.nextInt();
		sc.nextLine();

		String[][] arrayCuadrado = new String[numero][numero];
		int sumaTotal = 0;
		int numTemp;
		for (int i = 0; i < arrayCuadrado.length; i++) {
			for (int j = 0; j < arrayCuadrado[i].length; j++) {
				if (r.nextBoolean()) {
					arrayCuadrado[i][j] = "X";
				} else {
					numTemp = r.nextInt(numero);
					sumaTotal += numTemp;
					arrayCuadrado[i][j] = Integer.toString(r.nextInt(numero));
				}
			}
		}
		
		for (int i = 0; i < arrayCuadrado.length; i++) {
			for (int j = 0; j < arrayCuadrado[i].length; j++) {
				System.out.println(arrayCuadrado[i][j]);
			}
			System.out.println();
		}
		System.out.println("La suma es " + sumaTotal);
	}
}