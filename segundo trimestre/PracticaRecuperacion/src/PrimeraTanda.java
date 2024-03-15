import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class PrimeraTanda {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("¿Cuántos números deseas introducir?");
		int numIntroducidos = scanner.nextInt();
		scanner.nextLine();

		Random numeroRandom = new Random();
		int arrayNumeros[] = new int[numIntroducidos];

		for (int i = 0; i < arrayNumeros.length; i++) {
			int numAleatorio = numeroRandom.nextInt(100);
			arrayNumeros[i] = numAleatorio;
		}

		for (int i = 0; i < arrayNumeros.length; i++) {
			System.out.println("Introduciendo número " + arrayNumeros[i] + " en la posición " + i);

		}

		int opcion;
		do {
			System.out.println("Elige una opción:");
			System.out.println("1. Recorrer el array y mostrar sus valores en la consola");
			System.out.println("2. Sumar los elementos del array");
			System.out.println("3. Encontrar el máximo");
			System.out.println("4. Calcular la media");
			System.out.println("5. Buscar un elemento");
			System.out.println("6. Contar ocurrencias de un elemento");
			System.out.println("7. Invertir el array (y luego imprimirlo)");
			System.out.println(
					"8. Pedir el mismo número de elementos que el anterior elegido para crear otro array y luego compararlos");
			System.out.println("9. Ordenar el array");
			System.out.println(
					"10. Unir dos arrays (para ello el programa tiene que pedir números para crear otro array)");
			System.out.println("11. Salir");

			opcion = scanner.nextInt();
			scanner.nextLine();

			switch (opcion) {
			case 1:
				for (int num : arrayNumeros) {
					System.out.print(num + " ");
				}
				System.out.println();
				break;
			case 2:
				int suma = 0;
				for (int numeros : arrayNumeros) {
					suma += numeros;
				}
				System.out.println("La suma del array es " + suma);
				break;
			case 3:
				int maximo = 0;
				for (int numero : arrayNumeros) {
					if (numero > maximo) {
						maximo = numero;
					}
					System.out.println("El máximo es " + maximo);
				}
				break;
			case 4:
			    int sum = 0;
			    for (int num : arrayNumeros) {
			        sum += num;
			    }
			    double average = (double) sum / arrayNumeros.length;
			    System.out.println("La media es: " + average);
			    break;

			case 5:
//				int numBuscar = 0;
//				for (int numero : arrayNumeros) {
//					if (numBuscar = numero) {
//						
//					}
//				}
				break;
			case 6:
				break;
			case 7:
				break;
			case 8:
				break;
			case 9:
				break;
			case 10:
				break;
			case 11:
				System.out.println("Saliendo del programa...");
				return;
			default:
				System.out.println("Introduce un numero comprendido entre el 1 y el 11");
			}

		} while (opcion != 11);

		scanner.close();

	}
}
