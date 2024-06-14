package JavaFaker;
import com.github.javafaker.Faker;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ComoExamen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Faker faker = new Faker();
        Random random = new Random();

        System.out.print("Ingrese el número de nombres que desea generar: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        ArrayList<String> nombres = new ArrayList<>();

        // Generar nombres aleatorios y agregarlos a la lista
        for (int i = 0; i < n; i++) {
            nombres.add(faker.name().fullName());
        }

        System.out.println("Nombres generados:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        // Continuar eliminando nombres aleatorios hasta que la lista esté vacía
        while (!nombres.isEmpty()) {
            int index = random.nextInt(nombres.size());
            String nombreAEliminar = nombres.remove(index);
            System.out.println("Nombre eliminado: " + nombreAEliminar);

            // Verificar si la lista está vacía después de eliminar un nombre
            if (nombres.isEmpty()) {
                System.out.println("¡Todos los nombres han sido eliminados!");
                break;
            } else {
                // Mostrar un nombre aleatorio restante
                System.out.println("Nombre aleatorio restante: " + nombres.get(random.nextInt(nombres.size())));
            }
        }

        // Informar cuando se intente eliminar de una lista vacía
        if (nombres.isEmpty()) {
            System.out.println("La lista está vacía, no se pueden eliminar más nombres.");
        }
    }
}
