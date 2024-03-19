package EjerciciosVarios;

import java.io.*;

public class LeeMuestreModifique {
	public static void main(String[] args) {
		// Enunciado: Lectura y escritura básica de archivos
		String nombreArchivoLectura = "archivo_lectura.txt";
		String nombreArchivoEscritura = "archivo_escritura.txt";
		String textoAEscribir = "¡Hola desde el archivo de escritura!";

		// Lectura del archivo y escritura en consola
		try (BufferedReader lector = new BufferedReader(new FileReader(nombreArchivoLectura))) {
			String linea;
			while ((linea = lector.readLine()) != null) {
				System.out.println(linea);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Escritura en un nuevo archivo
		try (BufferedWriter escritor = new BufferedWriter(new FileWriter(nombreArchivoEscritura))) {
			escritor.write(textoAEscribir);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
