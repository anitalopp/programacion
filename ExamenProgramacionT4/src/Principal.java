import java.util.Random;
import java.util.Scanner;

import com.github.javafaker.Faker;

public class Principal {
	public static void main(String[] args) {
		System.out.println("===============");
		System.out.println("Ejercicio 3");
		System.out.println("===============");

		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		System.out.print("Dígame un número");
		int n = scanner.nextInt();

		String[][] tabla = new String[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {

				tabla[i][j] = String.valueOf(random.nextInt(n + 1));
			}
		}
		for (String[] fila : tabla) {
			for (String columna : fila) {
				System.out.print(columna + " ");
			}
			System.out.println();
		}

		System.out.println("===============");
		System.out.println("Ejercicio 2");
		System.out.println("===============");

		Faker faker = new Faker();

		Scanner sc = new Scanner(System.in);

		System.out.println("Dígame un número");
		int numero = sc.nextInt();
		sc.nextLine();
		String javafaker[] = new String[numero];
		for (int i = 0; i < numero; i++) {
			javafaker[i] = faker.gameOfThrones().character();
		}
		
}

}

