import java.util.Scanner;

public class UtilidadesCreacionDeObjetos {

	public static Libro crearLibro(Scanner sc) {
		System.out.println("Por favor, introduzca el título del libro");
		String titulo = sc.nextLine();

		System.out.println("Por favor, introduzca el precio del libro ");
		String autor = sc.nextLine();

		System.out.println("Por favor, introduzca el precio del libto ");
		float precio = Float.parseFloat(sc.nextLine());

		// Creamos el objeto libro
		Libro libro = new Libro(titulo, autor, precio);
		return libro;
	}
}
