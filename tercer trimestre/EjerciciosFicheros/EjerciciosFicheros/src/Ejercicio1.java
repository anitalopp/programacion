import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio1 {

	public static void main(String[] args) {
		String rutaArchivo = "C:\\Users\\alumnofp\\eclipse-workspace\\EjerciciosFicheros\\ArchivoEjer1.txt";
		try {
			int contadorPalabras = contarPalabras(rutaArchivo);
			System.out.println("El número total de palabras en el archivo es: " + contadorPalabras);
		} catch (IOException e) {
			System.err.println("Error al leer el archivo: " + e.getMessage());
		}
	}

	private static int contarPalabras(String rutaArchivo) throws IOException {
		int contadorPalabras = 0;
		try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
			String linea;
			while ((linea = br.readLine()) != null) {
				String[] palabras = linea.split("[\\s]+");
				contadorPalabras += palabras.length;
			}
		}
		return contadorPalabras;
	}

}
