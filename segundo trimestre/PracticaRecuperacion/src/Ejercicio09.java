//Desarrolla un programa que solicite al usuario que ingrese diez números enteros. 
//El programa deberá almacenar estos números en un array y luego mostrar el 
//número mayor y el número menor de entre los ingresados.

import java.util.Scanner;

public class Ejercicio09 {

    public static void main(String[] args) {
        System.out.println("===EJERCICIO 9===");
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca diez números enteros:");
        int[] numeros = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        int numeroMayor = encontrarMaximo(numeros);
        System.out.println("La suma total de los números pares es: " + numeroMayor);

        int numeroMenor = encontrarMinimo(numeros);
        System.out.println("La suma total de los números impares es: " + numeroMenor);

        sc.close();
    }

    private static int encontrarMaximo(int[] numeros) {
		int maximo = numeros[0];
		for (int numero : numeros) {
			if (numero > maximo) {
				maximo = numero;
			}
		}
		return maximo;
	}

	private static int encontrarMinimo(int[] numeros) {
		int minimo = numeros[0];
		for (int numero : numeros) {
			if (numero < minimo) {
				minimo = numero;
			}
		}
		return minimo;
	}
}

