import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {

		ejecutarEjercicio3();
		ejecutarEjercicio2();
		ejecutarEjercicio1();
	}

	public static void ejecutarEjercicio1() {
		System.out.println("========EJERCICIO 1========");
		System.out.println("===========================");

		Scanner sc = new Scanner(System.in);
		System.out.println("Dígame el directorio para empezar a buscar: ");
		String directorio = sc.nextLine();

		System.out.println("Dígame nombre de fichero a buscar");
		String patronBusqueda = sc.nextLine();
	}

	private static void ejecutarEjercicio2() {
		System.out.println("========EJERCICIO 2========");
		System.out.println("===========================");
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
			System.out.println("Introduce el nombre del fichero donde se almacenarán los datos: ");
			String nombreFichero = reader.readLine();

			System.out.println("Introduce tu nombre:");
			String nombre = reader.readLine();

			System.out.println("Introduce tu edad:");
			String edad = reader.readLine();

			System.out.println("Introduce tu correo electrónico:");
			String correo = reader.readLine();

			if (correo.contains("@")) {
				System.out.println("Usuario registrado con éxito");

				try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreFichero))) {
					String contenidoFichero = "Nombre: " + nombre + ", Edad:" + edad + ", Correo:" + correo;
					writer.write(contenidoFichero);
					System.out.println("Se ha escrito correctamente en el archivo.");
				} catch (IOException e) {
					System.err.println("Error al escribir en el archivo: " + e.getMessage());
				}
			} else {
				System.out.println("No se puiede crear");
			}
		} catch (IOException e) {
			System.err.println("Error");
		}
	}

	public static void ejecutarEjercicio3() {
		System.out.println("========EJERCICIO 3========");
		System.out.println("===========================");

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el nombre del fichero para guardar los resultados:");
		String nombreFichero = sc.nextLine();

		System.out.println("Introduce un directorio para listar su contenido:");
		String directorio = sc.nextLine();

		File carpeta = new File(directorio);

		String[] listado = carpeta.list();

		if (listado == null || listado.length == 0) {
			System.out.println("Introduzca un directorio");
			return;
		} else {
			for (int i = 0; i < listado.length; i++) {

				System.out.println(listado[i]);
			}
		}

		try {
			FileWriter escritorArchivo = new FileWriter(nombreFichero);
			BufferedWriter bufferedWriter = new BufferedWriter(escritorArchivo);

			bufferedWriter.write(Arrays.toString(listado));

			bufferedWriter.close();
			System.out.println("Se ha escrito correctamente en el archivo.");
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Introduce el nombre de un fichero para buscar una palabra");
		String nombreFicheroBuscarPalabra = sc.nextLine();

		System.out.println("Introduce la palabra a buscar: ");
		String palabraBuscada = sc.nextLine();

		try {
			FileReader lectorArchivo = new FileReader(nombreFicheroBuscarPalabra);
			BufferedReader bufferedReader = new BufferedReader(lectorArchivo);
			String linea;
			while ((linea = bufferedReader.readLine()) != null) {
				if (linea.contains(palabraBuscada)) {
					System.out.println("La palabra '" + palabraBuscada + "' se encuentra en el archivo");
				}
			}
			bufferedReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
