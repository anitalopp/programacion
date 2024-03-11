//Escribe un programa que pida al usuario que ingrese un número entero positivo. Con ese número, crea una matriz cuadrada de tamaño n x n. 
//Luego, rellena la matriz con números aleatorios entre 1 y 100. 
//Imprime la matriz y encuentra el mayor número en la matriz y su posición (fila y columna).

import java.util.Random;
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese el tamaño de la tabla
        System.out.print("Ingrese el tamaño de la tabla cuadrada: ");
        int n = scanner.nextInt();

        // Crear el array cuadrado de tamaño n x n
        char[][] tabla = new char[n][n];

        // Rellenar la tabla de forma aleatoria
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (random.nextBoolean()) {
                    // Llenar con un número aleatorio entre 0 y n
                    tabla[i][j] = (char) (random.nextInt(n + 1) + '0');
                } else {
                    // Llenar con 'X'
                    tabla[i][j] = 'X';
                }
            }
        }

        // Imprimir la tabla
        System.out.println("Tabla generada:");
        imprimirTabla(tabla);

        // Calcular la suma de todas las casillas
        int sumaCasillas = calcularSumaCasillas(tabla);
        System.out.println("La suma de todas las casillas es: " + sumaCasillas);

        scanner.close();
    }

    // Método para imprimir la tabla
    private static void imprimirTabla(char[][] tabla) {
        for (char[] fila : tabla) {
            for (char celda : fila) {
                System.out.print(celda + " ");
            }
            System.out.println();
        }
    }

    // Método para calcular la suma de todas las casillas
    private static int calcularSumaCasillas(char[][] tabla) {
        int suma = 0;
        for (char[] fila : tabla) {
            for (char celda : fila) {
                if (Character.isDigit(celda)) {
                    suma += Character.getNumericValue(celda);
                }
            }
        }
        return suma;
    }
}
