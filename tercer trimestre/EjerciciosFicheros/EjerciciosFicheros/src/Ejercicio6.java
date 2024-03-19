import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Ejercicio6 {
	
	public static void main(String[] args) {
        String archivoCSV = "archivo.csv"; // Nombre del archivo CSV

        try (BufferedReader br = new BufferedReader(new FileReader(archivoCSV))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] campos = linea.split(";");
                if (campos.length == 2) {
                    String nombrePersona = campos[0];
                    String urlRepo = campos[1];

                    // Crear carpeta para la persona
                    Path carpetaPersona = Paths.get(nombrePersona);
                    Files.createDirectories(carpetaPersona);

                    // Clonar el repositorio dentro de la carpeta de la persona
                    clonarRepositorio(urlRepo, carpetaPersona);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void clonarRepositorio(String urlRepo, Path carpetaPersona) {
        try {
            ProcessBuilder pb = new ProcessBuilder("git", "clone", urlRepo);
            pb.directory(carpetaPersona.toFile());
            Process p = pb.start();
            int exitCode = p.waitFor();
            if (exitCode == 0) {
                System.out.println("Repositorio clonado exitosamente en " + carpetaPersona.toString());
            } else {
                System.out.println("Error al clonar el repositorio.");
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

}
