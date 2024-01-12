package com.ana.array.utils;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayUtils {

	public static int[][] crearArrayBidimensional(int filas, int columnas) {
		int[][] arrayBidimensional = new int[filas][columnas];

		for (int i = 0; i < arrayBidimensional.length; i++) {
			for (int j = 0; j < arrayBidimensional[i].length; j++) {
				arrayBidimensional[i][j] = i * arrayBidimensional[i].length + j + 1;
			}
		}
		return arrayBidimensional;
	}

	public static void imprimirArray(int[][] arrayBidimensional) {
		System.out.println("Array Bidimensional:");

		for (int i = 0; i < arrayBidimensional.length; i++) {
			for (int j = 0; j < arrayBidimensional[i].length; j++) {
				System.out.print(arrayBidimensional[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static int sumarArray(int[][] arrayBidimensional) {
		int suma = 0;

		for (int i = 0; i < arrayBidimensional.length; i++) {
			for (int j = 0; j < arrayBidimensional[i].length; j++) {
				suma += arrayBidimensional[i][j];
			}
		}

		System.out.println("La suma de los elementos es: " + suma);

		return suma;
	}

	public static int obtenerMayor(int[][] array) {
		int mayor = array[0][0];
		for (int[] fila : array) {
			for (int elemento : fila) {
				if (elemento > mayor) {
					mayor = elemento;
				}
			}
			System.out.println("El número mayor es: " + mayor);
		}
		return mayor;
	}

	public static void diagonalPrincipal(int[][] arrayBidimensional) {
		System.out.println("Diagonal Principal:");
		for (int i = 0; i < arrayBidimensional.length; i++) {
			System.out.print(arrayBidimensional[i][i] + " ");
		}
		System.out.println();
	}

	public static void diagonalSecundaria(int[][] arrayBidimensional) {
		System.out.println("Diagonal Secundaria:");
		for (int i = 0; i < arrayBidimensional.length; i++) {
			System.out.print(arrayBidimensional[i][arrayBidimensional.length - 1 - i] + " ");
		}
		System.out.println();
	}

	public static void matrizTranspuesta(int[][] arrayBidimensional) {
		System.out.println("Matriz Transpuesta:");
		for (int i = 0; i < arrayBidimensional[0].length; i++) {
			for (int j = 0; j < arrayBidimensional.length; j++) {
				System.out.print(arrayBidimensional[j][i] + " ");
			}
			System.out.println();
		}
	}

	public static double calcularPromedio(int[][] arrayBidimensional) {
		int totalElementos = arrayBidimensional.length * arrayBidimensional[0].length;
		int suma = 0;

		for (int[] fila : arrayBidimensional) {
			for (int elemento : fila) {
				suma += elemento;
			}
		}

		return (double) suma / totalElementos;
	}

	public static void contarParesImpares(int[][] arrayBidimensional) {
		int pares = 0;
		int impares = 0;

		for (int[] fila : arrayBidimensional) {
			for (int elemento : fila) {
				if (elemento % 2 == 0) {
					pares++;
				} else {
					impares++;
				}
			}
		}

		System.out.println("Cantidad de números pares: " + pares);
		System.out.println("Cantidad de números impares: " + impares);
	}

	public static void mostrarBorde(int[][] arrayBidimensional) {
		System.out.println("Borde de la matriz:");
		for (int i = 0; i < arrayBidimensional.length; i++) {
			for (int j = 0; j < arrayBidimensional[0].length; j++) {
				if (i == 0 || i == arrayBidimensional.length - 1 || j == 0 || j == arrayBidimensional[0].length - 1) {
					System.out.print(arrayBidimensional[i][j] + " ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

	public static void sumaFila(int[][] arrayBidimensional) {
		System.out.println("Suma de cada fila:");
		for (int i = 0; i < arrayBidimensional.length; i++) {
			int sumaFila = 0;
			for (int j = 0; j < arrayBidimensional[0].length; j++) {
				sumaFila += arrayBidimensional[i][j];
			}
			System.out.println("Fila " + i + ": " + sumaFila);
		}
	}

	public static void sumaColumna(int[][] arrayBidimensional) {
		System.out.println("Suma de cada columna:");
		for (int i = 0; i < arrayBidimensional[0].length; i++) {
			int sumaColumna = 0;
			for (int j = 0; j < arrayBidimensional.length; j++) {
				sumaColumna += arrayBidimensional[j][i];
			}
			System.out.println("Columna " + i + ": " + sumaColumna);
		}
	}

	public static void pequeñoFila(int[][] arrayBidimensional) {
		System.out.println("Elemento más pequeño de cada fila:");
		for (int i = 0; i < arrayBidimensional.length; i++) {
			int minimo = arrayBidimensional[i][0];
			for (int j = 1; j < arrayBidimensional[0].length; j++) {
				if (arrayBidimensional[i][j] < minimo) {
					minimo = arrayBidimensional[i][j];
				}
			}
			System.out.println("Fila " + i + ": " + minimo);
		}
	}

	public static void sumarDiagonales(int[][] arrayBidimensional) {
		int sumaDiagonalPrincipal = 0;
		int sumaDiagonalSecundaria = 0;

		for (int i = 0; i < arrayBidimensional.length; i++) {
			sumaDiagonalPrincipal += arrayBidimensional[i][i];
			sumaDiagonalSecundaria += arrayBidimensional[i][arrayBidimensional.length - 1 - i];
		}

		System.out.println("Suma de la diagonal principal: " + sumaDiagonalPrincipal);
		System.out.println("Suma de la diagonal secundaria: " + sumaDiagonalSecundaria);
	}

	public static boolean buscarNumero(int[][] arrayBidimensional, int numeroBuscar) {
		for (int[] fila : arrayBidimensional) {
			for (int elemento : fila) {
				if (elemento == numeroBuscar) {
					return true;
				}
			}
		}
		return false;
	}

	public static void intercambiarFilas(int[][] arrayBidimensional) {
		int[] temp = arrayBidimensional[0];
		arrayBidimensional[0] = arrayBidimensional[arrayBidimensional.length - 1];
		arrayBidimensional[arrayBidimensional.length - 1] = temp;
		System.out.println("Elementos de la primera fila intercambiados con la última.");
	}

	public static int[] crearArrayConsecutivos() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingrese la longitud del array:");
		int longitud = scanner.nextInt();
		int[] arrayConsecutivos = new int[longitud];

		for (int i = 0; i < longitud; i++) {
			arrayConsecutivos[i] = i + 1;
		}

		return arrayConsecutivos;
	}

	public static int[] crearArrayCerosUnos(int filas, int columnas) {
		int[] arrayCerosUnos = new int[filas * columnas];

		for (int i = 0; i < arrayCerosUnos.length; i++) {
			arrayCerosUnos[i] = i % 2;
		}

		return arrayCerosUnos;
	}

	public static boolean comprobarSimetria(int[][] arrayBidimensional) {
		for (int i = 0; i < arrayBidimensional.length; i++) {
			for (int j = 0; j < i; j++) {
				if (arrayBidimensional[i][j] != arrayBidimensional[j][i]) {
					return false;
				}
			}
		}
		return true;
	}

	public static int[][] crearMatrizIdentidad(int filas, int columnas) {
		int[][] matrizIdentidad = new int[filas][columnas];

		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				matrizIdentidad[i][j] = (i == j) ? 1 : 0;
			}
		}

		return matrizIdentidad;
	}
}
//	public static int[][]: tipo de dato de retorno (números enteros)
//	int[][]: declara un array bidimensional de enteros
//	new int[filas][columnas]: nuevo array con número de filas y columnas
//	for (int i = 0; i < arrayBidimensional.length; i++): bucle externo sobre las filas
//				se inicializa a cero para acceder a las filas
//				la condición determina cuando se ejecutará el bucle: mientras que i sea menor a la longitud de filas
//				i++: incrementa la variable i despues de cada iteracion
//	for (int j = 0; j < arrayBidimensional[i].length; j++): bucle interno sobre las columnas sobre la fila i
//	arrayBidimensional[i][j] = i * arrayBidimensional[i].length + j + 1: asigna un valor a cada elemento utilizando la formula que genera valores crecientes en cada posicion
//				accede al elemento de la posición (i,j)
//				asigna un valor utilizando la fórmula
