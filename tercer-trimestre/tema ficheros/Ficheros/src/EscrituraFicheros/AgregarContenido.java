package EscrituraFicheros;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class AgregarContenido {

    public static void main(String[] args) {
        String nombreArchivo = "archivo_existente.txt";
        String contenidoNuevo = "Este es el contenido que se agregará al final del archivo existente.";

        try {
            FileWriter escritorArchivo = new FileWriter(nombreArchivo, true); // El segundo parámetro true indica que se agregará al final del archivo
            BufferedWriter bufferedWriter = new BufferedWriter(escritorArchivo);

            bufferedWriter.write(contenidoNuevo);
            bufferedWriter.newLine(); // Agrega un salto de línea después del contenido nuevo

            bufferedWriter.close();
            System.out.println("Se ha agregado correctamente el contenido al final del archivo existente.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
