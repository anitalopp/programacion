import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario el tamaño del array
        System.out.print("Introduce el tamaño del array: ");
        int tamaño = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        // Crear el array con el tamaño especificado
        char[] array = new char[tamaño];

        // Pedir al usuario que ingrese números del 0 al 9 o letras minúsculas
        for (int i = 0; i < tamaño; i++) {
            System.out.print("Introduce un número del 0 al 9 o una letra minúscula: ");
            String input = scanner.nextLine();

            // Verificar si la entrada es un número o una letra
            if (input.length() == 1) {
                char caracter = input.charAt(0);
                if (Character.isDigit(caracter) || (caracter >= 'a' && caracter <= 'z')) {
                    array[i] = caracter;
                } else {
                    System.out.println("Entrada inválida. Debe ser un número del 0 al 9 o una letra minúscula.");
                    i--; // Reintentar en la misma posición
                }
            } else {
                System.out.println("Entrada inválida. Debe ser un único carácter.");
                i--; // Reintentar en la misma posición
            }
        }

        // Calcular la suma de los números y encontrar la palabra
        int sumaNumeros = 0;
        StringBuilder palabra = new StringBuilder();
        for (char c : array) {
            if (Character.isDigit(c)) {
                sumaNumeros += Character.getNumericValue(c);
            } else {
                palabra.append(c);
            }
        }

        // Mostrar la suma de los números y la palabra encontrada
        System.out.println("La suma de los números es: " + sumaNumeros);
        System.out.println("La palabra encontrada es: " + palabra.toString());

        scanner.close();
    }
}
