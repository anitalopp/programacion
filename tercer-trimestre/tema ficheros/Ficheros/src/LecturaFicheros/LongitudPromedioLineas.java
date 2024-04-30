package LecturaFicheros;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LongitudPromedioLineas {

    public static void main(String[] args) {
    	String rutaArchivo = "C:\\Users\\analo\\Desktop\\archivos\\archivo1.txt";
        double sumaLongitudes = 0;
        int contador = 0;
        try {
            FileReader lectorArchivo = new FileReader(rutaArchivo);
            BufferedReader bufferedReader = new BufferedReader(lectorArchivo);
            String linea;
            while ((linea = bufferedReader.readLine()) != null) {
                sumaLongitudes += linea.length();
                contador++;
            }
            bufferedReader.close();
            double promedio = sumaLongitudes / contador;
            System.out.println("La longitud promedio de las líneas en el archivo es: " + promedio);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
