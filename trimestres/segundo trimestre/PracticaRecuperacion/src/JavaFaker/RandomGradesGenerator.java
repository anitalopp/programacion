package JavaFaker;
import com.github.javafaker.Faker;

public class RandomGradesGenerator {
    public static void main(String[] args) {
        Faker faker = new Faker();
        int numEstudiantes = 10; // Cambiar al número deseado de estudiantes
        double[] calificaciones = new double[numEstudiantes];

        // Generar calificaciones aleatorias
        for (int i = 0; i < numEstudiantes; i++) {
            calificaciones[i] = faker.number().randomDouble(2, 0, 100); // Calificaciones entre 0 y 100 con 2 decimales
        }

        // Calcular el promedio de las calificaciones
        double suma = 0;
        for (double calificacion : calificaciones) {
            suma += calificacion;
        }
        double promedio = suma / numEstudiantes;

        // Mostrar las calificaciones y el promedio
        System.out.println("Calificaciones:");
        for (int i = 0; i < numEstudiantes; i++) {
            System.out.println("Estudiante " + (i + 1) + ": " + calificaciones[i]);
        }
        System.out.println("Promedio de calificaciones: " + promedio);
    }
}
