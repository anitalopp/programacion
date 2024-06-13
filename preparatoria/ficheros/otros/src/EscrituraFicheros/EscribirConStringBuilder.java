package EscrituraFicheros;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EscribirConStringBuilder {

    public static void main(String[] args) {
        String nombreArchivo = "archivo_salida.txt";
        StringBuilder contenido = new StringBuilder();
        contenido.append("Línea 1").append(System.lineSeparator());
        contenido.append("Línea 2").append(System.lineSeparator());
        contenido.append("Línea 3").append(System.lineSeparator());

        try {
            FileWriter escritorArchivo = new FileWriter(nombreArchivo);
            BufferedWriter bufferedWriter = new BufferedWriter(escritorArchivo);

            bufferedWriter.write(contenido.toString());

            bufferedWriter.close();
            System.out.println("Se ha escrito correctamente en el archivo.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
