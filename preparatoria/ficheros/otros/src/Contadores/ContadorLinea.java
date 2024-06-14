package Contadores;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ContadorLinea {
    private String filePath;

    public ContadorLinea(String filePath) {
        this.filePath = filePath;
    }

    public int contarLineas() {
        int count = 0;
        try {
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                scanner.nextLine();
                count++;
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.err.println("Archivo no encontrado en la ruta especificada.");
            e.printStackTrace();
        }
        return count;
    }
}
