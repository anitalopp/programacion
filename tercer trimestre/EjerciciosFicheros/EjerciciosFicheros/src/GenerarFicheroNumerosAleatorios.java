import java.io.*;
import java.util.Random;

/*
 * Escribe un programa en Java que genere un fichero de 
 * texto con una cantidad específica de números enteros 
 * aleatorios en un rango dado. El programa debe aceptar 
 * como entrada el nombre del fichero a generar, la cantidad 
 * de números a generar y el rango de valores permitidos.
 */

public class GenerarFicheroNumerosAleatorios {
	
	public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Uso: java GenerarNumerosAleatorios <fichero_salida> <cantidad> <rango>");
            return;
        }

        String ficheroSalida = args[0];
        int cantidad = Integer.parseInt(args[1]);
        int rango = Integer.parseInt(args[2]);

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ficheroSalida))) {
            Random random = new Random();
            for (int i = 0; i < cantidad; i++) {
                int numeroAleatorio = random.nextInt(rango);
                bw.write(Integer.toString(numeroAleatorio));
                bw.newLine();
            }
            System.out.println("Fichero de números aleatorios generado con éxito.");
        } catch (IOException e) {
            System.out.println("Error al escribir el fichero.");
            e.printStackTrace();
        }
    }

}
