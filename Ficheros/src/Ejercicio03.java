import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio03 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Uso: java CopiarFichero <fichero_origen> <fichero_destino>");
            System.exit(1);
        }
        String nombreFicheroOrigen = args[0];
        String nombreFicheroDestino = args[1];
        try {
            BufferedReader lector = new BufferedReader(new FileReader(nombreFicheroOrigen));
            BufferedWriter escritor = new BufferedWriter(new FileWriter(nombreFicheroDestino));
            // Copiar contenido del fichero origen al fichero destino
            String linea;
            while ((linea = lector.readLine()) != null) {
                escritor.write(linea);
                escritor.newLine();
            }
            lector.close();
            escritor.close();
            System.out.println("¡Fichero copiado exitosamente!");
        } catch (IOException e) {
            System.err.println("Error al copiar el fichero: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Error inesperado: " + e.getMessage());
        }
    }
}
