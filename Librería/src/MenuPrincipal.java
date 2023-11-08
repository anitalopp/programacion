import java.util.Scanner;

public class MenuPrincipal {

	public void muetraMenuPrincipal() {

		Integer opcion;
		Scanner sc = new Scanner(System.in);

		do {

			System.out.println("********APICACIÓN GESTIÓN DE LIBRERÍA********");
			System.out.println("***************MENÚ PRINCIPAL****************");
			System.out.println("Introduzca, por favor, la opción que quiere realizar ");
			System.out.println("1.Gestión de VENTAS");
			System.out.println("2.Gestión de INVENTARIO");
			System.out.println("3.Gestión de DESCUENTOS");
			System.out.println("4.Salir");

			opcion = sc.nextInt();
			sc.nextLine();

			switch (opcion) {
			case 1:
				// Mostramos submenú de gestión ventas
				MenuGestionVentas mv = new MenuGestionVentas();
				while (true) {
					mv.mostrarMenu();
				}
			case 2:
				// Mostramos submenú de gestión de inventario
				System.out.println("Mostramos submenú de gestión de inventario");
				break;
			case 3:
				// Mostramos submenú de gestión de descuentos
				System.out.println("Mostramos submenú de gestión de descuentos");
				break;
			case 4:
				// Salimos
				System.out.println("Salimos de la aplicación, bye");
				return;
			default:
				System.out.println("Opción incorrecta:El número debe estar comprendido entre 1 y 8");
			}
		} while (opcion != 4);
	}

}
