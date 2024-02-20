package JavaFaker;

import com.github.javafaker.Faker;

public class Carmen {
	
	public static void main(String[] args) {
        Faker faker = new Faker();

        String[] nombresAleatorios = new String[10];

        for (int i = 0; i < nombresAleatorios.length; i++) {
            nombresAleatorios[i] = faker.name().fullName();
        }

        // Imprimir el array de nombres aleatorios
        for (String nombre : nombresAleatorios) {
            System.out.println(nombre);
        }
    }

}
