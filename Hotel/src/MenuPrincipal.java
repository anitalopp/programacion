import java.util.Scanner;

public class MenuPrincipal {

	public void muestraMenuPrincipal() {

		Integer opcion = 0;
		Scanner sc = new Scanner(System.in);
		Cliente cliente = null;
		Habitacion habitacion = null;

		do {
			System.out.println("*******************************************");
			System.out.println("*******APLICACIÓN RESERVAS DE HOTEL*******");
			System.out.println("*******************************************");

			System.out.print("Introduzca el dni: ");
			String dni = sc.nextLine();
			System.out.print("Introduzca el nombre: ");
			String nombre = sc.nextLine();
			System.out.print("Introduzca el apellido: ");
			String apellidos = sc.nextLine();

			cliente = new Cliente(dni, nombre, apellidos);
			System.out.println("Cliente creado: DNI: " + cliente.getDni() + ", Nombre: " + cliente.getNombre()
					+ ", Apellido: " + cliente.getApellido());

			System.out.print("Introduzca los datos para crear la habitación...");
			System.out.print("Introduzca el número de habitación: ");
			String numHabitacion = sc.nextLine();
			System.out.print("Introduzca el número de planta: ");
			String numPlanta = sc.nextLine();

			habitacion = new Habitacion();
			System.out.println("La habitación con número: " + habitacion.getNumHabitacion() + " en la planta: "
					+ habitacion.getNumPlanta() + " ha sido creada. Estado: "
					+ (habitacion.esOcupada() ? "Ocupada" : "Libre"));

			System.out.print("¿Qué operación desea realizar ahora?");
			System.out.print("1. Reservar habitación");
			System.out.print("2. Anular reserva");
			System.out.print("3. Salir");
			opcion = sc.nextInt();
			sc.nextLine();

			System.out.print("¿Qué operación desea realizar ahora?");
			System.out.print("1. Reservar la habitación al cliente: " + cliente.getNombre() + " en la habitación: "
					+ habitacion.getNumHabitacion());
			System.out.print("2. Anular reserva del cliente: " + cliente.getNombre() + " en la habitación: "
					+ habitacion.getNumHabitacion());
			System.out.print("3. Salir de la aplicación...");


			switch (opcion) {
			case 1:
				System.out.print("La reserva de la habitación: " + habitacion.getNumHabitacion()
						+ "ha quedado reservada por el cliente: " + cliente.getNombre());
				System.out.print("¿Qué operación desea realizar ahora?");
				break;
			case 2:
				System.out.print("La reserva de la habitación: " + habitacion.getNumHabitacion() + " ha quedado anulada ");
				System.out.print("¿Qué operación desea realizar ahora?");
				break;
			case 3:
				System.out.print("La aplicación ha terminado, bye!");
				break;
			default:
				System.out.print("Opción incorrecta:El número debe estar comprendido entre 1 y 8");
			}
		

		} while (opcion != 3);
	}
}
