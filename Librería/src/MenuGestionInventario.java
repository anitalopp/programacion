import java.util.Scanner;

public class MenuGestionInventario {

	public void mostrarMenu() {
		int opcion = 0;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("******Menú Gestión de inventario******");
			System.out.println("Indique la operación a realizar ");
			System.out.println("1. Introducir libro ");
			System.out.println("2. Borrar libro");
			System.out.println("3. Salir");

			String opcionString = sc.nextLine();

			opcion = Integer.parseInt(opcionString);

			switch (opcion) {
			case 1:
				System.out.println("Por favor, introduzca el título del libro");
				String titulo = sc.nextLine();

				System.out.println("Por favor, introduzca el precio del libro ");

//				String precioString = sc.nextLine();
//				float precio = Integer.parseInt(precioString);

				float precion = sc.nextFloat();
				System.out.println("Introduzca la cantidad de libros a insertar en el inventario");
				int cantidad = Integer.parseInt(opcionString);

//				String cantidadString = sc.nextLine();
//				int cantidad = Integer.parseInt(cantidadString);

				// Creamos el objeto libro

				LibroDAO libroDao = new libroDAO();
				libroDao.insertarLibros(null, cantidad);
				break;
			case 2:
				// TODO: borrar libro
				break;
			case 3:
				System.out.println("Volviendo a menú principal");
				return;
			default:
				System.out.println("Opción incorrecta, la elección debe ser entre 1 y 3");
			}
		} while (opcion != 3);
	}
}
