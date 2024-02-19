import java.util.Random;
import java.util.Scanner;

public class ConversionBinarioDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Se va a generar un array de números binarios \nEscribe la cantidad de números deseada");
        int cantidadNumeros = 0;
        while (cantidadNumeros <= 0) {
            cantidadNumeros = Integer.parseInt(sc.nextLine());
            if (cantidadNumeros <= 0) {
                System.err.println("Error. Número mayor que cero");
            }
        }

        String[] numerosBinarios = new String[cantidadNumeros];

        Random random = new Random();

        for (int i = 0; i < cantidadNumeros; i++) {
            int randomNumero = random.nextInt(256); 
            String binarioNumero = Integer.toBinaryString(randomNumero);
            numerosBinarios[i] = binarioNumero;
        }

        System.out.println("Array:");
        for (String numeroBinario : numerosBinarios) {
            System.out.println(numeroBinario);
        }
    }
}
