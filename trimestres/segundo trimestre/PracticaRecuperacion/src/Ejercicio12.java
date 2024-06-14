import java.util.Scanner;

public class Ejercicio12 {
    
    public static void main(String args[]) {
        System.out.println("====EJERCICIO 12===");

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la longitud del array");
        int tamaño = sc.nextInt();
        sc.nextLine();

        System.out.println("Introduce " + tamaño + " números");

        int[] array = new int[tamaño];

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        System.out.println("Los números ingresados son:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        
        // Llamada a la función encontrarMaximo fuera del bucle
        int maximo = encontrarMaximo(array);
        System.out.println("\nEl número más grande es " + maximo);
    }
    
    // Función para encontrar el número máximo en el array
    private static int encontrarMaximo(int[] array) {
        int maximo = array[0];
        for (int numero : array) {
            if (numero > maximo) {
                maximo = numero;
            }
        }
        return maximo;
    }
}
