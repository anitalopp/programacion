import java.io.FileWriter;
import java.io.IOException;

public class EscrituraFicherosUsandoFileWriter {
    public static void main(String args[]) {
        FileWriter miWriter = null;
        try {
            miWriter = new FileWriter("C:\\Users\\alumnofp\\eclipse-workspace\\Ficheros\\archivos\\output.txt", true);
            miWriter.write("Escritura en archivos");
            System.out.println("Se ha escrito en el fichero");
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error de entrada y salida");
            e.printStackTrace();
        } finally {
            try {
                if (miWriter != null)
                    miWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
