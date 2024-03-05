//El programa solicitará al usuario un número entero positivo N. Luego, 
//solicitará al usuario N palabras. El programa deberá imprimir las palabras que 
//tienen una longitud mayor que 5 caracteres y contar 
//cuántas de las palabras introducidas empiezan con la letra 'a' o 'A'.

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String args[]) {
		System.out.println("===EJERCICIO 2===");
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca un número");
		int cantidadNumeros = sc.nextInt();
		sc.nextLine();

		int[] numeros = new int[cantidadNumeros];

		System.out.println("Ingrese " + cantidadNumeros + " numeros separados por espacios");

		String[] numerosStr = sc.nextLine().split(" ");

		// Convertir los números ingresados de String a int y guardarlos en el array
		for (int i = 0; i < cantidadNumeros; i++) {
			numeros[i] = Integer.parseInt(numerosStr[i]);
		}

		int suma = calcularSumaTotal(numeros);
		System.out.println("La suma total de los números es: " + suma);

		int maximo = encontrarMaximo(numeros);
		System.out.println("El número más alto es: " + maximo);

		int minimo = encontrarMinimo(numeros);
		System.out.println("El número más pequeño es: " + minimo);

		int pares = contarPares(numeros);
		System.out.println("Hay: " + pares + " números pares");
	
		int impares = contarImpares(numeros);
		System.out.println("Hay: " + impares + " números impares");
	}


	private static int calcularSumaTotal(int[] numeros) {
		int suma = 0;
		for (int numero : numeros) {
			suma += numero;
		}
		return suma;
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

}
