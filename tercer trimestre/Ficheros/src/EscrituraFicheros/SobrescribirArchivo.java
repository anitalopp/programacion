package EscrituraFicheros;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class SobrescribirArchivo {

	public static void main(String[] args) {
		String nombreArchivo = "archivo_existente.txt";
		String contenidoNuevo = "Este es el nuevo contenido que reemplazará al contenido existente.";

		try {
			FileWriter escritorArchivo = new FileWriter(nombreArchivo); // No se especifica 'true' para sobrescribir el
																		// archivo
			BufferedWriter bufferedWriter = new BufferedWriter(escritorArchivo);

			bufferedWriter.write(contenidoNuevo);

			bufferedWriter.close();
			System.out.println("Se ha sobrescrito correctamente el archivo existente.");
		} catch (IOException e) {

		}
	}
}