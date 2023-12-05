import java.util.Scanner;

import com.ana.taller.entidades.Cliente;
import com.ana.taller.entidades.Coche;
import com.ana.taller.entidades.Neumaticos;
import com.ana.taller.interfaces.MenuCreacionCliente;
import com.ana.taller.interfaces.MenuCreacionCoche;
import com.ana.taller.interfaces.MenuCambioRuedas;

public class MenuPrincipal {
	private Cliente cliente;
	private Coche coche;
	private Neumaticos neumaticos;

	public void mostrarMenu() {

		Scanner sc = new Scanner(System.in);

		int opcion = 0;

		do {
			System.out.println("****Aplicación de gestión taller****");
			System.out.println("****ROLLING WHEELS****");
			System.out.println("1. Dar de alta cliente");
			System.out.println("2. Dar de alta coche");
			System.out.println("3. Servicio de cambio de ruedas");
			System.out.println("4. Emisión de factura");
			System.out.println("5. Salir de la aplicación");

			opcion = sc.nextInt();
			sc.nextLine();

			switch (opcion) {
			case 1:
				if (hayClienteCreado()) {
					System.out.println("Ya se ha creado un vehículo");

				} else {
					MenuCreacionCliente menuCreacionCliente = new MenuCreacionCliente();
					cliente = menuCreacionCliente.muestraMenuCreacionCliente();
					System.out.println("klsfnkl");
				}
				break;

			case 2:
				if (hayCocheCreado()) {
					System.out.println("Ya se ha creado un coche");
				} else {
					MenuCreacionCoche menuCreacionCoche = new MenuCreacionCoche();
					coche = menuCreacionCoche.muestraMenuCreacionCoche();
				}

				break;
			}

		} while (opcion != 5);
	}

	private boolean hayClienteCreado() {
		return false;
	}

	private boolean hayCocheCreado() {
		return false;
	}

}
