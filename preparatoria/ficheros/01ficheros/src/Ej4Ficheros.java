import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ej4Ficheros {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce la palabra que quieres buscar");

		String palabraBuscada = sc.nextLine();

		System.out.println("Introduce el nombre del fichero que quieres usar:");

		String fichero = sc.nextLine();

		
		// Leer el fichero: Primero tenemos que crear un FileReader (le pasamos el fichero que queremos que lea)
		// Luego creamos un BufferedReader y le pasamos el FileReader entre paréntesis
		//Creamos una variable llamada línea (la necesitamos para que vaya leyendo el fichero)
		// Y también creamos un contador para la palabra que queremos buscar, que empiece en 0.
		try {
			FileReader fr = new FileReader(fichero);
			BufferedReader br = new BufferedReader(fr);
			String linea = "";
			int frecuenciaPalabra = 0;

			//Aquí empezamos a leer el fichero con readLine(le pasamos el objeto BufferedReader entre paréntesis). 
			//Este do while se repetirá hasta que ya no haya más líneas para leer (mientras línea sea 
			//diferente de null)
			//El primer if es necesario por si acaso la primera línea está vacía o hay algún salto.
			// En el segundo if le decimos que si la línea contiene la palabra que buscamos, incremente en 1 el contador.
			
			do {
				linea = br.readLine();
				if (linea == null) continue;
				
				if (linea.contains(palabraBuscada)) {
					frecuenciaPalabra++;
				}
				
			} while (linea != null);
			
			//Una vez leído todo el fichero, sacamos por consola el resultado.
			//Lo de los try y los catch Eclipse nos dará opción de ponerlos cuando hagan falta.
			System.out.println(
					"Se ha encontrado la palabra " + palabraBuscada + " un total de " + frecuenciaPalabra + " veces.");
		} catch (FileNotFoundException e) {
			System.out.println("No se encuentra el archivo");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
