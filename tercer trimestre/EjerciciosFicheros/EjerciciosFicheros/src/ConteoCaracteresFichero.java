import java.io.*;
import java.util.HashMap;
import java.util.Map;

/*
 * Desarrolla un programa en Java que lea un fichero de 
 * texto y cuente la cantidad de veces que aparece cada 
 * carácter. El programa debe imprimir el conteo de cada 
 * carácter encontrado en el fichero.
 */

public class ConteoCaracteresFichero {
	
	public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Uso: java ConteoCaracteres <fichero_entrada>");
            return;
        }

        String ficheroEntrada = args[0];

        try (BufferedReader br = new BufferedReader(new FileReader(ficheroEntrada))) {
            Map<Character, Integer> conteoCaracteres = new HashMap<>();
            int caracter;
            while ((caracter = br.read()) != -1) {
                char ch = (char) caracter;
                if (conteoCaracteres.containsKey(ch)) {
                    conteoCaracteres.put(ch, conteoCaracteres.get(ch) + 1);
                } else {
                    conteoCaracteres.put(ch, 1);
                }
            }

            System.out.println("Conteo de caracteres:");
            for (Map.Entry<Character, Integer> entry : conteoCaracteres.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        } catch (IOException e) {
            System.out.println("Error al leer el fichero.");
            e.printStackTrace();
        }
    }

}
