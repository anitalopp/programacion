import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio2 {

	public static void main(String[] args) {
		if (args.length < 1) {
			System.out.println("Por favor, proporciona al menos una cadena de texto como parámetro.");
			return;
		}
		String[] cadenas = args;

		String rutaArchivo = "C:\\Users\\alumnofp\\eclipse-workspace\\EjerciciosFicheros\\ArchivoEjer2.txt";
		try {
			if (preguntarSobrescribir()) {
				escribirEnArchivo(rutaArchivo, cadenas, false);
			} else {
				escribirEnArchivo(rutaArchivo, cadenas, true);
			}
			System.out.println("¡Operación completada con éxito!");
		} catch (IOException e) {
			System.err.println("Error al escribir en el archivo: " + e.getMessage());
		}
	}

	private static boolean preguntarSobrescribir() {
		System.out.println("¿Deseas sobrescribir el archivo existente? (Sí/No)");
		return System.console().readLine().equalsIgnoreCase("Sí");
	}

	private static void escribirEnArchivo(String rutaArchivo, String[] cadenas, boolean agregar) throws IOException {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(rutaArchivo, agregar))) {
			for (String cadena : cadenas) {
				bw.write(cadena);
				bw.newLine();
			}
		}
	}

}
