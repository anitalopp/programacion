package Contadores;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ContadorPalabras {
    private String filePath;

    public ContadorPalabras(String filePath) {
        this.filePath = filePath;
    }

    public int contarPalabras() {
        int count = 0;
        try {
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                scanner.next();
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
