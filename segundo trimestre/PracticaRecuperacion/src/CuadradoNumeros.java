import java.util.Random;
import java.util.Scanner;

public class CuadradoNumeros {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, introduzca un número entero");
        int cantidadNumeros = sc.nextInt();

        Random numeroRandom = new Random();
        int[][] arrayBidimensional = new int[cantidadNumeros][cantidadNumeros];

        for (int i = 0; i < arrayBidimensional.length; i++) {
            for (int j = 0; j < arrayBidimensional[i].length; j++) {
                int numeros = numeroRandom.nextInt(100);
                arrayBidimensional[i][j] = numeros;
            }
        }

        System.out.println("Array generado:");
        for (int i = 0; i < arrayBidimensional.length; i++) {
            for (int j = 0; j < arrayBidimensional[i].length; j++) {
                System.out.print(arrayBidimensional[i][j] + " ");
            }
            System.out.println();
        }
    }
}
