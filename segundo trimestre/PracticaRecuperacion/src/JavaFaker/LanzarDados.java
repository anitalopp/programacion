package JavaFaker;
import com.github.javafaker.Faker;

public class LanzarDados {
    public static void main(String[] args) {
        Faker faker = new Faker();
        int numLanzamientos = 1000; // Cambiar al número deseado de lanzamientos
        int[] resultados = new int[6];

        // Simular lanzamientos de dados
        for (int i = 0; i < numLanzamientos; i++) {
            int resultado = faker.random().nextInt(1, 7); // Lanzamientos entre 1 y 6
            resultados[resultado - 1]++;
        }

        // Mostrar los resultados
        System.out.println("Resultados de los lanzamientos:");
        for (int i = 0; i < 6; i++) {
            System.out.println("Número " + (i + 1) + ": " + resultados[i]);
        }
    }
}
