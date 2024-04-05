import java.io.*;

/*
 * Enunciado: Escribe un programa en Java que tome dos 
 * ficheros de texto como entrada y los concatene en un 
 * tercer fichero de texto. El programa debe asegurarse 
 * de manejar adecuadamente los casos en los que los 
 * ficheros de entrada no existan.
 */

public class ConcatenacionFicherosTexto {
	
	public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Uso: java ConcatenarFicheros <fichero1> <fichero2> <fichero_salida>");
            return;
        }

        String fichero1 = args[0];
        String fichero2 = args[1];
        String ficheroSalida = args[2];

        try (BufferedReader br1 = new BufferedReader(new FileReader(fichero1));
             BufferedReader br2 = new BufferedReader(new FileReader(fichero2));
             BufferedWriter bw = new BufferedWriter(new FileWriter(ficheroSalida))) {

            String linea;
            while ((linea = br1.readLine()) != null) {
                bw.write(linea);
                bw.newLine();
            }

            while ((linea = br2.readLine()) != null) {
                bw.write(linea);
                bw.newLine();
            }

            System.out.println("Ficheros concatenados con éxito.");
        } catch (IOException e) {
            System.out.println("Error al leer/escribir los ficheros.");
            e.printStackTrace();
        }
    }

}
