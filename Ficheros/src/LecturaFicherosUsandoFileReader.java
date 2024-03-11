import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LecturaFicherosUsandoFileReader {

    public static void main(String[] args) throws IOException {
        FileReader fr = null;
        BufferedReader br = null;
        try {
            fr = new FileReader("C:\\Users\\alumnofp\\eclipse-workspace\\Ficheros\\archivos\\filename.txt");
            br = new BufferedReader(fr);
            // Lectura del fichero
            String linea;
            while ((linea = br.readLine()) != null)
                System.out.println(linea);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fr != null)
                    fr.close();
                if (br != null)
                    br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
