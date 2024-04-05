package LecturaFicheros; // Declaración del paquete donde se encuentra la clase

import java.io.BufferedReader; // Importación de la clase BufferedReader para leer el archivo de texto línea por línea
import java.io.FileReader; // Importación de la clase FileReader para abrir el archivo de texto
import java.io.IOException; // Importación de la clase IOException para manejar excepciones de entrada/salida
import java.util.Scanner; // Importación de la clase Scanner para leer la entrada del usuario desde la consola

public class BuscarCadena { // Declaración de la clase BuscarCadena

    public static void main(String[] args) { // Método principal, punto de entrada del programa
        Scanner scanner = new Scanner(System.in); // Creación de un objeto Scanner para leer la entrada del usuario desde la consola
        String nombreArchivo = "C:\\Users\\analo\\Desktop\\archivos\\archivo1.txt"; // Ruta del archivo de texto que se va a leer
        System.out.println("Dime la cadena que desees buscar"); // Se muestra un mensaje solicitando al usuario que introduzca la cadena a buscar
        String cadenaBuscada = scanner.nextLine(); // Se lee la cadena ingresada por el usuario
        try { // Se inicia un bloque try-catch para manejar posibles excepciones de entrada/salida
            FileReader lectorArchivo = new FileReader(nombreArchivo); // Se crea un objeto FileReader para abrir el archivo de texto
            BufferedReader bufferedReader = new BufferedReader(lectorArchivo); // Se crea un objeto BufferedReader para leer el archivo de texto línea por línea
            String linea; // Variable para almacenar cada línea del archivo
            int contador = 0; // Variable para contar las ocurrencias de la cadena buscada
            while ((linea = bufferedReader.readLine()) != null) { // Se lee cada línea del archivo hasta que no queden más líneas (null)
                if (linea.contains(cadenaBuscada)) { // Si la línea contiene la cadena buscada
                    contador++; // Se incrementa el contador de ocurrencias
                }
            }
            bufferedReader.close(); // Se cierra el objeto BufferedReader para liberar recursos
            System.out.println("La cadena '" + cadenaBuscada + "' aparece " + contador + " veces en el archivo."); // Se muestra el resultado al usuario
        } catch (IOException e) { // Captura de excepciones de entrada/salida
            e.printStackTrace(); // Se imprime la traza de la excepción en la consola
        }
    }
}
