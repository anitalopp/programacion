package Contadores;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ContadorLetras {
    private String filePath;

    public ContadorLetras(String filePath) {
        this.filePath = filePath;
    }

    public int contarLetras() {
        int count = 0;
        try {
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                count += line.replaceAll("\\s", "").length();
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.err.println("Archivo no encontrado en la ruta especificada.");
            e.printStackTrace();
        }
        return count;
    }
}
