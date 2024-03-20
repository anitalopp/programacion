import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import com.github.javafaker.Faker;

public class Main {

	public static void main(String args[]) {
		Ejercicio1();
		Ejercicio2(args);
		Ejercicio3(args);
	}

	public static int Ejercicio1() {
		System.out.println("===========================");
		System.out.println("======EJERCICIO 1==========");

		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduzca un número:");
		int numIntroducidos = scanner.nextInt();
		scanner.nextLine();

		Random numeroRandom = new Random();

		int arrayNumeros[] = new int[numIntroducidos];
		for (int i = 0; i < arrayNumeros.length; i++) {
			int numeroAleatorio = numeroRandom.nextInt(100);
			arrayNumeros[i] = numeroAleatorio;
		}
		System.out.println(Arrays.toString(arrayNumeros));

		int suma = calcularSumaTotal(arrayNumeros);
		System.out.println("La suma total de los números es: " + suma);

		int pares = contarPares(arrayNumeros);
		System.out.println("Hay " + pares + " números pares");

		int impares = contarImpares(arrayNumeros);
		System.out.println("Hay " + impares + " números impares");
		return impares;

	}

	private static int calcularSumaTotal(int[] numeros) {
		int suma = 0;
		for (int numero : numeros) {
			suma += numero;
		}
		return suma;
	}

	private static int contarPares(int[] numeros) {
		int pares = 0;
		for (int numero : numeros) {
			if (numero % 2 == 0)
				pares++;
		}
		return pares;

	}

	private static int contarImpares(int[] numeros) {
		int impares = 0;
		for (int numero : numeros) {
			if (numero % 2 != 0)
				impares++;
		}
		return impares;
	}

	public static void Ejercicio2(String args[]) {
		System.out.println("===========================");
		System.out.println("======EJERCICIO 2==========");

		Scanner sc = new Scanner(System.in);
		Faker faker = new Faker();

		System.out.println("Introduzca el número de nombres a generar: ");
		int n = sc.nextInt();
		sc.nextLine();

		String[] nombres = new String[n];

		for (int i = 0; i < n; i++) {
			nombres[i] = faker.name().fullName();
		}

		System.out.println("Nombres generados:");
		for (String nombre : nombres) {
			System.out.println(nombre);
		}

	}

	public static void Ejercicio3(String args[]) {
		System.out.println("===========================");
		System.out.println("======EJERCICIO 3==========");
		Scanner scanner = new Scanner(System.in);

		Random random = new Random();

		int[][] sala = new int[10][12];

		for (int fila = 0; fila < sala.length; fila++) {
			for (int asiento = 0; asiento < sala[fila].length; asiento++) {
				if (random.nextBoolean()) {
					sala[fila][asiento] = random.nextInt(10 + 1);
				} else {
					sala[fila][asiento] = -1;
				}
			}
		}
		int opcion;
		do {
			System.out.println("1. Mostrar asientos");
			System.out.println("2. Reservar asiento");
			System.out.println("3. Cancelar reserva");
			System.out.println("4. Estadísticas");
			System.out.println("5. Salir");
			System.out.print("Seleccione una opción: ");
			opcion = scanner.nextInt();
			scanner.nextLine();

			switch (opcion) {
			case 1:
				int contadorDisponibles = 0;
				int contadorReservadas = 0;
				for (int fila = 0; fila < sala.length; fila++) {
					for (int asiento = 0; asiento < sala.length; asiento++) {
						if (sala[fila][asiento] == -1) {
							System.out.print(" |D| ");
							contadorDisponibles++; 
						} else {
							System.out.print(" |R| ");
							contadorReservadas++;
						}
					}
					System.out.println();
				}
				break;
			case 2:
				System.out.println("Ingresela fila (1-10):");
				int fila = scanner.nextInt();
				System.out.println("Ingrese el asiento (1-12):");
				int asiento = scanner.nextInt();

				boolean reservado = true;
				if (reservado = true) {
					System.out.println("Asiento reservado exitosamente");
				} else {
					System.out.println("El asiento no ha podido ser reservado");
				}
				break;
			case 3:

				break;
			case 4:

				System.out.println("Asientos disponibles: ");
				System.out.println("Asientos reservados: ");
				break;
			case 5:
				System.out.println("Saliendo del programa...");
				return;
			default:
				System.out.println("Introduce un numero comprendido entre el 1 y el 5");
			}

		} while (opcion != 5);

		scanner.close();

	}

//		
//    
//        
//        boolean reservado = false;
//		while (!reservado) {
//			System.out.print("Ingrese la fila que quiere ser");
//			int fila = scanner.nextInt();
//			System.out.print("Ingrese la columna donde cree que está el tesoro: ");
//			int columna = scanner.nextInt();
//
//			if (fila < 1 || fila > tamano || columna < 1 || columna > tamano) {
//				System.out.println("Coordenadas fuera de rango. Intente de nuevo.");
//				continue;
//			}
//
//			if (cuadricula[fila - 1][columna - 1] == 'T') {
//				System.out.println(
//						"¡Felicidades! Ha encontrado el tesoro en la posición (" + fila + ", " + columna + ").");
//				reservado = true;
//			} else {
//				System.out.println("El tesoro no está en esa posición. Inténtelo de nuevo.");
//			}
//		}
//
//		scanner.close();
//	}
//        
//     
//	}
}
