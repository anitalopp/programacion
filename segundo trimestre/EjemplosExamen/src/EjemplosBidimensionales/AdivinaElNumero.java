package EjemplosBidimensionales;

import java.util.Random;
import java.util.Scanner;

public class AdivinaElNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroAleatorio = random.nextInt(100) + 1; // Generar un número aleatorio entre 1 y 100
        int intentos = 0;

        System.out.println("¡Bienvenido al juego Adivina el Número!");
        System.out.println("Intenta adivinar el número secreto entre 1 y 100.");

        while (true) {
            System.out.print("Ingresa tu intento: ");
            int intento = scanner.nextInt();
            intentos++;

            if (intento < numeroAleatorio) {
                System.out.println("El número secreto es mayor.");
            } else if (intento > numeroAleatorio) {
                System.out.println("El número secreto es menor.");
            } else {
                System.out.println("¡Felicidades! ¡Has adivinado el número en " + intentos + " intentos!");
                break;
            }
        }

        scanner.close();
    }
}

