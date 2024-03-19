package EjerciciosVarios;

import java.io.*;
import java.util.*;

public class LeeCSVCalcula {
	public static void main(String[] args) {
		// Enunciado: Manipulación de datos estructurados
		String nombreArchivoCSV = "datos.csv";

		// Lectura de datos desde el archivo CSV
		List<String> lineas = new ArrayList<>();
		try (BufferedReader lector = new BufferedReader(new FileReader(nombreArchivoCSV))) {
			String linea;
			while ((linea = lector.readLine()) != null) {
				lineas.add(linea);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Cálculo de estadísticas sobre los datos
		// Aquí podrías realizar cualquier operación necesaria sobre los datos
		// estructurados
	}
}


//Lee datos estructurados desde un archivo 
//CSV y calcula algunas estadísticas sobre esos datos.