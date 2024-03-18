package LecturaFicheros;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ConvertirMinusculas {

    public static void main(String[] args) {
    	String rutaArchivo = "C:\\Users\\analo\\Desktop\\archivos\\archivo1.txt";
        try {
            FileReader lectorArchivo = new FileReader(rutaArchivo);
            BufferedReader bufferedReader = new BufferedReader(lectorArchivo);

            String linea;
            while ((linea = bufferedReader.readLine()) != null) {
                System.out.println(linea.toLowerCase()); // Convertir línea a minúsculas y mostrarla
            }

            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
