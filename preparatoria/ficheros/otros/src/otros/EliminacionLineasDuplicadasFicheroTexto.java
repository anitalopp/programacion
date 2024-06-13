import java.io.*;
import java.util.HashSet;
import java.util.Set;

/*
 * Desarrolla un programa en Java que lea un fichero de 
 * texto y elimine las líneas duplicadas, escribiendo el 
 * resultado en un nuevo fichero de texto.
 */

public class EliminacionLineasDuplicadasFicheroTexto {
	
	public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Uso: java EliminarDuplicados <fichero_entrada> <fichero_salida>");
            return;
        }

        String ficheroEntrada = args[0];
        String ficheroSalida = args[1];

        try (BufferedReader br = new BufferedReader(new FileReader(ficheroEntrada));
             BufferedWriter bw = new BufferedWriter(new FileWriter(ficheroSalida))) {

            Set<String> lineasUnicas = new HashSet<>();
            String linea;
            while ((linea = br.readLine()) != null) {
                lineasUnicas.add(linea);
            }

            for (String lineaUnica : lineasUnicas) {
                bw.write(lineaUnica);
                bw.newLine();
            }

            System.out.println("Líneas duplicadas eliminadas con éxito.");
        } catch (IOException e) {
            System.out.println("Error al leer/escribir los ficheros.");
            e.printStackTrace();
        }
    }

}
