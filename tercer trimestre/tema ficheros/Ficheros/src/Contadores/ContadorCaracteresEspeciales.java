package Contadores;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ContadorCaracteresEspeciales {
    private String filePath;

    public ContadorCaracteresEspeciales(String filePath) {
        this.filePath = filePath;
    }

    public int contarCaracteresEspeciales() {
        int count = 0;
        try {
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                for (int i = 0; i < line.length(); i++) {
                    char c = line.charAt(i);
                    if (!Character.isLetterOrDigit(c) && !Character.isWhitespace(c)) {
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
