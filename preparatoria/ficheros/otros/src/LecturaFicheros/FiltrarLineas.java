package LecturaFicheros;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FiltrarLineas {

    public static void main(String[] args) {
        String rutaArchivo = "C:\\Users\\analo\\Desktop\\archivos\\archivo1.txt";
        String prefijo = "h";
        boolean encontrado = false; // Flag to track if any line is found with the prefix
        try {
            FileReader lectorArchivo = new FileReader(rutaArchivo);
            BufferedReader bufferedReader = new BufferedReader(lectorArchivo);

            String linea;
            while ((linea = bufferedReader.readLine()) != null) {
                if (linea.startsWith(prefijo)) {
                    System.out.println(linea); // Mostrar solo las líneas que comienzan con el prefijo
                    encontrado = true; // Set the flag to true if at least one line is found
                }
            }

            bufferedReader.close();
            
            if (!encontrado) {
                System.out.println("No se ha encontrado ninguna línea que empiece con '" + prefijo + "'.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
