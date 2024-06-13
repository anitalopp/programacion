package Contadores;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ContadorNumeros {
    private String filePath;

    public ContadorNumeros(String filePath) {
        this.filePath = filePath;
    }

    public int contarNumeros() {
        int count = 0;
        try {
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                if (scanner.hasNextInt() || scanner.hasNextDouble()) {
                    scanner.next();
                    count++;
                } else {
                    scanner.next();
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.err.println("Archivo no encontrado en la ruta especificada.");
            e.printStackTrace();
        }
        return count;
    }
}
