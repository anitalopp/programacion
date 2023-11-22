import java.util.Scanner;

import com.ana.itv.entidades.Propietario;
import com.ana.itv.entidades.Vehiculo;
import com.ana.itv.interfaces.MenuCalcularPrecio;
import com.ana.itv.interfaces.MenuCreacionVehiculo;
import com.ana.itv.interfaces.MenuImprimirInforme;
import com.ana.itv.interfaces.MenuPasarItv;
import com.ana.itv.interfaces.MenuPropietario;

public class MenuPrincipal {

	public void mostrarMenu() {

		int opcion = 0;
		try (Scanner sc = new Scanner(System.in)) {
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
					MenuCreacionVehiculo MenuVehiculo = new MenuCreacionVehiculo();
					MenuVehiculo.muestraMenuCreacionVehiculo();
					break;
                case 2:
                    MenuPropietario MenuPropietario = new MenuPropietario();
                    MenuPropietario.muestraMenuPropietario();
                    break;
                case 3:
                	MenuCalcularPrecio MenuCalcularPrecio = new MenuCalcularPrecio();
                	MenuCalcularPrecio.mostrarMenu();
                    break;
                case 4:
                	MenuPasarItv MenuPasarItv = new MenuPasarItv();
                	MenuPasarItv.mostrarMenu();
                    break;
                case 5:
                	MenuImprimirInforme MenuImprimirInforme = new MenuImprimirInforme();
                	MenuImprimirInforme.mostrarMenu();
					break;
				case 6:
					System.out.println("Saliendo...");
					break;
				default:
					System.out.println("WARNING");
				}
			} while (opcion != 6);
		}
	}
	
	 private boolean hayVehiculoCreado(Vehiculo vehiculo) {
	        return vehiculo != null;
	    }

	 private boolean hayPropietarioCreado(Propietario propietario) {
	        return propietario != null;
	    }
	}
