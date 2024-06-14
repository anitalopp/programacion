package JavaFaker;
import com.github.javafaker.Faker;
import java.util.Scanner;

public class Rellenar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Faker faker = new Faker();

        System.out.print("Ingrese el número de nombres que desea generar: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        String[] nombres = new String[n];

        for (int i = 0; i < n; i++) {
            nombres[i] = faker.name().fullName();
        }

        System.out.println("Nombres generados:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
}
