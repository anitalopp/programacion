package JavaFaker;
import com.github.javafaker.Faker;
import java.util.Scanner;

public class RandomWordArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Faker faker = new Faker();

        // Pedir al usuario el número n
        System.out.print("Ingrese el número n de palabras o frases que desea generar: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        // Pedir al usuario la temática
        System.out.println("Elija una temática para generar las palabras o frases:");
        System.out.println("1. Nombres de personas");
        System.out.println("2. Frases aleatorias");
        System.out.println("3. Nombres de ciudades");
        System.out.print("Ingrese el número correspondiente a la temática: ");
        int tematica = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        // Crear array de una dimensión de tamaño n
        String[] palabras = new String[n];

        // Generar palabras o frases aleatorias según la temática
        switch (tematica) {
            case 1:
                for (int i = 0; i < n; i++) {
                    palabras[i] = faker.name().fullName();
                }
                break;
            case 2:
                for (int i = 0; i < n; i++) {
                    palabras[i] = faker.lorem().sentence();
                }
                break;
            case 3:
                for (int i = 0; i < n; i++) {
                    palabras[i] = faker.address().city();
                }
                break;
            default:
                System.out.println("Opción de temática no válida.");
                return;
        }

        // Imprimir el array por pantalla
        System.out.println("\nPalabras o frases generadas:");
        for (String palabra : palabras) {
            System.out.println(palabra);
        }

        // Pedir una palabra al usuario
        System.out.print("\nIngrese una palabra para buscar en el array: ");
        String palabraBuscada = scanner.nextLine();

        // Buscar la palabra en el array
        boolean encontrado = false;
        for (String palabra : palabras) {
            if (palabra.equals(palabraBuscada)) {
                encontrado = true;
                break;
            }
        }

        // Mostrar el resultado de la búsqueda
        if (encontrado) {
            System.out.println("La palabra se encuentra en el array.");
        } else {
            System.out.println("La palabra no se encuentra en el array.");
        }
    }
}
