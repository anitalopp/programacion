//Desarrolla un programa que solicite al usuario que ingrese cinco números enteros. 
//El programa deberá almacenar estos números en un array y luego mostrar la 
//suma de los números pares y la suma de los números impares por separado

import java.util.Scanner;

public class Ejercicio08 {

    public static void main(String[] args) {
        System.out.println("===EJERCICIO 8===");
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca cinco números enteros:");
        int[] numeros = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        int sumaPar = calcularSumaPar(numeros);
        System.out.println("La suma total de los números pares es: " + sumaPar);

        int sumaImpar = calcularSumaImpar(numeros);
        System.out.println("La suma total de los números impares es: " + sumaImpar);

        sc.close();
    }

    private static int calcularSumaPar(int[] numeros) {
        int suma = 0;
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                suma += numero;
            }
        }
        return suma;
    }

    private static int calcularSumaImpar(int[] numeros) {
        int suma = 0;
        for (int numero : numeros) {
            if (numero % 2 != 0) {
                suma += numero;
            }
        }
        return suma;
    }
}
