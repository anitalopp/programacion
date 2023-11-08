import java.util.Scanner;

public class MenuGestionVentas {

	public void mostrarMenu() {

		int opcion = 0;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("**************************************");
			System.out.println("*******Menú de Gestión de ventas******");
			System.out.println("***Indique la operación a realizar***");
			System.out.println("*************************************");

			System.out.println("1. Hacer una venta.");
			System.out.println("2. Salir");

			opcion = sc.nextInt();
			sc.nextLine();

			switch (opcion) {
			case 1:
				realizarVenta(sc);

				break;
			case 2:
				// Salimos
				System.out.println("Volvemos al menú principal");
				return;
			default:
				System.out.println("Opción incorrecta: Las opciones válidas son 1 y 2");
			} 

		} while (opcion != 2);

	}

	private void realizarVenta(Scanner sc) {
		// Hacemos una venta
		System.out.println("Introduzca el nombre del cliente: ");
		String nombre = sc.nextLine();

		System.out.println("Introduzca la edad del cliente: ");
		int edad = sc.nextInt();
		sc.nextLine();

		System.out.println("Introduzca la ciudad del cliente: ");
		String ciudad = sc.nextLine();

		Cliente c = new Cliente(nombre, edad, ciudad);

		System.out.println("Dígame el título del libro a comprar: ");
		String titulo = sc.nextLine();

		System.out.println("Dígame el precio del libro: ");
		float precio = sc.nextFloat();
		sc.nextLine();

		System.out.println("Dígame el autor del libro: ");
		String autor = sc.nextLine();

		Libro libro = new Libro(titulo, autor, precio);

		System.out.println("Dígame la cantidad de libros a comprar: ");
		int cantidad = sc.nextInt();
		sc.nextLine();

		Venta venta = new Venta(c, libro, cantidad);
		venta.registraVenta();
	}
}
