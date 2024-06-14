package LecturaFicheros;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class CopiarArchivo {

    public static void main(String[] args) {
    	String rutaArchivoO = "C:\\Users\\analo\\Desktop\\archivos\\archivo1.txt";
        String archivoDestino = "C:\\Users\\analo\\Desktop\\archivos\\archivo2.txt";
        try {
            FileReader lectorArchivo = new FileReader(rutaArchivoO);
            BufferedReader bufferedReader = new BufferedReader(lectorArchivo);

            FileWriter escritorArchivo = new FileWriter(archivoDestino);
            BufferedWriter bufferedWriter = new BufferedWriter(escritorArchivo);

            String linea;
            while ((linea = bufferedReader.readLine()) != null) {
                bufferedWriter.write(linea);
                bufferedWriter.newLine(); // Agrega un salto de línea después de cada línea
            }

            bufferedReader.close();
            bufferedWriter.close();
            System.out.println("Se ha copiado el contenido de " + rutaArchivoO + " a " + archivoDestino);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
