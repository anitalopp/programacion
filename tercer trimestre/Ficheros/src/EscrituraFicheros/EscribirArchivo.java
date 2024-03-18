package EscrituraFicheros;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EscribirArchivo {

    public static void main(String[] args) {
        String nombreArchivo = "archivo_salida.txt";
        String contenido = "Hola, este es un ejemplo de escritura en un archivo.";

        try {
            FileWriter escritorArchivo = new FileWriter(nombreArchivo);
            BufferedWriter bufferedWriter = new BufferedWriter(escritorArchivo);

            bufferedWriter.write(contenido);

            bufferedWriter.close();
            System.out.println("Se ha escrito correctamente en el archivo.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
