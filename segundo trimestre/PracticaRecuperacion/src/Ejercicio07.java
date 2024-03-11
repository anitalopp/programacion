//Escribe un programa que solicite al usuario que ingrese cuatro palabras. 
//El programa debe almacenar estas palabras en un array y 
//luego mostrarlas en mayúsculas.

import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
        System.out.println("===EJERCICIO 7===");
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca cuatro palabras");
        String[] palabras = new String[4];
        for (int i = 0; i < 4; i++) {
            System.out.print("Ingrese la palabra " + (i + 1) + ": ");
            palabras[i] = sc.nextLine();
        }

        String cadenaMayusculas = mostrarMayusculas(palabras);
        System.out.println("Las palabras en mayúsculas serían: " + cadenaMayusculas);

        sc.close();
    }

    private static String mostrarMayusculas(String[] palabras) {
        StringBuilder mayusculas = new StringBuilder();
        for (String palabra : palabras) {
            mayusculas.append(palabra.toUpperCase()).append(" ");
        }
        return mayusculas.toString().trim(); // trim() para eliminar el espacio extra al final
    }
}
