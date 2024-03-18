package LecturaFicheros;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class BuscarCadena {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombreArchivo = "C:\\Users\\analo\\Desktop\\archivos\\archivo1.txt";
        System.out.println("Dime la cadena que desees buscar");
        String cadenaBuscada = scanner.nextLine();
        try {
            FileReader lectorArchivo = new FileReader(nombreArchivo);
            BufferedReader bufferedReader = new BufferedReader(lectorArchivo);
            String linea;
            int contador = 0;
            while ((linea = bufferedReader.readLine()) != null) {
                if (linea.contains(cadenaBuscada)) {
                    contador++;
                }
            }
            bufferedReader.close(); // Close the FileReader object
            System.out.println("La cadena '" + cadenaBuscada + "' aparece " + contador + " veces en el archivo.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
