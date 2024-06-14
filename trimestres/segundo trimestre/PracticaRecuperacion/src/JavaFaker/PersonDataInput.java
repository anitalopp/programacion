package JavaFaker;
import java.util.Scanner;

public class PersonDataInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de personas: ");
        int numPersonas = Integer.parseInt(scanner.nextLine());

        String[] nombres = new String[numPersonas];
        int[] edades = new int[numPersonas];

        // Solicitar al usuario que ingrese los datos de cada persona
        for (int i = 0; i < numPersonas; i++) {
            System.out.println("\nDatos de la persona " + (i + 1) + ":");
            System.out.print("Nombre: ");
            nombres[i] = scanner.nextLine();
            System.out.print("Edad: ");
            edades[i] = Integer.parseInt(scanner.nextLine());
        }

        // Mostrar los datos ingresados por el usuario
        System.out.println("\nDatos ingresados:");
        for (int i = 0; i < numPersonas; i++) {
            System.out.println("Persona " + (i + 1) + ": Nombre - " + nombres[i] + ", Edad - " + edades[i]);
        }
    }
}


import com.github.javafaker.Faker;
import java.util.Scanner;

public class PersonDataInputWithFaker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Faker faker = new Faker();

        System.out.print("Ingrese el número de personas: ");
        int numPersonas = Integer.parseInt(scanner.nextLine());

        String[] nombres = new String[numPersonas];
        int[] edades = new int[numPersonas];

        // Generar nombres aleatorios y edades ficticias para cada persona
        for (int i = 0; i < numPersonas; i++) {
            nombres[i] = faker.name().fullName();
            edades[i] = faker.number().numberBetween(18, 80); // Edades entre 18 y 80 años
        }

        // Mostrar los datos generados por JavaFaker
        System.out.println("\nDatos generados por JavaFaker:");
        for (int i = 0; i < numPersonas; i++) {
            System.out.println("Persona " + (i + 1) + ": Nombre - " + nombres[i] + ", Edad - " + edades[i]);
        }
    }
}
