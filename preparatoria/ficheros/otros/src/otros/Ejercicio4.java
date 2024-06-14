import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio4 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingrese una palabra: ");
		String palabra = scanner.nextLine();
		System.out.print("Ingrese el nombre del fichero de texto:");
		String nombreFichero = scanner.nextLine();
		try {
		BufferedReader lector = new BufferedReader(new FileReader(nombreFichero));
		int conteo = 0;
		String linea;
		while ((linea = lector.readLine()) != null) {

		String[] palabras = linea.split("\\s+");
		for (String p : palabras) {
		if (p.equals(palabra)) {
		conteo++;
		}
		}
		}
		lector.close();
		System.out.println("La palabra '" + palabra + "' aparece " + conteo + " veces en el fichero.");
		} catch (IOException e) {
		System.err.println("Error al leer el fichero: " +
		e.getMessage());
		} catch (Exception e) {
		System.err.println("Error inesperado: " +
		e.getMessage());
		} finally {
		scanner.close();
		}
		}

}
