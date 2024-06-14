import java.util.Random;
import java.util.Scanner;

public class Numero3Examen {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int tamano = sc.nextInt();
        sc.nextLine();

        Random random = new Random();

        int[][] array = new int[tamano][tamano];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (random.nextBoolean()) {
                    array[i][j] = random.nextInt(tamano + 1); 
                } else {
                    array[i][j] = -1; 
                }
            }
        }

        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < tamano; j++) {
                if (array[i][j] == -1) {
                    System.out.print("| X |" + "  ");
                } else {
                    System.out.print("|" + array[i][j] + "|" + "  ");
                }
            }
            System.out.println();
        }

        int suma = 0;
        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < tamano; j++) {
                if (array[i][j] != -1) {
                    suma += array[i][j];
                }
            }
        }

        System.out.println("La suma de los elementos es: " + suma);

        sc.close();
    }
}
