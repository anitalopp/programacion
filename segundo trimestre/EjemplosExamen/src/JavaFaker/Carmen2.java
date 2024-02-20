package JavaFaker;

import com.github.javafaker.Faker;

public class Carmen2 {
	
	public static void main(String[] args) {
        Faker faker = new Faker();

        String[][] direccionesAleatorias = new String[3][2];

        for (int i = 0; i < direccionesAleatorias.length; i++) {
            direccionesAleatorias[i][0] = faker.address().streetAddress();
            direccionesAleatorias[i][1] = faker.address().city();
        }

        // Imprimir la matriz de direcciones aleatorias
        for (String[] direccion : direccionesAleatorias) {
            System.out.println("Dirección: " + direccion[0]);
            System.out.println("Ciudad: " + direccion[1]);
            System.out.println();
        }
    }

}
