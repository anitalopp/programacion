import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio5 {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del archivo de entrada:");
        String archivoEntrada = scanner.nextLine();

        System.out.println("Ingrese el nombre del archivo de salida:");
        String archivoSalida = scanner.nextLine();

        System.out.println("Elija el criterio de filtrado:");
        System.out.println("1. Contiene una palabra específica.");
        System.out.println("2. Tiene más de n caracteres.");
        System.out.println("3. Empieza por un patrón determinado.");
        int opcion = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer de entrada

        switch (opcion) {
            case 1:
                System.out.println("Ingrese la palabra específica a buscar:");
                String palabra = scanner.nextLine();
                filtrarPorPalabra(archivoEntrada, archivoSalida, palabra);
                break;
            case 2:
                System.out.println("Ingrese el número mínimo de caracteres:");
                int numCaracteres = scanner.nextInt();
                scanner.nextLine(); // Limpiar el buffer de entrada
                filtrarPorNumeroCaracteres(archivoEntrada, archivoSalida, numCaracteres);
                break;
            case 3:
                System.out.println("Ingrese el patrón inicial:");
                String patron = scanner.nextLine();
                filtrarPorPatronInicial(archivoEntrada, archivoSalida, patron);
                break;
            default:
                System.out.println("Opción inválida.");
        }

        scanner.close();
    }

    public static void filtrarPorPalabra(String archivoEntrada, String archivoSalida, String palabra) {
        try (BufferedReader reader = new BufferedReader(new FileReader(archivoEntrada));
             BufferedWriter writer = new BufferedWriter(new FileWriter(archivoSalida))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                if (linea.contains(palabra)) {
                    writer.write(linea);
                    writer.newLine();
                }
            }
            System.out.println("Filtrado completado.");
        } catch (IOException e) {
            System.out.println("Error al leer/escribir archivos.");
            e.printStackTrace();
        }
    }

    public static void filtrarPorNumeroCaracteres(String archivoEntrada, String archivoSalida, int numCaracteres) {
        try (BufferedReader reader = new BufferedReader(new FileReader(archivoEntrada));
             BufferedWriter writer = new BufferedWriter(new FileWriter(archivoSalida))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                if (linea.length() > numCaracteres) {
                    writer.write(linea);
                    writer.newLine();
                }
            }
            System.out.println("Filtrado completado.");
        } catch (IOException e) {
            System.out.println("Error al leer/escribir archivos.");
            e.printStackTrace();
        }
    }

    public static void filtrarPorPatronInicial(String archivoEntrada, String archivoSalida, String patron) {
        try (BufferedReader reader = new BufferedReader(new FileReader(archivoEntrada));
             BufferedWriter writer = new BufferedWriter(new FileWriter(archivoSalida))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                if (linea.startsWith(patron)) {
                    writer.write(linea);
                    writer.newLine();
                }
            }
            System.out.println("Filtrado completado.");
        } catch (IOException e) {
            System.out.println("Error al leer/escribir archivos.");
            e.printStackTrace();
        }
    }

}
