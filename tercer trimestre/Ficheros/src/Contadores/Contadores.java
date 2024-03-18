package Contadores;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Contadores {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario la ruta del archivo de texto
        System.out.print("Introduce la ruta del archivo de texto: ");
        String filePath = scanner.nextLine();

        // Contar las palabras en el archivo
        int contadorPalabras = contarPalabras(filePath);
        // Contar las letras en el archivo
        int contadorLetras = contarLetras(filePath);
        // Contar los caracteres especiales en el archivo
        int contadorCaracteresEspeciales = contarCaracteresEspeciales(filePath);
        // Contar los espacios en blanco en el archivo
        int contadorEspaciosBlanco = contarEspaciosEnBlanco(filePath);
        // Contar las líneas en el archivo
        int contadorLineas = contarLineas(filePath);
        // Contar los números en el archivo
        int contadorNumero = contarNumeros(filePath);

        // Contar la frecuencia de cada palabra en el archivo
        Map<String, Integer> wordFrequency = contarFrecuenciaPalabras(filePath);

        // Contar las palabras con una longitud específica (por ejemplo, 5)
        int contadorPalabrasLongitud = contarPalabrasConLongitud(filePath, 5);

        // Imprimir los resultados
        System.out.println("El número total de palabras en el archivo es: " + contadorPalabras);
        System.out.println("El número total de letras en el archivo es: " + contadorLetras);
        System.out.println("El número total de caracteres especiales en el archivo es: " + contadorCaracteresEspeciales);
        System.out.println("El número total de espacios en blanco en el archivo es: " + contadorEspaciosBlanco);
        System.out.println("El número total de líneas en el archivo es: " + contadorLineas);
        System.out.println("El número total de números en el archivo es: " + contadorNumero);

        System.out.println("Frecuencia de cada palabra en el archivo:");
        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Imprimir el número de palabras con una longitud específica
        System.out.println("El número total de palabras con longitud 5 en el archivo es: " + contadorPalabrasLongitud);
    }
	public static int contarPalabras(String filePath) {
		int count = 0;
		try {
			// Crear un objeto File con la ruta proporcionada
			File file = new File(filePath);

			// Crear un Scanner para leer el archivo
			Scanner scanner = new Scanner(file);

			// Iterar sobre cada palabra en el archivo
			while (scanner.hasNext()) {
				scanner.next(); // Avanzar al siguiente token (palabra)
				count++; // Incrementar el contador de palabras
			}

			// Cerrar el Scanner
			scanner.close();
		} catch (FileNotFoundException e) {
			// Manejar el caso en que el archivo no se encuentre
			System.err.println("Archivo no encontrado en la ruta especificada.");
			e.printStackTrace();
		}
		return count;
	}

	public static int contarLetras(String filePath) {
		int count = 0;
		try {
			// Crear un objeto File con la ruta proporcionada
			File file = new File(filePath);

			// Crear un Scanner para leer el archivo
			Scanner scanner = new Scanner(file);

			// Iterar sobre cada carácter en el archivo
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				count += line.replaceAll("\\s", "").length(); // Eliminar espacios en blanco y contar caracteres
			}

			// Cerrar el Scanner
			scanner.close();
		} catch (FileNotFoundException e) {
			// Manejar el caso en que el archivo no se encuentre
			System.err.println("Archivo no encontrado en la ruta especificada.");
			e.printStackTrace();
		}
		return count;
	}

	public static int contarCaracteresEspeciales(String filePath) {
		int count = 0;
		try {
			// Crear un objeto File con la ruta proporcionada
			File file = new File(filePath);

			// Crear un Scanner para leer el archivo
			Scanner scanner = new Scanner(file);

			// Iterar sobre cada carácter en el archivo
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				for (int i = 0; i < line.length(); i++) {
					char c = line.charAt(i);
					if (!Character.isLetterOrDigit(c) && !Character.isWhitespace(c)) {
						count++; // Incrementar el contador si el carácter no es una letra/dígito ni un espacio
									// en blanco
					}
				}
			}

			// Cerrar el Scanner
			scanner.close();
		} catch (FileNotFoundException e) {
			// Manejar el caso en que el archivo no se encuentre
			System.err.println("Archivo no encontrado en la ruta especificada.");
			e.printStackTrace();
		}
		return count;
	}

	public static int contarEspaciosEnBlanco(String filePath) {
		int count = 0;
		try {
			// Crear un objeto File con la ruta proporcionada
			File file = new File(filePath);

			// Crear un Scanner para leer el archivo
			Scanner scanner = new Scanner(file);

			// Iterar sobre cada carácter en el archivo
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				for (int i = 0; i < line.length(); i++) {
					if (Character.isWhitespace(line.charAt(i))) {
						count++; // Incrementar el contador si el carácter es un espacio en blanco
					}
				}
			}

			// Cerrar el Scanner
			scanner.close();
		} catch (FileNotFoundException e) {
			// Manejar el caso en que el archivo no se encuentre
			System.err.println("Archivo no encontrado en la ruta especificada.");
			e.printStackTrace();
		}
		return count;
	}

	public static int contarLineas(String filePath) {
		int count = 0;
		try {
			// Crear un objeto File con la ruta proporcionada
			File file = new File(filePath);

			// Crear un Scanner para leer el archivo
			Scanner scanner = new Scanner(file);

			// Iterar sobre cada línea en el archivo
			while (scanner.hasNextLine()) {
				scanner.nextLine(); // Avanzar a la siguiente línea
				count++; // Incrementar el contador de líneas
			}

			// Cerrar el Scanner
			scanner.close();
		} catch (FileNotFoundException e) {
			// Manejar el caso en que el archivo no se encuentre
			System.err.println("Archivo no encontrado en la ruta especificada.");
			e.printStackTrace();
		}
		return count;
	}

	public static int contarNumeros(String filePath) {
		int count = 0;
		try {
			// Crear un objeto File con la ruta proporcionada
			File file = new File(filePath);

			// Crear un Scanner para leer el archivo
			Scanner scanner = new Scanner(file);

			// Iterar sobre cada palabra en el archivo
			while (scanner.hasNext()) {
				if (scanner.hasNextInt() || scanner.hasNextDouble()) {
					scanner.next(); // Avanzar al siguiente token (número)
					count++; // Incrementar el contador de números
				} else {
					scanner.next(); // Avanzar al siguiente token
				}
			}

			// Cerrar el Scanner
			scanner.close();
		} catch (FileNotFoundException e) {
			// Manejar el caso en que el archivo no se encuentre
			System.err.println("Archivo no encontrado en la ruta especificada.");
			e.printStackTrace();
		}
		return count;
	}

	public static Map<String, Integer> contarFrecuenciaPalabras(String filePath) {
		Map<String, Integer> wordFrequency = new HashMap<>();
		try {
			// Crear un objeto File con la ruta proporcionada
			File file = new File(filePath);

			// Crear un Scanner para leer el archivo
			Scanner scanner = new Scanner(file);

			// Iterar sobre cada palabra en el archivo
			while (scanner.hasNext()) {
				String word = scanner.next().toLowerCase(); // Leer la palabra y convertirla a minúsculas
				// Incrementar el contador de frecuencia para esta palabra
				wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
			}

			// Cerrar el Scanner
			scanner.close();
		} catch (FileNotFoundException e) {
			// Manejar el caso en que el archivo no se encuentre
			System.err.println("Archivo no encontrado en la ruta especificada.");
			e.printStackTrace();
		}
		return wordFrequency;
	}

	// Método para contar la cantidad de palabras que tienen una longitud específica
	public static int contarPalabrasConLongitud(String filePath, int longitud) {
        int count = 0;
        try {
            // Crear un objeto File con la ruta proporcionada
            File file = new File(filePath);

            // Crear un Scanner para leer el archivo
            Scanner scanner = new Scanner(file);

            // Iterar sobre cada palabra en el archivo
            while (scanner.hasNext()) {
                String word = scanner.next();
                // Incrementar el contador si la longitud de la palabra coincide con la longitud
                // especificada
                if (word.length() == longitud) {
                    count++;
                }
            }

            // Cerrar el Scanner
            scanner.close();
        } catch (FileNotFoundException e) {
            // Manejar el caso en que el archivo no se encuentre
            System.err.println("Archivo no encontrado en la ruta especificada.");
            e.printStackTrace();
        }
        return count;
    }
} 