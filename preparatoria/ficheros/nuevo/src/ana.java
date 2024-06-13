import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ana {

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer entradas del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario la palabra a buscar
        System.out.print("Introduce la palabra a buscar: ");
        String palabraBuscada = scanner.nextLine();

        // Pedir al usuario la ruta del archivo
        System.out.print("Introduce la ruta del archivo: ");
        String rutaArchivo = scanner.nextLine();

        // Leer y buscar la palabra
        int contador = buscarPalabraEnFichero(rutaArchivo, palabraBuscada);

        // Mostrar el número total de apariciones
        System.out.println("La palabra '" + palabraBuscada + "' aparece " + contador + " veces en el archivo.");

        // Cerrar el scanner
        scanner.close();
    }

    public static int buscarPalabraEnFichero(String rutaArchivo, String palabraBuscada) {
        int contador = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            int numeroLinea = 0;

            while ((linea = br.readLine()) != null) {
                numeroLinea++;
                if (linea.contains(palabraBuscada)) {
                    System.out.println("Línea " + numeroLinea + ": " + linea);
                    contador++;
                }
            }
        } catch (IOException e) {
            System.out.println("Ocurrió un error al leer el archivo: " + e.getMessage());
        }

        return contador;
    }
}
