import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio3 {

	public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("<C:\\Users\\alumnofp\\eclipse-workspace\\EjerciciosFicheros\\ArchivoEjer1.txt> <C:\\Users\\alumnofp\\eclipse-workspace\\EjerciciosFicheros\\ArchivoEjer2.txt>");
            return;
        }

        String origen = args[0];
        String destino = args[1];

        try {
            BufferedReader br = new BufferedReader(new FileReader(origen));

            BufferedWriter bw = new BufferedWriter(new FileWriter(destino));

            String linea;

            while ((linea = br.readLine()) != null) {
                bw.write(linea);
                bw.newLine();
            }

            br.close();
            bw.close();

            System.out.println("El archivo se ha copiado exitosamente.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}


