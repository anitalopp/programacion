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
		Cliente c = UtilidadesCreacionDeObjetos.crearCliente(sc);

		Libro l = UtilidadesCreacionDeObjetos.crearLibro(sc);

		System.out.println("Dígame la cantidad de libros a comprar: ");
		int cantidad = sc.nextInt();
		sc.nextLine();

		Venta venta = new Venta(c, l, cantidad);
		venta.registraVenta();
	}
}