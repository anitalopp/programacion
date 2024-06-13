package Contadores;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ContadorEspaciosBlanco {
    private String filePath;

    public ContadorEspaciosBlanco(String filePath) {
        this.filePath = filePath;
    }

    public int contarEspaciosEnBlanco() {
        int count = 0;
        try {
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                for (int i = 0; i < line.length(); i++) {
                    if (Character.isWhitespace(line.charAt(i))) {
                        count++;
                    }
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
