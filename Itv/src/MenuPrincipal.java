import java.util.Scanner;

public class MenuPrincipal {

	public void muestraMenuPrincipal() {

		int opcion = 0;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("*******APLICACIÓN ITV*******");
			System.out.println("Introduzca la opción elegida:");
			System.out.println("1. Introducir vehículo.");
			System.out.println("2. Introducir propietario.");
			System.out.println("3. Dar precio ITV.");
			System.out.println("4. Pasar la ITVa");
			System.out.println("5. Imprimir informe de ITV");
			System.out.println("6. Salir.");

			opcion = sc.nextInt();
			sc.nextLine();

			switch (opcion) {
			case 1:
				MenuVehiculo MenuVehiculo = new MenuVehiculo();
				MenuVehiculo.mostrarMenu();
				break;
//                case 2:
//                    MenuPropietario MenuPropietario = new MenuPropietario();
//                    MenuPropietario.mostrarMenu();
//                    break;
//                case 3:
//                	MenuCalcularPrecio MenuCalcularPrecio = new MenuCalcularPrecio();
//                	MenuCalcularPrecio.mostrarMenu();
//                    break;
//                case 4:
//                	MenuPasarItv MenuPasarItv = new MenuPasarItv();
//                	MenuPasarItv.mostrarMenu();
//                    break;
//                case 5:
//                	MenuImprimirInforme MenuImprimirInforme = new MenuImprimirInforme();
//                	MenuImprimirInforme.mostrarMenu();
			case 6:
				System.out.println("Saliendo...");
			default:
				System.out.println("Opción incorrecta: El número debe estar comprendido entre 1 y 3");
			}
		} while (opcion != 4);
	}

}
