package LecturaFicheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LectorArchivos {
	private String fileName;

	public LectorArchivos(String fileName) {
		this.fileName = fileName;
	}

	// Método para leer el contenido completo del archivo y devolverlo como una
	// cadena
	public String readFullFile() throws IOException {
		StringBuilder content = new StringBuilder();
		try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
			String line;
			while ((line = reader.readLine()) != null) {
				content.append(line).append("\n");
			}
		}
		return content.toString();
	}
}
