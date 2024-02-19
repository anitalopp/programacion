import java.util.Random;
import java.util.Arrays;

public class ConversorBinario  {
    public static void main(String[] args) {
        // Definir la cantidad de números binarios aleatorios que deseas generar
        int cantidadNumeros = 5;

        // Crear un array para almacenar los números binarios generados
        String[] numerosBinarios = new String[cantidadNumeros];

        // Generar números binarios aleatorios y almacenarlos en el array
        Random random = new Random();
        for (int i = 0; i < cantidadNumeros; i++) {
            StringBuilder numeroBinario = new StringBuilder();
            // Generar cada dígito del número binario
            for (int j = 0; j < 5; j++) { // Suponiendo que cada número binario tiene 5 dígitos
                int bit = random.nextInt(2); // Generar un bit aleatorio (0 o 1)
                numeroBinario.append(bit);
            }
            numerosBinarios[i] = numeroBinario.toString();
        }

        // Crear un nuevo array para almacenar los resultados en decimal
        int[] numerosDecimales = new int[cantidadNumeros];

        // Convertir cada número binario a decimal y almacenarlo en el nuevo array
        for (int i = 0; i < cantidadNumeros; i++) {
            numerosDecimales[i] = Integer.parseInt(numerosBinarios[i], 2);
        }

        // Imprimir los resultados
        System.out.println("Números binarios: " + Arrays.toString(numerosBinarios));
        System.out.println("Números decimales: " + Arrays.toString(numerosDecimales));
    }
}
