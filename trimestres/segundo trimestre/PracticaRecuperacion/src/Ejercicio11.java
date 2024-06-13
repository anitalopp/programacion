//Escribe un programa que solicite al usuario que ingrese dos números enteros positivos, filas y columnas. 
//Luego, crea una matriz de tamaño filas x columnas y rellénala con números aleatorios entre 1 y 50. 
//Posteriormente, muestra la matriz y calcula la suma de todos los números pares presentes en la matriz.

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio11 {

	public static void main (String [] args) throws IOException {
		FileReader fr = null;
		BufferedReader br;
		try {
			fr = new FileReader("C:\\Users\\alumnofp\\eclipse-workspace\\Ficheros\\archivos");
			br = new BufferedReader(fr);
			//LEctura del fichero
			String linea;
			while ((linea = br.readLine()) != null)
				System.out.println(linea);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (fr != null) {
				fr.close();
			}
		}
		
	}
}
