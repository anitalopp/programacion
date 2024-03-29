package com.ana.array.utils;

import java.util.Arrays;
import java.util.Random;
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

//1
	public static int sumarArray(int[][] arrayBidimensional) {
		int suma = 0;
		for (int i = 0; i < arrayBidimensional.length; i++) { //recorre las filas de la matriz
			for (int j = 0; j < arrayBidimensional[i].length; j++) { //recorre las matrices de la matriz
				suma += arrayBidimensional[i][j];
			}
		}

		System.out.println("La suma de los elementos es: " + suma);

		return suma;
	}

//2
	public static int obtenerMayor(int[][] array) {
		int mayor = array[0][0];
		for (int[] fila : array) {
			for (int elemento : fila) {  
				if (elemento > mayor) { //compara el elemento actual con el valor almacenado en 'mayor'.
					mayor = elemento; //si el elemento es mayor y se actualiza
				}
			}
		}
		System.out.println("El número mayor es: " + mayor);
		return mayor; //devuelve el mayor
	}

//3
	public static void diagonalPrincipal(int[][] arrayBidimensional) {
		System.out.println("Diagonal Principal:");
		for (int i = 0; i < arrayBidimensional.length; i++) { 
			System.out.print(arrayBidimensional[i][i] + " ");
		}
		System.out.println();
	}

//4
	public static void diagonalSecundaria(int[][] arrayBidimensional) {
		System.out.println("Diagonal Secundaria:");
		for (int i = 0; i < arrayBidimensional.length; i++) { //recorre cada fila de la matriz
			System.out.print(arrayBidimensional[i][arrayBidimensional.length - 1 - i] + " ");
		}
		System.out.println();
	}

//5
	public static void matrizTranspuesta(int[][] arrayBidimensional) {
		for (int i = 0; i < arrayBidimensional[0].length; i++) {
			for (int j = 0; j < arrayBidimensional.length; j++) {
				System.out.print(arrayBidimensional[j][i] + " ");
			}
			System.out.println();
		}
	}

//6
	public static double calcularMedia(int[][] arrayBidimensional) {
		int total = arrayBidimensional.length * arrayBidimensional[0].length;
		int suma = 0;

		for (int[] fila : arrayBidimensional) {
			for (int elemento : fila) {
				suma += elemento;
			}
		}
		return (double) suma / total;
	}

//7
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

		System.out.println("Números pares: " + pares);
		System.out.println("Impares: " + impares);
	}

//8
	public static void mostrarBorde(int[][] arrayBidimensional) {
		System.out.println("Borde de la matriz:");
		for (int i = 0; i < arrayBidimensional.length; i++) { //recorre cada fila de la matriz
			for (int j = 0; j < arrayBidimensional[0].length; j++) { //bucle para recorrer cada columna
				if (i == 0 || i == arrayBidimensional.length - 1 || j == 0 || j == arrayBidimensional[0].length - 1) { //verifica si está en el borde
					System.out.print(arrayBidimensional[i][j] + " "); //si está en el borde lo impre
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

//9
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

//10
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

//11
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

//12
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

//13
	public static int buscarNumero(int[][] arrayBidimensional, Scanner scanner) {
        boolean encontrado = false;
        
        System.out.println("Ingrese el número a buscar");
        int numeroBuscado = scanner.nextInt();
        
        for (int i = 0; i < arrayBidimensional.length; i++) {
        	for (int j = 0; j < arrayBidimensional.length; j++) {
				if (arrayBidimensional[i][j] == numeroBuscado) {
					encontrado = true;
					System.out.println("Número encontrado en la posición [" + i + "] [" + j + "]" );
				}
			}
        }
        if (!encontrado) {
        	System.out.println("Número no encontrado en el array");
        }
        return numeroBuscado;
    }

//14
	public static void intercambiarFilas(int[][] arrayBidimensional) {
		int[] temp = arrayBidimensional[0];
		arrayBidimensional[0] = arrayBidimensional[arrayBidimensional.length - 1];
		arrayBidimensional[arrayBidimensional.length - 1] = temp;
		System.out.println("Elementos de la primera fila intercambiados con la última.");
	}

//15
	public static int[] crearArrayConsecutivos() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese la longitud del array:");
		int longitud = scanner.nextInt();
		int[] arrayConsecutivos = new int[longitud];

		for (int i = 0; i < longitud; i++) {
			arrayConsecutivos[i] = i + 1;
		}
		System.out.println("Array con números consecutivos:");
		for (int i = 0; i < arrayConsecutivos.length; i++) {
			System.out.println(arrayConsecutivos[i]);
		}
		return arrayConsecutivos;
	}

//16
	public static int[] crearArrayCerosUnos(int filas, int columnas) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese la longitud del array:");
		int longitud = scanner.nextInt();
		int[] arrayCerosUnos = new int[longitud];

		for (int i = 0; i < longitud; i++) {
			arrayCerosUnos[i] = i % 2;
		}
		System.out.println("Array con números consecutivos:");
		for (int i = 0; i < arrayCerosUnos.length; i++) {
			System.out.println(arrayCerosUnos[i]);
		}
		return arrayCerosUnos;
	}


//17
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

//18
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


//Scanner scanner = new Scanner(System.in);
//System.out.println("Ingrese el número de filas:");
//int numFilas = scanner.nextInt();
//System.out.println("Ingrese el número de columnas:");
//int numColumnas = scanner.nextInt();
//
//Random numeroRandom = new Random();
//int nyumeros;
//int[][] arrayBidimensional = ArrayUtils.crearArrayBidimensional(numFilas, numColumnas);
//ArrayUtils.imprimirArray(arrayBidimensional);
//int opcion;
//do {