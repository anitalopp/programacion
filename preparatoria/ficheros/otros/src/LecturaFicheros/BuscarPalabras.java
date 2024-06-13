package LecturaFicheros;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class BuscarPalabras {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String nombreArchivo = "C:\\Users\\analo\\Desktop\\archivos\\archivo1.txt";
        System.out.println("Dime la palabra que desees buscar");
        String palabraBuscada = scanner.nextLine();
        try {
            FileReader lectorArchivo = new FileReader(nombreArchivo);
            BufferedReader bufferedReader = new BufferedReader(lectorArchivo);
            String linea;
            while ((linea = bufferedReader.readLine()) != null) {
                if (linea.contains(palabraBuscada)) {
                    System.out.println("La palabra '" + palabraBuscada + "' se encuentra en la línea: " + linea);
                }
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
