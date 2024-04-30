package EjerciciosVarios;

import java.io.*;

public class ManejoExcepciones {
	public static void main(String[] args) {
		// Enunciado: Manejo de excepciones
		String nombreArchivo = "archivo.txt";

		// Lectura del archivo con manejo de excepciones
		try (BufferedReader lector = new BufferedReader(new FileReader(nombreArchivo))) {
			String linea;
			while ((linea = lector.readLine()) != null) {
				System.out.println(linea);
			}
		} catch (FileNotFoundException e) {
			System.err.println("El archivo no se encuentra.");
		} catch (IOException e) {
			System.err.println("Ocurrió un error durante la lectura del archivo.");
		}
	}
}

//Escribe un programa que lea un archivo y maneje las excepciones 
//que puedan ocurrir durante la operación de lectura.