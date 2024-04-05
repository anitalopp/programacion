package LecturaFicheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Buscador {
	private String fileName;

	public Buscador(String fileName) {
		this.fileName = fileName;
	}

	// Método para contar el número de ocurrencias de una cadena en el archivo
	public int countOccurrences(String searchString) throws IOException {
		int count = 0;
		try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
			String line;
			while ((line = reader.readLine()) != null) {
				if (line.contains(searchString)) {
					count++;
				}
			}
		}
		return count;
	}

	// Método para comprobar si el archivo contiene una cadena específica
	public boolean containsString(String searchString) throws IOException {
		try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
			String line;
			while ((line = reader.readLine()) != null) {
				if (line.contains(searchString)) {
					return true;
				}
			}
		}
		return false;
	}
}
