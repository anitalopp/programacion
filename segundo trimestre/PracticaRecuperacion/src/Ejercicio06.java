//Escribe un programa que solicite al usuario que ingrese tres números enteros. 
//El programa debe almacenar estos números en un array y luego mostrarlos en orden 
//inverso al ingresado por el usuario. 
//Además, debe calcular y mostrar la suma de los tres números.

import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese tres números enteros
        int[] numeros = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Mostrar los números en orden inverso
        System.out.println("Los números en orden inverso son:");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }

        // Calcular y mostrar la suma de los tres números
        int suma = 0;
        for (int num : numeros) {
            suma += num;
        }
        System.out.println("La suma de los números es: " + suma);

        scanner.close();
    }
}
