import java.util.Scanner;  // Importa la clase Scanner para la entrada de datos desde el teclado.

import com.ana.itv.entidades.Propietario;  // Importa la clase Propietario desde el paquete com.ana.itv.entidades.
import com.ana.itv.entidades.Vehiculo;  // Importa la clase Vehiculo desde el paquete com.ana.itv.entidades.
import com.ana.itv.interfaces.EmisionInforme;  // Importa la interfaz EmisionInforme desde el paquete com.ana.itv.interfaces.
import com.ana.itv.interfaces.MenuCreacionPropietario;  // Importa la interfaz MenuCreacionPropietario desde el paquete com.ana.itv.interfaces.
import com.ana.itv.interfaces.MenuCreacionVehiculo;  // Importa la interfaz MenuCreacionVehiculo desde el paquete com.ana.itv.interfaces.
import com.ana.itv.interfaces.MenuPasarItv;  // Importa la interfaz MenuPasarItv desde el paquete com.ana.itv.interfaces.

public class MenuPrincipal {

	private Vehiculo vehiculo;  // Declaración de la variable vehiculo que representa un vehículo.
	private Propietario propietario;  // Declaración de la variable propietario que representa un propietario.

	public void mostrarMenu() {

		Scanner sc = new Scanner(System.in);  // Creación de un objeto Scanner para la entrada de datos.

		int opcion = 0;  // Declaración de la variable opcion que almacenará la opción seleccionada por el usuario.

		do {
			System.out.println("*******APLICACIÓN ITV*******");
			System.out.println("Introduzca la opción elegida:");
			System.out.println("1. Introducir vehículo");
			System.out.println("2. Introducir propietario");
			System.out.println("3. Dar precio ITV");
			System.out.println("4. Pasar la ITV");
			System.out.println("5. Imprimir informe de ITV");
			System.out.println("6. Salir de la aplicación ITV");

			opcion = sc.nextInt();  // Lee la opción seleccionada por el usuario.
			sc.nextLine();  // Limpia el buffer de entrada.

			switch (opcion) {
			case 1:
				if (hayVehiculoCreado()) {
					System.out.println("Ya se ha creado un vehículo");

					System.err.println(
							"WARNING: Hay ya un vehículo creado, si continúa los datos del mismo se perderán.");
					System.err.println("Desea continuar (S/N)");

					char respuesta = sc.next().charAt(0);

					if (respuesta != 'S' && respuesta != 's') {
						break;
					} else {
						MenuCreacionVehiculo menuCreacionVehiculo = new MenuCreacionVehiculo();
						vehiculo = menuCreacionVehiculo.muestraMenuCreacionVehiculo();
					}
				} else {
					MenuCreacionVehiculo mv = new MenuCreacionVehiculo();
					vehiculo = mv.muestraMenuCreacionVehiculo();
				}
				break;
			case 2:
				if (hayPropietarioCreado()) {
					System.out.println("Ya se ha creado un propietario");

					System.err.println(
							"WARNING: Hay ya un vehículo creado, si continúa los datos del mismo se perderán.");
					System.err.println("Desea continuar (S/N)");

					char respuesta = sc.next().charAt(0);

					if (respuesta != 'S' && respuesta != 's') {
						break;
					} else {
						MenuCreacionPropietario mi = new MenuCreacionPropietario();
						propietario = mi.muestraMenuPropietario();
					}
				} else {
					MenuCreacionVehiculo mv = new MenuCreacionVehiculo();
					vehiculo = mv.muestraMenuCreacionVehiculo();
				}
				break;
			case 3:
				if (hayVehiculoCreado()) {
					double precioITV = vehiculo.calculaPrecioITV();
					System.out.println("El precio de pasar la ITV es: " + precioITV + " euros.");
				} else {
					System.out.println("Primero debe crear un vehículo antes de obtener el precio de pasar la ITV.");
				}
				break;
			case 4:
				if (hayVehiculoCreado()) {
					MenuPasarItv md = new MenuPasarItv();
					md.mostrarMenuPasarITV(vehiculo);
				} else {
					System.out.println("Primero debe crear un vehículo antes de pasar la ITV.");
				}
				break;
			case 5:
				if (hayVehiculoCreado() && hayPropietarioCreado()) {
					EmisionInforme emisionInforme = new EmisionInforme();
					emisionInforme.emiteInforme(vehiculo, propietario);
				} else {
					System.out.println("Primero debe crear un vehículo y un propietario antes de imprimir el informe.");
				}
				break;
			case 6:
				System.out.println("Saliendo de la aplicación ITV.");
				break;
			default:
				System.out.println("Escribe un número comprendido entre el 1 y el 6");
			}

		} while (opcion != 6);

	}

	private boolean hayVehiculoCreado() {
		return vehiculo != null;  // Verifica si se ha creado un vehículo.
	}

	private boolean hayPropietarioCreado() {
		return propietario != null;  // Verifica si se ha creado un propietario.
	}

	public static void main(String[] args) {
		MenuPrincipal menu = new MenuPrincipal();  // Creación de un objeto MenuPrincipal.
		menu.mostrarMenu();  // Llamada al método mostrarMenu para iniciar la aplicación.
	}
}
