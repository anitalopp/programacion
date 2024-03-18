package EscrituraFicheros;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EscribirVariasLineas {

    public static void main(String[] args) {
        String nombreArchivo = "archivo_salida.txt";
        String[] lineas = {
            "Primera línea",
            "Segunda línea",
            "Tercera línea"
        };

        try {
            FileWriter escritorArchivo = new FileWriter(nombreArchivo);
            BufferedWriter bufferedWriter = new BufferedWriter(escritorArchivo);

            for (String linea : lineas) {
                bufferedWriter.write(linea);
                bufferedWriter.newLine(); // Agrega un salto de línea después de cada línea
            }

            bufferedWriter.close();
            System.out.println("Se han escrito correctamente las líneas en el archivo.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
