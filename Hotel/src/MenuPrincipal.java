import java.util.Scanner;

public class MenuPrincipal {

    public void muestraMenuPrincipal() {

        int opcion = 0;
        Scanner sc = new Scanner(System.in);
        Cliente cliente = null;
        Habitacion habitacion = null;
        Reserva reserva = new Reserva();

        do {
            System.out.println("*******************************************");
            System.out.println("*******APLICACIÓN RESERVAS DE HOTEL*******");
            System.out.println("*******************************************");

            System.out.println("Introduzca el dni: ");
            String dni = sc.nextLine();
            System.out.println("Introduzca el nombre: ");
            String nombre = sc.nextLine();
            System.out.println("Introduzca el apellido: ");
            String apellidos = sc.nextLine();

            System.out.println();

            System.out.println("Introduzca los datos para crear la habitación...");
            System.out.println("Introduzca el número de habitación: ");
            String numHabitacion = sc.nextLine();
            System.out.println("Introduzca el número de planta: ");
            String numPlanta = sc.nextLine();

            System.out.println();

            habitacion = new Habitacion(numHabitacion, numPlanta);
            System.out.println("La habitación con número: " + habitacion.getNumHabitacion() + " en la planta: "
                    + habitacion.getNumPlanta() + " ha sido creada. Estado: "
                    + (habitacion.esOcupada() ? "Ocupada" : "Libre"));

            cliente = new Cliente(dni, nombre, apellidos);
            System.out.println("Cliente creado: DNI: " + cliente.getDni() + ", Nombre: " + cliente.getNombre()
                    + ", Apellido: " + cliente.getApellido());

            do {
                System.out.println("¿Qué operación desea realizar?");
                System.out.println();
                System.out.println("1- Reservar la habitación al cliente: " + cliente.getNombre() + " en la habitacion: " + habitacion.getNumHabitacion());
                System.out.println("2- Anular la reserva del cliente: " + cliente.getNombre() + " en la habitacion: " + habitacion.getNumHabitacion());
                System.out.println("3- Salir de la aplicacion....");
                
                opcion = sc.nextInt();
                sc.nextLine(); 
                
                switch (opcion) {
                    case 1:
                        // Submenú de reserva de habitación
                        reserva.reservarHabitacion(cliente, habitacion);
                        break;
                    case 2:
                        // Submenú de anulación
                        reserva.anularReserva(cliente, habitacion);
                        break;
                    case 3:
                        System.out.println("Saliendo del submenú...");
                        break;
                    default:
                        System.out.println("Opción incorrecta: El número debe estar comprendido entre 1 y 3");
                }
            } while (opcion != 3);

        } while (opcion != 3);
    }

    public static void main(String[] args) {
        MenuPrincipal menu = new MenuPrincipal();
        menu.muestraMenuPrincipal();
    }
}

