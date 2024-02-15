package com.ana.principal;

import java.util.Random;
import java.util.Scanner;

import com.ana.array.utils.ArrayUtils;

public class PrincipalSegunda {

	public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese el número de filas:");
		int numFilas = scanner.nextInt();
		System.out.println("Ingrese el número de columnas:");
		int numColumnas = scanner.nextInt();
		
		Random numeroRandom = new Random();
		int numeros;
		
		int[][] arrayBidimensional = new int [numFilas][numColumnas];
		
		for (int i = 0; i < arrayBidimensional.length; i++) {
		    for (int j = 0; j < arrayBidimensional[i].length; j++) {
		        numeros = numeroRandom.nextInt(100);
		        arrayBidimensional[i][j] = numeros;
		    }
		}

		
		ArrayUtils.imprimirArray(arrayBidimensional);
		int opcion;
		do {

			System.out.println("Seleccione un ejercicio");
			System.out.println("1. Sumar todos los elementos.");
			System.out.println("2. Obtener el mayor número.");
			System.out.println("3. Mostrar la diagonal principal.");
			System.out.println("4. Mostrar la diagonal secundaria.");
			System.out.println("5. Crea su matriz transpuesta (intercambia filas por columnas).");
			System.out.println("6. Calcula el promedio de todos los elementos.");
			System.out.println("7. Contar pares e impares.");
			System.out.println("8. Mostrar borde de array.");
			System.out.println("9. Calcular la suma de cada fila.");
			System.out.println("10. Calcular la suma de cada columna.");
			System.out.println("11. Encontrar el elemento más pequeño de cada fila.");
			System.out.println("12. Suma ambas diagonales.");
			System.out.println("13. Buscar número");
			System.out.println("14.Intercambiar los elementos de la primera fila con los de la última");
			System.out.println("=== MISCELANEA ===");
			System.out.println("15. Crear un array y rellenarlo de números consecutivos");
			System.out
					.println("16. Crear un array y rellenarlo de ceros y unos en función de su posición (impar o par)");
			System.out.println("17. creación de una matriz 3x3 por el usuario y comprobación de si es simétrica.");
			System.out.println("18. Crear una matriz identidad de tamaño 4x4.");
			System.out.println("19. Salir");

			opcion = scanner.nextInt();
			scanner.nextLine();

			switch (opcion) {
			case 1:
                ArrayUtils.sumarArray(arrayBidimensional);
				break;
			case 2:
                ArrayUtils.obtenerMayor(arrayBidimensional);
                break;
			case 3:
                ArrayUtils.diagonalPrincipal(arrayBidimensional);
				System.out.println(); 
				break;
			case 4:
                ArrayUtils.diagonalSecundaria(arrayBidimensional);
				break;
			case 5:
                ArrayUtils.matrizTranspuesta(arrayBidimensional);
				break;
			case 6:
			    double media = ArrayUtils.calcularMedia(arrayBidimensional);
			    System.out.println("La media de los elementos del array es: " + media);
			    break;
			case 7:
                ArrayUtils.contarParesImpares(arrayBidimensional);
                break;
            case 8:
                ArrayUtils.mostrarBorde(arrayBidimensional);
                break;
            case 9:
                ArrayUtils.sumaFila(arrayBidimensional);
                break;
            case 10:
                ArrayUtils.sumaColumna(arrayBidimensional);
                break;
            case 11:
                ArrayUtils.pequeñoFila(arrayBidimensional);
                break;
            case 12:
                ArrayUtils.sumarDiagonales(arrayBidimensional);
                break;
            case 13:
                ArrayUtils.buscarNumero(arrayBidimensional, scanner);
                break;
            case 14:
                ArrayUtils.intercambiarFilas(arrayBidimensional);
                break;
            case 15:
                ArrayUtils.crearArrayConsecutivos();
                break;
            case 16:
                ArrayUtils.crearArrayCerosUnos(arrayBidimensional.length, arrayBidimensional[0].length);
                break;
            case 17:
                boolean esSimetrica = ArrayUtils.comprobarSimetria(arrayBidimensional);
                if (esSimetrica) {
                    System.out.println("La matriz es simétrica.");
                } else {
                    System.out.println("La matriz no es simétrica.");
                }
                break;
            case 18:
                ArrayUtils.crearMatrizIdentidad(arrayBidimensional.length, arrayBidimensional[0].length);
                System.out.println("Matriz identidad:");
                ArrayUtils.imprimirArray(arrayBidimensional);
                break;
			case 19:
				System.out.println("Salir");
				return;
			default:
				System.out.println("Error");
			}

		} while (opcion != 19);

	}
}
