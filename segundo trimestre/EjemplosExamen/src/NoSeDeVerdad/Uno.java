
//Claro, aquí tienes un ejemplo de problema relacionado con arrays en Java que podría aparecer en un examen:
//
//Problema: Encontrar el número mayor en un arreglo
//
//Escribe un programa en Java que encuentre el número mayor en un arreglo de enteros. El programa debe solicitar al usuario ingresar el tamaño del arreglo y luego los elementos del mismo. Luego, debe imprimir el número mayor encontrado en el arreglo.
//

import java.util.Scanner;

public class Uno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario ingresar el tamaño del arreglo
        System.out.print("Ingrese el tamaño del arreglo: ");
        int size = scanner.nextInt();

        // Crear un arreglo con el tamaño proporcionado
        int[] arr = new int[size];

        // Solicitar al usuario ingresar los elementos del arreglo
        System.out.println("Ingrese los elementos del arreglo:");
        for (int i = 0; i < size; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        // Encontrar el número mayor en el arreglo
        int max = arr[0];
        for (int i = 1; i < size; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Imprimir el número mayor encontrado
        System.out.println("El número mayor en el arreglo es: " + max);

        scanner.close();
    }
}